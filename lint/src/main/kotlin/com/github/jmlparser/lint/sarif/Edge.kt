package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * Represents a directed edge in a graph.
 */
@Generated("jsonschema2pojo")
class Edge {
    /**
     * A string that uniquely identifies the edge within its graph.
     * (Required)
     */
    /**
     * A string that uniquely identifies the edge within its graph.
     * (Required)
     */
    /**
     * A string that uniquely identifies the edge within its graph.
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
     * Identifies the source node (the node at which the edge starts).
     * (Required)
     */
    /**
     * Identifies the source node (the node at which the edge starts).
     * (Required)
     */
    /**
     * Identifies the source node (the node at which the edge starts).
     * (Required)
     */
    @SerializedName("sourceNodeId")
    @Expose
    var sourceNodeId: String? = null
    /**
     * Identifies the target node (the node at which the edge ends).
     * (Required)
     */
    /**
     * Identifies the target node (the node at which the edge ends).
     * (Required)
     */
    /**
     * Identifies the target node (the node at which the edge ends).
     * (Required)
     */
    @SerializedName("targetNodeId")
    @Expose
    var targetNodeId: String? = null

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
     * @param sourceNodeId
     * @param id
     * @param label
     * @param targetNodeId
     * @param properties
     */
    constructor(
        id: String?,
        label: Message?,
        sourceNodeId: String?,
        targetNodeId: String?,
        properties: PropertyBag?
    ) : super() {
        this.id = id
        this.label = label
        this.sourceNodeId = sourceNodeId
        this.targetNodeId = targetNodeId
        this.properties = properties
    }

    fun withId(id: String?): Edge {
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

    fun withLabel(label: Message?): Edge {
        this.label = label
        return this
    }

    fun withSourceNodeId(sourceNodeId: String?): Edge {
        this.sourceNodeId = sourceNodeId
        return this
    }

    fun withTargetNodeId(targetNodeId: String?): Edge {
        this.targetNodeId = targetNodeId
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

    fun withProperties(properties: PropertyBag?): Edge {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Edge::class.java.name).append('@').append(
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
        sb.append("sourceNodeId")
        sb.append('=')
        sb.append((if ((this.sourceNodeId == null)) "<null>" else this.sourceNodeId))
        sb.append(',')
        sb.append("targetNodeId")
        sb.append('=')
        sb.append((if ((this.targetNodeId == null)) "<null>" else this.targetNodeId))
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
        result = ((result * 31) + (if ((this.id == null)) 0 else id.hashCode()))
        result = ((result * 31) + (if ((this.label == null)) 0 else label.hashCode()))
        result = ((result * 31) + (if ((this.targetNodeId == null)) 0 else targetNodeId.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        result = ((result * 31) + (if ((this.sourceNodeId == null)) 0 else sourceNodeId.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Edge) == false) {
            return false
        }
        val rhs = other
        return ((((((this.id === rhs.id) || ((this.id != null) && (this.id == rhs.id))) && ((this.label === rhs.label) || ((this.label != null) && label.equals(
            rhs.label
        )))) && ((this.targetNodeId === rhs.targetNodeId) || ((this.targetNodeId != null) && (this.targetNodeId == rhs.targetNodeId)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        )))) && ((this.sourceNodeId === rhs.sourceNodeId) || ((this.sourceNodeId != null) && (this.sourceNodeId == rhs.sourceNodeId))))
    }
}
