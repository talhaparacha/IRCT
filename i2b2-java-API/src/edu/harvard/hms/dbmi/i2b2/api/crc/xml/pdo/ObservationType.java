/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for observationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="observationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="event_id">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" default="HIVE" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="patient_id" type="{http://www.i2b2.org/xsd/hive/pdo/1.1/}patientIdType"/>
 *         &lt;element name="concept_cd">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="observer_cd">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="start_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="modifier_cd">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="instance_num">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valuetype_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tval_char" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nval_num">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attribute name="units" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valueflag_cd">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="quantity_num" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="units_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="end_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="location_cd">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="confidence_num" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="observation_blob" type="{http://www.i2b2.org/xsd/hive/pdo/1.1/}blobType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.i2b2.org/xsd/hive/pdo/1.1/}techDataAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "observationType", namespace = "http://www.i2b2.org/xsd/hive/pdo/1.1/", propOrder = {
    "eventId",
    "patientId",
    "conceptCd",
    "observerCd",
    "startDate",
    "modifierCd",
    "instanceNum",
    "valuetypeCd",
    "tvalChar",
    "nvalNum",
    "valueflagCd",
    "quantityNum",
    "unitsCd",
    "endDate",
    "locationCd",
    "confidenceNum",
    "observationBlob"
})
public class ObservationType {

