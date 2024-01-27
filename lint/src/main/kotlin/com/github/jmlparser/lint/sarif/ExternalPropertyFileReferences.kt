package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * References to external property files that should be inlined with the content of a root log file.
 */
@Generated("jsonschema2pojo")
class ExternalPropertyFileReferences {
    /**
     * Contains information that enables a SARIF consumer to locate the external property file that contains the value of an externalized property associated with the run.
     */
    @SerializedName("conversion")
    @Expose
    private var conversion: ExternalPropertyFileReference? = null

    /**
     * An array of external property files containing a run.graphs object to be merged with the root log file.
     */
    @SerializedName("graphs")
    @Expose
    private var graphs: Set<ExternalPropertyFileReference>? = LinkedHashSet<ExternalPropertyFileReference>()

    /**
     * Contains information that enables a SARIF consumer to locate the external property file that contains the value of an externalized property associated with the run.
     */
    @SerializedName("externalizedProperties")
    @Expose
    private var externalizedProperties: ExternalPropertyFileReference? = null

    /**
     * An array of external property files containing run.artifacts arrays to be merged with the root log file.
     */
    @SerializedName("artifacts")
    @Expose
    private var artifacts: Set<ExternalPropertyFileReference>? = LinkedHashSet<ExternalPropertyFileReference>()

    /**
     * An array of external property files containing run.invocations arrays to be merged with the root log file.
     */
    @SerializedName("invocations")
    @Expose
    private var invocations: Set<ExternalPropertyFileReference>? = LinkedHashSet<ExternalPropertyFileReference>()

    /**
     * An array of external property files containing run.logicalLocations arrays to be merged with the root log file.
     */
    @SerializedName("logicalLocations")
    @Expose
    private var logicalLocations: Set<ExternalPropertyFileReference>? = LinkedHashSet<ExternalPropertyFileReference>()

    /**
     * An array of external property files containing run.threadFlowLocations arrays to be merged with the root log file.
     */
    @SerializedName("threadFlowLocations")
    @Expose
    private var threadFlowLocations: Set<ExternalPropertyFileReference>? =
        LinkedHashSet<ExternalPropertyFileReference>()

    /**
     * An array of external property files containing run.results arrays to be merged with the root log file.
     */
    @SerializedName("results")
    @Expose
    private var results: Set<ExternalPropertyFileReference>? = LinkedHashSet<ExternalPropertyFileReference>()

    /**
     * An array of external property files containing run.taxonomies arrays to be merged with the root log file.
     */
    @SerializedName("taxonomies")
    @Expose
    private var taxonomies: Set<ExternalPropertyFileReference>? = LinkedHashSet<ExternalPropertyFileReference>()

    /**
     * An array of external property files containing run.addresses arrays to be merged with the root log file.
     */
    @SerializedName("addresses")
    @Expose
    private var addresses: Set<ExternalPropertyFileReference>? = LinkedHashSet<ExternalPropertyFileReference>()

    /**
     * Contains information that enables a SARIF consumer to locate the external property file that contains the value of an externalized property associated with the run.
     */
    @SerializedName("driver")
    @Expose
    private var driver: ExternalPropertyFileReference? = null

    /**
     * An array of external property files containing run.extensions arrays to be merged with the root log file.
     */
    @SerializedName("extensions")
    @Expose
    private var extensions: Set<ExternalPropertyFileReference>? = LinkedHashSet<ExternalPropertyFileReference>()

    /**
     * An array of external property files containing run.policies arrays to be merged with the root log file.
     */
    @SerializedName("policies")
    @Expose
    private var policies: Set<ExternalPropertyFileReference>? = LinkedHashSet<ExternalPropertyFileReference>()

    /**
     * An array of external property files containing run.translations arrays to be merged with the root log file.
     */
    @SerializedName("translations")
    @Expose
    private var translations: Set<ExternalPropertyFileReference>? = LinkedHashSet<ExternalPropertyFileReference>()

    /**
     * An array of external property files containing run.requests arrays to be merged with the root log file.
     */
    @SerializedName("webRequests")
    @Expose
    private var webRequests: Set<ExternalPropertyFileReference>? = LinkedHashSet<ExternalPropertyFileReference>()

