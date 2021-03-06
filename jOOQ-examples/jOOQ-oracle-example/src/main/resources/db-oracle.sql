BEGIN
  BEGIN
    EXECUTE IMMEDIATE 'DROP TABLE books';
  EXCEPTION WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE (SQLERRM);
  END;

  BEGIN
    EXECUTE IMMEDIATE 'DROP TABLE books';
  EXCEPTION WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE (SQLERRM);
  END;

  BEGIN
    EXECUTE IMMEDIATE 'DROP TABLE authors';
  EXCEPTION WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE (SQLERRM);
  END;

  BEGIN
    EXECUTE IMMEDIATE 'DROP PACKAGE library';
  EXCEPTION WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE (SQLERRM);
  END;

  BEGIN
    EXECUTE IMMEDIATE 'DROP TYPE books_t FORCE';
  EXCEPTION WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE (SQLERRM);
  END;

  BEGIN
    EXECUTE IMMEDIATE 'DROP TYPE book_t FORCE';
  EXCEPTION WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE (SQLERRM);
  END;

  BEGIN
    EXECUTE IMMEDIATE 'DROP TYPE authors_t FORCE';
  EXCEPTION WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE (SQLERRM);
  END;

  BEGIN
    EXECUTE IMMEDIATE 'DROP TYPE author_t FORCE';
  EXCEPTION WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE (SQLERRM);
  END;

  BEGIN
    DBMS_AQADM.DROP_QUEUE_TABLE(
      queue_table => 'new_author_aq_t',
      force => true
    );

    DBMS_AQADM.STOP_QUEUE(
      queue_name => 'new_author_aq'
    );

    DBMS_AQADM.DROP_QUEUE(
      queue_name => 'new_author_aq'
    );

    COMMIT;
  EXCEPTION
    WHEN OTHERS THEN DBMS_OUTPUT.PUT_LINE(SQLERRM);
  END;
END;
/


CREATE TABLE authors (
  ID         NUMBER(7)          NOT NULL PRIMARY KEY,
  first_name VARCHAR2(100 CHAR) NOT NULL,
  last_name  VARCHAR2(100 CHAR) NOT NULL
)
/

CREATE TABLE books (
  ID         NUMBER(7)          PRIMARY KEY,
  title      VARCHAR2(100 CHAR) NOT NULL,
  language   VARCHAR2(2 CHAR)   NOT NULL,
  author_id  NUMBER(7)          NOT NULL,

  CONSTRAINT fk_author_id FOREIGN KEY (author_id) REFERENCES authors (ID)
)
/

INSERT INTO authors VALUES (1, 'George', 'Orwell')
/
INSERT INTO authors VALUES (2, 'Paulo', 'Coelho')
/

INSERT INTO books VALUES (1, '1984',         'en', 1)
/
INSERT INTO books VALUES (2, 'Animal Farm',  'en', 1)
/
INSERT INTO books VALUES (3, 'O Alquimista', 'pt', 2)
/
INSERT INTO books VALUES (4, 'Brida',        'en', 2)
/

COMMIT
/

CREATE OR REPLACE TYPE book_t AS OBJECT (
  ID         NUMBER(7),
  title      VARCHAR2(100 CHAR),
  language   VARCHAR2(2 CHAR)
)
/

CREATE OR REPLACE TYPE books_t AS VARRAY(32) OF book_t
/

CREATE OR REPLACE TYPE author_t AS OBJECT (
  ID         NUMBER(7),
  first_name VARCHAR2(100 CHAR),
  last_name  VARCHAR2(100 CHAR),
  books      books_t
)
/

CREATE OR REPLACE TYPE authors_t AS VARRAY(32) OF author_t
/

CREATE OR REPLACE PACKAGE library AS
  TYPE book_count_t IS RECORD(
    author author_t,
    books  NUMBER(7)
  );

  TYPE book_counts_t IS TABLE OF book_count_t;

  FUNCTION get_authors(p_id NUMBER := NULL, p_load_books NUMBER := 0) RETURN authors_t;
  FUNCTION get_books(p_id NUMBER := NULL) RETURN books_t;
  FUNCTION get_book_counts(p_id NUMBER := NULL) RETURN book_counts_t PIPELINED;
END library;
/

CREATE OR REPLACE PACKAGE BODY library AS
  FUNCTION get_authors(p_id NUMBER := NULL, p_load_books NUMBER := 0) RETURN authors_t IS
    v_result authors_t;
  BEGIN
    SELECT author_t(
             id,
             first_name,
             last_name,
             CASE WHEN p_load_books = 1
                  THEN CAST(MULTISET(SELECT id, title, language FROM books WHERE author_id = authors.id) AS books_t)
                  ELSE books_t()
             END
    )
    BULK COLLECT INTO v_result
    FROM authors
    WHERE p_id IS NULL OR id = p_id;

    RETURN v_result;
  END get_authors;

  FUNCTION get_books(p_id NUMBER := NULL) RETURN books_t IS
    v_result books_t;
  BEGIN
    SELECT book_t(id, title, language)
    BULK COLLECT INTO v_result
    FROM books
    WHERE p_id IS NULL OR author_id = p_id;

    RETURN v_result;
  END get_books;

  FUNCTION get_book_counts(p_id NUMBER := NULL) RETURN book_counts_t PIPELINED IS
    book_count book_count_t;
    authors    authors_t;
  BEGIN
    authors := get_authors(p_id, 1);

    FOR author IN (SELECT * FROM TABLE(authors)) LOOP
      book_count.author := author_t(author.id, author.first_name, author.last_name, author.books);
      book_count.books := author.books.count;

      PIPE ROW(book_count);
    END LOOP;

    RETURN;
  END get_book_counts;
END library;
/

BEGIN
  DBMS_AQADM.CREATE_QUEUE_TABLE(
    queue_table => 'new_author_aq_t',
    queue_payload_type => 'author_t'
  );

  DBMS_AQADM.CREATE_QUEUE(
    queue_name => 'new_author_aq',
    queue_table => 'new_author_aq_t'
  );

  DBMS_AQADM.START_QUEUE(
    queue_name => 'new_author_aq'
  );
  COMMIT;
END;
/
