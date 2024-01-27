package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * Describes a single run of an analysis tool, and contains the reported output of that run.
 */
@Generated("jsonschema2pojo")
class Run {
    /**
     * The analysis tool that was run.
     * (Required)
     */
    @SerializedName("tool")
    @Expose
    private var tool: Tool? = null

    /**
     * Describes the invocation of the analysis tool.
     */
    @SerializedName("invocations")
    @Expose
    private var invocations: List<Invocation>? = ArrayList<Invocation>()

    /**
     * Describes how a converter transformed the output of a static analysis tool from the analysis tool's native output format into the SARIF format.
     */
    @SerializedName("conversion")
    @Expose
    private var conversion: Conversion? = null
    /**
     * The language of the messages emitted into the log file during this run (expressed as an ISO 639-1 two-letter lowercase culture code) and an optional region (expressed as an ISO 3166-1 two-letter uppercase subculture code associated with a country or region). The casing is recommended but not required (in order for this data to conform to RFC5646).
     */
    /**
     * The language of the messages emitted into the log file during this run (expressed as an ISO 639-1 two-letter lowercase culture code) and an optional region (expressed as an ISO 3166-1 two-letter uppercase subculture code associated with a country or region). The casing is recommended but not required (in order for this data to conform to RFC5646).
     */
    /**
     * The language of the messages emitted into the log file during this run (expressed as an ISO 639-1 two-letter lowercase culture code) and an optional region (expressed as an ISO 3166-1 two-letter uppercase subculture code associated with a country or region). The casing is recommended but not required (in order for this data to conform to RFC5646).
     */
    @SerializedName("language")
    @Expose
    var language: String? = "en-US"

    /**
     * Specifies the revision in version control of the artifacts that were scanned.
     */
    @SerializedName("versionControlProvenance")
    @Expose
    private var versionControlProvenance: Set<VersionControlDetails>? = LinkedHashSet<VersionControlDetails>()

    /**
     * The artifact location specified by each uriBaseId symbol on the machine where the tool originally ran.
     */
    @SerializedName("originalUriBaseIds")
    @Expose
    private var originalUriBaseIds: OriginalUriBaseIds? = null

    /**
     * An array of artifact objects relevant to the run.
     */
    @SerializedName("artifacts")
    @Expose
    private var artifacts: Set<Artifact>? = LinkedHashSet<Artifact>()

    /**
     * An array of logical locations such as namespaces, types or functions.
     */
    @SerializedName("logicalLocations")
    @Expose
    private var logicalLocations: Set<LogicalLocation>? = LinkedHashSet<LogicalLocation>()

    /**
     * An array of zero or more unique graph objects associated with the run.
     */
    @SerializedName("graphs")
    @Expose
    private var graphs: Set<Graph>? = LinkedHashSet<Graph>()

    /**
     * The set of results contained in an SARIF log. The results array can be omitted when a run is solely exporting rules metadata. It must be present (but may be empty) if a log file represents an actual scan.
     */
    @SerializedName("results")
    @Expose
    private var results: List<Result>? = ArrayList<Result>()

    /**
     * Information that describes a run's identity and role within an engineering system process.
     */
    @SerializedName("automationDetails")
    @Expose
    private var automationDetails: RunAutomationDetails? = null

