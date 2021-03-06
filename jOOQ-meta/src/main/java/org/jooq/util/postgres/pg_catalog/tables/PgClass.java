/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgClass extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1433095935;

	/**
	 * The singleton instance of <code>pg_catalog.pg_class</code>
	 */
	public static final org.jooq.util.postgres.pg_catalog.tables.PgClass PG_CLASS = new org.jooq.util.postgres.pg_catalog.tables.PgClass();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>pg_catalog.pg_class.relname</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RELNAME = createField("relname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relnamespace</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> RELNAMESPACE = createField("relnamespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.reltype</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> RELTYPE = createField("reltype", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.reloftype</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> RELOFTYPE = createField("reloftype", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relowner</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> RELOWNER = createField("relowner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relam</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> RELAM = createField("relam", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relfilenode</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> RELFILENODE = createField("relfilenode", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.reltablespace</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> RELTABLESPACE = createField("reltablespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relpages</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> RELPAGES = createField("relpages", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.reltuples</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Float> RELTUPLES = createField("reltuples", org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relallvisible</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> RELALLVISIBLE = createField("relallvisible", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.reltoastrelid</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> RELTOASTRELID = createField("reltoastrelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.reltoastidxid</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> RELTOASTIDXID = createField("reltoastidxid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relhasindex</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> RELHASINDEX = createField("relhasindex", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relisshared</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> RELISSHARED = createField("relisshared", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relpersistence</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RELPERSISTENCE = createField("relpersistence", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relkind</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RELKIND = createField("relkind", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relnatts</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RELNATTS = createField("relnatts", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relchecks</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RELCHECKS = createField("relchecks", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relhasoids</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> RELHASOIDS = createField("relhasoids", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relhaspkey</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> RELHASPKEY = createField("relhaspkey", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relhasrules</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> RELHASRULES = createField("relhasrules", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relhastriggers</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> RELHASTRIGGERS = createField("relhastriggers", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relhassubclass</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> RELHASSUBCLASS = createField("relhassubclass", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relispopulated</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> RELISPOPULATED = createField("relispopulated", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relfrozenxid</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> RELFROZENXID = createField("relfrozenxid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relminmxid</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> RELMINMXID = createField("relminmxid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relacl</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String[]> RELACL = createField("relacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.reloptions</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String[]> RELOPTIONS = createField("reloptions", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

	/**
	 * Create a <code>pg_catalog.pg_class</code> table reference
	 */
	public PgClass() {
		this("pg_class", null);
	}

	/**
	 * Create an aliased <code>pg_catalog.pg_class</code> table reference
	 */
	public PgClass(java.lang.String alias) {
		this(alias, org.jooq.util.postgres.pg_catalog.tables.PgClass.PG_CLASS);
	}

	private PgClass(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased) {
		this(alias, aliased, null);
	}

	private PgClass(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.util.postgres.pg_catalog.PgCatalog.PG_CATALOG, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.postgres.pg_catalog.tables.PgClass as(java.lang.String alias) {
		return new org.jooq.util.postgres.pg_catalog.tables.PgClass(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.util.postgres.pg_catalog.tables.PgClass rename(java.lang.String name) {
		return new org.jooq.util.postgres.pg_catalog.tables.PgClass(name, null);
	}
}
