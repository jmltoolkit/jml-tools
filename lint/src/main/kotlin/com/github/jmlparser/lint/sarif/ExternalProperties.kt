package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import java.net.URI
import javax.annotation.processing.Generated

/**
 * The top-level element of an external property file.
 */
@Generated("jsonschema2pojo")
class ExternalProperties {
    /**
     * The URI of the JSON schema corresponding to the version of the external property file format.
     */
    /**
     * The URI of the JSON schema corresponding to the version of the external property file format.
     */
    /**
     * The URI of the JSON schema corresponding to the version of the external property file format.
     */
    @SerializedName("schema")
    @Expose
    var schema: URI? = null
    /**
     * The SARIF format version of this external properties object.
     */
    /**
     * The SARIF format version of this external properties object.
     */
    /**
     * The SARIF format version of this external properties object.
     */
    @SerializedName("version")
    @Expose
    var version: Version? = null
    /**
     * A stable, unique identifer for this external properties object, in the form of a GUID.
     */
    /**
     * A stable, unique identifer for this external properties object, in the form of a GUID.
     */
    /**
     * A stable, unique identifer for this external properties object, in the form of a GUID.
     */
    @SerializedName("guid")
    @Expose
    var guid: String? = null
    /**
     * A stable, unique identifer for the run associated with this external properties object, in the form of a GUID.
     */
    /**
     * A stable, unique identifer for the run associated with this external properties object, in the form of a GUID.
     */
    /**
     * A stable, unique identifer for the run associated with this external properties object, in the form of a GUID.
     */
    @SerializedName("runGuid")
    @Expose
    var runGuid: String? = null

    /**
     * Describes how a converter transformed the output of a static analysis tool from the analysis tool's native output format into the SARIF format.
     */
    @SerializedName("conversion")
    @Expose
    private var conversion: Conversion? = null

    /**
     * An array of graph objects that will be merged with a separate run.
     */
    @SerializedName("graphs")
    @Expose
    private var graphs: Set<Graph>? = LinkedHashSet<Graph>()

    /**
     * Key/value pairs that provide additional information about the object.
     */
    @SerializedName("externalizedProperties")
    @Expose
    private var externalizedProperties: PropertyBag? = null

    /**
     * An array of artifact objects that will be merged with a separate run.
     */
    @SerializedName("artifacts")
    @Expose
    private var artifacts: Set<Artifact>? = LinkedHashSet<Artifact>()

    /**
     * Describes the invocation of the analysis tool that will be merged with a separate run.
     */
    @SerializedName("invocations")
    @Expose
    private var invocations: List<Invocation>? = ArrayList<Invocation>()

    /**
     * An array of logical locations such as namespaces, types or functions that will be merged with a separate run.
     */
    @SerializedName("logicalLocations")
    @Expose
    private var logicalLocations: Set<LogicalLocation>? = LinkedHashSet<LogicalLocation>()

    /**
     * An array of threadFlowLocation objects that will be merged with a separate run.
     */
    @SerializedName("threadFlowLocations")
    @Expose
    private var threadFlowLocations: Set<ThreadFlowLocation>? = LinkedHashSet<ThreadFlowLocation>()

    /**
     * An array of result objects that will be merged with a separate run.
     */
    @SerializedName("results")
    @Expose
    private var results: List<Result>? = ArrayList<Result>()

    /**
     * Tool taxonomies that will be merged with a separate run.
     */
    @SerializedName("taxonomies")
    @Expose
    private var taxonomies: Set<ToolComponent>? = LinkedHashSet<ToolComponent>()

    /**
     * A component, such as a plug-in or the driver, of the analysis tool that was run.
     */
    @SerializedName("driver")
    @Expose
    private var driver: ToolComponent? = null

    /**
     * Tool extensions that will be merged with a separate run.
     */
    @SerializedName("extensions")
    @Expose
    private var extensions: Set<ToolComponent>? = LinkedHashSet<ToolComponent>()

    /**
     * Tool policies that will be merged with a separate run.
     */
    @SerializedName("policies")
    @Expose
    private var policies: Set<ToolComponent>? = LinkedHashSet<ToolComponent>()

    /**
     * Tool translations that will be merged with a separate run.
     */
    @SerializedName("translations")
    @Expose
    private var translations: Set<ToolComponent>? = LinkedHashSet<ToolComponent>()

    /**
     * Addresses that will be merged with a separate run.
     */
    @SerializedName("addresses")
    @Expose
    private var addresses: List<Address>? = ArrayList<Address>()

