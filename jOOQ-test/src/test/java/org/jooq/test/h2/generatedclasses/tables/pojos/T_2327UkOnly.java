/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.pojos;

/**
 * This is a POJO for table T_2327_UK_ONLY.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_2327UkOnly implements org.jooq.test.h2.generatedclasses.tables.interfaces.IT_2327UkOnly {

	private static final long serialVersionUID = 472642796;

	private java.lang.Integer id;

	public T_2327UkOnly() {}

	public T_2327UkOnly(
		java.lang.Integer id
	) {
		this.id = id;
	}

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public T_2327UkOnly setId(java.lang.Integer id) {
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
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IT_2327UkOnly from) {
		setId(from.getId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IT_2327UkOnly> E into(E into) {
		into.from(this);
		return into;
	}

	// Here, a toString() method could be generated
}
