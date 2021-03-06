/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.pojos;

/**
 * This is a POJO for table X_UNUSED.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XUnused implements org.jooq.test.h2.generatedclasses.tables.interfaces.IXUnused {

	private static final long serialVersionUID = -226452209;

	private java.lang.Integer    id;
	private java.lang.String     name;
	private java.math.BigInteger bigInteger;
	private java.lang.Integer    idRef;
	private java.lang.String     nameRef;
	private java.lang.Integer    class_;
	private java.lang.Integer    fields;
	private java.lang.Integer    table;
	private java.lang.Integer    configuration;
	private java.lang.Integer    uDT;
	private java.lang.Integer    metaData;
	private java.lang.Integer    values;
	private java.lang.Integer    type0;
	private java.lang.Integer    primaryKey;
	private java.lang.Integer    primarykey;
	private java.math.BigDecimal field_737;

	public XUnused() {}

	public XUnused(
		java.lang.Integer    id,
		java.lang.String     name,
		java.math.BigInteger bigInteger,
		java.lang.Integer    idRef,
		java.lang.String     nameRef,
		java.lang.Integer    class_,
		java.lang.Integer    fields,
		java.lang.Integer    table,
		java.lang.Integer    configuration,
		java.lang.Integer    uDT,
		java.lang.Integer    metaData,
		java.lang.Integer    values,
		java.lang.Integer    type0,
		java.lang.Integer    primaryKey,
		java.lang.Integer    primarykey,
		java.math.BigDecimal field_737
	) {
		this.id = id;
		this.name = name;
		this.bigInteger = bigInteger;
		this.idRef = idRef;
		this.nameRef = nameRef;
		this.class_ = class_;
		this.fields = fields;
		this.table = table;
		this.configuration = configuration;
		this.uDT = uDT;
		this.metaData = metaData;
		this.values = values;
		this.type0 = type0;
		this.primaryKey = primaryKey;
		this.primarykey = primarykey;
		this.field_737 = field_737;
	}

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public XUnused setId(java.lang.Integer id) {
		this.id = id;
		return this;
	}

	@Override
	public java.lang.String getName() {
		return this.name;
	}

	@Override
	public XUnused setName(java.lang.String name) {
		this.name = name;
		return this;
	}

	@Override
	public java.math.BigInteger getBigInteger() {
		return this.bigInteger;
	}

	@Override
	public XUnused setBigInteger(java.math.BigInteger bigInteger) {
		this.bigInteger = bigInteger;
		return this;
	}

	@Override
	public java.lang.Integer getIdRef() {
		return this.idRef;
	}

	@Override
	public XUnused setIdRef(java.lang.Integer idRef) {
		this.idRef = idRef;
		return this;
	}

	@Override
	public java.lang.String getNameRef() {
		return this.nameRef;
	}

	@Override
	public XUnused setNameRef(java.lang.String nameRef) {
		this.nameRef = nameRef;
		return this;
	}

	@Override
	public java.lang.Integer getClass_() {
		return this.class_;
	}

	@Override
	public XUnused setClass_(java.lang.Integer class_) {
		this.class_ = class_;
		return this;
	}

	@Override
	public java.lang.Integer getFields() {
		return this.fields;
	}

	@Override
	public XUnused setFields(java.lang.Integer fields) {
		this.fields = fields;
		return this;
	}

	@Override
	public java.lang.Integer getTable_() {
		return this.table;
	}

	@Override
	public XUnused setTable_(java.lang.Integer table) {
		this.table = table;
		return this;
	}

	@Override
	public java.lang.Integer getConfiguration() {
		return this.configuration;
	}

	@Override
	public XUnused setConfiguration(java.lang.Integer configuration) {
		this.configuration = configuration;
		return this;
	}

	@Override
	public java.lang.Integer getUDT() {
		return this.uDT;
	}

	@Override
	public XUnused setUDT(java.lang.Integer uDT) {
		this.uDT = uDT;
		return this;
	}

	@Override
	public java.lang.Integer getMetaData() {
		return this.metaData;
	}

	@Override
	public XUnused setMetaData(java.lang.Integer metaData) {
		this.metaData = metaData;
		return this;
	}

	@Override
	public java.lang.Integer getValues() {
		return this.values;
	}

	@Override
	public XUnused setValues(java.lang.Integer values) {
		this.values = values;
		return this;
	}

	@Override
	public java.lang.Integer getType0() {
		return this.type0;
	}

	@Override
	public XUnused setType0(java.lang.Integer type0) {
		this.type0 = type0;
		return this;
	}

	@Override
	public java.lang.Integer getPrimaryKey_() {
		return this.primaryKey;
	}

	@Override
	public XUnused setPrimaryKey_(java.lang.Integer primaryKey) {
		this.primaryKey = primaryKey;
		return this;
	}

	@Override
	public java.lang.Integer getPrimarykey() {
		return this.primarykey;
	}

	@Override
	public XUnused setPrimarykey(java.lang.Integer primarykey) {
		this.primarykey = primarykey;
		return this;
	}

	@Override
	public java.math.BigDecimal getField_737() {
		return this.field_737;
	}

	@Override
	public XUnused setField_737(java.math.BigDecimal field_737) {
		this.field_737 = field_737;
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IXUnused from) {
		setId(from.getId());
		setName(from.getName());
		setBigInteger(from.getBigInteger());
		setIdRef(from.getIdRef());
		setNameRef(from.getNameRef());
		setClass_(from.getClass_());
		setFields(from.getFields());
		setTable_(from.getTable_());
		setConfiguration(from.getConfiguration());
		setUDT(from.getUDT());
		setMetaData(from.getMetaData());
		setValues(from.getValues());
		setType0(from.getType0());
		setPrimaryKey_(from.getPrimaryKey_());
		setPrimarykey(from.getPrimarykey());
		setField_737(from.getField_737());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IXUnused> E into(E into) {
		into.from(this);
		return into;
	}

	// Here, a toString() method could be generated
}
