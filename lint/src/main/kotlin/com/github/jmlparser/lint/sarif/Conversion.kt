package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * Describes how a converter transformed the output of a static analysis tool from the analysis tool's native output format into the SARIF format.
 */
@Generated("jsonschema2pojo")
class Conversion {
    /**
     * The analysis tool that was run.
     * (Required)
     */
    @SerializedName("tool")
    @Expose
    private var tool: Tool? = null

    /**
     * The runtime environment of the analysis tool run.
     */
    @SerializedName("invocation")
    @Expose
    private var invocation: Invocation? = null

    /**
     * The locations of the analysis tool's per-run log files.
     */
    @SerializedName("analysisToolLogFiles")
    @Expose
    private var analysisToolLogFiles: Set<ArtifactLocation>? = LinkedHashSet<ArtifactLocation>()

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
     * @param invocation
     * @param analysisToolLogFiles
     * @param tool
     * @param properties
     */
    constructor(
        tool: Tool?,
        invocation: Invocation?,
        analysisToolLogFiles: Set<ArtifactLocation>?,
        properties: PropertyBag?
    ) : super() {
        this.tool = tool
        this.invocation = invocation
        this.analysisToolLogFiles = analysisToolLogFiles
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

    fun withTool(tool: Tool?): Conversion {
        this.tool = tool
        return this
    }

    /**
     * The runtime environment of the analysis tool run.
     */
    fun getInvocation(): Invocation? {
        return invocation
    }

    /**
     * The runtime environment of the analysis tool run.
     */
    fun setInvocation(invocation: Invocation?) {
        this.invocation = invocation
    }

    fun withInvocation(invocation: Invocation?): Conversion {
        this.invocation = invocation
        return this
    }

    /**
     * The locations of the analysis tool's per-run log files.
     */
    fun getAnalysisToolLogFiles(): Set<ArtifactLocation>? {
        return analysisToolLogFiles
    }

    /**
     * The locations of the analysis tool's per-run log files.
     */
    fun setAnalysisToolLogFiles(analysisToolLogFiles: Set<ArtifactLocation>?) {
        this.analysisToolLogFiles = analysisToolLogFiles
    }

    fun withAnalysisToolLogFiles(analysisToolLogFiles: Set<ArtifactLocation>?): Conversion {
        this.analysisToolLogFiles = analysisToolLogFiles
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

    fun withProperties(properties: PropertyBag?): Conversion {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Conversion::class.java.name).append('@').append(
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
        sb.append("invocation")
        sb.append('=')
        sb.append((if ((this.invocation == null)) "<null>" else this.invocation))
        sb.append(',')
        sb.append("analysisToolLogFiles")
        sb.append('=')
        sb.append((if ((this.analysisToolLogFiles == null)) "<null>" else this.analysisToolLogFiles))
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
        result = ((result * 31) + (if ((this.invocation == null)) 0 else invocation.hashCode()))
        result = ((result * 31) + (if ((this.analysisToolLogFiles == null)) 0 else analysisToolLogFiles.hashCode()))
        result = ((result * 31) + (if ((this.tool == null)) 0 else tool.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Conversion) == false) {
            return false
        }
        val rhs = other
        return (((((this.invocation === rhs.invocation) || ((this.invocation != null) && invocation.equals(rhs.invocation))) && ((this.analysisToolLogFiles === rhs.analysisToolLogFiles) || ((this.analysisToolLogFiles != null) && (this.analysisToolLogFiles == rhs.analysisToolLogFiles)))) && ((this.tool === rhs.tool) || ((this.tool != null) && tool.equals(
            rhs.tool
        )))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(rhs.properties))))
    }
}