    /**
     * An array of external property files containing run.responses arrays to be merged with the root log file.
     */
    @SerializedName("webResponses")
    @Expose
    private var webResponses: Set<ExternalPropertyFileReference>? = LinkedHashSet<ExternalPropertyFileReference>()

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
     * @param externalizedProperties
     * @param invocations
     * @param graphs
     * @param extensions
     * @param driver
     * @param taxonomies
     * @param translations
     * @param webResponses
     * @param webRequests
     * @param results
     * @param threadFlowLocations
     * @param properties
     * @param conversion
     * @param artifacts
     */
    constructor(
        conversion: ExternalPropertyFileReference?,
        graphs: Set<ExternalPropertyFileReference>?,
        externalizedProperties: ExternalPropertyFileReference?,
        artifacts: Set<ExternalPropertyFileReference>?,
        invocations: Set<ExternalPropertyFileReference>?,
        logicalLocations: Set<ExternalPropertyFileReference>?,
        threadFlowLocations: Set<ExternalPropertyFileReference>?,
        results: Set<ExternalPropertyFileReference>?,
        taxonomies: Set<ExternalPropertyFileReference>?,
        addresses: Set<ExternalPropertyFileReference>?,
        driver: ExternalPropertyFileReference?,
        extensions: Set<ExternalPropertyFileReference>?,
        policies: Set<ExternalPropertyFileReference>?,
        translations: Set<ExternalPropertyFileReference>?,
        webRequests: Set<ExternalPropertyFileReference>?,
        webResponses: Set<ExternalPropertyFileReference>?,
        properties: PropertyBag?
    ) : super() {
        this.conversion = conversion
        this.graphs = graphs
        this.externalizedProperties = externalizedProperties
        this.artifacts = artifacts
        this.invocations = invocations
        this.logicalLocations = logicalLocations
        this.threadFlowLocations = threadFlowLocations
        this.results = results
        this.taxonomies = taxonomies
        this.addresses = addresses
        this.driver = driver
        this.extensions = extensions
        this.policies = policies
        this.translations = translations
        this.webRequests = webRequests
        this.webResponses = webResponses
        this.properties = properties
    }

    /**
     * Contains information that enables a SARIF consumer to locate the external property file that contains the value of an externalized property associated with the run.
     */
    fun getConversion(): ExternalPropertyFileReference? {
        return conversion
    }

    /**
     * Contains information that enables a SARIF consumer to locate the external property file that contains the value of an externalized property associated with the run.
     */
    fun setConversion(conversion: ExternalPropertyFileReference?) {
        this.conversion = conversion
    }

    fun withConversion(conversion: ExternalPropertyFileReference?): ExternalPropertyFileReferences {
        this.conversion = conversion
        return this
    }

    /**
     * An array of external property files containing a run.graphs object to be merged with the root log file.
     */
    fun getGraphs(): Set<ExternalPropertyFileReference>? {
        return graphs
    }

    /**
     * An array of external property files containing a run.graphs object to be merged with the root log file.
     */
    fun setGraphs(graphs: Set<ExternalPropertyFileReference>?) {
        this.graphs = graphs
    }

    fun withGraphs(graphs: Set<ExternalPropertyFileReference>?): ExternalPropertyFileReferences {
        this.graphs = graphs
        return this
    }

    /**
     * Contains information that enables a SARIF consumer to locate the external property file that contains the value of an externalized property associated with the run.
     */
    fun getExternalizedProperties(): ExternalPropertyFileReference? {
        return externalizedProperties
    }

    /**
     * Contains information that enables a SARIF consumer to locate the external property file that contains the value of an externalized property associated with the run.
     */
    fun setExternalizedProperties(externalizedProperties: ExternalPropertyFileReference?) {
        this.externalizedProperties = externalizedProperties
    }

    fun withExternalizedProperties(externalizedProperties: ExternalPropertyFileReference?): ExternalPropertyFileReferences {
        this.externalizedProperties = externalizedProperties
        return this
    }

    /**
     * An array of external property files containing run.artifacts arrays to be merged with the root log file.
     */
    fun getArtifacts(): Set<ExternalPropertyFileReference>? {
        return artifacts
    }

    /**
     * An array of external property files containing run.artifacts arrays to be merged with the root log file.
     */
    fun setArtifacts(artifacts: Set<ExternalPropertyFileReference>?) {
        this.artifacts = artifacts
    }

    fun withArtifacts(artifacts: Set<ExternalPropertyFileReference>?): ExternalPropertyFileReferences {
        this.artifacts = artifacts
        return this
    }

    /**
     * An array of external property files containing run.invocations arrays to be merged with the root log file.
     */
    fun getInvocations(): Set<ExternalPropertyFileReference>? {
        return invocations
    }

    /**
     * An array of external property files containing run.invocations arrays to be merged with the root log file.
     */
    fun setInvocations(invocations: Set<ExternalPropertyFileReference>?) {
        this.invocations = invocations
    }

    fun withInvocations(invocations: Set<ExternalPropertyFileReference>?): ExternalPropertyFileReferences {
        this.invocations = invocations
        return this
    }

    /**
     * An array of external property files containing run.logicalLocations arrays to be merged with the root log file.
     */
    fun getLogicalLocations(): Set<ExternalPropertyFileReference>? {
        return logicalLocations
    }

