//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.13 at 01:29:05 PM IST 
//


package com.intershop.cordysServices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:fiber.kpn.com:crm:frontdesk:data:v0}ServiceBare"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Product" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}DiscountProducts" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CarrierTechnology" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SelfcareUsername" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}EmailAddress64"/&gt;
 *         &lt;element name="PhoneNumberInfo" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}PhoneNumberInfo" maxOccurs="8" minOccurs="0"/&gt;
 *         &lt;element name="LineSharing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageService", propOrder = {
    "product",
    "carrierTechnology",
    "selfcareUsername",
    "phoneNumberInfo",
    "lineSharing"
})
public class PackageService
    extends ServiceBare
{

    @XmlElement(name = "Product")
    protected List<DiscountProducts> product;
    @XmlElement(name = "CarrierTechnology")
    protected String carrierTechnology;
    @XmlElement(name = "SelfcareUsername", required = true)
    protected String selfcareUsername;
    @XmlElement(name = "PhoneNumberInfo")
    protected List<PhoneNumberInfo> phoneNumberInfo;
    @XmlElement(name = "LineSharing")
    protected String lineSharing;

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountProducts }
     * 
     * 
     */
    public List<DiscountProducts> getProduct() {
        if (product == null) {
            product = new ArrayList<DiscountProducts>();
        }
        return this.product;
    }

    /**
     * Gets the value of the carrierTechnology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierTechnology() {
        return carrierTechnology;
    }

    /**
     * Sets the value of the carrierTechnology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierTechnology(String value) {
        this.carrierTechnology = value;
    }

    /**
     * Gets the value of the selfcareUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfcareUsername() {
        return selfcareUsername;
    }

    /**
     * Sets the value of the selfcareUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfcareUsername(String value) {
        this.selfcareUsername = value;
    }

    /**
     * Gets the value of the phoneNumberInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNumberInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneNumberInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneNumberInfo }
     * 
     * 
     */
    public List<PhoneNumberInfo> getPhoneNumberInfo() {
        if (phoneNumberInfo == null) {
            phoneNumberInfo = new ArrayList<PhoneNumberInfo>();
        }
        return this.phoneNumberInfo;
    }

    /**
     * Gets the value of the lineSharing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineSharing() {
        return lineSharing;
    }

    /**
     * Sets the value of the lineSharing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineSharing(String value) {
        this.lineSharing = value;
    }

}
