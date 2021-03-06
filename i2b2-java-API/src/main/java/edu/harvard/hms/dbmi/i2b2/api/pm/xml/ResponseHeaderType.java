/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.pm.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for response_headerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="response_headerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="info" type="{http://www.i2b2.org/xsd/hive/msg/1.1/}infoType"/>
 *         &lt;element name="result_status" type="{http://www.i2b2.org/xsd/hive/msg/1.1/}result_statusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "response_headerType", namespace = "http://www.i2b2.org/xsd/hive/msg/1.1/", propOrder = {
    "info",
    "resultStatus"
})
public class ResponseHeaderType {

    @XmlElement(required = true)
    protected InfoType info;
    @XmlElement(name = "result_status", required = true)
    protected ResultStatusType resultStatus;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link InfoType }
     *     
     */
    public InfoType getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoType }
     *     
     */
    public void setInfo(InfoType value) {
        this.info = value;
    }

    /**
     * Gets the value of the resultStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResultStatusType }
     *     
     */
    public ResultStatusType getResultStatus() {
        return resultStatus;
    }

    /**
     * Sets the value of the resultStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultStatusType }
     *     
     */
    public void setResultStatus(ResultStatusType value) {
        this.resultStatus = value;
    }

}