    /**
     * An array of external property files containing run.logicalLocations arrays to be merged with the root log file.
     */
    fun setLogicalLocations(logicalLocations: Set<ExternalPropertyFileReference>?) {
        this.logicalLocations = logicalLocations
    }

    fun withLogicalLocations(logicalLocations: Set<ExternalPropertyFileReference>?): ExternalPropertyFileReferences {
        this.logicalLocations = logicalLocations
        return this
    }

    /**
     * An array of external property files containing run.threadFlowLocations arrays to be merged with the root log file.
     */
    fun getThreadFlowLocations(): Set<ExternalPropertyFileReference>? {
        return threadFlowLocations
    }

    /**
     * An array of external property files containing run.threadFlowLocations arrays to be merged with the root log file.
     */
    fun setThreadFlowLocations(threadFlowLocations: Set<ExternalPropertyFileReference>?) {
        this.threadFlowLocations = threadFlowLocations
    }

    fun withThreadFlowLocations(threadFlowLocations: Set<ExternalPropertyFileReference>?): ExternalPropertyFileReferences {
        this.threadFlowLocations = threadFlowLocations
        return this
    }

    /**
     * An array of external property files containing run.results arrays to be merged with the root log file.
     */
    fun getResults(): Set<ExternalPropertyFileReference>? {
        return results
    }

    /**
     * An array of external property files containing run.results arrays to be merged with the root log file.
     */
    fun setResults(results: Set<ExternalPropertyFileReference>?) {
        this.results = results
    }

    fun withResults(results: Set<ExternalPropertyFileReference>?): ExternalPropertyFileReferences {
        this.results = results
        return this
    }

    /**
     * An array of external property files containing run.taxonomies arrays to be merged with the root log file.
     */
    fun getTaxonomies(): Set<ExternalPropertyFileReference>? {
        return taxonomies
    }

    /**
     * An array of external property files containing run.taxonomies arrays to be merged with the root log file.
     */
    fun setTaxonomies(taxonomies: Set<ExternalPropertyFileReference>?) {
        this.taxonomies = taxonomies
    }

    fun withTaxonomies(taxonomies: Set<ExternalPropertyFileReference>?): ExternalPropertyFileReferences {
        this.taxonomies = taxonomies
        return this
    }

    /**
     * An array of external property files containing run.addresses arrays to be merged with the root log file.
     */
    fun getAddresses(): Set<ExternalPropertyFileReference>? {
        return addresses
    }

    /**
     * An array of external property files containing run.addresses arrays to be merged with the root log file.
     */
    fun setAddresses(addresses: Set<ExternalPropertyFileReference>?) {
        this.addresses = addresses
    }

    fun withAddresses(addresses: Set<ExternalPropertyFileReference>?): ExternalPropertyFileReferences {
        this.addresses = addresses
        return this
    }

    /**
     * Contains information that enables a SARIF consumer to locate the external property file that contains the value of an externalized property associated with the run.
     */
    fun getDriver(): ExternalPropertyFileReference? {
        return driver
    }

    /**
     * Contains information that enables a SARIF consumer to locate the external property file that contains the value of an externalized property associated with the run.
     */
    fun setDriver(driver: ExternalPropertyFileReference?) {
        this.driver = driver
    }

    fun withDriver(driver: ExternalPropertyFileReference?): ExternalPropertyFileReferences {
        this.driver = driver
        return this
    }

    /**
     * An array of external property files containing run.extensions arrays to be merged with the root log file.
     */
    fun getExtensions(): Set<ExternalPropertyFileReference>? {
        return extensions
    }

    /**
     * An array of external property files containing run.extensions arrays to be merged with the root log file.
     */
    fun setExtensions(extensions: Set<ExternalPropertyFileReference>?) {
        this.extensions = extensions
    }

    fun withExtensions(extensions: Set<ExternalPropertyFileReference>?): ExternalPropertyFileReferences {
        this.extensions = extensions
        return this
    }

    /**
     * An array of external property files containing run.policies arrays to be merged with the root log file.
     */
    fun getPolicies(): Set<ExternalPropertyFileReference>? {
        return policies
    }

    /**
     * An array of external property files containing run.policies arrays to be merged with the root log file.
     */
    fun setPolicies(policies: Set<ExternalPropertyFileReference>?) {
        this.policies = policies
    }

    fun withPolicies(policies: Set<ExternalPropertyFileReference>?): ExternalPropertyFileReferences {
        this.policies = policies
        return this
    }

    /**
     * An array of external property files containing run.translations arrays to be merged with the root log file.
     */
    fun getTranslations(): Set<ExternalPropertyFileReference>? {
        return translations
    }

    /**
     * An array of external property files containing run.translations arrays to be merged with the root log file.
     */
    fun setTranslations(translations: Set<ExternalPropertyFileReference>?) {
        this.translations = translations
    }

