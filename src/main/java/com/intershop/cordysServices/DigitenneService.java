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
 * <p>Java class for DigitenneService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DigitenneService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:fiber.kpn.com:crm:frontdesk:data:v0}ServiceSpec"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SmartcardCode" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}Digits12" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitenneService", propOrder = {
    "smartcardCode"
})
public class DigitenneService
    extends ServiceSpec
{

    @XmlElement(name = "SmartcardCode")
    protected String smartcardCode;

    /**
     * Gets the value of the smartcardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmartcardCode() {
        return smartcardCode;
    }

    /**
     * Sets the value of the smartcardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmartcardCode(String value) {
        this.smartcardCode = value;
    }

}