    /**
     * Automation details that describe the aggregate of runs to which this run belongs.
     */
    @SerializedName("runAggregates")
    @Expose
    private var runAggregates: Set<RunAutomationDetails>? = LinkedHashSet<RunAutomationDetails>()
    /**
     * The 'guid' property of a previous SARIF 'run' that comprises the baseline that was used to compute result 'baselineState' properties for the run.
     */
    /**
     * The 'guid' property of a previous SARIF 'run' that comprises the baseline that was used to compute result 'baselineState' properties for the run.
     */
    /**
     * The 'guid' property of a previous SARIF 'run' that comprises the baseline that was used to compute result 'baselineState' properties for the run.
     */
    @SerializedName("baselineGuid")
    @Expose
    var baselineGuid: String? = null
    /**
     * An array of strings used to replace sensitive information in a redaction-aware property.
     */
    /**
     * An array of strings used to replace sensitive information in a redaction-aware property.
     */
    /**
     * An array of strings used to replace sensitive information in a redaction-aware property.
     */
    @SerializedName("redactionTokens")
    @Expose
    var redactionTokens: Set<String>? = LinkedHashSet()
    /**
     * Specifies the default encoding for any artifact object that refers to a text file.
     */
    /**
     * Specifies the default encoding for any artifact object that refers to a text file.
     */
    /**
     * Specifies the default encoding for any artifact object that refers to a text file.
     */
    @SerializedName("defaultEncoding")
    @Expose
    var defaultEncoding: String? = null
    /**
     * Specifies the default source language for any artifact object that refers to a text file that contains source code.
     */
    /**
     * Specifies the default source language for any artifact object that refers to a text file that contains source code.
     */
    /**
     * Specifies the default source language for any artifact object that refers to a text file that contains source code.
     */
    @SerializedName("defaultSourceLanguage")
    @Expose
    var defaultSourceLanguage: String? = null
    /**
     * An ordered list of character sequences that were treated as line breaks when computing region information for the run.
     */
    /**
     * An ordered list of character sequences that were treated as line breaks when computing region information for the run.
     */
    /**
     * An ordered list of character sequences that were treated as line breaks when computing region information for the run.
     */
    @SerializedName("newlineSequences")
    @Expose
    var newlineSequences: Set<String>? = LinkedHashSet(mutableListOf("\r\n", "\n"))
    /**
     * Specifies the unit in which the tool measures columns.
     */
    /**
     * Specifies the unit in which the tool measures columns.
     */
    /**
     * Specifies the unit in which the tool measures columns.
     */
    @SerializedName("columnKind")
    @Expose
    var columnKind: ColumnKind? = null

    /**
     * References to external property files that should be inlined with the content of a root log file.
     */
    @SerializedName("externalPropertyFileReferences")
    @Expose
    private var externalPropertyFileReferences: ExternalPropertyFileReferences? = null

    /**
     * An array of threadFlowLocation objects cached at run level.
     */
    @SerializedName("threadFlowLocations")
    @Expose
    private var threadFlowLocations: Set<ThreadFlowLocation>? = LinkedHashSet<ThreadFlowLocation>()

    /**
     * An array of toolComponent objects relevant to a taxonomy in which results are categorized.
     */
    @SerializedName("taxonomies")
    @Expose
    private var taxonomies: Set<ToolComponent>? = LinkedHashSet<ToolComponent>()

    /**
     * Addresses associated with this run instance, if any.
     */
    @SerializedName("addresses")
    @Expose
    private var addresses: List<Address>? = ArrayList<Address>()

    /**
     * The set of available translations of the localized data provided by the tool.
     */
    @SerializedName("translations")
    @Expose
    private var translations: Set<ToolComponent>? = LinkedHashSet<ToolComponent>()

    /**
     * Contains configurations that may potentially override both reportingDescriptor.defaultConfiguration (the tool's default severities) and invocation.configurationOverrides (severities established at run-time from the command line).
     */
    @SerializedName("policies")
    @Expose
    private var policies: Set<ToolComponent>? = LinkedHashSet<ToolComponent>()

    /**
     * An array of request objects cached at run level.
     */
    @SerializedName("webRequests")
    @Expose
    private var webRequests: Set<WebRequest>? = LinkedHashSet<WebRequest>()

    /**
     * An array of response objects cached at run level.
     */
    @SerializedName("webResponses")
    @Expose
    private var webResponses: Set<WebResponse>? = LinkedHashSet<WebResponse>()

