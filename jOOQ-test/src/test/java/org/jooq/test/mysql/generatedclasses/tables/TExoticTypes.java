/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TExoticTypes extends org.jooq.impl.TableImpl<org.jooq.test.mysql.generatedclasses.tables.records.TExoticTypesRecord> {

	private static final long serialVersionUID = 2034278045;

	/**
	 * The singleton instance of <code>test.t_exotic_types</code>
	 */
	public static final org.jooq.test.mysql.generatedclasses.tables.TExoticTypes T_EXOTIC_TYPES = new org.jooq.test.mysql.generatedclasses.tables.TExoticTypes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.TExoticTypesRecord> getRecordType() {
		return org.jooq.test.mysql.generatedclasses.tables.records.TExoticTypesRecord.class;
	}

	/**
	 * The column <code>test.t_exotic_types.ID</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TExoticTypesRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), T_EXOTIC_TYPES, "");

	/**
	 * The column <code>test.t_exotic_types.UU</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TExoticTypesRecord, java.util.UUID> UU = createField("UU", org.jooq.impl.SQLDataType.BINARY.length(16), T_EXOTIC_TYPES, "", new org.jooq.test.all.converters.UUIDBinaryConverter());

	/**
	 * No further instances allowed
	 */
	private TExoticTypes() {
		this("t_exotic_types", null);
	}

	private TExoticTypes(java.lang.String alias, org.jooq.Table<org.jooq.test.mysql.generatedclasses.tables.records.TExoticTypesRecord> aliased) {
		this(alias, aliased, null);
	}

	private TExoticTypes(java.lang.String alias, org.jooq.Table<org.jooq.test.mysql.generatedclasses.tables.records.TExoticTypesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.mysql.generatedclasses.Test.TEST, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TExoticTypesRecord> getPrimaryKey() {
		return org.jooq.test.mysql.generatedclasses.Keys.KEY_T_EXOTIC_TYPES_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TExoticTypesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TExoticTypesRecord>>asList(org.jooq.test.mysql.generatedclasses.Keys.KEY_T_EXOTIC_TYPES_PRIMARY);
	}
}
