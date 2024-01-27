package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import java.net.URI
import javax.annotation.processing.Generated

/**
 * A result produced by an analysis tool.
 */
@Generated("jsonschema2pojo")
class Result {
    /**
     * The stable, unique identifier of the rule, if any, to which this notification is relevant. This member can be used to retrieve rule metadata from the rules dictionary, if it exists.
     */
    /**
     * The stable, unique identifier of the rule, if any, to which this notification is relevant. This member can be used to retrieve rule metadata from the rules dictionary, if it exists.
     */
    /**
     * The stable, unique identifier of the rule, if any, to which this notification is relevant. This member can be used to retrieve rule metadata from the rules dictionary, if it exists.
     */
    @SerializedName("ruleId")
    @Expose
    var ruleId: String? = null
    /**
     * The index within the tool component rules array of the rule object associated with this result.
     */
    /**
     * The index within the tool component rules array of the rule object associated with this result.
     */
    /**
     * The index within the tool component rules array of the rule object associated with this result.
     */
    @SerializedName("ruleIndex")
    @Expose
    var ruleIndex: Int = -1

    /**
     * Information about how to locate a relevant reporting descriptor.
     */
    @SerializedName("rule")
    @Expose
    private var rule: ReportingDescriptorReference? = null
    /**
     * A value that categorizes results by evaluation state.
     */
    /**
     * A value that categorizes results by evaluation state.
     */
    /**
     * A value that categorizes results by evaluation state.
     */
    @SerializedName("kind")
    @Expose
    var kind: Any? = null
    /**
     * A value specifying the severity level of the result.
     */
    /**
     * A value specifying the severity level of the result.
     */
    /**
     * A value specifying the severity level of the result.
     */
    @SerializedName("level")
    @Expose
    var level: Any? = null

    /**
     * Encapsulates a message intended to be read by the end user.
     * (Required)
     */
    @SerializedName("message")
    @Expose
    private var message: Message? = null

    /**
     * Specifies the location of an artifact.
     */
    @SerializedName("analysisTarget")
    @Expose
    private var analysisTarget: ArtifactLocation? = null

    /**
     * The set of locations where the result was detected. Specify only one location unless the problem indicated by the result can only be corrected by making a change at every specified location.
     */
    @SerializedName("locations")
    @Expose
    private var locations: List<Location>? = ArrayList<Location>()
    /**
     * A stable, unique identifer for the result in the form of a GUID.
     */
    /**
     * A stable, unique identifer for the result in the form of a GUID.
     */
    /**
     * A stable, unique identifer for the result in the form of a GUID.
     */
    @SerializedName("guid")
    @Expose
    var guid: String? = null
    /**
     * A stable, unique identifier for the equivalence class of logically identical results to which this result belongs, in the form of a GUID.
     */
    /**
     * A stable, unique identifier for the equivalence class of logically identical results to which this result belongs, in the form of a GUID.
     */
    /**
     * A stable, unique identifier for the equivalence class of logically identical results to which this result belongs, in the form of a GUID.
     */
    @SerializedName("correlationGuid")
    @Expose
    var correlationGuid: String? = null
    /**
     * A positive integer specifying the number of times this logically unique result was observed in this run.
     */
    /**
     * A positive integer specifying the number of times this logically unique result was observed in this run.
     */
    /**
     * A positive integer specifying the number of times this logically unique result was observed in this run.
     */
    @SerializedName("occurrenceCount")
    @Expose
    var occurrenceCount: Int = 0

    /**
     * A set of strings that contribute to the stable, unique identity of the result.
     */
    @SerializedName("partialFingerprints")
    @Expose
    private var partialFingerprints: PartialFingerprints? = null

    /**
     * A set of strings each of which individually defines a stable, unique identity for the result.
     */
    @SerializedName("fingerprints")
    @Expose
    private var fingerprints: Fingerprints? = null

    /**
     * An array of 'stack' objects relevant to the result.
     */
    @SerializedName("stacks")
    @Expose
    private var stacks: Set<Stack>? = LinkedHashSet<Stack>()

