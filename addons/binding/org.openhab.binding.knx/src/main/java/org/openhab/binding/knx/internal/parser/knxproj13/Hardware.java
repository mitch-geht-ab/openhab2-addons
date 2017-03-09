//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.09 at 08:34:29 PM CET 
//


package org.openhab.binding.knx.internal.parser.knxproj13;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Hardware complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Hardware">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Products" type="{http://knx.org/xml/project/13}Products" minOccurs="0"/>
 *         &lt;element name="Hardware" type="{http://knx.org/xml/project/13}Hardware" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Hardware2Programs" type="{http://knx.org/xml/project/13}Hardware2Programs" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VersionNumber" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="BusCurrent" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="IsAccessory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HasIndividualAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HasApplicationProgram" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HasApplicationProgram2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsPowerSupply" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsChoke" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsCoupler" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsPowerLineRepeater" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsPowerLineSignalFilter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsCable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NonRegRelevantDataVersion" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="IsIPEnabled" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OriginalManufacturer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hardware", propOrder = {
    "products",
    "hardware",
    "hardware2Programs"
})
public class Hardware {

    @XmlElement(name = "Products")
    protected Products products;
    @XmlElement(name = "Hardware")
    protected List<Hardware> hardware;
    @XmlElement(name = "Hardware2Programs")
    protected Hardware2Programs hardware2Programs;
    @XmlAttribute(name = "Id")
    protected java.lang.String id;
    @XmlAttribute(name = "Name")
    protected java.lang.String name;
    @XmlAttribute(name = "SerialNumber")
    protected java.lang.String serialNumber;
    @XmlAttribute(name = "VersionNumber")
    protected Byte versionNumber;
    @XmlAttribute(name = "BusCurrent")
    protected java.lang.Float busCurrent;
    @XmlAttribute(name = "IsAccessory")
    protected java.lang.String isAccessory;
    @XmlAttribute(name = "HasIndividualAddress")
    protected java.lang.String hasIndividualAddress;
    @XmlAttribute(name = "HasApplicationProgram")
    protected java.lang.String hasApplicationProgram;
    @XmlAttribute(name = "HasApplicationProgram2")
    protected java.lang.String hasApplicationProgram2;
    @XmlAttribute(name = "IsPowerSupply")
    protected java.lang.String isPowerSupply;
    @XmlAttribute(name = "IsChoke")
    protected java.lang.String isChoke;
    @XmlAttribute(name = "IsCoupler")
    protected java.lang.String isCoupler;
    @XmlAttribute(name = "IsPowerLineRepeater")
    protected java.lang.String isPowerLineRepeater;
    @XmlAttribute(name = "IsPowerLineSignalFilter")
    protected java.lang.String isPowerLineSignalFilter;
    @XmlAttribute(name = "IsCable")
    protected java.lang.String isCable;
    @XmlAttribute(name = "NonRegRelevantDataVersion")
    protected Byte nonRegRelevantDataVersion;
    @XmlAttribute(name = "IsIPEnabled")
    protected java.lang.String isIPEnabled;
    @XmlAttribute(name = "OriginalManufacturer")
    protected java.lang.String originalManufacturer;

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link Products }
     *     
     */
    public Products getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link Products }
     *     
     */
    public void setProducts(Products value) {
        this.products = value;
    }

    /**
     * Gets the value of the hardware property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hardware property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHardware().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hardware }
     * 
     * 
     */
    public List<Hardware> getHardware() {
        if (hardware == null) {
            hardware = new ArrayList<Hardware>();
        }
        return this.hardware;
    }

    /**
     * Gets the value of the hardware2Programs property.
     * 
     * @return
     *     possible object is
     *     {@link Hardware2Programs }
     *     
     */
    public Hardware2Programs getHardware2Programs() {
        return hardware2Programs;
    }

    /**
     * Sets the value of the hardware2Programs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hardware2Programs }
     *     
     */
    public void setHardware2Programs(Hardware2Programs value) {
        this.hardware2Programs = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setName(java.lang.String value) {
        this.name = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSerialNumber(java.lang.String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setVersionNumber(Byte value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the busCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getBusCurrent() {
        return busCurrent;
    }

    /**
     * Sets the value of the busCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setBusCurrent(java.lang.Float value) {
        this.busCurrent = value;
    }

    /**
     * Gets the value of the isAccessory property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getIsAccessory() {
        return isAccessory;
    }

    /**
     * Sets the value of the isAccessory property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setIsAccessory(java.lang.String value) {
        this.isAccessory = value;
    }

    /**
     * Gets the value of the hasIndividualAddress property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getHasIndividualAddress() {
        return hasIndividualAddress;
    }

    /**
     * Sets the value of the hasIndividualAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setHasIndividualAddress(java.lang.String value) {
        this.hasIndividualAddress = value;
    }

    /**
     * Gets the value of the hasApplicationProgram property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getHasApplicationProgram() {
        return hasApplicationProgram;
    }

    /**
     * Sets the value of the hasApplicationProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setHasApplicationProgram(java.lang.String value) {
        this.hasApplicationProgram = value;
    }

    /**
     * Gets the value of the hasApplicationProgram2 property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getHasApplicationProgram2() {
        return hasApplicationProgram2;
    }

    /**
     * Sets the value of the hasApplicationProgram2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setHasApplicationProgram2(java.lang.String value) {
        this.hasApplicationProgram2 = value;
    }

    /**
     * Gets the value of the isPowerSupply property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getIsPowerSupply() {
        return isPowerSupply;
    }

    /**
     * Sets the value of the isPowerSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setIsPowerSupply(java.lang.String value) {
        this.isPowerSupply = value;
    }

    /**
     * Gets the value of the isChoke property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getIsChoke() {
        return isChoke;
    }

    /**
     * Sets the value of the isChoke property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setIsChoke(java.lang.String value) {
        this.isChoke = value;
    }

    /**
     * Gets the value of the isCoupler property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getIsCoupler() {
        return isCoupler;
    }

    /**
     * Sets the value of the isCoupler property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setIsCoupler(java.lang.String value) {
        this.isCoupler = value;
    }

    /**
     * Gets the value of the isPowerLineRepeater property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getIsPowerLineRepeater() {
        return isPowerLineRepeater;
    }

    /**
     * Sets the value of the isPowerLineRepeater property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setIsPowerLineRepeater(java.lang.String value) {
        this.isPowerLineRepeater = value;
    }

    /**
     * Gets the value of the isPowerLineSignalFilter property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getIsPowerLineSignalFilter() {
        return isPowerLineSignalFilter;
    }

    /**
     * Sets the value of the isPowerLineSignalFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setIsPowerLineSignalFilter(java.lang.String value) {
        this.isPowerLineSignalFilter = value;
    }

    /**
     * Gets the value of the isCable property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getIsCable() {
        return isCable;
    }

    /**
     * Sets the value of the isCable property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setIsCable(java.lang.String value) {
        this.isCable = value;
    }

    /**
     * Gets the value of the nonRegRelevantDataVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getNonRegRelevantDataVersion() {
        return nonRegRelevantDataVersion;
    }

    /**
     * Sets the value of the nonRegRelevantDataVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setNonRegRelevantDataVersion(Byte value) {
        this.nonRegRelevantDataVersion = value;
    }

    /**
     * Gets the value of the isIPEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getIsIPEnabled() {
        return isIPEnabled;
    }

    /**
     * Sets the value of the isIPEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setIsIPEnabled(java.lang.String value) {
        this.isIPEnabled = value;
    }

    /**
     * Gets the value of the originalManufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOriginalManufacturer() {
        return originalManufacturer;
    }

    /**
     * Sets the value of the originalManufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOriginalManufacturer(java.lang.String value) {
        this.originalManufacturer = value;
    }

}
