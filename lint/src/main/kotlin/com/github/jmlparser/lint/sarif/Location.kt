package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * A location within a programming artifact.
 */
@Generated("jsonschema2pojo")
class Location {
    /**
     * Value that distinguishes this location from all other locations within a single result object.
     */
    /**
     * Value that distinguishes this location from all other locations within a single result object.
     */
    /**
     * Value that distinguishes this location from all other locations within a single result object.
     */
    @SerializedName("id")
    @Expose
    var id: Int = -1

    /**
     * A physical location relevant to a result. Specifies a reference to a programming artifact together with a range of bytes or characters within that artifact.
     */
    @SerializedName("physicalLocation")
    @Expose
    private var physicalLocation: PhysicalLocation? = null

    /**
     * The logical locations associated with the result.
     */
    @SerializedName("logicalLocations")
    @Expose
    private var logicalLocations: Set<LogicalLocation>? = LinkedHashSet<LogicalLocation>()

    /**
     * Encapsulates a message intended to be read by the end user.
     */
    @SerializedName("message")
    @Expose
    private var message: Message? = null

    /**
     * A set of regions relevant to the location.
     */
    @SerializedName("annotations")
    @Expose
    private var annotations: Set<Region>? = LinkedHashSet<Region>()

    /**
     * An array of objects that describe relationships between this location and others.
     */
    @SerializedName("relationships")
    @Expose
    private var relationships: Set<LocationRelationship>? = LinkedHashSet<LocationRelationship>()

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
     * @param relationships
     * @param physicalLocation
     * @param logicalLocations
     * @param annotations
     * @param id
     * @param message
     * @param properties
     */
    constructor(
        id: Int,
        physicalLocation: PhysicalLocation?,
        logicalLocations: Set<LogicalLocation>?,
        message: Message?,
        annotations: Set<Region>?,
        relationships: Set<LocationRelationship>?,
        properties: PropertyBag?
    ) : super() {
        this.id = id
        this.physicalLocation = physicalLocation
        this.logicalLocations = logicalLocations
        this.message = message
        this.annotations = annotations
        this.relationships = relationships
        this.properties = properties
    }

    fun withId(id: Int): Location {
        this.id = id
        return this
    }

    /**
     * A physical location relevant to a result. Specifies a reference to a programming artifact together with a range of bytes or characters within that artifact.
     */
    fun getPhysicalLocation(): PhysicalLocation? {
        return physicalLocation
    }

    /**
     * A physical location relevant to a result. Specifies a reference to a programming artifact together with a range of bytes or characters within that artifact.
     */
    fun setPhysicalLocation(physicalLocation: PhysicalLocation?) {
        this.physicalLocation = physicalLocation
    }

    fun withPhysicalLocation(physicalLocation: PhysicalLocation?): Location {
        this.physicalLocation = physicalLocation
        return this
    }

    /**
     * The logical locations associated with the result.
     */
    fun getLogicalLocations(): Set<LogicalLocation>? {
        return logicalLocations
    }

    /**
     * The logical locations associated with the result.
     */
    fun setLogicalLocations(logicalLocations: Set<LogicalLocation>?) {
        this.logicalLocations = logicalLocations
    }

    fun withLogicalLocations(logicalLocations: Set<LogicalLocation>?): Location {
        this.logicalLocations = logicalLocations
        return this
    }

    /**
     * Encapsulates a message intended to be read by the end user.
     */
    fun getMessage(): Message? {
        return message
    }

    /**
     * Encapsulates a message intended to be read by the end user.
     */
    fun setMessage(message: Message?) {
        this.message = message
    }

    fun withMessage(message: Message?): Location {
        this.message = message
        return this
    }

    /**
     * A set of regions relevant to the location.
     */
    fun getAnnotations(): Set<Region>? {
        return annotations
    }

    /**
     * A set of regions relevant to the location.
     */
    fun setAnnotations(annotations: Set<Region>?) {
        this.annotations = annotations
    }

    fun withAnnotations(annotations: Set<Region>?): Location {
        this.annotations = annotations
        return this
    }

    /**
     * An array of objects that describe relationships between this location and others.
     */
    fun getRelationships(): Set<LocationRelationship>? {
        return relationships
    }

    /**
     * An array of objects that describe relationships between this location and others.
     */
    fun setRelationships(relationships: Set<LocationRelationship>?) {
        this.relationships = relationships
    }

    fun withRelationships(relationships: Set<LocationRelationship>?): Location {
        this.relationships = relationships
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

    fun withProperties(properties: PropertyBag?): Location {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Location::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("id")
        sb.append('=')
        sb.append(this.id)
        sb.append(',')
        sb.append("physicalLocation")
        sb.append('=')
        sb.append((if ((this.physicalLocation == null)) "<null>" else this.physicalLocation))
        sb.append(',')
        sb.append("logicalLocations")
        sb.append('=')
        sb.append((if ((this.logicalLocations == null)) "<null>" else this.logicalLocations))
        sb.append(',')
        sb.append("message")
        sb.append('=')
        sb.append((if ((this.message == null)) "<null>" else this.message))
        sb.append(',')
        sb.append("annotations")
        sb.append('=')
        sb.append((if ((this.annotations == null)) "<null>" else this.annotations))
        sb.append(',')
        sb.append("relationships")
        sb.append('=')
        sb.append((if ((this.relationships == null)) "<null>" else this.relationships))
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
        result = ((result * 31) + (if ((this.relationships == null)) 0 else relationships.hashCode()))
        result = ((result * 31) + (if ((this.physicalLocation == null)) 0 else physicalLocation.hashCode()))
        result = ((result * 31) + (if ((this.logicalLocations == null)) 0 else logicalLocations.hashCode()))
        result = ((result * 31) + (if ((this.annotations == null)) 0 else annotations.hashCode()))
        result = ((result * 31) + this.id)
        result = ((result * 31) + (if ((this.message == null)) 0 else message.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Location) == false) {
            return false
        }
        val rhs = other
        return ((((((((this.relationships === rhs.relationships) || ((this.relationships != null) && (this.relationships == rhs.relationships))) && ((this.physicalLocation === rhs.physicalLocation) || ((this.physicalLocation != null) && physicalLocation.equals(
            rhs.physicalLocation
        )))) && ((this.logicalLocations === rhs.logicalLocations) || ((this.logicalLocations != null) && (this.logicalLocations == rhs.logicalLocations)))) && ((this.annotations === rhs.annotations) || ((this.annotations != null) && (this.annotations == rhs.annotations)))) && (this.id == rhs.id)) && ((this.message === rhs.message) || ((this.message != null) && message.equals(
            rhs.message
        )))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(rhs.properties))))
    }
}