    /**
     * An array of 'codeFlow' objects relevant to the result.
     */
    @SerializedName("codeFlows")
    @Expose
    private var codeFlows: List<CodeFlow>? = ArrayList<CodeFlow>()

    /**
     * An array of zero or more unique graph objects associated with the result.
     */
    @SerializedName("graphs")
    @Expose
    private var graphs: Set<Graph>? = LinkedHashSet<Graph>()

    /**
     * An array of one or more unique 'graphTraversal' objects.
     */
    @SerializedName("graphTraversals")
    @Expose
    private var graphTraversals: Set<GraphTraversal>? = LinkedHashSet<GraphTraversal>()

    /**
     * A set of locations relevant to this result.
     */
    @SerializedName("relatedLocations")
    @Expose
    private var relatedLocations: Set<Location>? = LinkedHashSet<Location>()

    /**
     * A set of suppressions relevant to this result.
     */
    @SerializedName("suppressions")
    @Expose
    private var suppressions: Set<Suppression>? = LinkedHashSet<Suppression>()
    /**
     * The state of a result relative to a baseline of a previous run.
     */
    /**
     * The state of a result relative to a baseline of a previous run.
     */
    /**
     * The state of a result relative to a baseline of a previous run.
     */
    @SerializedName("baselineState")
    @Expose
    var baselineState: BaselineState? = null
    /**
     * A number representing the priority or importance of the result.
     */
    /**
     * A number representing the priority or importance of the result.
     */
    /**
     * A number representing the priority or importance of the result.
     */
    @SerializedName("rank")
    @Expose
    var rank: Double = -1.0

    /**
     * A set of artifacts relevant to the result.
     */
    @SerializedName("attachments")
    @Expose
    private var attachments: Set<Attachment>? = LinkedHashSet<Attachment>()
    /**
     * An absolute URI at which the result can be viewed.
     */
    /**
     * An absolute URI at which the result can be viewed.
     */
    /**
     * An absolute URI at which the result can be viewed.
     */
    @SerializedName("hostedViewerUri")
    @Expose
    var hostedViewerUri: URI? = null
    /**
     * The URIs of the work items associated with this result.
     */
    /**
     * The URIs of the work items associated with this result.
     */
    /**
     * The URIs of the work items associated with this result.
     */
    @SerializedName("workItemUris")
    @Expose
    var workItemUris: Set<URI>? = LinkedHashSet()

    /**
     * Contains information about how and when a result was detected.
     */
    @SerializedName("provenance")
    @Expose
    private var provenance: ResultProvenance? = null

    /**
     * An array of 'fix' objects, each of which represents a proposed fix to the problem indicated by the result.
     */
    @SerializedName("fixes")
    @Expose
    private var fixes: Set<Fix>? = LinkedHashSet<Fix>()

    /**
     * An array of references to taxonomy reporting descriptors that are applicable to the result.
     */
    @SerializedName("taxa")
    @Expose
    private var taxa: Set<ReportingDescriptorReference>? = LinkedHashSet<ReportingDescriptorReference>()

    /**
     * Describes an HTTP request.
     */
    @SerializedName("webRequest")
    @Expose
    private var webRequest: WebRequest? = null

    /**
     * Describes the response to an HTTP request.
     */
    @SerializedName("webResponse")
    @Expose
    private var webResponse: WebResponse? = null

    /**
     * Key/value pairs that provide additional information about the object.
     */
    @SerializedName("properties")
    @Expose
    private var properties: PropertyBag? = null

    /**
     * No args constructor for use in serialization
     */
    constructor()

