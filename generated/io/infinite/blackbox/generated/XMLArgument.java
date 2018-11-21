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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 https://github.com/INFINITE-TECHNOLOGY/BLACKBOX/wiki#argument
 *             
 * 
 * <p>Java class for Argument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Argument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="argumentValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="argumentClassName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="argumentName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Argument", propOrder = {
    "argumentValue"
})
public class XMLArgument {

    @XmlElement(required = true)
    protected String argumentValue;
    @XmlAttribute(name = "argumentClassName", required = true)
    protected String argumentClassName;
    @XmlAttribute(name = "argumentName", required = true)
    protected String argumentName;

    /**
     * Gets the value of the argumentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArgumentValue() {
        return argumentValue;
    }

    /**
     * Sets the value of the argumentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArgumentValue(String value) {
        this.argumentValue = value;
    }

    /**
     * Gets the value of the argumentClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArgumentClassName() {
        return argumentClassName;
    }

    /**
     * Sets the value of the argumentClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArgumentClassName(String value) {
        this.argumentClassName = value;
    }

    /**
     * Gets the value of the argumentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArgumentName() {
        return argumentName;
    }

    /**
     * Sets the value of the argumentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArgumentName(String value) {
        this.argumentName = value;
    }

}
