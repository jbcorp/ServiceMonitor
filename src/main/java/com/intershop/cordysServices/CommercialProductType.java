//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.13 at 01:29:05 PM IST 
//


package com.intershop.cordysServices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommercialProductType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommercialProductType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Promotion"/&gt;
 *     &lt;enumeration value="Package"/&gt;
 *     &lt;enumeration value="Add-on"/&gt;
 *     &lt;enumeration value="Discount"/&gt;
 *     &lt;enumeration value="AdditionalCost"/&gt;
 *     &lt;enumeration value="Service"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommercialProductType")
@XmlEnum
public enum CommercialProductType {

    @XmlEnumValue("Promotion")
    PROMOTION("Promotion"),
    @XmlEnumValue("Package")
    PACKAGE("Package"),
    @XmlEnumValue("Add-on")
    ADD_ON("Add-on"),
    @XmlEnumValue("Discount")
    DISCOUNT("Discount"),
    @XmlEnumValue("AdditionalCost")
    ADDITIONAL_COST("AdditionalCost"),
    @XmlEnumValue("Service")
    SERVICE("Service");
    private final String value;

    CommercialProductType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommercialProductType fromValue(String v) {
        for (CommercialProductType c: CommercialProductType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