    /**
     * @param attachments
     * @param correlationGuid
     * @param webRequest
     * @param graphTraversals
     * @param rule
     * @param analysisTarget
     * @param fixes
     * @param relatedLocations
     * @param graphs
     * @param provenance
     * @param rank
     * @param ruleId
     * @param taxa
     * @param ruleIndex
     * @param suppressions
     * @param level
     * @param hostedViewerUri
     * @param kind
     * @param stacks
     * @param occurrenceCount
     * @param message
     * @param fingerprints
     * @param codeFlows
     * @param guid
     * @param partialFingerprints
     * @param webResponse
     * @param locations
     * @param baselineState
     * @param workItemUris
     * @param properties
     */
    constructor(
        ruleId: String?,
        ruleIndex: Int,
        rule: ReportingDescriptorReference?,
        kind: Any?,
        level: Any?,
        message: Message?,
        analysisTarget: ArtifactLocation?,
        locations: List<Location>?,
        guid: String?,
        correlationGuid: String?,
        occurrenceCount: Int,
        partialFingerprints: PartialFingerprints?,
        fingerprints: Fingerprints?,
        stacks: Set<Stack>?,
        codeFlows: List<CodeFlow>?,
        graphs: Set<Graph>?,
        graphTraversals: Set<GraphTraversal>?,
        relatedLocations: Set<Location>?,
        suppressions: Set<Suppression>?,
        baselineState: BaselineState?,
        rank: Double,
        attachments: Set<Attachment>?,
        hostedViewerUri: URI?,
        workItemUris: Set<URI>?,
        provenance: ResultProvenance?,
        fixes: Set<Fix>?,
        taxa: Set<ReportingDescriptorReference>?,
        webRequest: WebRequest?,
        webResponse: WebResponse?,
        properties: PropertyBag?
    ) : super() {
        this.ruleId = ruleId
        this.ruleIndex = ruleIndex
        this.rule = rule
        this.kind = kind
        this.level = level
        this.message = message
        this.analysisTarget = analysisTarget
        this.locations = locations
        this.guid = guid
        this.correlationGuid = correlationGuid
        this.occurrenceCount = occurrenceCount
        this.partialFingerprints = partialFingerprints
        this.fingerprints = fingerprints
        this.stacks = stacks
        this.codeFlows = codeFlows
        this.graphs = graphs
        this.graphTraversals = graphTraversals
        this.relatedLocations = relatedLocations
        this.suppressions = suppressions
        this.baselineState = baselineState
        this.rank = rank
        this.attachments = attachments
        this.hostedViewerUri = hostedViewerUri
        this.workItemUris = workItemUris
        this.provenance = provenance
        this.fixes = fixes
        this.taxa = taxa
        this.webRequest = webRequest
        this.webResponse = webResponse
        this.properties = properties
    }

    fun withRuleId(ruleId: String?): Result {
        this.ruleId = ruleId
        return this
    }

    fun withRuleIndex(ruleIndex: Int): Result {
        this.ruleIndex = ruleIndex
        return this
    }

    /**
     * Information about how to locate a relevant reporting descriptor.
     */
    fun getRule(): ReportingDescriptorReference? {
        return rule
    }

    /**
     * Information about how to locate a relevant reporting descriptor.
     */
    fun setRule(rule: ReportingDescriptorReference?) {
        this.rule = rule
    }

    fun withRule(rule: ReportingDescriptorReference?): Result {
        this.rule = rule
        return this
    }

    fun withKind(kind: Any?): Result {
        this.kind = kind
        return this
    }

    fun withLevel(level: Any?): Result {
        this.level = level
        return this
    }

    /**
     * Encapsulates a message intended to be read by the end user.
     * (Required)
     */
    fun getMessage(): Message? {
        return message
    }

    /**
     * Encapsulates a message intended to be read by the end user.
     * (Required)
     */
    fun setMessage(message: Message?) {
        this.message = message
    }

    fun withMessage(message: Message?): Result {
        this.message = message
        return this
    }

    /**
     * Specifies the location of an artifact.
     */
    fun getAnalysisTarget(): ArtifactLocation? {
        return analysisTarget
    }

    /**
     * Specifies the location of an artifact.
     */
    fun setAnalysisTarget(analysisTarget: ArtifactLocation?) {
        this.analysisTarget = analysisTarget
    }

    fun withAnalysisTarget(analysisTarget: ArtifactLocation?): Result {
        this.analysisTarget = analysisTarget
        return this
    }

    /**
     * The set of locations where the result was detected. Specify only one location unless the problem indicated by the result can only be corrected by making a change at every specified location.
     */
    fun getLocations(): List<Location>? {
        return locations
    }

