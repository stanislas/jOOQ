/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.pojos;

/**
 * This is a POJO for table T_877.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_877 implements org.jooq.test.h2.generatedclasses.tables.interfaces.IT_877 {

	private static final long serialVersionUID = -1511465690;

	private java.lang.Integer id;

	public T_877() {}

	public T_877(
		java.lang.Integer id
	) {
		this.id = id;
	}

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public T_877 setId(java.lang.Integer id) {
		this.id = id;
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IT_877 from) {
		setId(from.getId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IT_877> E into(E into) {
		into.from(this);
		return into;
	}

	// Here, a toString() method could be generated
}
