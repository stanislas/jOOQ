/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbc.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_725LobTest extends org.jooq.impl.TableImpl<org.jooq.test.jdbc.generatedclasses.tables.records.T_725LobTestRecord> {

	private static final long serialVersionUID = -682322371;

	/**
	 * The singleton instance of <code>PUBLIC.T_725_LOB_TEST</code>
	 */
	public static final org.jooq.test.jdbc.generatedclasses.tables.T_725LobTest T_725_LOB_TEST = new org.jooq.test.jdbc.generatedclasses.tables.T_725LobTest();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.jdbc.generatedclasses.tables.records.T_725LobTestRecord> getRecordType() {
		return org.jooq.test.jdbc.generatedclasses.tables.records.T_725LobTestRecord.class;
	}

	/**
	 * The column <code>PUBLIC.T_725_LOB_TEST.ID</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbc.generatedclasses.tables.records.T_725LobTestRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_725_LOB_TEST, "");

	/**
	 * The column <code>PUBLIC.T_725_LOB_TEST.LOB</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbc.generatedclasses.tables.records.T_725LobTestRecord, byte[]> LOB = createField("LOB", org.jooq.impl.SQLDataType.BLOB.length(2147483647), T_725_LOB_TEST, "");

	/**
	 * No further instances allowed
	 */
	private T_725LobTest() {
		this("T_725_LOB_TEST", null);
	}

	private T_725LobTest(java.lang.String alias, org.jooq.Table<org.jooq.test.jdbc.generatedclasses.tables.records.T_725LobTestRecord> aliased) {
		this(alias, aliased, null);
	}

	private T_725LobTest(java.lang.String alias, org.jooq.Table<org.jooq.test.jdbc.generatedclasses.tables.records.T_725LobTestRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.jdbc.generatedclasses.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.jdbc.generatedclasses.tables.records.T_725LobTestRecord> getPrimaryKey() {
		return org.jooq.test.jdbc.generatedclasses.Keys.PK_T_725_LOB_TEST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.jdbc.generatedclasses.tables.records.T_725LobTestRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.jdbc.generatedclasses.tables.records.T_725LobTestRecord>>asList(org.jooq.test.jdbc.generatedclasses.Keys.PK_T_725_LOB_TEST);
	}
}