    /**
     * Defines locations of special significance to SARIF consumers.
     */
    @SerializedName("specialLocations")
    @Expose
    private var specialLocations: SpecialLocations? = null

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
     * @param addresses
     * @param logicalLocations
     * @param policies
     * @param language
     * @param invocations
     * @param graphs
     * @param baselineGuid
     * @param translations
     * @param newlineSequences
     * @param webResponses
     * @param externalPropertyFileReferences
     * @param defaultSourceLanguage
     * @param webRequests
     * @param results
     * @param automationDetails
     * @param conversion
     * @param artifacts
     * @param originalUriBaseIds
     * @param specialLocations
     * @param defaultEncoding
     * @param tool
     * @param versionControlProvenance
     * @param runAggregates
     * @param redactionTokens
     * @param taxonomies
     * @param columnKind
     * @param threadFlowLocations
     * @param properties
     */
    constructor(
        tool: Tool?,
        invocations: List<Invocation>?,
        conversion: Conversion?,
        language: String?,
        versionControlProvenance: Set<VersionControlDetails>?,
        originalUriBaseIds: OriginalUriBaseIds?,
        artifacts: Set<Artifact>?,
        logicalLocations: Set<LogicalLocation>?,
        graphs: Set<Graph>?,
        results: List<Result>?,
        automationDetails: RunAutomationDetails?,
        runAggregates: Set<RunAutomationDetails>?,
        baselineGuid: String?,
        redactionTokens: Set<String>?,
        defaultEncoding: String?,
        defaultSourceLanguage: String?,
        newlineSequences: Set<String>?,
        columnKind: ColumnKind?,
        externalPropertyFileReferences: ExternalPropertyFileReferences?,
        threadFlowLocations: Set<ThreadFlowLocation>?,
        taxonomies: Set<ToolComponent>?,
        addresses: List<Address>?,
        translations: Set<ToolComponent>?,
        policies: Set<ToolComponent>?,
        webRequests: Set<WebRequest>?,
        webResponses: Set<WebResponse>?,
        specialLocations: SpecialLocations?,
        properties: PropertyBag?
    ) : super() {
        this.tool = tool
        this.invocations = invocations
        this.conversion = conversion
        this.language = language
        this.versionControlProvenance = versionControlProvenance
        this.originalUriBaseIds = originalUriBaseIds
        this.artifacts = artifacts
        this.logicalLocations = logicalLocations
        this.graphs = graphs
        this.results = results
        this.automationDetails = automationDetails
        this.runAggregates = runAggregates
        this.baselineGuid = baselineGuid
        this.redactionTokens = redactionTokens
        this.defaultEncoding = defaultEncoding
        this.defaultSourceLanguage = defaultSourceLanguage
        this.newlineSequences = newlineSequences
        this.columnKind = columnKind
        this.externalPropertyFileReferences = externalPropertyFileReferences
        this.threadFlowLocations = threadFlowLocations
        this.taxonomies = taxonomies
        this.addresses = addresses
        this.translations = translations
        this.policies = policies
        this.webRequests = webRequests
        this.webResponses = webResponses
        this.specialLocations = specialLocations
        this.properties = properties
    }

    /**
     * The analysis tool that was run.
     * (Required)
     */
    fun getTool(): Tool? {
        return tool
    }

    /**
     * The analysis tool that was run.
     * (Required)
     */
    fun setTool(tool: Tool?) {
        this.tool = tool
    }

    fun withTool(tool: Tool?): Run {
        this.tool = tool
        return this
    }

    /**
     * Describes the invocation of the analysis tool.
     */
    fun getInvocations(): List<Invocation>? {
        return invocations
    }

    /**
     * Describes the invocation of the analysis tool.
     */
    fun setInvocations(invocations: List<Invocation>?) {
        this.invocations = invocations
    }

    fun withInvocations(invocations: List<Invocation>?): Run {
        this.invocations = invocations
        return this
    }

    /**
     * Describes how a converter transformed the output of a static analysis tool from the analysis tool's native output format into the SARIF format.
     */
    fun getConversion(): Conversion? {
        return conversion
    }

    /**
     * Describes how a converter transformed the output of a static analysis tool from the analysis tool's native output format into the SARIF format.
     */
    fun setConversion(conversion: Conversion?) {
        this.conversion = conversion
    }

    fun withConversion(conversion: Conversion?): Run {
        this.conversion = conversion
        return this
    }

    fun withLanguage(language: String?): Run {
        this.language = language
        return this
    }

    /**
     * Specifies the revision in version control of the artifacts that were scanned.
     */
    fun getVersionControlProvenance(): Set<VersionControlDetails>? {
        return versionControlProvenance
    }

    /**
     * Specifies the revision in version control of the artifacts that were scanned.
     */
    fun setVersionControlProvenance(versionControlProvenance: Set<VersionControlDetails>?) {
        this.versionControlProvenance = versionControlProvenance
    }

    fun withVersionControlProvenance(versionControlProvenance: Set<VersionControlDetails>?): Run {
        this.versionControlProvenance = versionControlProvenance
        return this
    }

