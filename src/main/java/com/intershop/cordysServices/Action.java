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
 * <p>Java class for Action.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Action"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NoChange"/&gt;
 *     &lt;enumeration value="Delete"/&gt;
 *     &lt;enumeration value="New"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Action")
@XmlEnum
public enum Action {

    @XmlEnumValue("NoChange")
    NO_CHANGE("NoChange"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("New")
    NEW("New");
    private final String value;

    Action(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Action fromValue(String v) {
        for (Action c: Action.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
