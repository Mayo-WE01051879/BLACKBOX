//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.21 at 05:18:42 PM GST 
//


package io.infinite.blackbox.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *                 https://github.com/INFINITE-TECHNOLOGY/BLACKBOX/wiki#exceptionreference
 *             
 * 
 * <p>Java class for ExceptionReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExceptionReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="exceptionDateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="exceptionUid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isAlreadyLogged" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionReference")
@XmlSeeAlso({
    XMLException.class
})
public class XMLExceptionReference {

    @XmlAttribute(name = "exceptionDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exceptionDateTime;
    @XmlAttribute(name = "exceptionUid")
    protected String exceptionUid;
    @XmlAttribute(name = "isAlreadyLogged")
    protected Boolean isAlreadyLogged;

    /**
     * Gets the value of the exceptionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExceptionDateTime() {
        return exceptionDateTime;
    }

    /**
     * Sets the value of the exceptionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExceptionDateTime(XMLGregorianCalendar value) {
        this.exceptionDateTime = value;
    }

    /**
     * Gets the value of the exceptionUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionUid() {
        return exceptionUid;
    }

    /**
     * Sets the value of the exceptionUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionUid(String value) {
        this.exceptionUid = value;
    }

    /**
     * Gets the value of the isAlreadyLogged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAlreadyLogged() {
        return isAlreadyLogged;
    }

    /**
     * Sets the value of the isAlreadyLogged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAlreadyLogged(Boolean value) {
        this.isAlreadyLogged = value;
    }

}
