//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.13 at 01:29:05 PM IST 
//


package com.intershop.cordysServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetItvPincodeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetItvPincodeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ItvPincode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Error" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}GetItvPincodeError"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItvPincodeResponse", propOrder = {
    "itvPincode",
    "error"
})
public class GetItvPincodeResponse {

    @XmlElement(name = "ItvPincode")
    protected String itvPincode;
    @XmlElement(name = "Error")
    @XmlSchemaType(name = "string")
    protected GetItvPincodeError error;

    /**
     * Gets the value of the itvPincode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItvPincode() {
        return itvPincode;
    }

    /**
     * Sets the value of the itvPincode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItvPincode(String value) {
        this.itvPincode = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link GetItvPincodeError }
     *     
     */
    public GetItvPincodeError getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetItvPincodeError }
     *     
     */
    public void setError(GetItvPincodeError value) {
        this.error = value;
    }

}
