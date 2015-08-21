/*
 *  This file is part of i2b2-Java-API.
 *
 *  The i2b2-Java-API is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  i2b2-Java-API is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with i2b2-Java-API.  If not, see <http://www.gnu.org/licenses/>.
 */

package edu.harvard.hms.dbmi.i2b2.api.ont.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.harvard.hms.dbmi.bd2k.irct.ri.i2b2.message.ont package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteChild_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "delete_child");
    private final static QName _GetModifiers_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "get_modifiers");
    private final static QName _OntologyProcessStatus_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "ontology_process_status");
    private final static QName _GetModifierChildren_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "get_modifier_children");
    private final static QName _Concepts_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "concepts");
    private final static QName _GetCategories_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "get_categories");
    private final static QName _GetDirtyState_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "get_dirty_state");
    private final static QName _GetOntProcessStatus_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "get_ont_process_status");
    private final static QName _AddModifier_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "add_modifier");
    private final static QName _GetModifierInfo_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "get_modifier_info");
    private final static QName _Response_QNAME = new QName("http://www.i2b2.org/xsd/hive/msg/1.1/", "response");
    private final static QName _GetCodeInfo_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "get_code_info");
    private final static QName _AddChild_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "add_child");
    private final static QName _GetModifierCodeInfo_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "get_modifier_code_info");
    private final static QName _GetSchemes_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "get_schemes");
    private final static QName _UpdateCrcConcept_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "update_crc_concept");
    private final static QName _OntologyProcessStatusList_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "ontology_process_status_list");
    private final static QName _DirtyState_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "dirty_state");
    private final static QName _UpdateConceptTotalnum_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "update_concept_totalnum");
    private final static QName _GenomicMetadata_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "GenomicMetadata");
    private final static QName _Request_QNAME = new QName("http://www.i2b2.org/xsd/hive/msg/1.1/", "request");
    private final static QName _GetTermInfo_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "get_term_info");
    private final static QName _GetChildren_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "get_children");
    private final static QName _ValueMetadata_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "ValueMetadata");
    private final static QName _GetModifierNameInfo_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "get_modifier_name_info");
    private final static QName _Modifiers_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "modifiers");
    private final static QName _GetNameInfo_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "get_name_info");
    private final static QName _ModifyChild_QNAME = new QName("http://www.i2b2.org/xsd/cell/ont/1.1/", "modify_child");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.harvard.hms.dbmi.bd2k.irct.ri.i2b2.message.ont
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConditionsType }
     * 
     */
    public ConditionsType createConditionsType() {
        return new ConditionsType();
    }
    
    /**
     * Create an instance of {@link PasswordType }
     * 
     */
    public PasswordType createPasswordType() {
        return new PasswordType();
    }

    /**
     * Create an instance of {@link GetOntProcessStatusType }
     * 
     */
    public GetOntProcessStatusType createGetOntProcessStatusType() {
        return new GetOntProcessStatusType();
    }

    /**
     * Create an instance of {@link ValueMetadataType }
     * 
     */
    public ValueMetadataType createValueMetadataType() {
        return new ValueMetadataType();
    }

    /**
     * Create an instance of {@link ValueMetadataType.UnitValues }
     * 
     */
    public ValueMetadataType.UnitValues createValueMetadataTypeUnitValues() {
        return new ValueMetadataType.UnitValues();
    }

    /**
     * Create an instance of {@link ReturnListType }
     * 
     */
    public ReturnListType createReturnListType() {
        return new ReturnListType();
    }

    /**
     * Create an instance of {@link ReturnType }
     * 
     */
    public ReturnType createReturnType() {
        return new ReturnType();
    }

    /**
     * Create an instance of {@link GetChildrenType }
     * 
     */
    public GetChildrenType createGetChildrenType() {
        return new GetChildrenType();
    }

    /**
     * Create an instance of {@link GetTermInfoType }
     * 
     */
    public GetTermInfoType createGetTermInfoType() {
        return new GetTermInfoType();
    }

    /**
     * Create an instance of {@link VocabRequestType }
     * 
     */
    public VocabRequestType createVocabRequestType() {
        return new VocabRequestType();
    }

    /**
     * Create an instance of {@link ModifiersType }
     * 
     */
    public ModifiersType createModifiersType() {
        return new ModifiersType();
    }

    /**
     * Create an instance of {@link ModifyChildType }
     * 
     */
    public ModifyChildType createModifyChildType() {
        return new ModifyChildType();
    }

    /**
     * Create an instance of {@link GetReturnType }
     * 
     */
    public GetReturnType createGetReturnType() {
        return new GetReturnType();
    }

    /**
     * Create an instance of {@link UpdateCrcConceptType }
     * 
     */
    public UpdateCrcConceptType createUpdateCrcConceptType() {
        return new UpdateCrcConceptType();
    }

    /**
     * Create an instance of {@link OntologyProcessStatusListType }
     * 
     */
    public OntologyProcessStatusListType createOntologyProcessStatusListType() {
        return new OntologyProcessStatusListType();
    }

    /**
     * Create an instance of {@link UpdateConceptTotalNumType }
     * 
     */
    public UpdateConceptTotalNumType createUpdateConceptTotalNumType() {
        return new UpdateConceptTotalNumType();
    }

    /**
     * Create an instance of {@link GenomicMetadataType }
     * 
     */
    public GenomicMetadataType createGenomicMetadataType() {
        return new GenomicMetadataType();
    }

    /**
     * Create an instance of {@link GetModifierInfoType }
     * 
     */
    public GetModifierInfoType createGetModifierInfoType() {
        return new GetModifierInfoType();
    }

    /**
     * Create an instance of {@link ConceptType }
     * 
     */
    public ConceptType createConceptType() {
        return new ConceptType();
    }

    /**
     * Create an instance of {@link DeleteChildType }
     * 
     */
    public DeleteChildType createDeleteChildType() {
        return new DeleteChildType();
    }

    /**
     * Create an instance of {@link GetModifiersType }
     * 
     */
    public GetModifiersType createGetModifiersType() {
        return new GetModifiersType();
    }

    /**
     * Create an instance of {@link OntologyProcessStatusType }
     * 
     */
    public OntologyProcessStatusType createOntologyProcessStatusType() {
        return new OntologyProcessStatusType();
    }

    /**
     * Create an instance of {@link ConceptsType }
     * 
     */
    public ConceptsType createConceptsType() {
        return new ConceptsType();
    }

    /**
     * Create an instance of {@link GetModifierChildrenType }
     * 
     */
    public GetModifierChildrenType createGetModifierChildrenType() {
        return new GetModifierChildrenType();
    }

    /**
     * Create an instance of {@link GetCategoriesType }
     * 
     */
    public GetCategoriesType createGetCategoriesType() {
        return new GetCategoriesType();
    }

    /**
     * Create an instance of {@link ModifierType }
     * 
     */
    public ModifierType createModifierType() {
        return new ModifierType();
    }

    /**
     * Create an instance of {@link XmlValueType }
     * 
     */
    public XmlValueType createXmlValueType() {
        return new XmlValueType();
    }

    /**
     * Create an instance of {@link AccessionType }
     * 
     */
    public AccessionType createAccessionType() {
        return new AccessionType();
    }

    /**
     * Create an instance of {@link ChromosomeLocationType }
     * 
     */
    public ChromosomeLocationType createChromosomeLocationType() {
        return new ChromosomeLocationType();
    }

    /**
     * Create an instance of {@link SequenceVariantType }
     * 
     */
    public SequenceVariantType createSequenceVariantType() {
        return new SequenceVariantType();
    }

    /**
     * Create an instance of {@link AccessionsType }
     * 
     */
    public AccessionsType createAccessionsType() {
        return new AccessionsType();
    }

    /**
     * Create an instance of {@link MatchDateType }
     * 
     */
    public MatchDateType createMatchDateType() {
        return new MatchDateType();
    }

    /**
     * Create an instance of {@link MatchStrType }
     * 
     */
    public MatchStrType createMatchStrType() {
        return new MatchStrType();
    }

    /**
     * Create an instance of {@link MatchIntType }
     * 
     */
    public MatchIntType createMatchIntType() {
        return new MatchIntType();
    }

    /**
     * Create an instance of {@link SequenceVariantLocationType }
     * 
     */
    public SequenceVariantLocationType createSequenceVariantLocationType() {
        return new SequenceVariantLocationType();
    }

    /**
     * Create an instance of {@link DnaChangeType }
     * 
     */
    public DnaChangeType createDnaChangeType() {
        return new DnaChangeType();
    }

    /**
     * Create an instance of {@link RequestMessageType }
     * 
     */
    public RequestMessageType createRequestMessageType() {
        return new RequestMessageType();
    }

    /**
     * Create an instance of {@link ResponseMessageType }
     * 
     */
    public ResponseMessageType createResponseMessageType() {
        return new ResponseMessageType();
    }

    /**
     * Create an instance of {@link BodyType }
     * 
     */
    public BodyType createBodyType() {
        return new BodyType();
    }

    /**
     * Create an instance of {@link MessageTypeType }
     * 
     */
    public MessageTypeType createMessageTypeType() {
        return new MessageTypeType();
    }

    /**
     * Create an instance of {@link MessageControlIdType }
     * 
     */
    public MessageControlIdType createMessageControlIdType() {
        return new MessageControlIdType();
    }

    /**
     * Create an instance of {@link ApplicationType }
     * 
     */
    public ApplicationType createApplicationType() {
        return new ApplicationType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link FacilityType }
     * 
     */
    public FacilityType createFacilityType() {
        return new FacilityType();
    }

    /**
     * Create an instance of {@link ResultStatusType }
     * 
     */
    public ResultStatusType createResultStatusType() {
        return new ResultStatusType();
    }

    /**
     * Create an instance of {@link RequestHeaderType }
     * 
     */
    public RequestHeaderType createRequestHeaderType() {
        return new RequestHeaderType();
    }

    /**
     * Create an instance of {@link ResponseHeaderType }
     * 
     */
    public ResponseHeaderType createResponseHeaderType() {
        return new ResponseHeaderType();
    }

    /**
     * Create an instance of {@link ProcessingIdType }
     * 
     */
    public ProcessingIdType createProcessingIdType() {
        return new ProcessingIdType();
    }

    /**
     * Create an instance of {@link MessageHeaderType }
     * 
     */
    public MessageHeaderType createMessageHeaderType() {
        return new MessageHeaderType();
    }

    /**
     * Create an instance of {@link InfoType }
     * 
     */
    public InfoType createInfoType() {
        return new InfoType();
    }

    /**
     * Create an instance of {@link SecurityType }
     * 
     */
    public SecurityType createSecurityType() {
        return new SecurityType();
    }

    /**
     * Create an instance of {@link PollingUrlType }
     * 
     */
    public PollingUrlType createPollingUrlType() {
        return new PollingUrlType();
    }

    /**
     * Create an instance of {@link ConditionsType.Condition }
     * 
     */
    public ConditionsType.Condition createConditionsTypeCondition() {
        return new ConditionsType.Condition();
    }

    /**
     * Create an instance of {@link GetOntProcessStatusType.ProcessStartDate }
     * 
     */
    public GetOntProcessStatusType.ProcessStartDate createGetOntProcessStatusTypeProcessStartDate() {
        return new GetOntProcessStatusType.ProcessStartDate();
    }

    /**
     * Create an instance of {@link GetOntProcessStatusType.ProcessEndDate }
     * 
     */
    public GetOntProcessStatusType.ProcessEndDate createGetOntProcessStatusTypeProcessEndDate() {
        return new GetOntProcessStatusType.ProcessEndDate();
    }

    /**
     * Create an instance of {@link ValueMetadataType.EnumValues }
     * 
     */
    public ValueMetadataType.EnumValues createValueMetadataTypeEnumValues() {
        return new ValueMetadataType.EnumValues();
    }

    /**
     * Create an instance of {@link ValueMetadataType.CommentsDetermingExclusion }
     * 
     */
    public ValueMetadataType.CommentsDetermingExclusion createValueMetadataTypeCommentsDetermingExclusion() {
        return new ValueMetadataType.CommentsDetermingExclusion();
    }

    /**
     * Create an instance of {@link ValueMetadataType.UnitValues.ConvertingUnits }
     * 
     */
    public ValueMetadataType.UnitValues.ConvertingUnits createValueMetadataTypeUnitValuesConvertingUnits() {
        return new ValueMetadataType.UnitValues.ConvertingUnits();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteChildType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "delete_child")
    public JAXBElement<DeleteChildType> createDeleteChild(DeleteChildType value) {
        return new JAXBElement<DeleteChildType>(_DeleteChild_QNAME, DeleteChildType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModifiersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "get_modifiers")
    public JAXBElement<GetModifiersType> createGetModifiers(GetModifiersType value) {
        return new JAXBElement<GetModifiersType>(_GetModifiers_QNAME, GetModifiersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OntologyProcessStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "ontology_process_status")
    public JAXBElement<OntologyProcessStatusType> createOntologyProcessStatus(OntologyProcessStatusType value) {
        return new JAXBElement<OntologyProcessStatusType>(_OntologyProcessStatus_QNAME, OntologyProcessStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModifierChildrenType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "get_modifier_children")
    public JAXBElement<GetModifierChildrenType> createGetModifierChildren(GetModifierChildrenType value) {
        return new JAXBElement<GetModifierChildrenType>(_GetModifierChildren_QNAME, GetModifierChildrenType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConceptsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "concepts")
    public JAXBElement<ConceptsType> createConcepts(ConceptsType value) {
        return new JAXBElement<ConceptsType>(_Concepts_QNAME, ConceptsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoriesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "get_categories")
    public JAXBElement<GetCategoriesType> createGetCategories(GetCategoriesType value) {
        return new JAXBElement<GetCategoriesType>(_GetCategories_QNAME, GetCategoriesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReturnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "get_dirty_state")
    public JAXBElement<GetReturnType> createGetDirtyState(GetReturnType value) {
        return new JAXBElement<GetReturnType>(_GetDirtyState_QNAME, GetReturnType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOntProcessStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "get_ont_process_status")
    public JAXBElement<GetOntProcessStatusType> createGetOntProcessStatus(GetOntProcessStatusType value) {
        return new JAXBElement<GetOntProcessStatusType>(_GetOntProcessStatus_QNAME, GetOntProcessStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "add_modifier")
    public JAXBElement<ModifierType> createAddModifier(ModifierType value) {
        return new JAXBElement<ModifierType>(_AddModifier_QNAME, ModifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModifierInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "get_modifier_info")
    public JAXBElement<GetModifierInfoType> createGetModifierInfo(GetModifierInfoType value) {
        return new JAXBElement<GetModifierInfoType>(_GetModifierInfo_QNAME, GetModifierInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/hive/msg/1.1/", name = "response")
    public JAXBElement<ResponseMessageType> createResponse(ResponseMessageType value) {
        return new JAXBElement<ResponseMessageType>(_Response_QNAME, ResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VocabRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "get_code_info")
    public JAXBElement<VocabRequestType> createGetCodeInfo(VocabRequestType value) {
        return new JAXBElement<VocabRequestType>(_GetCodeInfo_QNAME, VocabRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConceptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "add_child")
    public JAXBElement<ConceptType> createAddChild(ConceptType value) {
        return new JAXBElement<ConceptType>(_AddChild_QNAME, ConceptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VocabRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "get_modifier_code_info")
    public JAXBElement<VocabRequestType> createGetModifierCodeInfo(VocabRequestType value) {
        return new JAXBElement<VocabRequestType>(_GetModifierCodeInfo_QNAME, VocabRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReturnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "get_schemes")
    public JAXBElement<GetReturnType> createGetSchemes(GetReturnType value) {
        return new JAXBElement<GetReturnType>(_GetSchemes_QNAME, GetReturnType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCrcConceptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "update_crc_concept")
    public JAXBElement<UpdateCrcConceptType> createUpdateCrcConcept(UpdateCrcConceptType value) {
        return new JAXBElement<UpdateCrcConceptType>(_UpdateCrcConcept_QNAME, UpdateCrcConceptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OntologyProcessStatusListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "ontology_process_status_list")
    public JAXBElement<OntologyProcessStatusListType> createOntologyProcessStatusList(OntologyProcessStatusListType value) {
        return new JAXBElement<OntologyProcessStatusListType>(_OntologyProcessStatusList_QNAME, OntologyProcessStatusListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirtyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "dirty_state")
    public JAXBElement<DirtyValueType> createDirtyState(DirtyValueType value) {
        return new JAXBElement<DirtyValueType>(_DirtyState_QNAME, DirtyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateConceptTotalNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "update_concept_totalnum")
    public JAXBElement<UpdateConceptTotalNumType> createUpdateConceptTotalnum(UpdateConceptTotalNumType value) {
        return new JAXBElement<UpdateConceptTotalNumType>(_UpdateConceptTotalnum_QNAME, UpdateConceptTotalNumType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenomicMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "GenomicMetadata")
    public JAXBElement<GenomicMetadataType> createGenomicMetadata(GenomicMetadataType value) {
        return new JAXBElement<GenomicMetadataType>(_GenomicMetadata_QNAME, GenomicMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/hive/msg/1.1/", name = "request")
    public JAXBElement<RequestMessageType> createRequest(RequestMessageType value) {
        return new JAXBElement<RequestMessageType>(_Request_QNAME, RequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTermInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "get_term_info")
    public JAXBElement<GetTermInfoType> createGetTermInfo(GetTermInfoType value) {
        return new JAXBElement<GetTermInfoType>(_GetTermInfo_QNAME, GetTermInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChildrenType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "get_children")
    public JAXBElement<GetChildrenType> createGetChildren(GetChildrenType value) {
        return new JAXBElement<GetChildrenType>(_GetChildren_QNAME, GetChildrenType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "ValueMetadata")
    public JAXBElement<ValueMetadataType> createValueMetadata(ValueMetadataType value) {
        return new JAXBElement<ValueMetadataType>(_ValueMetadata_QNAME, ValueMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VocabRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "get_modifier_name_info")
    public JAXBElement<VocabRequestType> createGetModifierNameInfo(VocabRequestType value) {
        return new JAXBElement<VocabRequestType>(_GetModifierNameInfo_QNAME, VocabRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifiersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "modifiers")
    public JAXBElement<ModifiersType> createModifiers(ModifiersType value) {
        return new JAXBElement<ModifiersType>(_Modifiers_QNAME, ModifiersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VocabRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "get_name_info")
    public JAXBElement<VocabRequestType> createGetNameInfo(VocabRequestType value) {
        return new JAXBElement<VocabRequestType>(_GetNameInfo_QNAME, VocabRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyChildType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/ont/1.1/", name = "modify_child")
    public JAXBElement<ModifyChildType> createModifyChild(ModifyChildType value) {
        return new JAXBElement<ModifyChildType>(_ModifyChild_QNAME, ModifyChildType.class, null, value);
    }

}
