/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * A book store
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookStore extends org.jooq.impl.TableImpl<org.jooq.test.mysql.generatedclasses.tables.records.TBookStoreRecord> {

	private static final long serialVersionUID = -1747348109;

	/**
	 * The singleton instance of <code>test.t_book_store</code>
	 */
	public static final org.jooq.test.mysql.generatedclasses.tables.TBookStore T_BOOK_STORE = new org.jooq.test.mysql.generatedclasses.tables.TBookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.TBookStoreRecord> getRecordType() {
		return org.jooq.test.mysql.generatedclasses.tables.records.TBookStoreRecord.class;
	}

	/**
	 * The column <code>test.t_book_store.name</code>. The books store name
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBookStoreRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), T_BOOK_STORE, "The books store name");

	/**
	 * No further instances allowed
	 */
	private TBookStore() {
		this("t_book_store", null);
	}

	private TBookStore(java.lang.String alias, org.jooq.Table<org.jooq.test.mysql.generatedclasses.tables.records.TBookStoreRecord> aliased) {
		this(alias, aliased, null);
	}

	private TBookStore(java.lang.String alias, org.jooq.Table<org.jooq.test.mysql.generatedclasses.tables.records.TBookStoreRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.mysql.generatedclasses.Test.TEST, aliased, parameters, "A book store");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TBookStoreRecord> getPrimaryKey() {
		return org.jooq.test.mysql.generatedclasses.Keys.KEY_T_BOOK_STORE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TBookStoreRecord>>asList(org.jooq.test.mysql.generatedclasses.Keys.KEY_T_BOOK_STORE_PRIMARY);
	}
}
