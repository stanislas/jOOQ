/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK_TO_BOOK_STORE", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"BOOK_STORE_NAME", "BOOK_ID"})
})
public interface ITBookToBookStore extends java.io.Serializable {

	/**
	 * Setter for <code>T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>.
	 */
	public void setBookStoreName(java.lang.String value);

	/**
	 * Getter for <code>T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>.
	 */
	@javax.persistence.Column(name = "BOOK_STORE_NAME", nullable = false, length = 400)
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 400)
	public java.lang.String getBookStoreName();

	/**
	 * Setter for <code>T_BOOK_TO_BOOK_STORE.BOOK_ID</code>.
	 */
	public void setBookId(java.lang.Integer value);

	/**
	 * Getter for <code>T_BOOK_TO_BOOK_STORE.BOOK_ID</code>.
	 */
	@javax.persistence.Column(name = "BOOK_ID", nullable = false)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getBookId();

	/**
	 * Setter for <code>T_BOOK_TO_BOOK_STORE.STOCK</code>.
	 */
	public void setStock(java.lang.Integer value);

	/**
	 * Getter for <code>T_BOOK_TO_BOOK_STORE.STOCK</code>.
	 */
	@javax.persistence.Column(name = "STOCK")
	public java.lang.Integer getStock();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITBookToBookStore
	 */
	public void from(org.jooq.test.firebird.generatedclasses.tables.interfaces.ITBookToBookStore from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITBookToBookStore
	 */
	public <E extends org.jooq.test.firebird.generatedclasses.tables.interfaces.ITBookToBookStore> E into(E into);
}
