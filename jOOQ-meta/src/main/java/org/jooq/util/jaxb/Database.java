//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.16 at 09:49:36 PM MEZ 
//


package org.jooq.util.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Database complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Database">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="includes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="excludes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateAsTimestamp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="unsignedTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="inputSchema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outputSchema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schemata" type="{http://www.jooq.org/xsd/jooq-codegen-2.0.4.xsd}Schemata" minOccurs="0"/>
 *         &lt;element name="masterDataTables" type="{http://www.jooq.org/xsd/jooq-codegen-2.0.4.xsd}MasterDataTables" minOccurs="0"/>
 *         &lt;element name="enumTypes" type="{http://www.jooq.org/xsd/jooq-codegen-2.0.4.xsd}EnumTypes" minOccurs="0"/>
 *         &lt;element name="forcedTypes" type="{http://www.jooq.org/xsd/jooq-codegen-2.0.4.xsd}ForcedTypes" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Database", propOrder = {

})
public class Database {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(defaultValue = ".*")
    protected String includes;
    @XmlElement(defaultValue = "")
    protected String excludes;
    @XmlElement(defaultValue = "false")
    protected Boolean dateAsTimestamp;
    @XmlElement(defaultValue = "true")
    protected Boolean unsignedTypes;
    @XmlElement(defaultValue = "")
    protected String inputSchema;
    @XmlElement(defaultValue = "")
    protected String outputSchema;
    @XmlElementWrapper(name = "schemata")
    @XmlElement(name = "schema")
    protected List<Schema> schemata;
    @XmlElementWrapper(name = "masterDataTables")
    @XmlElement(name = "masterDataTable")
    protected List<MasterDataTable> masterDataTables;
    @XmlElementWrapper(name = "enumTypes")
    @XmlElement(name = "enumType")
    protected List<EnumType> enumTypes;
    @XmlElementWrapper(name = "forcedTypes")
    @XmlElement(name = "forcedType")
    protected List<ForcedType> forcedTypes;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the includes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludes() {
        return includes;
    }

    /**
     * Sets the value of the includes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludes(String value) {
        this.includes = value;
    }

    /**
     * Gets the value of the excludes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcludes() {
        return excludes;
    }

    /**
     * Sets the value of the excludes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcludes(String value) {
        this.excludes = value;
    }

    /**
     * Gets the value of the dateAsTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDateAsTimestamp() {
        return dateAsTimestamp;
    }

    /**
     * Sets the value of the dateAsTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDateAsTimestamp(Boolean value) {
        this.dateAsTimestamp = value;
    }

    /**
     * Gets the value of the unsignedTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnsignedTypes() {
        return unsignedTypes;
    }

    /**
     * Sets the value of the unsignedTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnsignedTypes(Boolean value) {
        this.unsignedTypes = value;
    }

    /**
     * Gets the value of the inputSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputSchema() {
        return inputSchema;
    }

    /**
     * Sets the value of the inputSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputSchema(String value) {
        this.inputSchema = value;
    }

    /**
     * Gets the value of the outputSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputSchema() {
        return outputSchema;
    }

    /**
     * Sets the value of the outputSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputSchema(String value) {
        this.outputSchema = value;
    }

    public List<Schema> getSchemata() {
        if (schemata == null) {
            schemata = new ArrayList<Schema>();
        }
        return schemata;
    }

    public List<MasterDataTable> getMasterDataTables() {
        if (masterDataTables == null) {
            masterDataTables = new ArrayList<MasterDataTable>();
        }
        return masterDataTables;
    }

    public List<EnumType> getEnumTypes() {
        if (enumTypes == null) {
            enumTypes = new ArrayList<EnumType>();
        }
        return enumTypes;
    }

    public List<ForcedType> getForcedTypes() {
        if (forcedTypes == null) {
            forcedTypes = new ArrayList<ForcedType>();
        }
        return forcedTypes;
    }

}