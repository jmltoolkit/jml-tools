package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * A network of nodes and directed edges that describes some aspect of the structure of the code (for example, a call graph).
 */
@Generated("jsonschema2pojo")
class Graph {
    /**
     * Encapsulates a message intended to be read by the end user.
     */
    @SerializedName("description")
    @Expose
    private var description: Message? = null

    /**
     * An array of node objects representing the nodes of the graph.
     */
    @SerializedName("nodes")
    @Expose
    private var nodes: Set<Node>? = LinkedHashSet<Node>()

    /**
     * An array of edge objects representing the edges of the graph.
     */
    @SerializedName("edges")
    @Expose
    private var edges: Set<Edge>? = LinkedHashSet<Edge>()

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
     * @param nodes
     * @param edges
     * @param description
     * @param properties
     */
    constructor(description: Message?, nodes: Set<Node>?, edges: Set<Edge>?, properties: PropertyBag?) : super() {
        this.description = description
        this.nodes = nodes
        this.edges = edges
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

    fun withDescription(description: Message?): Graph {
        this.description = description
        return this
    }

    /**
     * An array of node objects representing the nodes of the graph.
     */
    fun getNodes(): Set<Node>? {
        return nodes
    }

    /**
     * An array of node objects representing the nodes of the graph.
     */
    fun setNodes(nodes: Set<Node>?) {
        this.nodes = nodes
    }

    fun withNodes(nodes: Set<Node>?): Graph {
        this.nodes = nodes
        return this
    }

    /**
     * An array of edge objects representing the edges of the graph.
     */
    fun getEdges(): Set<Edge>? {
        return edges
    }

    /**
     * An array of edge objects representing the edges of the graph.
     */
    fun setEdges(edges: Set<Edge>?) {
        this.edges = edges
    }

    fun withEdges(edges: Set<Edge>?): Graph {
        this.edges = edges
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

    fun withProperties(properties: PropertyBag?): Graph {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Graph::class.java.name).append('@').append(
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
        sb.append("nodes")
        sb.append('=')
        sb.append((if ((this.nodes == null)) "<null>" else this.nodes))
        sb.append(',')
        sb.append("edges")
        sb.append('=')
        sb.append((if ((this.edges == null)) "<null>" else this.edges))
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
        result = ((result * 31) + (if ((this.edges == null)) 0 else edges.hashCode()))
        result = ((result * 31) + (if ((this.description == null)) 0 else description.hashCode()))
        result = ((result * 31) + (if ((this.nodes == null)) 0 else nodes.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Graph) == false) {
            return false
        }
        val rhs = other
        return (((((this.edges === rhs.edges) || ((this.edges != null) && (this.edges == rhs.edges))) && ((this.description === rhs.description) || ((this.description != null) && description.equals(
            rhs.description
        )))) && ((this.nodes === rhs.nodes) || ((this.nodes != null) && (this.nodes == rhs.nodes)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }
}
