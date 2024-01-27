package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * Information that describes a run's identity and role within an engineering system process.
 */
@Generated("jsonschema2pojo")
class RunAutomationDetails {
    /**
     * Encapsulates a message intended to be read by the end user.
     */
    @SerializedName("description")
    @Expose
    private var description: Message? = null
    /**
     * A hierarchical string that uniquely identifies this object's containing run object.
     */
    /**
     * A hierarchical string that uniquely identifies this object's containing run object.
     */
    /**
     * A hierarchical string that uniquely identifies this object's containing run object.
     */
    @SerializedName("id")
    @Expose
    var id: String? = null
    /**
     * A stable, unique identifer for this object's containing run object in the form of a GUID.
     */
    /**
     * A stable, unique identifer for this object's containing run object in the form of a GUID.
     */
    /**
     * A stable, unique identifer for this object's containing run object in the form of a GUID.
     */
    @SerializedName("guid")
    @Expose
    var guid: String? = null
    /**
     * A stable, unique identifier for the equivalence class of runs to which this object's containing run object belongs in the form of a GUID.
     */
    /**
     * A stable, unique identifier for the equivalence class of runs to which this object's containing run object belongs in the form of a GUID.
     */
    /**
     * A stable, unique identifier for the equivalence class of runs to which this object's containing run object belongs in the form of a GUID.
     */
    @SerializedName("correlationGuid")
    @Expose
    var correlationGuid: String? = null

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
     * @param correlationGuid
     * @param description
     * @param guid
     * @param id
     * @param properties
     */
    constructor(
        description: Message?,
        id: String?,
        guid: String?,
        correlationGuid: String?,
        properties: PropertyBag?
    ) : super() {
        this.description = description
        this.id = id
        this.guid = guid
        this.correlationGuid = correlationGuid
        this.properties = properties
    }

    /**
     * Encapsulates a message intended to be read by the end user.
     */
    fun getDescription(): Message? {
        return description
    }

    /**
     * Encapsulates a message intended to be read by the end user.
     */
    fun setDescription(description: Message?) {
        this.description = description
    }

    fun withDescription(description: Message?): RunAutomationDetails {
        this.description = description
        return this
    }

    fun withId(id: String?): RunAutomationDetails {
        this.id = id
        return this
    }

    fun withGuid(guid: String?): RunAutomationDetails {
        this.guid = guid
        return this
    }

    fun withCorrelationGuid(correlationGuid: String?): RunAutomationDetails {
        this.correlationGuid = correlationGuid
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

    fun withProperties(properties: PropertyBag?): RunAutomationDetails {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(RunAutomationDetails::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("description")
        sb.append('=')
        sb.append((if ((this.description == null)) "<null>" else this.description))
        sb.append(',')
        sb.append("id")
        sb.append('=')
        sb.append((if ((this.id == null)) "<null>" else this.id))
        sb.append(',')
        sb.append("guid")
        sb.append('=')
        sb.append((if ((this.guid == null)) "<null>" else this.guid))
        sb.append(',')
        sb.append("correlationGuid")
        sb.append('=')
        sb.append((if ((this.correlationGuid == null)) "<null>" else this.correlationGuid))
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
        result = ((result * 31) + (if ((this.description == null)) 0 else description.hashCode()))
        result = ((result * 31) + (if ((this.guid == null)) 0 else guid.hashCode()))
        result = ((result * 31) + (if ((this.id == null)) 0 else id.hashCode()))
        result = ((result * 31) + (if ((this.correlationGuid == null)) 0 else correlationGuid.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is RunAutomationDetails) == false) {
            return false
        }
        val rhs = other
        return ((((((this.description === rhs.description) || ((this.description != null) && description.equals(rhs.description))) && ((this.guid === rhs.guid) || ((this.guid != null) && (this.guid == rhs.guid)))) && ((this.id === rhs.id) || ((this.id != null) && (this.id == rhs.id)))) && ((this.correlationGuid === rhs.correlationGuid) || ((this.correlationGuid != null) && (this.correlationGuid == rhs.correlationGuid)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }
}