    /**
     * The set of locations where the result was detected. Specify only one location unless the problem indicated by the result can only be corrected by making a change at every specified location.
     */
    fun setLocations(locations: List<Location>?) {
        this.locations = locations
    }

    fun withLocations(locations: List<Location>?): Result {
        this.locations = locations
        return this
    }

    fun withGuid(guid: String?): Result {
        this.guid = guid
        return this
    }

    fun withCorrelationGuid(correlationGuid: String?): Result {
        this.correlationGuid = correlationGuid
        return this
    }

    fun withOccurrenceCount(occurrenceCount: Int): Result {
        this.occurrenceCount = occurrenceCount
        return this
    }

    /**
     * A set of strings that contribute to the stable, unique identity of the result.
     */
    fun getPartialFingerprints(): PartialFingerprints? {
        return partialFingerprints
    }

    /**
     * A set of strings that contribute to the stable, unique identity of the result.
     */
    fun setPartialFingerprints(partialFingerprints: PartialFingerprints?) {
        this.partialFingerprints = partialFingerprints
    }

    fun withPartialFingerprints(partialFingerprints: PartialFingerprints?): Result {
        this.partialFingerprints = partialFingerprints
        return this
    }

    /**
     * A set of strings each of which individually defines a stable, unique identity for the result.
     */
    fun getFingerprints(): Fingerprints? {
        return fingerprints
    }

    /**
     * A set of strings each of which individually defines a stable, unique identity for the result.
     */
    fun setFingerprints(fingerprints: Fingerprints?) {
        this.fingerprints = fingerprints
    }

    fun withFingerprints(fingerprints: Fingerprints?): Result {
        this.fingerprints = fingerprints
        return this
    }

    /**
     * An array of 'stack' objects relevant to the result.
     */
    fun getStacks(): Set<Stack>? {
        return stacks
    }

    /**
     * An array of 'stack' objects relevant to the result.
     */
    fun setStacks(stacks: Set<Stack>?) {
        this.stacks = stacks
    }

    fun withStacks(stacks: Set<Stack>?): Result {
        this.stacks = stacks
        return this
    }

    /**
     * An array of 'codeFlow' objects relevant to the result.
     */
    fun getCodeFlows(): List<CodeFlow>? {
        return codeFlows
    }

    /**
     * An array of 'codeFlow' objects relevant to the result.
     */
    fun setCodeFlows(codeFlows: List<CodeFlow>?) {
        this.codeFlows = codeFlows
    }

    fun withCodeFlows(codeFlows: List<CodeFlow>?): Result {
        this.codeFlows = codeFlows
        return this
    }

    /**
     * An array of zero or more unique graph objects associated with the result.
     */
    fun getGraphs(): Set<Graph>? {
        return graphs
    }

    /**
     * An array of zero or more unique graph objects associated with the result.
     */
    fun setGraphs(graphs: Set<Graph>?) {
        this.graphs = graphs
    }

    fun withGraphs(graphs: Set<Graph>?): Result {
        this.graphs = graphs
        return this
    }

    /**
     * An array of one or more unique 'graphTraversal' objects.
     */
    fun getGraphTraversals(): Set<GraphTraversal>? {
        return graphTraversals
    }

    /**
     * An array of one or more unique 'graphTraversal' objects.
     */
    fun setGraphTraversals(graphTraversals: Set<GraphTraversal>?) {
        this.graphTraversals = graphTraversals
    }

    fun withGraphTraversals(graphTraversals: Set<GraphTraversal>?): Result {
        this.graphTraversals = graphTraversals
        return this
    }

    /**
     * A set of locations relevant to this result.
     */
    fun getRelatedLocations(): Set<Location>? {
        return relatedLocations
    }

    /**
     * A set of locations relevant to this result.
     */
    fun setRelatedLocations(relatedLocations: Set<Location>?) {
        this.relatedLocations = relatedLocations
    }

    fun withRelatedLocations(relatedLocations: Set<Location>?): Result {
        this.relatedLocations = relatedLocations
        return this
    }

