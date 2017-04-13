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
 * <p>Java class for AddressInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZipCode" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}ZipCode"/&gt;
 *         &lt;element name="HouseNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HouseNumberExtension" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}String5" minOccurs="0"/&gt;
 *         &lt;element name="internetCapabilities" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}internetCapabilities"/&gt;
 *         &lt;element name="tvProfiles" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}tvProfiles"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressInformation", propOrder = {
    "zipCode",
    "houseNumber",
    "houseNumberExtension",
    "internetCapabilities",
    "tvProfiles"
})
public class AddressInformation {

    @XmlElement(name = "ZipCode", required = true)
    protected String zipCode;
    @XmlElement(name = "HouseNumber")
    protected int houseNumber;
    @XmlElement(name = "HouseNumberExtension")
    protected String houseNumberExtension;
    @XmlElement(required = true)
    protected InternetCapabilities internetCapabilities;
    @XmlElement(required = true)
    protected TvProfiles tvProfiles;

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the houseNumber property.
     * 
     */
    public int getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     * 
     */
    public void setHouseNumber(int value) {
        this.houseNumber = value;
    }

    /**
     * Gets the value of the houseNumberExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumberExtension() {
        return houseNumberExtension;
    }

    /**
     * Sets the value of the houseNumberExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumberExtension(String value) {
        this.houseNumberExtension = value;
    }

    /**
     * Gets the value of the internetCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link InternetCapabilities }
     *     
     */
    public InternetCapabilities getInternetCapabilities() {
        return internetCapabilities;
    }

    /**
     * Sets the value of the internetCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternetCapabilities }
     *     
     */
    public void setInternetCapabilities(InternetCapabilities value) {
        this.internetCapabilities = value;
    }

    /**
     * Gets the value of the tvProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link TvProfiles }
     *     
     */
    public TvProfiles getTvProfiles() {
        return tvProfiles;
    }

    /**
     * Sets the value of the tvProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link TvProfiles }
     *     
     */
    public void setTvProfiles(TvProfiles value) {
        this.tvProfiles = value;
    }

}