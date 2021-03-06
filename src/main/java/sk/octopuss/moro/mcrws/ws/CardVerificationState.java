//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.06 at 05:30:53 PM CEST 
//


package sk.octopuss.moro.mcrws.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cardVerificationState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cardVerificationState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VERIFIED"/>
 *     &lt;enumeration value="VERIFIED_WAITING"/>
 *     &lt;enumeration value="UNVERIFIED"/>
 *     &lt;enumeration value="WAITING_FOR_TRANSACTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cardVerificationState")
@XmlEnum
public enum CardVerificationState {

    VERIFIED,
    VERIFIED_WAITING,
    UNVERIFIED,
    WAITING_FOR_TRANSACTION;

    public String value() {
        return name();
    }

    public static CardVerificationState fromValue(String v) {
        return valueOf(v);
    }

}
