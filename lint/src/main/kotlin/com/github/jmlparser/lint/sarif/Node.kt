package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * Represents a node in a graph.
 */
@Generated("jsonschema2pojo")
class Node {
    /**
     * A string that uniquely identifies the node within its graph.
     * (Required)
     */
    /**
     * A string that uniquely identifies the node within its graph.
     * (Required)
     */
    /**
     * A string that uniquely identifies the node within its graph.
     * (Required)
     */
    @SerializedName("id")
    @Expose
    var id: String? = null

    /**
     * Encapsulates a message intended to be read by the end user.
     */
    @SerializedName("label")
    @Expose
    private var label: Message? = null

    /**
     * A location within a programming artifact.
     */
    @SerializedName("location")
    @Expose
    private var location: Location? = null
    /**
     * Array of child nodes.
     */
    /**
     * Array of child nodes.
     */
    /**
     * Array of child nodes.
     */
    @SerializedName("children")
    @Expose
    var children: Set<Node>? = LinkedHashSet()

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
     * @param children
     * @param location
     * @param id
     * @param label
     * @param properties
     */
    constructor(
        id: String?,
        label: Message?,
        location: Location?,
        children: Set<Node>?,
        properties: PropertyBag?
    ) : super() {
        this.id = id
        this.label = label
        this.location = location
        this.children = children
        this.properties = properties
    }

    fun withId(id: String?): Node {
        this.id = id
        return this
    }

    /**
     * Encapsulates a message intended to be read by the end user.
     */
    fun getLabel(): Message? {
        return label
    }

    /**
     * Encapsulates a message intended to be read by the end user.
     */
    fun setLabel(label: Message?) {
        this.label = label
    }

    fun withLabel(label: Message?): Node {
        this.label = label
        return this
    }

    /**
     * A location within a programming artifact.
     */
    fun getLocation(): Location? {
        return location
    }

    /**
     * A location within a programming artifact.
     */
    fun setLocation(location: Location?) {
        this.location = location
    }

    fun withLocation(location: Location?): Node {
        this.location = location
        return this
    }

    fun withChildren(children: Set<Node>?): Node {
        this.children = children
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

    fun withProperties(properties: PropertyBag?): Node {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Node::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("id")
        sb.append('=')
        sb.append((if ((this.id == null)) "<null>" else this.id))
        sb.append(',')
        sb.append("label")
        sb.append('=')
        sb.append((if ((this.label == null)) "<null>" else this.label))
        sb.append(',')
        sb.append("location")
        sb.append('=')
        sb.append((if ((this.location == null)) "<null>" else this.location))
        sb.append(',')
        sb.append("children")
        sb.append('=')
        sb.append((if ((this.children == null)) "<null>" else this.children))
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
        result = ((result * 31) + (if ((this.location == null)) 0 else location.hashCode()))
        result = ((result * 31) + (if ((this.id == null)) 0 else id.hashCode()))
        result = ((result * 31) + (if ((this.label == null)) 0 else label.hashCode()))
        result = ((result * 31) + (if ((this.children == null)) 0 else children.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Node) == false) {
            return false
        }
        val rhs = other
        return ((((((this.location === rhs.location) || ((this.location != null) && location.equals(rhs.location))) && ((this.id === rhs.id) || ((this.id != null) && (this.id == rhs.id)))) && ((this.label === rhs.label) || ((this.label != null) && label.equals(
            rhs.label
        )))) && ((this.children === rhs.children) || ((this.children != null) && (this.children == rhs.children)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }
}
