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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckDuplicateVoip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckDuplicateVoip"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerNumber" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}CustomerNumber" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumberInfo" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}DuplicateVoipPhoneNumberInfo"/&gt;
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckDuplicateVoip", propOrder = {
    "customerNumber",
    "phoneNumberInfo",
    "orderID"
})
public class CheckDuplicateVoip {

    @XmlElement(name = "CustomerNumber")
    protected String customerNumber;
    @XmlElement(name = "PhoneNumberInfo", required = true)
    protected DuplicateVoipPhoneNumberInfo phoneNumberInfo;
    @XmlElement(name = "OrderID")
    protected String orderID;

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the phoneNumberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DuplicateVoipPhoneNumberInfo }
     *     
     */
    public DuplicateVoipPhoneNumberInfo getPhoneNumberInfo() {
        return phoneNumberInfo;
    }

    /**
     * Sets the value of the phoneNumberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DuplicateVoipPhoneNumberInfo }
     *     
     */
    public void setPhoneNumberInfo(DuplicateVoipPhoneNumberInfo value) {
        this.phoneNumberInfo = value;
    }

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

}
