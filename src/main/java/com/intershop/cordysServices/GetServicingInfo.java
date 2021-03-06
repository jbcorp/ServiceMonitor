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
 * <p>Java class for GetServicingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetServicingInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InstallationType" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}String20"/&gt;
 *         &lt;element name="FiberProximity" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}FiberProximity" minOccurs="0"/&gt;
 *         &lt;element name="PrequalInfo" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}PrequalInfo" minOccurs="0"/&gt;
 *         &lt;element name="OrderScenario" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}String50" minOccurs="0"/&gt;
 *         &lt;element name="NlType" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}String20" minOccurs="0"/&gt;
 *         &lt;element name="FTUType" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}String20" minOccurs="0"/&gt;
 *         &lt;element name="Zipcode" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}String20" minOccurs="0"/&gt;
 *         &lt;element name="HouseNumber" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}String20" minOccurs="0"/&gt;
 *         &lt;element name="HouseNumberExtension" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}String20" minOccurs="0"/&gt;
 *         &lt;element name="CarrierTechnologyType" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}String20" minOccurs="0"/&gt;
 *         &lt;element name="TestEnLabel" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}Flag" minOccurs="0"/&gt;
 *         &lt;element name="AccessInstallation" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}AccessInstallation" minOccurs="0"/&gt;
 *         &lt;element name="OldCarrierTechnology" type="{urn:fiber.kpn.com:crm:frontdesk:data:v0}String20" minOccurs="0"/&gt;
 *         &lt;element name="DetermineAOSFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InitialOrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetServicingInfo", propOrder = {
    "installationType",
    "fiberProximity",
    "prequalInfo",
    "orderScenario",
    "nlType",
    "ftuType",
    "zipcode",
    "houseNumber",
    "houseNumberExtension",
    "carrierTechnologyType",
    "testEnLabel",
    "accessInstallation",
    "oldCarrierTechnology",
    "determineAOSFlag",
    "orderType",
    "initialOrderType"
})
public class GetServicingInfo {

    @XmlElement(name = "InstallationType", required = true)
    protected String installationType;
    @XmlElement(name = "FiberProximity")
    @XmlSchemaType(name = "string")
    protected FiberProximity fiberProximity;
    @XmlElement(name = "PrequalInfo")
    protected PrequalInfo prequalInfo;
    @XmlElement(name = "OrderScenario")
    protected String orderScenario;
    @XmlElement(name = "NlType")
    protected String nlType;
    @XmlElement(name = "FTUType")
    protected String ftuType;
    @XmlElement(name = "Zipcode")
    protected String zipcode;
    @XmlElement(name = "HouseNumber")
    protected String houseNumber;
    @XmlElement(name = "HouseNumberExtension")
    protected String houseNumberExtension;
    @XmlElement(name = "CarrierTechnologyType")
    protected String carrierTechnologyType;
    @XmlElement(name = "TestEnLabel")
    protected String testEnLabel;
    @XmlElement(name = "AccessInstallation")
    @XmlSchemaType(name = "string")
    protected AccessInstallation accessInstallation;
    @XmlElement(name = "OldCarrierTechnology")
    protected String oldCarrierTechnology;
    @XmlElement(name = "DetermineAOSFlag")
    protected Boolean determineAOSFlag;
    @XmlElement(name = "OrderType", required = true)
    protected String orderType;
    @XmlElement(name = "InitialOrderType")
    protected String initialOrderType;

    /**
     * Gets the value of the installationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallationType() {
        return installationType;
    }

    /**
     * Sets the value of the installationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallationType(String value) {
        this.installationType = value;
    }

    /**
     * Gets the value of the fiberProximity property.
     * 
     * @return
     *     possible object is
     *     {@link FiberProximity }
     *     
     */
    public FiberProximity getFiberProximity() {
        return fiberProximity;
    }

    /**
     * Sets the value of the fiberProximity property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiberProximity }
     *     
     */
    public void setFiberProximity(FiberProximity value) {
        this.fiberProximity = value;
    }

    /**
     * Gets the value of the prequalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PrequalInfo }
     *     
     */
    public PrequalInfo getPrequalInfo() {
        return prequalInfo;
    }

    /**
     * Sets the value of the prequalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrequalInfo }
     *     
     */
    public void setPrequalInfo(PrequalInfo value) {
        this.prequalInfo = value;
    }

    /**
     * Gets the value of the orderScenario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderScenario() {
        return orderScenario;
    }

    /**
     * Sets the value of the orderScenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderScenario(String value) {
        this.orderScenario = value;
    }

    /**
     * Gets the value of the nlType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNlType() {
        return nlType;
    }

    /**
     * Sets the value of the nlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNlType(String value) {
        this.nlType = value;
    }

    /**
     * Gets the value of the ftuType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTUType() {
        return ftuType;
    }

    /**
     * Sets the value of the ftuType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTUType(String value) {
        this.ftuType = value;
    }

    /**
     * Gets the value of the zipcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * Sets the value of the zipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipcode(String value) {
        this.zipcode = value;
    }

    /**
     * Gets the value of the houseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumber(String value) {
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
     * Gets the value of the carrierTechnologyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierTechnologyType() {
        return carrierTechnologyType;
    }

    /**
     * Sets the value of the carrierTechnologyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierTechnologyType(String value) {
        this.carrierTechnologyType = value;
    }

    /**
     * Gets the value of the testEnLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestEnLabel() {
        return testEnLabel;
    }

    /**
     * Sets the value of the testEnLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestEnLabel(String value) {
        this.testEnLabel = value;
    }

    /**
     * Gets the value of the accessInstallation property.
     * 
     * @return
     *     possible object is
     *     {@link AccessInstallation }
     *     
     */
    public AccessInstallation getAccessInstallation() {
        return accessInstallation;
    }

    /**
     * Sets the value of the accessInstallation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessInstallation }
     *     
     */
    public void setAccessInstallation(AccessInstallation value) {
        this.accessInstallation = value;
    }

    /**
     * Gets the value of the oldCarrierTechnology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldCarrierTechnology() {
        return oldCarrierTechnology;
    }

    /**
     * Sets the value of the oldCarrierTechnology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldCarrierTechnology(String value) {
        this.oldCarrierTechnology = value;
    }

    /**
     * Gets the value of the determineAOSFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDetermineAOSFlag() {
        return determineAOSFlag;
    }

    /**
     * Sets the value of the determineAOSFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetermineAOSFlag(Boolean value) {
        this.determineAOSFlag = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the initialOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialOrderType() {
        return initialOrderType;
    }

    /**
     * Sets the value of the initialOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialOrderType(String value) {
        this.initialOrderType = value;
    }

}
