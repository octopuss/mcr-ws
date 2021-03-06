//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.06 at 05:30:53 PM CEST 
//


package sk.octopuss.moro.mcrws.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="panToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userAccountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="redeemAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "panToken",
    "userAccountId",
    "redeemAmount"
})
@XmlRootElement(name = "redemptionRequest")
public class RedemptionRequest {

    @XmlElement(required = true)
    protected String panToken;
    protected long userAccountId;
    @XmlElement(required = true)
    protected BigDecimal redeemAmount;

    /**
     * Gets the value of the panToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanToken() {
        return panToken;
    }

    /**
     * Sets the value of the panToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanToken(String value) {
        this.panToken = value;
    }

    /**
     * Gets the value of the userAccountId property.
     * 
     */
    public long getUserAccountId() {
        return userAccountId;
    }

    /**
     * Sets the value of the userAccountId property.
     * 
     */
    public void setUserAccountId(long value) {
        this.userAccountId = value;
    }

    /**
     * Gets the value of the redeemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRedeemAmount() {
        return redeemAmount;
    }

    /**
     * Sets the value of the redeemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRedeemAmount(BigDecimal value) {
        this.redeemAmount = value;
    }

}
