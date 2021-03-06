/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.pojos;

/**
 * This is a POJO for table V_AUTHOR.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VAuthor implements org.jooq.test.h2.generatedclasses.tables.interfaces.IVAuthor {

	private static final long serialVersionUID = 873972536;

	private java.lang.Integer id;
	private java.lang.String  firstName;
	private java.lang.String  lastName;
	private java.sql.Date     dateOfBirth;
	private java.lang.Integer yearOfBirth;
	private java.lang.String  address;

	public VAuthor() {}

	public VAuthor(
		java.lang.Integer id,
		java.lang.String  firstName,
		java.lang.String  lastName,
		java.sql.Date     dateOfBirth,
		java.lang.Integer yearOfBirth,
		java.lang.String  address
	) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.address = address;
	}

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public VAuthor setId(java.lang.Integer id) {
		this.id = id;
		return this;
	}

	@Override
	public java.lang.String getFirstName() {
		return this.firstName;
	}

	@Override
	public VAuthor setFirstName(java.lang.String firstName) {
		this.firstName = firstName;
		return this;
	}

	@Override
	public java.lang.String getLastName() {
		return this.lastName;
	}

	@Override
	public VAuthor setLastName(java.lang.String lastName) {
		this.lastName = lastName;
		return this;
	}

	@Override
	public java.sql.Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	@Override
	public VAuthor setDateOfBirth(java.sql.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}

	@Override
	public java.lang.Integer getYearOfBirth() {
		return this.yearOfBirth;
	}

	@Override
	public VAuthor setYearOfBirth(java.lang.Integer yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
		return this;
	}

	@Override
	public java.lang.String getAddress() {
		return this.address;
	}

	@Override
	public VAuthor setAddress(java.lang.String address) {
		this.address = address;
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IVAuthor from) {
		setId(from.getId());
		setFirstName(from.getFirstName());
		setLastName(from.getLastName());
		setDateOfBirth(from.getDateOfBirth());
		setYearOfBirth(from.getYearOfBirth());
		setAddress(from.getAddress());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IVAuthor> E into(E into) {
		into.from(this);
		return into;
	}

	// Here, a toString() method could be generated
}