    /**
     * A set of suppressions relevant to this result.
     */
    fun getSuppressions(): Set<Suppression>? {
        return suppressions
    }

    /**
     * A set of suppressions relevant to this result.
     */
    fun setSuppressions(suppressions: Set<Suppression>?) {
        this.suppressions = suppressions
    }

    fun withSuppressions(suppressions: Set<Suppression>?): Result {
        this.suppressions = suppressions
        return this
    }

    fun withBaselineState(baselineState: BaselineState?): Result {
        this.baselineState = baselineState
        return this
    }

    fun withRank(rank: Double): Result {
        this.rank = rank
        return this
    }

    /**
     * A set of artifacts relevant to the result.
     */
    fun getAttachments(): Set<Attachment>? {
        return attachments
    }

    /**
     * A set of artifacts relevant to the result.
     */
    fun setAttachments(attachments: Set<Attachment>?) {
        this.attachments = attachments
    }

    fun withAttachments(attachments: Set<Attachment>?): Result {
        this.attachments = attachments
        return this
    }

    fun withHostedViewerUri(hostedViewerUri: URI?): Result {
        this.hostedViewerUri = hostedViewerUri
        return this
    }

    fun withWorkItemUris(workItemUris: Set<URI>?): Result {
        this.workItemUris = workItemUris
        return this
    }

    /**
     * Contains information about how and when a result was detected.
     */
    fun getProvenance(): ResultProvenance? {
        return provenance
    }

    /**
     * Contains information about how and when a result was detected.
     */
    fun setProvenance(provenance: ResultProvenance?) {
        this.provenance = provenance
    }

    fun withProvenance(provenance: ResultProvenance?): Result {
        this.provenance = provenance
        return this
    }

    /**
     * An array of 'fix' objects, each of which represents a proposed fix to the problem indicated by the result.
     */
    fun getFixes(): Set<Fix>? {
        return fixes
    }

    /**
     * An array of 'fix' objects, each of which represents a proposed fix to the problem indicated by the result.
     */
    fun setFixes(fixes: Set<Fix>?) {
        this.fixes = fixes
    }

    fun withFixes(fixes: Set<Fix>?): Result {
        this.fixes = fixes
        return this
    }

    /**
     * An array of references to taxonomy reporting descriptors that are applicable to the result.
     */
    fun getTaxa(): Set<ReportingDescriptorReference>? {
        return taxa
    }

    /**
     * An array of references to taxonomy reporting descriptors that are applicable to the result.
     */
    fun setTaxa(taxa: Set<ReportingDescriptorReference>?) {
        this.taxa = taxa
    }

    fun withTaxa(taxa: Set<ReportingDescriptorReference>?): Result {
        this.taxa = taxa
        return this
    }

    /**
     * Describes an HTTP request.
     */
    fun getWebRequest(): WebRequest? {
        return webRequest
    }

    /**
     * Describes an HTTP request.
     */
    fun setWebRequest(webRequest: WebRequest?) {
        this.webRequest = webRequest
    }

    fun withWebRequest(webRequest: WebRequest?): Result {
        this.webRequest = webRequest
        return this
    }

    /**
     * Describes the response to an HTTP request.
     */
    fun getWebResponse(): WebResponse? {
        return webResponse
    }

    /**
     * Describes the response to an HTTP request.
     */
    fun setWebResponse(webResponse: WebResponse?) {
        this.webResponse = webResponse
    }

    fun withWebResponse(webResponse: WebResponse?): Result {
        this.webResponse = webResponse
        return this
    }

    /**
     * Key/value pairs that provide additional information about the object.
     */
    fun getProperties(): PropertyBag? {
        return properties
    }

    /**
     * Key/value pairs that provide additional information about the object.
     */
    fun setProperties(properties: PropertyBag?) {
        this.properties = properties
    }