    /**
     * Requests that will be merged with a separate run.
     */
    @SerializedName("webRequests")
    @Expose
    private var webRequests: Set<WebRequest>? = LinkedHashSet<WebRequest>()

    /**
     * Responses that will be merged with a separate run.
     */
    @SerializedName("webResponses")
    @Expose
    private var webResponses: Set<WebResponse>? = LinkedHashSet<WebResponse>()

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
     * @param schema
     * @param addresses
     * @param logicalLocations
     * @param policies
     * @param runGuid
     * @param version
     * @param externalizedProperties
     * @param invocations
     * @param graphs
     * @param extensions
     * @param driver
     * @param taxonomies
     * @param translations
     * @param webResponses
     * @param guid
     * @param webRequests
     * @param results
     * @param threadFlowLocations
     * @param properties
     * @param conversion
     * @param artifacts
     */
    constructor(
        schema: URI?,
        version: Version?,
        guid: String?,
        runGuid: String?,
        conversion: Conversion?,
        graphs: Set<Graph>?,
        externalizedProperties: PropertyBag?,
        artifacts: Set<Artifact>?,
        invocations: List<Invocation>?,
        logicalLocations: Set<LogicalLocation>?,
        threadFlowLocations: Set<ThreadFlowLocation>?,
        results: List<Result>?,
        taxonomies: Set<ToolComponent>?,
        driver: ToolComponent?,
        extensions: Set<ToolComponent>?,
        policies: Set<ToolComponent>?,
        translations: Set<ToolComponent>?,
        addresses: List<Address>?,
        webRequests: Set<WebRequest>?,
        webResponses: Set<WebResponse>?,
        properties: PropertyBag?
    ) : super() {
        this.schema = schema
        this.version = version
        this.guid = guid
        this.runGuid = runGuid
        this.conversion = conversion
        this.graphs = graphs
        this.externalizedProperties = externalizedProperties
        this.artifacts = artifacts
        this.invocations = invocations
        this.logicalLocations = logicalLocations
        this.threadFlowLocations = threadFlowLocations
        this.results = results
        this.taxonomies = taxonomies
        this.driver = driver
        this.extensions = extensions
        this.policies = policies
        this.translations = translations
        this.addresses = addresses
        this.webRequests = webRequests
        this.webResponses = webResponses
        this.properties = properties
    }

    fun withSchema(schema: URI?): ExternalProperties {
        this.schema = schema
        return this
    }

    fun withVersion(version: Version?): ExternalProperties {
        this.version = version
        return this
    }

    fun withGuid(guid: String?): ExternalProperties {
        this.guid = guid
        return this
    }

