/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.pojos;

/**
 * This is a POJO for table X_TEST_CASE_64_69.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_64_69 implements org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_64_69 {

	private static final long serialVersionUID = 1809538171;

	private java.lang.Integer id;
	private java.lang.Integer unusedId;

	public XTestCase_64_69() {}

	public XTestCase_64_69(
		java.lang.Integer id,
		java.lang.Integer unusedId
	) {
		this.id = id;
		this.unusedId = unusedId;
	}

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public XTestCase_64_69 setId(java.lang.Integer id) {
		this.id = id;
		return this;
	}

	@Override
	public java.lang.Integer getUnusedId() {
		return this.unusedId;
	}

	@Override
	public XTestCase_64_69 setUnusedId(java.lang.Integer unusedId) {
		this.unusedId = unusedId;
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_64_69 from) {
		setId(from.getId());
		setUnusedId(from.getUnusedId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_64_69> E into(E into) {
		into.from(this);
		return into;
	}

	// Here, a toString() method could be generated
}