    fun withTranslations(translations: Set<ExternalPropertyFileReference>?): ExternalPropertyFileReferences {
        this.translations = translations
        return this
    }

    /**
     * An array of external property files containing run.requests arrays to be merged with the root log file.
     */
    fun getWebRequests(): Set<ExternalPropertyFileReference>? {
        return webRequests
    }

    /**
     * An array of external property files containing run.requests arrays to be merged with the root log file.
     */
    fun setWebRequests(webRequests: Set<ExternalPropertyFileReference>?) {
        this.webRequests = webRequests
    }

    fun withWebRequests(webRequests: Set<ExternalPropertyFileReference>?): ExternalPropertyFileReferences {
        this.webRequests = webRequests
        return this
    }

    /**
     * An array of external property files containing run.responses arrays to be merged with the root log file.
     */
    fun getWebResponses(): Set<ExternalPropertyFileReference>? {
        return webResponses
    }

    /**
     * An array of external property files containing run.responses arrays to be merged with the root log file.
     */
    fun setWebResponses(webResponses: Set<ExternalPropertyFileReference>?) {
        this.webResponses = webResponses
    }

    fun withWebResponses(webResponses: Set<ExternalPropertyFileReference>?): ExternalPropertyFileReferences {
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

    fun withProperties(properties: PropertyBag?): ExternalPropertyFileReferences {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(ExternalPropertyFileReferences::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
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
        sb.append("addresses")
        sb.append('=')
        sb.append((if ((this.addresses == null)) "<null>" else this.addresses))
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
        result = ((result * 31) + (if ((this.addresses == null)) 0 else addresses.hashCode()))
        result = ((result * 31) + (if ((this.logicalLocations == null)) 0 else logicalLocations.hashCode()))
        result = ((result * 31) + (if ((this.policies == null)) 0 else policies.hashCode()))
        result = ((result * 31) + (if ((this.externalizedProperties == null)) 0 else externalizedProperties.hashCode()))
        result = ((result * 31) + (if ((this.invocations == null)) 0 else invocations.hashCode()))
        result = ((result * 31) + (if ((this.graphs == null)) 0 else graphs.hashCode()))
        result = ((result * 31) + (if ((this.extensions == null)) 0 else extensions.hashCode()))
        result = ((result * 31) + (if ((this.driver == null)) 0 else driver.hashCode()))
        result = ((result * 31) + (if ((this.taxonomies == null)) 0 else taxonomies.hashCode()))
        result = ((result * 31) + (if ((this.translations == null)) 0 else translations.hashCode()))
        result = ((result * 31) + (if ((this.webResponses == null)) 0 else webResponses.hashCode()))
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
        if ((other is ExternalPropertyFileReferences) == false) {
            return false
        }
        val rhs = other
        return ((((((((((((((((((this.addresses === rhs.addresses) || ((this.addresses != null) && (this.addresses == rhs.addresses))) && ((this.logicalLocations === rhs.logicalLocations) || ((this.logicalLocations != null) && (this.logicalLocations == rhs.logicalLocations)))) && ((this.policies === rhs.policies) || ((this.policies != null) && (this.policies == rhs.policies)))) && ((this.externalizedProperties === rhs.externalizedProperties) || ((this.externalizedProperties != null) && externalizedProperties.equals(
            rhs.externalizedProperties
        )))) && ((this.invocations === rhs.invocations) || ((this.invocations != null) && (this.invocations == rhs.invocations)))) && ((this.graphs === rhs.graphs) || ((this.graphs != null) && (this.graphs == rhs.graphs)))) && ((this.extensions === rhs.extensions) || ((this.extensions != null) && (this.extensions == rhs.extensions)))) && ((this.driver === rhs.driver) || ((this.driver != null) && driver.equals(
            rhs.driver
        )))) && ((this.taxonomies === rhs.taxonomies) || ((this.taxonomies != null) && (this.taxonomies == rhs.taxonomies)))) && ((this.translations === rhs.translations) || ((this.translations != null) && (this.translations == rhs.translations)))) && ((this.webResponses === rhs.webResponses) || ((this.webResponses != null) && (this.webResponses == rhs.webResponses)))) && ((this.webRequests === rhs.webRequests) || ((this.webRequests != null) && (this.webRequests == rhs.webRequests)))) && ((this.results === rhs.results) || ((this.results != null) && (this.results == rhs.results)))) && ((this.threadFlowLocations === rhs.threadFlowLocations) || ((this.threadFlowLocations != null) && (this.threadFlowLocations == rhs.threadFlowLocations)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        )))) && ((this.conversion === rhs.conversion) || ((this.conversion != null) && conversion.equals(rhs.conversion)))) && ((this.artifacts === rhs.artifacts) || ((this.artifacts != null) && (this.artifacts == rhs.artifacts))))
    }
}