    /**
     * The artifact location specified by each uriBaseId symbol on the machine where the tool originally ran.
     */
    fun getOriginalUriBaseIds(): OriginalUriBaseIds? {
        return originalUriBaseIds
    }

    /**
     * The artifact location specified by each uriBaseId symbol on the machine where the tool originally ran.
     */
    fun setOriginalUriBaseIds(originalUriBaseIds: OriginalUriBaseIds?) {
        this.originalUriBaseIds = originalUriBaseIds
    }

    fun withOriginalUriBaseIds(originalUriBaseIds: OriginalUriBaseIds?): Run {
        this.originalUriBaseIds = originalUriBaseIds
        return this
    }

    /**
     * An array of artifact objects relevant to the run.
     */
    fun getArtifacts(): Set<Artifact>? {
        return artifacts
    }

    /**
     * An array of artifact objects relevant to the run.
     */
    fun setArtifacts(artifacts: Set<Artifact>?) {
        this.artifacts = artifacts
    }

    fun withArtifacts(artifacts: Set<Artifact>?): Run {
        this.artifacts = artifacts
        return this
    }

    /**
     * An array of logical locations such as namespaces, types or functions.
     */
    fun getLogicalLocations(): Set<LogicalLocation>? {
        return logicalLocations
    }

    /**
     * An array of logical locations such as namespaces, types or functions.
     */
    fun setLogicalLocations(logicalLocations: Set<LogicalLocation>?) {
        this.logicalLocations = logicalLocations
    }

    fun withLogicalLocations(logicalLocations: Set<LogicalLocation>?): Run {
        this.logicalLocations = logicalLocations
        return this
    }

    /**
     * An array of zero or more unique graph objects associated with the run.
     */
    fun getGraphs(): Set<Graph>? {
        return graphs
    }

    /**
     * An array of zero or more unique graph objects associated with the run.
     */
    fun setGraphs(graphs: Set<Graph>?) {
        this.graphs = graphs
    }

    fun withGraphs(graphs: Set<Graph>?): Run {
        this.graphs = graphs
        return this
    }

    /**
     * The set of results contained in an SARIF log. The results array can be omitted when a run is solely exporting rules metadata. It must be present (but may be empty) if a log file represents an actual scan.
     */
    fun getResults(): List<Result>? {
        return results
    }

    /**
     * The set of results contained in an SARIF log. The results array can be omitted when a run is solely exporting rules metadata. It must be present (but may be empty) if a log file represents an actual scan.
     */
    fun setResults(results: List<Result>?) {
        this.results = results
    }

    fun withResults(results: List<Result>?): Run {
        this.results = results
        return this
    }

    /**
     * Information that describes a run's identity and role within an engineering system process.
     */
    fun getAutomationDetails(): RunAutomationDetails? {
        return automationDetails
    }

    /**
     * Information that describes a run's identity and role within an engineering system process.
     */
    fun setAutomationDetails(automationDetails: RunAutomationDetails?) {
        this.automationDetails = automationDetails
    }

    fun withAutomationDetails(automationDetails: RunAutomationDetails?): Run {
        this.automationDetails = automationDetails
        return this
    }

    /**
     * Automation details that describe the aggregate of runs to which this run belongs.
     */
    fun getRunAggregates(): Set<RunAutomationDetails>? {
        return runAggregates
    }

    /**
     * Automation details that describe the aggregate of runs to which this run belongs.
     */
    fun setRunAggregates(runAggregates: Set<RunAutomationDetails>?) {
        this.runAggregates = runAggregates
    }

    fun withRunAggregates(runAggregates: Set<RunAutomationDetails>?): Run {
        this.runAggregates = runAggregates
        return this
    }

    fun withBaselineGuid(baselineGuid: String?): Run {
        this.baselineGuid = baselineGuid
        return this
    }

    fun withRedactionTokens(redactionTokens: Set<String>?): Run {
        this.redactionTokens = redactionTokens
        return this
    }

    fun withDefaultEncoding(defaultEncoding: String?): Run {
        this.defaultEncoding = defaultEncoding
        return this
    }

    fun withDefaultSourceLanguage(defaultSourceLanguage: String?): Run {
        this.defaultSourceLanguage = defaultSourceLanguage
        return this
    }

