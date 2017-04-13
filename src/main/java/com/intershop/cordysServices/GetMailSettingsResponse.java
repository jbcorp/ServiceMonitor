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
 * <p>Java class for GetMailSettingsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMailSettingsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="MailSettings" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}GetMailSettingsResponseParameters"/&gt;
 *         &lt;element name="Error" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}GetMailSettingsError"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMailSettingsResponse", propOrder = {
    "mailSettings",
    "error"
})
public class GetMailSettingsResponse {

    @XmlElement(name = "MailSettings")
    protected GetMailSettingsResponseParameters mailSettings;
    @XmlElement(name = "Error")
    @XmlSchemaType(name = "string")
    protected GetMailSettingsError error;

    /**
     * Gets the value of the mailSettings property.
     * 
     * @return
     *     possible object is
     *     {@link GetMailSettingsResponseParameters }
     *     
     */
    public GetMailSettingsResponseParameters getMailSettings() {
        return mailSettings;
    }

    /**
     * Sets the value of the mailSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMailSettingsResponseParameters }
     *     
     */
    public void setMailSettings(GetMailSettingsResponseParameters value) {
        this.mailSettings = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link GetMailSettingsError }
     *     
     */
    public GetMailSettingsError getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMailSettingsError }
     *     
     */
    public void setError(GetMailSettingsError value) {
        this.error = value;
    }

}