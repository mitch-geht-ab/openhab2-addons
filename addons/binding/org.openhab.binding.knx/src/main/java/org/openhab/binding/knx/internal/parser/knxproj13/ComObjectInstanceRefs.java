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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComObjectInstanceRefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComObjectInstanceRefs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComObjectInstanceRef" type="{http://knx.org/xml/project/13}ComObjectInstanceRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComObjectInstanceRefs", propOrder = {
    "comObjectInstanceRef"
})
public class ComObjectInstanceRefs {

    @XmlElement(name = "ComObjectInstanceRef")
    protected List<ComObjectInstanceRef> comObjectInstanceRef;

    /**
     * Gets the value of the comObjectInstanceRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comObjectInstanceRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComObjectInstanceRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComObjectInstanceRef }
     * 
     * 
     */
    public List<ComObjectInstanceRef> getComObjectInstanceRef() {
        if (comObjectInstanceRef == null) {
            comObjectInstanceRef = new ArrayList<ComObjectInstanceRef>();
        }
        return this.comObjectInstanceRef;
    }

}
