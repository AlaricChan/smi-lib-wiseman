//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-382 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.05.29 at 01:59:34 PM EDT 
//

package org.dmtf.schemas.wbem.wsman._1.wsman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for MaxEnvelopeSizeType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaxEnvelopeSizeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://schemas.dmtf.org/wbem/wsman/1/wsman.xsd>attributablePositiveInteger">
 *       &lt;attribute name="Policy" type="{http://schemas.dmtf.org/wbem/wsman/1/wsman.xsd}PolicyType" default="Notify" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaxEnvelopeSizeType")
public class MaxEnvelopeSizeType extends AttributablePositiveInteger {

    @XmlAttribute(name = "Policy")
    protected PolicyType policy;


    /**
     * Gets the value of the policy property.
     * 
     * @return possible object is {@link PolicyType }
     * 
     */
    public PolicyType getPolicy() {
        if (policy == null) {
            return PolicyType.NOTIFY;
        } else {
            return policy;
        }
    }


    /**
     * Sets the value of the policy property.
     * 
     * @param value allowed object is {@link PolicyType }
     * 
     */
    public void setPolicy(PolicyType value) {
        this.policy = value;
    }

}
