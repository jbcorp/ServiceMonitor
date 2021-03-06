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
 * <p>Java class for GetPhoneDirectoryEntryResponseDeliveryElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPhoneDirectoryEntryResponseDeliveryElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceIdTelephoneNumber" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}String100"/&gt;
 *         &lt;element name="SubscriptionNumber" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}TelephoneNumber"/&gt;
 *         &lt;element name="UsageType" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}NIDUsageType"/&gt;
 *         &lt;element name="PublicationCodes" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}PublicationCodes"/&gt;
 *         &lt;element name="Printname" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}printnameType"/&gt;
 *         &lt;element name="NIDSubscriberName" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}NIDSubscriberName" minOccurs="0"/&gt;
 *         &lt;element name="NIDAdditionalSubscriberName" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}NIDSubscriberName" minOccurs="0"/&gt;
 *         &lt;element name="NIDSubscriberAddress" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}NIDSubscriberAddress"/&gt;
 *         &lt;element name="replacementflag" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}replacementflagType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPhoneDirectoryEntryResponseDeliveryElement", propOrder = {
    "serviceIdTelephoneNumber",
    "subscriptionNumber",
    "usageType",
    "publicationCodes",
    "printname",
    "nidSubscriberName",
    "nidAdditionalSubscriberName",
    "nidSubscriberAddress",
    "replacementflag"
})
public class GetPhoneDirectoryEntryResponseDeliveryElement {

    @XmlElement(name = "ServiceIdTelephoneNumber", required = true)
    protected String serviceIdTelephoneNumber;
    @XmlElement(name = "SubscriptionNumber", required = true)
    protected String subscriptionNumber;
    @XmlElement(name = "UsageType", required = true)
    protected String usageType;
    @XmlElement(name = "PublicationCodes", required = true)
    @XmlSchemaType(name = "string")
    protected PublicationCodes publicationCodes;
    @XmlElement(name = "Printname", required = true)
    protected String printname;
    @XmlElement(name = "NIDSubscriberName")
    protected NIDSubscriberName nidSubscriberName;
    @XmlElement(name = "NIDAdditionalSubscriberName")
    protected NIDSubscriberName nidAdditionalSubscriberName;
    @XmlElement(name = "NIDSubscriberAddress", required = true)
    protected NIDSubscriberAddress nidSubscriberAddress;
    @XmlElement(required = true)
    protected String replacementflag;

    /**
     * Gets the value of the serviceIdTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceIdTelephoneNumber() {
        return serviceIdTelephoneNumber;
    }

    /**
     * Sets the value of the serviceIdTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceIdTelephoneNumber(String value) {
        this.serviceIdTelephoneNumber = value;
    }

    /**
     * Gets the value of the subscriptionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionNumber() {
        return subscriptionNumber;
    }

    /**
     * Sets the value of the subscriptionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionNumber(String value) {
        this.subscriptionNumber = value;
    }

    /**
     * Gets the value of the usageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageType() {
        return usageType;
    }

    /**
     * Sets the value of the usageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageType(String value) {
        this.usageType = value;
    }

    /**
     * Gets the value of the publicationCodes property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationCodes }
     *     
     */
    public PublicationCodes getPublicationCodes() {
        return publicationCodes;
    }

    /**
     * Sets the value of the publicationCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationCodes }
     *     
     */
    public void setPublicationCodes(PublicationCodes value) {
        this.publicationCodes = value;
    }

    /**
     * Gets the value of the printname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintname() {
        return printname;
    }

    /**
     * Sets the value of the printname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintname(String value) {
        this.printname = value;
    }

    /**
     * Gets the value of the nidSubscriberName property.
     * 
     * @return
     *     possible object is
     *     {@link NIDSubscriberName }
     *     
     */
    public NIDSubscriberName getNIDSubscriberName() {
        return nidSubscriberName;
    }

    /**
     * Sets the value of the nidSubscriberName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NIDSubscriberName }
     *     
     */
    public void setNIDSubscriberName(NIDSubscriberName value) {
        this.nidSubscriberName = value;
    }

    /**
     * Gets the value of the nidAdditionalSubscriberName property.
     * 
     * @return
     *     possible object is
     *     {@link NIDSubscriberName }
     *     
     */
    public NIDSubscriberName getNIDAdditionalSubscriberName() {
        return nidAdditionalSubscriberName;
    }

    /**
     * Sets the value of the nidAdditionalSubscriberName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NIDSubscriberName }
     *     
     */
    public void setNIDAdditionalSubscriberName(NIDSubscriberName value) {
        this.nidAdditionalSubscriberName = value;
    }

    /**
     * Gets the value of the nidSubscriberAddress property.
     * 
     * @return
     *     possible object is
     *     {@link NIDSubscriberAddress }
     *     
     */
    public NIDSubscriberAddress getNIDSubscriberAddress() {
        return nidSubscriberAddress;
    }

    /**
     * Sets the value of the nidSubscriberAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link NIDSubscriberAddress }
     *     
     */
    public void setNIDSubscriberAddress(NIDSubscriberAddress value) {
        this.nidSubscriberAddress = value;
    }

    /**
     * Gets the value of the replacementflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplacementflag() {
        return replacementflag;
    }

    /**
     * Sets the value of the replacementflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplacementflag(String value) {
        this.replacementflag = value;
    }

}
