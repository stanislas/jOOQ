/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "vProductAndDescription", schema = "Production")
public class vProductAndDescription extends org.jooq.impl.TableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.vProductAndDescription> {

	private static final long serialVersionUID = -459579110;

	/**
	 * An uncommented item
	 */
	public void setProductID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductAndDescription.vProductAndDescription.ProductID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ProductID", nullable = false, precision = 10)
	public java.lang.Integer getProductID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductAndDescription.vProductAndDescription.ProductID);
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductAndDescription.vProductAndDescription.Name, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductAndDescription.vProductAndDescription.Name);
	}

	/**
	 * An uncommented item
	 */
	public void setProductModel(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductAndDescription.vProductAndDescription.ProductModel, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ProductModel", nullable = false, length = 50)
	public java.lang.String getProductModel() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductAndDescription.vProductAndDescription.ProductModel);
	}

	/**
	 * An uncommented item
	 */
	public void setCultureID(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductAndDescription.vProductAndDescription.CultureID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "CultureID", nullable = false, length = 6)
	public java.lang.String getCultureID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductAndDescription.vProductAndDescription.CultureID);
	}

	/**
	 * An uncommented item
	 */
	public void setDescription(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductAndDescription.vProductAndDescription.Description, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Description", nullable = false, length = 400)
	public java.lang.String getDescription() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductAndDescription.vProductAndDescription.Description);
	}

	/**
	 * Create a detached vProductAndDescription
	 */
	public vProductAndDescription() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.vProductAndDescription.vProductAndDescription);
	}
}