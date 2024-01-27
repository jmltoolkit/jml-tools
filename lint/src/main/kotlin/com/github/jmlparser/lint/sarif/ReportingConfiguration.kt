package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * Information about a rule or notification that can be configured at runtime.
 */
@Generated("jsonschema2pojo")
class ReportingConfiguration {
    /**
     * Specifies whether the report may be produced during the scan.
     */
    /**
     * Specifies whether the report may be produced during the scan.
     */
    /**
     * Specifies whether the report may be produced during the scan.
     */
    @SerializedName("enabled")
    @Expose
    var isEnabled: Boolean = true
    /**
     * Specifies the failure level for the report.
     */
    /**
     * Specifies the failure level for the report.
     */
    /**
     * Specifies the failure level for the report.
     */
    @SerializedName("level")
    @Expose
    var level: Level? = Level.fromValue("warning")
    /**
     * Specifies the relative priority of the report. Used for analysis output only.
     */
    /**
     * Specifies the relative priority of the report. Used for analysis output only.
     */
    /**
     * Specifies the relative priority of the report. Used for analysis output only.
     */
    @SerializedName("rank")
    @Expose
    var rank: Double = -1.0

    /**
     * Key/value pairs that provide additional information about the object.
     */
    @SerializedName("parameters")
    @Expose
    private var parameters: PropertyBag? = null

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
     * @param level
     * @param rank
     * @param parameters
     * @param enabled
     * @param properties
     */
    constructor(
        enabled: Boolean,
        level: Level?,
        rank: Double,
        parameters: PropertyBag?,
        properties: PropertyBag?
    ) : super() {
        this.isEnabled = enabled
        this.level = level
        this.rank = rank
        this.parameters = parameters
        this.properties = properties
    }

    fun withEnabled(enabled: Boolean): ReportingConfiguration {
        this.isEnabled = enabled
        return this
    }

    fun withLevel(level: Level?): ReportingConfiguration {
        this.level = level
        return this
    }

    fun withRank(rank: Double): ReportingConfiguration {
        this.rank = rank
        return this
    }

    /**
     * Key/value pairs that provide additional information about the object.
     */
    fun getParameters(): PropertyBag? {
        return parameters
    }

    /**
     * Key/value pairs that provide additional information about the object.
     */
    fun setParameters(parameters: PropertyBag?) {
        this.parameters = parameters
    }

    fun withParameters(parameters: PropertyBag?): ReportingConfiguration {
        this.parameters = parameters
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

    fun withProperties(properties: PropertyBag?): ReportingConfiguration {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(ReportingConfiguration::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("enabled")
        sb.append('=')
        sb.append(this.isEnabled)
        sb.append(',')
        sb.append("level")
        sb.append('=')
        sb.append((if ((this.level == null)) "<null>" else this.level))
        sb.append(',')
        sb.append("rank")
        sb.append('=')
        sb.append(this.rank)
        sb.append(',')
        sb.append("parameters")
        sb.append('=')
        sb.append((if ((this.parameters == null)) "<null>" else this.parameters))
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
        result = ((result * 31) + ((java.lang.Double.doubleToLongBits(this.rank) xor (java.lang.Double.doubleToLongBits(
            this.rank
        ) ushr 32)).toInt()))
        result = ((result * 31) + (if ((this.level == null)) 0 else level.hashCode()))
        result = ((result * 31) + (if ((this.parameters == null)) 0 else parameters.hashCode()))
        result = ((result * 31) + (if (this.isEnabled) 1 else 0))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is ReportingConfiguration) == false) {
            return false
        }
        val rhs = other
        return (((((java.lang.Double.doubleToLongBits(this.rank) == java.lang.Double.doubleToLongBits(rhs.rank)) && ((this.level == rhs.level) || ((this.level != null) && (this.level == rhs.level)))) && ((this.parameters === rhs.parameters) || ((this.parameters != null) && parameters.equals(
            rhs.parameters
        )))) && (this.isEnabled == rhs.isEnabled)) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }


    /**
     * Specifies the failure level for the report.
     */
    @Generated("jsonschema2pojo")
    enum class Level(private val value: String) {
        @SerializedName("none")
        NONE("none"),
        @SerializedName("note")
        NOTE("note"),
        @SerializedName("warning")
        WARNING("warning"),
        @SerializedName("error")
        ERROR("error");

        override fun toString(): String {
            return this.value
        }

        fun value(): String {
            return this.value
        }

        companion object {
            private val CONSTANTS: MutableMap<String, Level> = HashMap()

            init {
                for (c in entries) {
                    CONSTANTS[c.value] = c
                }
            }

            fun fromValue(value: String): Level {
                val constant = CONSTANTS[value]
                requireNotNull(constant) { value }
                return constant
            }
        }
    }
}
