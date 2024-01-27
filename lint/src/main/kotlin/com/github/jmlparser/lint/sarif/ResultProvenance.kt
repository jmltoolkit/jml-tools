package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import java.util.*
import javax.annotation.processing.Generated

/**
 * Contains information about how and when a result was detected.
 */
@Generated("jsonschema2pojo")
class ResultProvenance {
    /**
     * The Coordinated Universal Time (UTC) date and time at which the result was first detected. See "Date/time properties" in the SARIF spec for the required format.
     */
    /**
     * The Coordinated Universal Time (UTC) date and time at which the result was first detected. See "Date/time properties" in the SARIF spec for the required format.
     */
    /**
     * The Coordinated Universal Time (UTC) date and time at which the result was first detected. See "Date/time properties" in the SARIF spec for the required format.
     */
    @SerializedName("firstDetectionTimeUtc")
    @Expose
    var firstDetectionTimeUtc: Date? = null
    /**
     * The Coordinated Universal Time (UTC) date and time at which the result was most recently detected. See "Date/time properties" in the SARIF spec for the required format.
     */
    /**
     * The Coordinated Universal Time (UTC) date and time at which the result was most recently detected. See "Date/time properties" in the SARIF spec for the required format.
     */
    /**
     * The Coordinated Universal Time (UTC) date and time at which the result was most recently detected. See "Date/time properties" in the SARIF spec for the required format.
     */
    @SerializedName("lastDetectionTimeUtc")
    @Expose
    var lastDetectionTimeUtc: Date? = null
    /**
     * A GUID-valued string equal to the automationDetails.guid property of the run in which the result was first detected.
     */
    /**
     * A GUID-valued string equal to the automationDetails.guid property of the run in which the result was first detected.
     */
    /**
     * A GUID-valued string equal to the automationDetails.guid property of the run in which the result was first detected.
     */
    @SerializedName("firstDetectionRunGuid")
    @Expose
    var firstDetectionRunGuid: String? = null
    /**
     * A GUID-valued string equal to the automationDetails.guid property of the run in which the result was most recently detected.
     */
    /**
     * A GUID-valued string equal to the automationDetails.guid property of the run in which the result was most recently detected.
     */
    /**
     * A GUID-valued string equal to the automationDetails.guid property of the run in which the result was most recently detected.
     */
    @SerializedName("lastDetectionRunGuid")
    @Expose
    var lastDetectionRunGuid: String? = null
    /**
     * The index within the run.invocations array of the invocation object which describes the tool invocation that detected the result.
     */
    /**
     * The index within the run.invocations array of the invocation object which describes the tool invocation that detected the result.
     */
    /**
     * The index within the run.invocations array of the invocation object which describes the tool invocation that detected the result.
     */
    @SerializedName("invocationIndex")
    @Expose
    var invocationIndex: Int = -1

    /**
     * An array of physicalLocation objects which specify the portions of an analysis tool's output that a converter transformed into the result.
     */
    @SerializedName("conversionSources")
    @Expose
    private var conversionSources: Set<PhysicalLocation>? = LinkedHashSet<PhysicalLocation>()

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
     * @param firstDetectionRunGuid
     * @param lastDetectionTimeUtc
     * @param invocationIndex
     * @param lastDetectionRunGuid
     * @param conversionSources
     * @param firstDetectionTimeUtc
     * @param properties
     */
    constructor(
        firstDetectionTimeUtc: Date?,
        lastDetectionTimeUtc: Date?,
        firstDetectionRunGuid: String?,
        lastDetectionRunGuid: String?,
        invocationIndex: Int,
        conversionSources: Set<PhysicalLocation>?,
        properties: PropertyBag?
    ) : super() {
        this.firstDetectionTimeUtc = firstDetectionTimeUtc
        this.lastDetectionTimeUtc = lastDetectionTimeUtc
        this.firstDetectionRunGuid = firstDetectionRunGuid
        this.lastDetectionRunGuid = lastDetectionRunGuid
        this.invocationIndex = invocationIndex
        this.conversionSources = conversionSources
        this.properties = properties
    }

    fun withFirstDetectionTimeUtc(firstDetectionTimeUtc: Date?): ResultProvenance {
        this.firstDetectionTimeUtc = firstDetectionTimeUtc
        return this
    }

