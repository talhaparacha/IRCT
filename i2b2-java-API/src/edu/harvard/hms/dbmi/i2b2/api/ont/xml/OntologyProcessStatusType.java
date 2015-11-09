/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.ont.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ontologyProcessStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ontologyProcessStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="process_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="process_type_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="process_step_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="start_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="end_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="process_status_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="crc_upload_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ontologyProcessStatusType", propOrder = {
    "processId",
    "processTypeCd",
    "processStepCd",
    "startDate",
    "endDate",
    "processStatusCd",
    "crcUploadId",
    "message"
})
public class OntologyProcessStatusType {

    @XmlElement(name = "process_id", required = true)
    protected String processId;
    @XmlElement(name = "process_type_cd", required = true)
    protected String processTypeCd;
    @XmlElement(name = "process_step_cd", required = true)
    protected String processStepCd;
    @XmlElement(name = "start_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "end_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "process_status_cd", required = true)
    protected String processStatusCd;
    @XmlElement(name = "crc_upload_id", required = true)
    protected String crcUploadId;
    @XmlElement(required = true)
    protected String message;

    /**
     * Gets the value of the processId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * Sets the value of the processId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessId(String value) {
        this.processId = value;
    }

    /**
     * Gets the value of the processTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessTypeCd() {
        return processTypeCd;
    }

    /**
     * Sets the value of the processTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessTypeCd(String value) {
        this.processTypeCd = value;
    }

    /**
     * Gets the value of the processStepCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessStepCd() {
        return processStepCd;
    }

    /**
     * Sets the value of the processStepCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessStepCd(String value) {
        this.processStepCd = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the processStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessStatusCd() {
        return processStatusCd;
    }

    /**
     * Sets the value of the processStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessStatusCd(String value) {
        this.processStatusCd = value;
    }

    /**
     * Gets the value of the crcUploadId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrcUploadId() {
        return crcUploadId;
    }

    /**
     * Sets the value of the crcUploadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrcUploadId(String value) {
        this.crcUploadId = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
