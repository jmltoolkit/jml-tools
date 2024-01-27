package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import java.net.URI
import javax.annotation.processing.Generated

/**
 * Static Analysis Results Format (SARIF) Version 2.1.0 JSON Schema
 *
 *
 * Static Analysis Results Format (SARIF) Version 2.1.0 JSON Schema: a standard format for the output of static analysis tools.
 */
@Generated("jsonschema2pojo")
class SarifSchema {
    /**
     * The URI of the JSON schema corresponding to the version.
     */
    @SerializedName("\$schema")
    @Expose
    private var `$schema`: URI? = null
    /**
     * The SARIF format version of this log file.
     * (Required)
     */
    /**
     * The SARIF format version of this log file.
     * (Required)
     */
    /**
     * The SARIF format version of this log file.
     * (Required)
     */
    @SerializedName("version")
    @Expose
    var version: Any? = null

    /**
     * The set of runs contained in this log file.
     * (Required)
     */
    @SerializedName("runs")
    @Expose
    private var runs: List<Run>? = ArrayList<Run>()

    /**
     * References to external property files that share data between runs.
     */
    @SerializedName("inlineExternalProperties")
    @Expose
    private var inlineExternalProperties: Set<ExternalProperties>? = LinkedHashSet<ExternalProperties>()

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
     * @param inlineExternalProperties
     * @param $schema
     * @param version
     * @param runs
     * @param properties
     */
    constructor(
        `$schema`: URI?,
        version: Any?,
        runs: List<Run>?,
        inlineExternalProperties: Set<ExternalProperties>?,
        properties: PropertyBag?
    ) : super() {
        this.`$schema` = `$schema`
        this.version = version
        this.runs = runs
        this.inlineExternalProperties = inlineExternalProperties
        this.properties = properties
    }

    /**
     * The URI of the JSON schema corresponding to the version.
     */
    fun `get$schema`(): URI? {
        return `$schema`
    }

    /**
     * The URI of the JSON schema corresponding to the version.
     */
    fun `set$schema`(`$schema`: URI?) {
        this.`$schema` = `$schema`
    }

    fun `with$schema`(`$schema`: URI?): SarifSchema {
        this.`$schema` = `$schema`
        return this
    }

    fun withVersion(version: Any?): SarifSchema {
        this.version = version
        return this
    }

    /**
     * The set of runs contained in this log file.
     * (Required)
     */
    fun getRuns(): List<Run>? {
        return runs
    }

    /**
     * The set of runs contained in this log file.
     * (Required)
     */
    fun setRuns(runs: List<Run>?) {
        this.runs = runs
    }

    fun withRuns(runs: List<Run>?): SarifSchema {
        this.runs = runs
        return this
    }

    /**
     * References to external property files that share data between runs.
     */
    fun getInlineExternalProperties(): Set<ExternalProperties>? {
        return inlineExternalProperties
    }

    /**
     * References to external property files that share data between runs.
     */
    fun setInlineExternalProperties(inlineExternalProperties: Set<ExternalProperties>?) {
        this.inlineExternalProperties = inlineExternalProperties
    }

    fun withInlineExternalProperties(inlineExternalProperties: Set<ExternalProperties>?): SarifSchema {
        this.inlineExternalProperties = inlineExternalProperties
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

    fun withProperties(properties: PropertyBag?): SarifSchema {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(SarifSchema::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("\$schema")
        sb.append('=')
        sb.append((if ((this.`$schema` == null)) "<null>" else this.`$schema`))
        sb.append(',')
        sb.append("version")
        sb.append('=')
        sb.append((if ((this.version == null)) "<null>" else this.version))
        sb.append(',')
        sb.append("runs")
        sb.append('=')
        sb.append((if ((this.runs == null)) "<null>" else this.runs))
        sb.append(',')
        sb.append("inlineExternalProperties")
        sb.append('=')
        sb.append((if ((this.inlineExternalProperties == null)) "<null>" else this.inlineExternalProperties))
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
        result =
            ((result * 31) + (if ((this.inlineExternalProperties == null)) 0 else inlineExternalProperties.hashCode()))
        result = ((result * 31) + (if ((this.`$schema` == null)) 0 else `$schema`.hashCode()))
        result = ((result * 31) + (if ((this.version == null)) 0 else version.hashCode()))
        result = ((result * 31) + (if ((this.runs == null)) 0 else runs.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is SarifSchema) == false) {
            return false
        }
        val rhs = other
        return ((((((this.inlineExternalProperties === rhs.inlineExternalProperties) || ((this.inlineExternalProperties != null) && (this.inlineExternalProperties == rhs.inlineExternalProperties))) && ((this.`$schema` === rhs.`$schema`) || ((this.`$schema` != null) && (this.`$schema` == rhs.`$schema`)))) && ((this.version === rhs.version) || ((this.version != null) && (this.version == rhs.version)))) && ((this.runs === rhs.runs) || ((this.runs != null) && (this.runs == rhs.runs)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }
}