    fun withLastDetectionTimeUtc(lastDetectionTimeUtc: Date?): ResultProvenance {
        this.lastDetectionTimeUtc = lastDetectionTimeUtc
        return this
    }

    fun withFirstDetectionRunGuid(firstDetectionRunGuid: String?): ResultProvenance {
        this.firstDetectionRunGuid = firstDetectionRunGuid
        return this
    }

    fun withLastDetectionRunGuid(lastDetectionRunGuid: String?): ResultProvenance {
        this.lastDetectionRunGuid = lastDetectionRunGuid
        return this
    }

    fun withInvocationIndex(invocationIndex: Int): ResultProvenance {
        this.invocationIndex = invocationIndex
        return this
    }

    /**
     * An array of physicalLocation objects which specify the portions of an analysis tool's output that a converter transformed into the result.
     */
    fun getConversionSources(): Set<PhysicalLocation>? {
        return conversionSources
    }

    /**
     * An array of physicalLocation objects which specify the portions of an analysis tool's output that a converter transformed into the result.
     */
    fun setConversionSources(conversionSources: Set<PhysicalLocation>?) {
        this.conversionSources = conversionSources
    }

    fun withConversionSources(conversionSources: Set<PhysicalLocation>?): ResultProvenance {
        this.conversionSources = conversionSources
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

    fun withProperties(properties: PropertyBag?): ResultProvenance {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(ResultProvenance::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("firstDetectionTimeUtc")
        sb.append('=')
        sb.append((if ((this.firstDetectionTimeUtc == null)) "<null>" else this.firstDetectionTimeUtc))
        sb.append(',')
        sb.append("lastDetectionTimeUtc")
        sb.append('=')
        sb.append((if ((this.lastDetectionTimeUtc == null)) "<null>" else this.lastDetectionTimeUtc))
        sb.append(',')
        sb.append("firstDetectionRunGuid")
        sb.append('=')
        sb.append((if ((this.firstDetectionRunGuid == null)) "<null>" else this.firstDetectionRunGuid))
        sb.append(',')
        sb.append("lastDetectionRunGuid")
        sb.append('=')
        sb.append((if ((this.lastDetectionRunGuid == null)) "<null>" else this.lastDetectionRunGuid))
        sb.append(',')
        sb.append("invocationIndex")
        sb.append('=')
        sb.append(this.invocationIndex)
        sb.append(',')
        sb.append("conversionSources")
        sb.append('=')
        sb.append((if ((this.conversionSources == null)) "<null>" else this.conversionSources))
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
        result = ((result * 31) + (if ((this.firstDetectionRunGuid == null)) 0 else firstDetectionRunGuid.hashCode()))
        result = ((result * 31) + (if ((this.lastDetectionTimeUtc == null)) 0 else lastDetectionTimeUtc.hashCode()))
        result = ((result * 31) + this.invocationIndex)
        result = ((result * 31) + (if ((this.lastDetectionRunGuid == null)) 0 else lastDetectionRunGuid.hashCode()))
        result = ((result * 31) + (if ((this.conversionSources == null)) 0 else conversionSources.hashCode()))
        result = ((result * 31) + (if ((this.firstDetectionTimeUtc == null)) 0 else firstDetectionTimeUtc.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is ResultProvenance) == false) {
            return false
        }
        val rhs = other
        return ((((((((this.firstDetectionRunGuid === rhs.firstDetectionRunGuid) || ((this.firstDetectionRunGuid != null) && (this.firstDetectionRunGuid == rhs.firstDetectionRunGuid))) && ((this.lastDetectionTimeUtc === rhs.lastDetectionTimeUtc) || ((this.lastDetectionTimeUtc != null) && (this.lastDetectionTimeUtc == rhs.lastDetectionTimeUtc)))) && (this.invocationIndex == rhs.invocationIndex)) && ((this.lastDetectionRunGuid === rhs.lastDetectionRunGuid) || ((this.lastDetectionRunGuid != null) && (this.lastDetectionRunGuid == rhs.lastDetectionRunGuid)))) && ((this.conversionSources === rhs.conversionSources) || ((this.conversionSources != null) && (this.conversionSources == rhs.conversionSources)))) && ((this.firstDetectionTimeUtc === rhs.firstDetectionTimeUtc) || ((this.firstDetectionTimeUtc != null) && (this.firstDetectionTimeUtc == rhs.firstDetectionTimeUtc)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }
}