    fun withNewlineSequences(newlineSequences: Set<String>?): Run {
        this.newlineSequences = newlineSequences
        return this
    }

    fun withColumnKind(columnKind: ColumnKind?): Run {
        this.columnKind = columnKind
        return this
    }

    /**
     * References to external property files that should be inlined with the content of a root log file.
     */
    fun getExternalPropertyFileReferences(): ExternalPropertyFileReferences? {
        return externalPropertyFileReferences
    }

    /**
     * References to external property files that should be inlined with the content of a root log file.
     */
    fun setExternalPropertyFileReferences(externalPropertyFileReferences: ExternalPropertyFileReferences?) {
        this.externalPropertyFileReferences = externalPropertyFileReferences
    }

    fun withExternalPropertyFileReferences(externalPropertyFileReferences: ExternalPropertyFileReferences?): Run {
        this.externalPropertyFileReferences = externalPropertyFileReferences
        return this
    }

    /**
     * An array of threadFlowLocation objects cached at run level.
     */
    fun getThreadFlowLocations(): Set<ThreadFlowLocation>? {
        return threadFlowLocations
    }

    /**
     * An array of threadFlowLocation objects cached at run level.
     */
    fun setThreadFlowLocations(threadFlowLocations: Set<ThreadFlowLocation>?) {
        this.threadFlowLocations = threadFlowLocations
    }

    fun withThreadFlowLocations(threadFlowLocations: Set<ThreadFlowLocation>?): Run {
        this.threadFlowLocations = threadFlowLocations
        return this
    }

    /**
     * An array of toolComponent objects relevant to a taxonomy in which results are categorized.
     */
    fun getTaxonomies(): Set<ToolComponent>? {
        return taxonomies
    }

    /**
     * An array of toolComponent objects relevant to a taxonomy in which results are categorized.
     */
    fun setTaxonomies(taxonomies: Set<ToolComponent>?) {
        this.taxonomies = taxonomies
    }

    fun withTaxonomies(taxonomies: Set<ToolComponent>?): Run {
        this.taxonomies = taxonomies
        return this
    }

    /**
     * Addresses associated with this run instance, if any.
     */
    fun getAddresses(): List<Address>? {
        return addresses
    }

    /**
     * Addresses associated with this run instance, if any.
     */
    fun setAddresses(addresses: List<Address>?) {
        this.addresses = addresses
    }

    fun withAddresses(addresses: List<Address>?): Run {
        this.addresses = addresses
        return this
    }

    /**
     * The set of available translations of the localized data provided by the tool.
     */
    fun getTranslations(): Set<ToolComponent>? {
        return translations
    }

    /**
     * The set of available translations of the localized data provided by the tool.
     */
    fun setTranslations(translations: Set<ToolComponent>?) {
        this.translations = translations
    }

    fun withTranslations(translations: Set<ToolComponent>?): Run {
        this.translations = translations
        return this
    }

    /**
     * Contains configurations that may potentially override both reportingDescriptor.defaultConfiguration (the tool's default severities) and invocation.configurationOverrides (severities established at run-time from the command line).
     */
    fun getPolicies(): Set<ToolComponent>? {
        return policies
    }

    /**
     * Contains configurations that may potentially override both reportingDescriptor.defaultConfiguration (the tool's default severities) and invocation.configurationOverrides (severities established at run-time from the command line).
     */
    fun setPolicies(policies: Set<ToolComponent>?) {
        this.policies = policies
    }

    fun withPolicies(policies: Set<ToolComponent>?): Run {
        this.policies = policies
        return this
    }

    /**
     * An array of request objects cached at run level.
     */
    fun getWebRequests(): Set<WebRequest>? {
        return webRequests
    }

    /**
     * An array of request objects cached at run level.
     */
    fun setWebRequests(webRequests: Set<WebRequest>?) {
        this.webRequests = webRequests
    }

    fun withWebRequests(webRequests: Set<WebRequest>?): Run {
        this.webRequests = webRequests
        return this
    }

    /**
     * An array of response objects cached at run level.
     */
    fun getWebResponses(): Set<WebResponse>? {
        return webResponses
    }

    /**
     * An array of response objects cached at run level.
     */
    fun setWebResponses(webResponses: Set<WebResponse>?) {
        this.webResponses = webResponses
    }