    fun withRunGuid(runGuid: String?): ExternalProperties {
        this.runGuid = runGuid
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

    fun withConversion(conversion: Conversion?): ExternalProperties {
        this.conversion = conversion
        return this
    }

    /**
     * An array of graph objects that will be merged with a separate run.
     */
    fun getGraphs(): Set<Graph>? {
        return graphs
    }

    /**
     * An array of graph objects that will be merged with a separate run.
     */
    fun setGraphs(graphs: Set<Graph>?) {
        this.graphs = graphs
    }

    fun withGraphs(graphs: Set<Graph>?): ExternalProperties {
        this.graphs = graphs
        return this
    }

    /**
     * Key/value pairs that provide additional information about the object.
     */
    fun getExternalizedProperties(): PropertyBag? {
        return externalizedProperties
    }

    /**
     * Key/value pairs that provide additional information about the object.
     */
    fun setExternalizedProperties(externalizedProperties: PropertyBag?) {
        this.externalizedProperties = externalizedProperties
    }

    fun withExternalizedProperties(externalizedProperties: PropertyBag?): ExternalProperties {
        this.externalizedProperties = externalizedProperties
        return this
    }

    /**
     * An array of artifact objects that will be merged with a separate run.
     */
    fun getArtifacts(): Set<Artifact>? {
        return artifacts
    }

    /**
     * An array of artifact objects that will be merged with a separate run.
     */
    fun setArtifacts(artifacts: Set<Artifact>?) {
        this.artifacts = artifacts
    }

    fun withArtifacts(artifacts: Set<Artifact>?): ExternalProperties {
        this.artifacts = artifacts
        return this
    }

    /**
     * Describes the invocation of the analysis tool that will be merged with a separate run.
     */
    fun getInvocations(): List<Invocation>? {
        return invocations
    }

    /**
     * Describes the invocation of the analysis tool that will be merged with a separate run.
     */
    fun setInvocations(invocations: List<Invocation>?) {
        this.invocations = invocations
    }

    fun withInvocations(invocations: List<Invocation>?): ExternalProperties {
        this.invocations = invocations
        return this
    }

    /**
     * An array of logical locations such as namespaces, types or functions that will be merged with a separate run.
     */
    fun getLogicalLocations(): Set<LogicalLocation>? {
        return logicalLocations
    }

    /**
     * An array of logical locations such as namespaces, types or functions that will be merged with a separate run.
     */
    fun setLogicalLocations(logicalLocations: Set<LogicalLocation>?) {
        this.logicalLocations = logicalLocations
    }

    fun withLogicalLocations(logicalLocations: Set<LogicalLocation>?): ExternalProperties {
        this.logicalLocations = logicalLocations
        return this
    }

    /**
     * An array of threadFlowLocation objects that will be merged with a separate run.
     */
    fun getThreadFlowLocations(): Set<ThreadFlowLocation>? {
        return threadFlowLocations
    }

    /**
     * An array of threadFlowLocation objects that will be merged with a separate run.
     */
    fun setThreadFlowLocations(threadFlowLocations: Set<ThreadFlowLocation>?) {
        this.threadFlowLocations = threadFlowLocations
    }

    fun withThreadFlowLocations(threadFlowLocations: Set<ThreadFlowLocation>?): ExternalProperties {
        this.threadFlowLocations = threadFlowLocations
        return this
    }

    /**
     * An array of result objects that will be merged with a separate run.
     */
    fun getResults(): List<Result>? {
        return results
    }

    /**
     * An array of result objects that will be merged with a separate run.
     */
    fun setResults(results: List<Result>?) {
        this.results = results
    }

    fun withResults(results: List<Result>?): ExternalProperties {
        this.results = results
        return this
    }

    /**
     * Tool taxonomies that will be merged with a separate run.
     */
    fun getTaxonomies(): Set<ToolComponent>? {
        return taxonomies
    }

    /**
     * Tool taxonomies that will be merged with a separate run.
     */
    fun setTaxonomies(taxonomies: Set<ToolComponent>?) {
        this.taxonomies = taxonomies
    }

    fun withTaxonomies(taxonomies: Set<ToolComponent>?): ExternalProperties {
        this.taxonomies = taxonomies
        return this
    }

    /**
     * A component, such as a plug-in or the driver, of the analysis tool that was run.
     */
    fun getDriver(): ToolComponent? {
        return driver
    }

    /**
     * A component, such as a plug-in or the driver, of the analysis tool that was run.
     */
    fun setDriver(driver: ToolComponent?) {
        this.driver = driver
    }

    fun withDriver(driver: ToolComponent?): ExternalProperties {
        this.driver = driver
        return this
    }

    /**
     * Tool extensions that will be merged with a separate run.
     */
    fun getExtensions(): Set<ToolComponent>? {
        return extensions
    }

    /**
     * Tool extensions that will be merged with a separate run.
     */
    fun setExtensions(extensions: Set<ToolComponent>?) {
        this.extensions = extensions
    }

    fun withExtensions(extensions: Set<ToolComponent>?): ExternalProperties {
        this.extensions = extensions
        return this
    }

    /**
     * Tool policies that will be merged with a separate run.
     */
    fun getPolicies(): Set<ToolComponent>? {
        return policies
    }

    /**
     * Tool policies that will be merged with a separate run.
     */
    fun setPolicies(policies: Set<ToolComponent>?) {
        this.policies = policies
    }

    fun withPolicies(policies: Set<ToolComponent>?): ExternalProperties {
        this.policies = policies
        return this
    }

    /**
     * Tool translations that will be merged with a separate run.
     */
    fun getTranslations(): Set<ToolComponent>? {
        return translations
    }

    /**
     * Tool translations that will be merged with a separate run.
     */
    fun setTranslations(translations: Set<ToolComponent>?) {
        this.translations = translations
    }

    fun withTranslations(translations: Set<ToolComponent>?): ExternalProperties {
        this.translations = translations
        return this
    }

    /**
     * Addresses that will be merged with a separate run.
     */
    fun getAddresses(): List<Address>? {
        return addresses
    }

    /**
     * Addresses that will be merged with a separate run.
     */
    fun setAddresses(addresses: List<Address>?) {
        this.addresses = addresses
    }

    fun withAddresses(addresses: List<Address>?): ExternalProperties {
        this.addresses = addresses
        return this
    }

    /**
     * Requests that will be merged with a separate run.
     */
    fun getWebRequests(): Set<WebRequest>? {
        return webRequests
    }

    /**
     * Requests that will be merged with a separate run.
     */
    fun setWebRequests(webRequests: Set<WebRequest>?) {
        this.webRequests = webRequests
    }

    fun withWebRequests(webRequests: Set<WebRequest>?): ExternalProperties {
        this.webRequests = webRequests
        return this
    }

    /**
     * Responses that will be merged with a separate run.
     */
    fun getWebResponses(): Set<WebResponse>? {
        return webResponses
    }

    /**
     * Responses that will be merged with a separate run.
     */
    fun setWebResponses(webResponses: Set<WebResponse>?) {
        this.webResponses = webResponses
    }

    fun withWebResponses(webResponses: Set<WebResponse>?): ExternalProperties {
        this.webResponses = webResponses
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

    fun withProperties(properties: PropertyBag?): ExternalProperties {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(ExternalProperties::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("schema")
        sb.append('=')
        sb.append((if ((this.schema == null)) "<null>" else this.schema))
        sb.append(',')
        sb.append("version")
        sb.append('=')
        sb.append((if ((this.version == null)) "<null>" else this.version))
        sb.append(',')
        sb.append("guid")
        sb.append('=')
        sb.append((if ((this.guid == null)) "<null>" else this.guid))
        sb.append(',')
        sb.append("runGuid")
        sb.append('=')
        sb.append((if ((this.runGuid == null)) "<null>" else this.runGuid))
        sb.append(',')
        sb.append("conversion")
        sb.append('=')
        sb.append((if ((this.conversion == null)) "<null>" else this.conversion))
        sb.append(',')
        sb.append("graphs")
        sb.append('=')
        sb.append((if ((this.graphs == null)) "<null>" else this.graphs))
        sb.append(',')
        sb.append("externalizedProperties")
        sb.append('=')
        sb.append((if ((this.externalizedProperties == null)) "<null>" else this.externalizedProperties))
        sb.append(',')
        sb.append("artifacts")
        sb.append('=')
        sb.append((if ((this.artifacts == null)) "<null>" else this.artifacts))
        sb.append(',')
        sb.append("invocations")
        sb.append('=')
        sb.append((if ((this.invocations == null)) "<null>" else this.invocations))
        sb.append(',')
        sb.append("logicalLocations")
        sb.append('=')
        sb.append((if ((this.logicalLocations == null)) "<null>" else this.logicalLocations))
        sb.append(',')
        sb.append("threadFlowLocations")
        sb.append('=')
        sb.append((if ((this.threadFlowLocations == null)) "<null>" else this.threadFlowLocations))
        sb.append(',')
        sb.append("results")
        sb.append('=')
        sb.append((if ((this.results == null)) "<null>" else this.results))
        sb.append(',')
        sb.append("taxonomies")
        sb.append('=')
        sb.append((if ((this.taxonomies == null)) "<null>" else this.taxonomies))
        sb.append(',')
        sb.append("driver")
        sb.append('=')
        sb.append((if ((this.driver == null)) "<null>" else this.driver))
        sb.append(',')
        sb.append("extensions")
        sb.append('=')
        sb.append((if ((this.extensions == null)) "<null>" else this.extensions))
        sb.append(',')
        sb.append("policies")
        sb.append('=')
        sb.append((if ((this.policies == null)) "<null>" else this.policies))
        sb.append(',')
        sb.append("translations")
        sb.append('=')
        sb.append((if ((this.translations == null)) "<null>" else this.translations))
        sb.append(',')
        sb.append("addresses")
        sb.append('=')
        sb.append((if ((this.addresses == null)) "<null>" else this.addresses))
        sb.append(',')
        sb.append("webRequests")
        sb.append('=')
        sb.append((if ((this.webRequests == null)) "<null>" else this.webRequests))
        sb.append(',')
        sb.append("webResponses")
        sb.append('=')
        sb.append((if ((this.webResponses == null)) "<null>" else this.webResponses))
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
        result = ((result * 31) + (if ((this.schema == null)) 0 else schema.hashCode()))
        result = ((result * 31) + (if ((this.addresses == null)) 0 else addresses.hashCode()))
        result = ((result * 31) + (if ((this.logicalLocations == null)) 0 else logicalLocations.hashCode()))
        result = ((result * 31) + (if ((this.policies == null)) 0 else policies.hashCode()))
        result = ((result * 31) + (if ((this.runGuid == null)) 0 else runGuid.hashCode()))
        result = ((result * 31) + (if ((this.version == null)) 0 else version.hashCode()))
        result = ((result * 31) + (if ((this.externalizedProperties == null)) 0 else externalizedProperties.hashCode()))
        result = ((result * 31) + (if ((this.invocations == null)) 0 else invocations.hashCode()))
        result = ((result * 31) + (if ((this.graphs == null)) 0 else graphs.hashCode()))
        result = ((result * 31) + (if ((this.extensions == null)) 0 else extensions.hashCode()))
        result = ((result * 31) + (if ((this.driver == null)) 0 else driver.hashCode()))
        result = ((result * 31) + (if ((this.taxonomies == null)) 0 else taxonomies.hashCode()))
        result = ((result * 31) + (if ((this.translations == null)) 0 else translations.hashCode()))
        result = ((result * 31) + (if ((this.webResponses == null)) 0 else webResponses.hashCode()))
        result = ((result * 31) + (if ((this.guid == null)) 0 else guid.hashCode()))
        result = ((result * 31) + (if ((this.webRequests == null)) 0 else webRequests.hashCode()))
        result = ((result * 31) + (if ((this.results == null)) 0 else results.hashCode()))
        result = ((result * 31) + (if ((this.threadFlowLocations == null)) 0 else threadFlowLocations.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        result = ((result * 31) + (if ((this.conversion == null)) 0 else conversion.hashCode()))
        result = ((result * 31) + (if ((this.artifacts == null)) 0 else artifacts.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is ExternalProperties) == false) {
            return false
        }
        val rhs = other
        return ((((((((((((((((((((((this.schema === rhs.schema) || ((this.schema != null) && (this.schema == rhs.schema))) && ((this.addresses === rhs.addresses) || ((this.addresses != null) && (this.addresses == rhs.addresses)))) && ((this.logicalLocations === rhs.logicalLocations) || ((this.logicalLocations != null) && (this.logicalLocations == rhs.logicalLocations)))) && ((this.policies === rhs.policies) || ((this.policies != null) && (this.policies == rhs.policies)))) && ((this.runGuid === rhs.runGuid) || ((this.runGuid != null) && (this.runGuid == rhs.runGuid)))) && ((this.version == rhs.version) || ((this.version != null) && (this.version == rhs.version)))) && ((this.externalizedProperties === rhs.externalizedProperties) || ((this.externalizedProperties != null) && externalizedProperties.equals(
            rhs.externalizedProperties
        )))) && ((this.invocations === rhs.invocations) || ((this.invocations != null) && (this.invocations == rhs.invocations)))) && ((this.graphs === rhs.graphs) || ((this.graphs != null) && (this.graphs == rhs.graphs)))) && ((this.extensions === rhs.extensions) || ((this.extensions != null) && (this.extensions == rhs.extensions)))) && ((this.driver === rhs.driver) || ((this.driver != null) && driver.equals(
            rhs.driver
        )))) && ((this.taxonomies === rhs.taxonomies) || ((this.taxonomies != null) && (this.taxonomies == rhs.taxonomies)))) && ((this.translations === rhs.translations) || ((this.translations != null) && (this.translations == rhs.translations)))) && ((this.webResponses === rhs.webResponses) || ((this.webResponses != null) && (this.webResponses == rhs.webResponses)))) && ((this.guid === rhs.guid) || ((this.guid != null) && (this.guid == rhs.guid)))) && ((this.webRequests === rhs.webRequests) || ((this.webRequests != null) && (this.webRequests == rhs.webRequests)))) && ((this.results === rhs.results) || ((this.results != null) && (this.results == rhs.results)))) && ((this.threadFlowLocations === rhs.threadFlowLocations) || ((this.threadFlowLocations != null) && (this.threadFlowLocations == rhs.threadFlowLocations)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        )))) && ((this.conversion === rhs.conversion) || ((this.conversion != null) && conversion.equals(rhs.conversion)))) && ((this.artifacts === rhs.artifacts) || ((this.artifacts != null) && (this.artifacts == rhs.artifacts))))
    }


    /**
     * The SARIF format version of this external properties object.
     */
    @Generated("jsonschema2pojo")
    enum class Version(private val value: String) {
        @SerializedName("2.1.0")
        _2_1_0("2.1.0");

        override fun toString(): String {
            return this.value
        }

        fun value(): String {
            return this.value
        }

        companion object {
            private val CONSTANTS: MutableMap<String, Version> = HashMap()

            init {
                for (c in entries) {
                    CONSTANTS[c.value] = c
                }
            }

            fun fromValue(value: String): Version {
                val constant = CONSTANTS[value]
                requireNotNull(constant) { value }
                return constant
            }
        }
    }
}