    fun withProperties(properties: PropertyBag?): Result {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Result::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("ruleId")
        sb.append('=')
        sb.append((if ((this.ruleId == null)) "<null>" else this.ruleId))
        sb.append(',')
        sb.append("ruleIndex")
        sb.append('=')
        sb.append(this.ruleIndex)
        sb.append(',')
        sb.append("rule")
        sb.append('=')
        sb.append((if ((this.rule == null)) "<null>" else this.rule))
        sb.append(',')
        sb.append("kind")
        sb.append('=')
        sb.append((if ((this.kind == null)) "<null>" else this.kind))
        sb.append(',')
        sb.append("level")
        sb.append('=')
        sb.append((if ((this.level == null)) "<null>" else this.level))
        sb.append(',')
        sb.append("message")
        sb.append('=')
        sb.append((if ((this.message == null)) "<null>" else this.message))
        sb.append(',')
        sb.append("analysisTarget")
        sb.append('=')
        sb.append((if ((this.analysisTarget == null)) "<null>" else this.analysisTarget))
        sb.append(',')
        sb.append("locations")
        sb.append('=')
        sb.append((if ((this.locations == null)) "<null>" else this.locations))
        sb.append(',')
        sb.append("guid")
        sb.append('=')
        sb.append((if ((this.guid == null)) "<null>" else this.guid))
        sb.append(',')
        sb.append("correlationGuid")
        sb.append('=')
        sb.append((if ((this.correlationGuid == null)) "<null>" else this.correlationGuid))
        sb.append(',')
        sb.append("occurrenceCount")
        sb.append('=')
        sb.append(this.occurrenceCount)
        sb.append(',')
        sb.append("partialFingerprints")
        sb.append('=')
        sb.append((if ((this.partialFingerprints == null)) "<null>" else this.partialFingerprints))
        sb.append(',')
        sb.append("fingerprints")
        sb.append('=')
        sb.append((if ((this.fingerprints == null)) "<null>" else this.fingerprints))
        sb.append(',')
        sb.append("stacks")
        sb.append('=')
        sb.append((if ((this.stacks == null)) "<null>" else this.stacks))
        sb.append(',')
        sb.append("codeFlows")
        sb.append('=')
        sb.append((if ((this.codeFlows == null)) "<null>" else this.codeFlows))
        sb.append(',')
        sb.append("graphs")
        sb.append('=')
        sb.append((if ((this.graphs == null)) "<null>" else this.graphs))
        sb.append(',')
        sb.append("graphTraversals")
        sb.append('=')
        sb.append((if ((this.graphTraversals == null)) "<null>" else this.graphTraversals))
        sb.append(',')
        sb.append("relatedLocations")
        sb.append('=')
        sb.append((if ((this.relatedLocations == null)) "<null>" else this.relatedLocations))
        sb.append(',')
        sb.append("suppressions")
        sb.append('=')
        sb.append((if ((this.suppressions == null)) "<null>" else this.suppressions))
        sb.append(',')
        sb.append("baselineState")
        sb.append('=')
        sb.append((if ((this.baselineState == null)) "<null>" else this.baselineState))
        sb.append(',')
        sb.append("rank")
        sb.append('=')
        sb.append(this.rank)
        sb.append(',')
        sb.append("attachments")
        sb.append('=')
        sb.append((if ((this.attachments == null)) "<null>" else this.attachments))
        sb.append(',')
        sb.append("hostedViewerUri")
        sb.append('=')
        sb.append((if ((this.hostedViewerUri == null)) "<null>" else this.hostedViewerUri))
        sb.append(',')
        sb.append("workItemUris")
        sb.append('=')
        sb.append((if ((this.workItemUris == null)) "<null>" else this.workItemUris))
        sb.append(',')
        sb.append("provenance")
        sb.append('=')
        sb.append((if ((this.provenance == null)) "<null>" else this.provenance))
        sb.append(',')
        sb.append("fixes")
        sb.append('=')
        sb.append((if ((this.fixes == null)) "<null>" else this.fixes))
        sb.append(',')
        sb.append("taxa")
        sb.append('=')
        sb.append((if ((this.taxa == null)) "<null>" else this.taxa))
        sb.append(',')
        sb.append("webRequest")
        sb.append('=')
        sb.append((if ((this.webRequest == null)) "<null>" else this.webRequest))
        sb.append(',')
        sb.append("webResponse")
        sb.append('=')
        sb.append((if ((this.webResponse == null)) "<null>" else this.webResponse))
        sb.append(',')
        sb.append("properties")
        sb.append('=')
        sb.append((if ((this.properties == null)) "<null>" else this.properties))
        sb.append(',')
        if (sb[sb.length - 1] == ',') {
            sb.setCharAt((sb.length - 1), ']')
        } else {
            sb.append(']')
        }
        return sb.toString()
    }

