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
 * <p>Java class for HomepageSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HomepageSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TargetHomepageCreated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SourceDefaultDocumentCreated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DestinationFolder" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HomepageSummary", propOrder = {
    "targetHomepageCreated",
    "sourceDefaultDocumentCreated",
    "destinationFolder"
})
public class HomepageSummary {

    @XmlElement(name = "TargetHomepageCreated")
    protected boolean targetHomepageCreated;
    @XmlElement(name = "SourceDefaultDocumentCreated")
    protected boolean sourceDefaultDocumentCreated;
    @XmlElement(name = "DestinationFolder", required = true)
    protected String destinationFolder;

    /**
     * Gets the value of the targetHomepageCreated property.
     * 
     */
    public boolean isTargetHomepageCreated() {
        return targetHomepageCreated;
    }

    /**
     * Sets the value of the targetHomepageCreated property.
     * 
     */
    public void setTargetHomepageCreated(boolean value) {
        this.targetHomepageCreated = value;
    }

    /**
     * Gets the value of the sourceDefaultDocumentCreated property.
     * 
     */
    public boolean isSourceDefaultDocumentCreated() {
        return sourceDefaultDocumentCreated;
    }

    /**
     * Sets the value of the sourceDefaultDocumentCreated property.
     * 
     */
    public void setSourceDefaultDocumentCreated(boolean value) {
        this.sourceDefaultDocumentCreated = value;
    }

    /**
     * Gets the value of the destinationFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationFolder() {
        return destinationFolder;
    }

    /**
     * Sets the value of the destinationFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationFolder(String value) {
        this.destinationFolder = value;
    }

}