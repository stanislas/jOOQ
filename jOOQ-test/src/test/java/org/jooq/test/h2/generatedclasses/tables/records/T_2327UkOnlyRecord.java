/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_2327UkOnlyRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.T_2327UkOnlyRecord> implements org.jooq.Record1<java.lang.Integer>, org.jooq.test.h2.generatedclasses.tables.interfaces.IT_2327UkOnly {

	private static final long serialVersionUID = -2003697684;

	/**
	 * Setter for <code>PUBLIC.T_2327_UK_ONLY.ID</code>.
	 */
	@Override
	public T_2327UkOnlyRecord setId(java.lang.Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_2327_UK_ONLY.ID</code>.
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> fieldsRow() {
		return (org.jooq.Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> valuesRow() {
		return (org.jooq.Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.h2.generatedclasses.tables.T_2327UkOnly.T_2327_UK_ONLY.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2327UkOnlyRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2327UkOnlyRecord values(java.lang.Integer value1) {
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

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_2327UkOnlyRecord
	 */
	public T_2327UkOnlyRecord() {
		super(org.jooq.test.h2.generatedclasses.tables.T_2327UkOnly.T_2327_UK_ONLY);
	}

	/**
	 * Create a detached, initialised T_2327UkOnlyRecord
	 */
	public T_2327UkOnlyRecord(java.lang.Integer id) {
		super(org.jooq.test.h2.generatedclasses.tables.T_2327UkOnly.T_2327_UK_ONLY);

		setValue(0, id);
	}
}