    override fun hashCode(): Int {
        var result = 1
        result = ((result * 31) + (if ((this.attachments == null)) 0 else attachments.hashCode()))
        result = ((result * 31) + (if ((this.correlationGuid == null)) 0 else correlationGuid.hashCode()))
        result = ((result * 31) + (if ((this.webRequest == null)) 0 else webRequest.hashCode()))
        result = ((result * 31) + (if ((this.graphTraversals == null)) 0 else graphTraversals.hashCode()))
        result = ((result * 31) + (if ((this.rule == null)) 0 else rule.hashCode()))
        result = ((result * 31) + (if ((this.analysisTarget == null)) 0 else analysisTarget.hashCode()))
        result = ((result * 31) + (if ((this.fixes == null)) 0 else fixes.hashCode()))
        result = ((result * 31) + (if ((this.relatedLocations == null)) 0 else relatedLocations.hashCode()))
        result = ((result * 31) + (if ((this.graphs == null)) 0 else graphs.hashCode()))
        result = ((result * 31) + (if ((this.provenance == null)) 0 else provenance.hashCode()))
        result = ((result * 31) + ((java.lang.Double.doubleToLongBits(this.rank) xor (java.lang.Double.doubleToLongBits(
            this.rank
        ) ushr 32)).toInt()))
        result = ((result * 31) + (if ((this.ruleId == null)) 0 else ruleId.hashCode()))
        result = ((result * 31) + (if ((this.taxa == null)) 0 else taxa.hashCode()))
        result = ((result * 31) + this.ruleIndex)
        result = ((result * 31) + (if ((this.suppressions == null)) 0 else suppressions.hashCode()))
        result = ((result * 31) + (if ((this.level == null)) 0 else level.hashCode()))
        result = ((result * 31) + (if ((this.hostedViewerUri == null)) 0 else hostedViewerUri.hashCode()))
        result = ((result * 31) + (if ((this.kind == null)) 0 else kind.hashCode()))
        result = ((result * 31) + (if ((this.stacks == null)) 0 else stacks.hashCode()))
        result = ((result * 31) + this.occurrenceCount)
        result = ((result * 31) + (if ((this.message == null)) 0 else message.hashCode()))
        result = ((result * 31) + (if ((this.fingerprints == null)) 0 else fingerprints.hashCode()))
        result = ((result * 31) + (if ((this.codeFlows == null)) 0 else codeFlows.hashCode()))
        result = ((result * 31) + (if ((this.guid == null)) 0 else guid.hashCode()))
        result = ((result * 31) + (if ((this.partialFingerprints == null)) 0 else partialFingerprints.hashCode()))
        result = ((result * 31) + (if ((this.webResponse == null)) 0 else webResponse.hashCode()))
        result = ((result * 31) + (if ((this.locations == null)) 0 else locations.hashCode()))
        result = ((result * 31) + (if ((this.baselineState == null)) 0 else baselineState.hashCode()))
        result = ((result * 31) + (if ((this.workItemUris == null)) 0 else workItemUris.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Result) == false) {
            return false
        }
        val rhs = other
        return (((((((((((((((((((((((((((((((this.attachments === rhs.attachments) || ((this.attachments != null) && (this.attachments == rhs.attachments))) && ((this.correlationGuid === rhs.correlationGuid) || ((this.correlationGuid != null) && (this.correlationGuid == rhs.correlationGuid)))) && ((this.webRequest === rhs.webRequest) || ((this.webRequest != null) && webRequest.equals(
            rhs.webRequest
        )))) && ((this.graphTraversals === rhs.graphTraversals) || ((this.graphTraversals != null) && (this.graphTraversals == rhs.graphTraversals)))) && ((this.rule === rhs.rule) || ((this.rule != null) && rule.equals(
            rhs.rule
        )))) && ((this.analysisTarget === rhs.analysisTarget) || ((this.analysisTarget != null) && analysisTarget.equals(
            rhs.analysisTarget
        )))) && ((this.fixes === rhs.fixes) || ((this.fixes != null) && (this.fixes == rhs.fixes)))) && ((this.relatedLocations === rhs.relatedLocations) || ((this.relatedLocations != null) && (this.relatedLocations == rhs.relatedLocations)))) && ((this.graphs === rhs.graphs) || ((this.graphs != null) && (this.graphs == rhs.graphs)))) && ((this.provenance === rhs.provenance) || ((this.provenance != null) && provenance.equals(
            rhs.provenance
        )))) && (java.lang.Double.doubleToLongBits(
            this.rank
        ) == java.lang.Double.doubleToLongBits(rhs.rank))) && ((this.ruleId === rhs.ruleId) || ((this.ruleId != null) && (this.ruleId == rhs.ruleId)))) && ((this.taxa === rhs.taxa) || ((this.taxa != null) && (this.taxa == rhs.taxa)))) && (this.ruleIndex == rhs.ruleIndex)) && ((this.suppressions === rhs.suppressions) || ((this.suppressions != null) && (this.suppressions == rhs.suppressions)))) && ((this.level === rhs.level) || ((this.level != null) && (this.level == rhs.level)))) && ((this.hostedViewerUri === rhs.hostedViewerUri) || ((this.hostedViewerUri != null) && (this.hostedViewerUri == rhs.hostedViewerUri)))) && ((this.kind === rhs.kind) || ((this.kind != null) && (this.kind == rhs.kind)))) && ((this.stacks === rhs.stacks) || ((this.stacks != null) && (this.stacks == rhs.stacks)))) && (this.occurrenceCount == rhs.occurrenceCount)) && ((this.message === rhs.message) || ((this.message != null) && message.equals(
            rhs.message
        )))) && ((this.fingerprints === rhs.fingerprints) || ((this.fingerprints != null) && fingerprints.equals(rhs.fingerprints)))) && ((this.codeFlows === rhs.codeFlows) || ((this.codeFlows != null) && (this.codeFlows == rhs.codeFlows)))) && ((this.guid === rhs.guid) || ((this.guid != null) && (this.guid == rhs.guid)))) && ((this.partialFingerprints === rhs.partialFingerprints) || ((this.partialFingerprints != null) && partialFingerprints.equals(
            rhs.partialFingerprints
        )))) && ((this.webResponse === rhs.webResponse) || ((this.webResponse != null) && webResponse.equals(rhs.webResponse)))) && ((this.locations === rhs.locations) || ((this.locations != null) && (this.locations == rhs.locations)))) && ((this.baselineState == rhs.baselineState) || ((this.baselineState != null) && (this.baselineState == rhs.baselineState)))) && ((this.workItemUris === rhs.workItemUris) || ((this.workItemUris != null) && (this.workItemUris == rhs.workItemUris)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }


    /**
     * The state of a result relative to a baseline of a previous run.
     */
    @Generated("jsonschema2pojo")
    enum class BaselineState(private val value: String) {
        @SerializedName("new")
        NEW("new"),
        @SerializedName("unchanged")
        UNCHANGED("unchanged"),
        @SerializedName("updated")
        UPDATED("updated"),
        @SerializedName("absent")
        ABSENT("absent");

        override fun toString(): String {
            return this.value
        }

        fun value(): String {
            return this.value
        }

        companion object {
            private val CONSTANTS: MutableMap<String, BaselineState> = HashMap()

            init {
                for (c in entries) {
                    CONSTANTS[c.value] = c
                }
            }

            fun fromValue(value: String): BaselineState {
                val constant = CONSTANTS[value]
                requireNotNull(constant) { value }
                return constant
            }
        }
    }
}