    @XmlElement(name = "event_id", required = true)
    protected ObservationType.EventId eventId;
    @XmlElement(name = "patient_id", required = true)
    protected PatientIdType patientId;
    @XmlElement(name = "concept_cd", required = true)
    protected ObservationType.ConceptCd conceptCd;
    @XmlElement(name = "observer_cd", required = true)
    protected ObservationType.ObserverCd observerCd;
    @XmlElement(name = "start_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "modifier_cd", required = true)
    protected ObservationType.ModifierCd modifierCd;
    @XmlElement(name = "instance_num", required = true)
    protected ObservationType.InstanceNum instanceNum;
    @XmlElement(name = "valuetype_cd", required = true)
    protected String valuetypeCd;
    @XmlElement(name = "tval_char", required = true)
    protected String tvalChar;
    @XmlElement(name = "nval_num", required = true)
    protected ObservationType.NvalNum nvalNum;
    @XmlElement(name = "valueflag_cd", required = true)
    protected ObservationType.ValueflagCd valueflagCd;
    @XmlElement(name = "quantity_num", required = true)
    protected BigDecimal quantityNum;
    @XmlElement(name = "units_cd", required = true)
    protected String unitsCd;
    @XmlElement(name = "end_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "location_cd", required = true)
    protected ObservationType.LocationCd locationCd;
    @XmlElement(name = "confidence_num", required = true)
    protected BigDecimal confidenceNum;
    @XmlElement(name = "observation_blob")
    protected BlobType observationBlob;
    @XmlAttribute(name = "update_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;
    @XmlAttribute(name = "download_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar downloadDate;
    @XmlAttribute(name = "import_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar importDate;
    @XmlAttribute(name = "sourcesystem_cd")
    protected String sourcesystemCd;
    @XmlAttribute(name = "upload_id")
    protected String uploadId;

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationType.EventId }
     *     
     */
    public ObservationType.EventId getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationType.EventId }
     *     
     */
    public void setEventId(ObservationType.EventId value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the patientId property.
     * 
     * @return
     *     possible object is
     *     {@link PatientIdType }
     *     
     */
    public PatientIdType getPatientId() {
        return patientId;
    }

    /**
     * Sets the value of the patientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientIdType }
     *     
     */
    public void setPatientId(PatientIdType value) {
        this.patientId = value;
    }

    /**
     * Gets the value of the conceptCd property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationType.ConceptCd }
     *     
     */
    public ObservationType.ConceptCd getConceptCd() {
        return conceptCd;
    }

    /**
     * Sets the value of the conceptCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationType.ConceptCd }
     *     
     */
    public void setConceptCd(ObservationType.ConceptCd value) {
        this.conceptCd = value;
    }

    /**
     * Gets the value of the observerCd property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationType.ObserverCd }
     *     
     */
    public ObservationType.ObserverCd getObserverCd() {
        return observerCd;
    }

    /**
     * Sets the value of the observerCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationType.ObserverCd }
     *     
     */
    public void setObserverCd(ObservationType.ObserverCd value) {
        this.observerCd = value;
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
     * Gets the value of the modifierCd property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationType.ModifierCd }
     *     
     */
    public ObservationType.ModifierCd getModifierCd() {
        return modifierCd;
    }

    /**
     * Sets the value of the modifierCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationType.ModifierCd }
     *     
     */
    public void setModifierCd(ObservationType.ModifierCd value) {
        this.modifierCd = value;
    }

    /**
     * Gets the value of the instanceNum property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationType.InstanceNum }
     *     
     */
    public ObservationType.InstanceNum getInstanceNum() {
        return instanceNum;
    }

    /**
     * Sets the value of the instanceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationType.InstanceNum }
     *     
     */
    public void setInstanceNum(ObservationType.InstanceNum value) {
        this.instanceNum = value;
    }

    /**
     * Gets the value of the valuetypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuetypeCd() {
        return valuetypeCd;
    }

    /**
     * Sets the value of the valuetypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuetypeCd(String value) {
        this.valuetypeCd = value;
    }

    /**
     * Gets the value of the tvalChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTvalChar() {
        return tvalChar;
    }

    /**
     * Sets the value of the tvalChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTvalChar(String value) {
        this.tvalChar = value;
    }

    /**
     * Gets the value of the nvalNum property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationType.NvalNum }
     *     
     */
    public ObservationType.NvalNum getNvalNum() {
        return nvalNum;
    }

    /**
     * Sets the value of the nvalNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationType.NvalNum }
     *     
     */
    public void setNvalNum(ObservationType.NvalNum value) {
        this.nvalNum = value;
    }

    /**
     * Gets the value of the valueflagCd property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationType.ValueflagCd }
     *     
     */
    public ObservationType.ValueflagCd getValueflagCd() {
        return valueflagCd;
    }

    /**
     * Sets the value of the valueflagCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationType.ValueflagCd }
     *     
     */
    public void setValueflagCd(ObservationType.ValueflagCd value) {
        this.valueflagCd = value;
    }

    /**
     * Gets the value of the quantityNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityNum() {
        return quantityNum;
    }

    /**
     * Sets the value of the quantityNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityNum(BigDecimal value) {
        this.quantityNum = value;
    }

    /**
     * Gets the value of the unitsCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitsCd() {
        return unitsCd;
    }

    /**
     * Sets the value of the unitsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitsCd(String value) {
        this.unitsCd = value;
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
     * Gets the value of the locationCd property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationType.LocationCd }
     *     
     */
    public ObservationType.LocationCd getLocationCd() {
        return locationCd;
    }

    /**
     * Sets the value of the locationCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationType.LocationCd }
     *     
     */
    public void setLocationCd(ObservationType.LocationCd value) {
        this.locationCd = value;
    }

    /**
     * Gets the value of the confidenceNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConfidenceNum() {
        return confidenceNum;
    }

    /**
     * Sets the value of the confidenceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConfidenceNum(BigDecimal value) {
        this.confidenceNum = value;
    }

    /**
     * Gets the value of the observationBlob property.
     * 
     * @return
     *     possible object is
     *     {@link BlobType }
     *     
     */
    public BlobType getObservationBlob() {
        return observationBlob;
    }

    /**
     * Sets the value of the observationBlob property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlobType }
     *     
     */
    public void setObservationBlob(BlobType value) {
        this.observationBlob = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the downloadDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDownloadDate() {
        return downloadDate;
    }

    /**
     * Sets the value of the downloadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDownloadDate(XMLGregorianCalendar value) {
        this.downloadDate = value;
    }

    /**
     * Gets the value of the importDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getImportDate() {
        return importDate;
    }

    /**
     * Sets the value of the importDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setImportDate(XMLGregorianCalendar value) {
        this.importDate = value;
    }

    /**
     * Gets the value of the sourcesystemCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcesystemCd() {
        return sourcesystemCd;
    }

    /**
     * Sets the value of the sourcesystemCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcesystemCd(String value) {
        this.sourcesystemCd = value;
    }

    /**
     * Gets the value of the uploadId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * Sets the value of the uploadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadId(String value) {
        this.uploadId = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ConceptCd {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "name", required = true)
        protected String name;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" default="HIVE" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class EventId {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "source")
        protected String source;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            if (source == null) {
                return "HIVE";
            } else {
                return source;
            }
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class InstanceNum {

        @XmlValue
        protected String value;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class LocationCd {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "name", required = true)
        protected String name;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ModifierCd {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "name", required = true)
        protected String name;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="units" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class NvalNum {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "units", required = true)
        protected String units;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnits() {
            return units;
        }

        /**
         * Sets the value of the units property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ObserverCd {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "name", required = true)
        protected String name;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ValueflagCd {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "name", required = true)
        protected String name;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }

}