    fun withWebResponses(webResponses: Set<WebResponse>?): Run {
        this.webResponses = webResponses
        return this
    }

    /**
     * Defines locations of special significance to SARIF consumers.
     */
    fun getSpecialLocations(): SpecialLocations? {
        return specialLocations
    }

    /**
     * Defines locations of special significance to SARIF consumers.
     */
    fun setSpecialLocations(specialLocations: SpecialLocations?) {
        this.specialLocations = specialLocations
    }

    fun withSpecialLocations(specialLocations: SpecialLocations?): Run {
        this.specialLocations = specialLocations
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

    fun withProperties(properties: PropertyBag?): Run {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Run::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("tool")
        sb.append('=')
        sb.append((if ((this.tool == null)) "<null>" else this.tool))
        sb.append(',')
        sb.append("invocations")
        sb.append('=')
        sb.append((if ((this.invocations == null)) "<null>" else this.invocations))
        sb.append(',')
        sb.append("conversion")
        sb.append('=')
        sb.append((if ((this.conversion == null)) "<null>" else this.conversion))
        sb.append(',')
        sb.append("language")
        sb.append('=')
        sb.append((if ((this.language == null)) "<null>" else this.language))
        sb.append(',')
        sb.append("versionControlProvenance")
        sb.append('=')
        sb.append((if ((this.versionControlProvenance == null)) "<null>" else this.versionControlProvenance))
        sb.append(',')
        sb.append("originalUriBaseIds")
        sb.append('=')
        sb.append((if ((this.originalUriBaseIds == null)) "<null>" else this.originalUriBaseIds))
        sb.append(',')
        sb.append("artifacts")
        sb.append('=')
        sb.append((if ((this.artifacts == null)) "<null>" else this.artifacts))
        sb.append(',')
        sb.append("logicalLocations")
        sb.append('=')
        sb.append((if ((this.logicalLocations == null)) "<null>" else this.logicalLocations))
        sb.append(',')
        sb.append("graphs")
        sb.append('=')
        sb.append((if ((this.graphs == null)) "<null>" else this.graphs))
        sb.append(',')
        sb.append("results")
        sb.append('=')
        sb.append((if ((this.results == null)) "<null>" else this.results))
        sb.append(',')
        sb.append("automationDetails")
        sb.append('=')
        sb.append((if ((this.automationDetails == null)) "<null>" else this.automationDetails))
        sb.append(',')
        sb.append("runAggregates")
        sb.append('=')
        sb.append((if ((this.runAggregates == null)) "<null>" else this.runAggregates))
        sb.append(',')
        sb.append("baselineGuid")
        sb.append('=')
        sb.append((if ((this.baselineGuid == null)) "<null>" else this.baselineGuid))
        sb.append(',')
        sb.append("redactionTokens")
        sb.append('=')
        sb.append((if ((this.redactionTokens == null)) "<null>" else this.redactionTokens))
        sb.append(',')
        sb.append("defaultEncoding")
        sb.append('=')
        sb.append((if ((this.defaultEncoding == null)) "<null>" else this.defaultEncoding))
        sb.append(',')
        sb.append("defaultSourceLanguage")
        sb.append('=')
        sb.append((if ((this.defaultSourceLanguage == null)) "<null>" else this.defaultSourceLanguage))
        sb.append(',')
        sb.append("newlineSequences")
        sb.append('=')
        sb.append((if ((this.newlineSequences == null)) "<null>" else this.newlineSequences))
        sb.append(',')
        sb.append("columnKind")
        sb.append('=')
        sb.append((if ((this.columnKind == null)) "<null>" else this.columnKind))
        sb.append(',')
        sb.append("externalPropertyFileReferences")
        sb.append('=')
        sb.append((if ((this.externalPropertyFileReferences == null)) "<null>" else this.externalPropertyFileReferences))
        sb.append(',')
        sb.append("threadFlowLocations")
        sb.append('=')
        sb.append((if ((this.threadFlowLocations == null)) "<null>" else this.threadFlowLocations))
        sb.append(',')
        sb.append("taxonomies")
        sb.append('=')
        sb.append((if ((this.taxonomies == null)) "<null>" else this.taxonomies))
        sb.append(',')
        sb.append("addresses")
        sb.append('=')
        sb.append((if ((this.addresses == null)) "<null>" else this.addresses))
        sb.append(',')
        sb.append("translations")
        sb.append('=')
        sb.append((if ((this.translations == null)) "<null>" else this.translations))
        sb.append(',')
        sb.append("policies")
        sb.append('=')
        sb.append((if ((this.policies == null)) "<null>" else this.policies))
        sb.append(',')
        sb.append("webRequests")
        sb.append('=')
        sb.append((if ((this.webRequests == null)) "<null>" else this.webRequests))
        sb.append(',')
        sb.append("webResponses")
        sb.append('=')
        sb.append((if ((this.webResponses == null)) "<null>" else this.webResponses))
        sb.append(',')
        sb.append("specialLocations")
        sb.append('=')
        sb.append((if ((this.specialLocations == null)) "<null>" else this.specialLocations))
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
        result = ((result * 31) + (if ((this.addresses == null)) 0 else addresses.hashCode()))
        result = ((result * 31) + (if ((this.logicalLocations == null)) 0 else logicalLocations.hashCode()))
        result = ((result * 31) + (if ((this.policies == null)) 0 else policies.hashCode()))
        result = ((result * 31) + (if ((this.language == null)) 0 else language.hashCode()))
        result = ((result * 31) + (if ((this.invocations == null)) 0 else invocations.hashCode()))
        result = ((result * 31) + (if ((this.graphs == null)) 0 else graphs.hashCode()))
        result = ((result * 31) + (if ((this.baselineGuid == null)) 0 else baselineGuid.hashCode()))
        result = ((result * 31) + (if ((this.translations == null)) 0 else translations.hashCode()))
        result = ((result * 31) + (if ((this.newlineSequences == null)) 0 else newlineSequences.hashCode()))
        result = ((result * 31) + (if ((this.webResponses == null)) 0 else webResponses.hashCode()))
        result =
            ((result * 31) + (if ((this.externalPropertyFileReferences == null)) 0 else externalPropertyFileReferences.hashCode()))
        result = ((result * 31) + (if ((this.defaultSourceLanguage == null)) 0 else defaultSourceLanguage.hashCode()))
        result = ((result * 31) + (if ((this.webRequests == null)) 0 else webRequests.hashCode()))
        result = ((result * 31) + (if ((this.results == null)) 0 else results.hashCode()))
        result = ((result * 31) + (if ((this.automationDetails == null)) 0 else automationDetails.hashCode()))
        result = ((result * 31) + (if ((this.conversion == null)) 0 else conversion.hashCode()))
        result = ((result * 31) + (if ((this.artifacts == null)) 0 else artifacts.hashCode()))
        result = ((result * 31) + (if ((this.originalUriBaseIds == null)) 0 else originalUriBaseIds.hashCode()))
        result = ((result * 31) + (if ((this.specialLocations == null)) 0 else specialLocations.hashCode()))
        result = ((result * 31) + (if ((this.defaultEncoding == null)) 0 else defaultEncoding.hashCode()))
        result = ((result * 31) + (if ((this.tool == null)) 0 else tool.hashCode()))
        result =
            ((result * 31) + (if ((this.versionControlProvenance == null)) 0 else versionControlProvenance.hashCode()))
        result = ((result * 31) + (if ((this.runAggregates == null)) 0 else runAggregates.hashCode()))
        result = ((result * 31) + (if ((this.redactionTokens == null)) 0 else redactionTokens.hashCode()))
        result = ((result * 31) + (if ((this.taxonomies == null)) 0 else taxonomies.hashCode()))
        result = ((result * 31) + (if ((this.columnKind == null)) 0 else columnKind.hashCode()))
        result = ((result * 31) + (if ((this.threadFlowLocations == null)) 0 else threadFlowLocations.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Run) == false) {
            return false
        }
        val rhs = other
        return (((((((((((((((((((((((((((((this.addresses === rhs.addresses) || ((this.addresses != null) && (this.addresses == rhs.addresses))) && ((this.logicalLocations === rhs.logicalLocations) || ((this.logicalLocations != null) && (this.logicalLocations == rhs.logicalLocations)))) && ((this.policies === rhs.policies) || ((this.policies != null) && (this.policies == rhs.policies)))) && ((this.language === rhs.language) || ((this.language != null) && (this.language == rhs.language)))) && ((this.invocations === rhs.invocations) || ((this.invocations != null) && (this.invocations == rhs.invocations)))) && ((this.graphs === rhs.graphs) || ((this.graphs != null) && (this.graphs == rhs.graphs)))) && ((this.baselineGuid === rhs.baselineGuid) || ((this.baselineGuid != null) && (this.baselineGuid == rhs.baselineGuid)))) && ((this.translations === rhs.translations) || ((this.translations != null) && (this.translations == rhs.translations)))) && ((this.newlineSequences === rhs.newlineSequences) || ((this.newlineSequences != null) && (this.newlineSequences == rhs.newlineSequences)))) && ((this.webResponses === rhs.webResponses) || ((this.webResponses != null) && (this.webResponses == rhs.webResponses)))) && ((this.externalPropertyFileReferences === rhs.externalPropertyFileReferences) || ((this.externalPropertyFileReferences != null) && externalPropertyFileReferences.equals(
            rhs.externalPropertyFileReferences
        )))) && ((this.defaultSourceLanguage === rhs.defaultSourceLanguage) || ((this.defaultSourceLanguage != null) && (this.defaultSourceLanguage == rhs.defaultSourceLanguage)))) && ((this.webRequests === rhs.webRequests) || ((this.webRequests != null) && (this.webRequests == rhs.webRequests)))) && ((this.results === rhs.results) || ((this.results != null) && (this.results == rhs.results)))) && ((this.automationDetails === rhs.automationDetails) || ((this.automationDetails != null) && automationDetails.equals(
            rhs.automationDetails
        )))) && ((this.conversion === rhs.conversion) || ((this.conversion != null) && conversion.equals(rhs.conversion)))) && ((this.artifacts === rhs.artifacts) || ((this.artifacts != null) && (this.artifacts == rhs.artifacts)))) && ((this.originalUriBaseIds === rhs.originalUriBaseIds) || ((this.originalUriBaseIds != null) && originalUriBaseIds.equals(
            rhs.originalUriBaseIds
        )))) && ((this.specialLocations === rhs.specialLocations) || ((this.specialLocations != null) && specialLocations.equals(
            rhs.specialLocations
        )))) && ((this.defaultEncoding === rhs.defaultEncoding) || ((this.defaultEncoding != null) && (this.defaultEncoding == rhs.defaultEncoding)))) && ((this.tool === rhs.tool) || ((this.tool != null) && tool.equals(
            rhs.tool
        )))) && ((this.versionControlProvenance === rhs.versionControlProvenance) || ((this.versionControlProvenance != null) && (this.versionControlProvenance == rhs.versionControlProvenance)))) && ((this.runAggregates === rhs.runAggregates) || ((this.runAggregates != null) && (this.runAggregates == rhs.runAggregates)))) && ((this.redactionTokens === rhs.redactionTokens) || ((this.redactionTokens != null) && (this.redactionTokens == rhs.redactionTokens)))) && ((this.taxonomies === rhs.taxonomies) || ((this.taxonomies != null) && (this.taxonomies == rhs.taxonomies)))) && ((this.columnKind == rhs.columnKind) || ((this.columnKind != null) && (this.columnKind == rhs.columnKind)))) && ((this.threadFlowLocations === rhs.threadFlowLocations) || ((this.threadFlowLocations != null) && (this.threadFlowLocations == rhs.threadFlowLocations)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }


    /**
     * Specifies the unit in which the tool measures columns.
     */
    @Generated("jsonschema2pojo")
    enum class ColumnKind(private val value: String) {
        @SerializedName("utf16CodeUnits")
        UTF_16_CODE_UNITS("utf16CodeUnits"),
        @SerializedName("unicodeCodePoints")
        UNICODE_CODE_POINTS("unicodeCodePoints");

        override fun toString(): String {
            return this.value
        }

        fun value(): String {
            return this.value
        }

        companion object {
            private val CONSTANTS: MutableMap<String, ColumnKind> = HashMap()

            init {
                for (c in entries) {
                    CONSTANTS[c.value] = c
                }
            }

            fun fromValue(value: String): ColumnKind {
                val constant = CONSTANTS[value]
                requireNotNull(constant) { value }
                return constant
            }
        }
    }
}
