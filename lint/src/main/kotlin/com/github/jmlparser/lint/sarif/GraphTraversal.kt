package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * Represents a path through a graph.
 */
@Generated("jsonschema2pojo")
class GraphTraversal {
    /**
     * The index within the run.graphs to be associated with the result.
     */
    /**
     * The index within the run.graphs to be associated with the result.
     */
    /**
     * The index within the run.graphs to be associated with the result.
     */
    @SerializedName("runGraphIndex")
    @Expose
    var runGraphIndex: Int = -1
    /**
     * The index within the result.graphs to be associated with the result.
     */
    /**
     * The index within the result.graphs to be associated with the result.
     */
    /**
     * The index within the result.graphs to be associated with the result.
     */
    @SerializedName("resultGraphIndex")
    @Expose
    var resultGraphIndex: Int = -1

    /**
     * Encapsulates a message intended to be read by the end user.
     */
    @SerializedName("description")
    @Expose
    private var description: Message? = null

    /**
     * Values of relevant expressions at the start of the graph traversal that may change during graph traversal.
     */
    @SerializedName("initialState")
    @Expose
    private var initialState: InitialState__1? = null

    /**
     * Values of relevant expressions at the start of the graph traversal that remain constant for the graph traversal.
     */
    @SerializedName("immutableState")
    @Expose
    private var immutableState: ImmutableState__1? = null

    /**
     * The sequences of edges traversed by this graph traversal.
     */
    @SerializedName("edgeTraversals")
    @Expose
    private var edgeTraversals: List<EdgeTraversal>? = ArrayList<EdgeTraversal>()

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
     * @param initialState
     * @param description
     * @param immutableState
     * @param runGraphIndex
     * @param resultGraphIndex
     * @param edgeTraversals
     * @param properties
     */
    constructor(
        runGraphIndex: Int,
        resultGraphIndex: Int,
        description: Message?,
        initialState: InitialState__1?,
        immutableState: ImmutableState__1?,
        edgeTraversals: List<EdgeTraversal>?,
        properties: PropertyBag?
    ) : super() {
        this.runGraphIndex = runGraphIndex
        this.resultGraphIndex = resultGraphIndex
        this.description = description
        this.initialState = initialState
        this.immutableState = immutableState
        this.edgeTraversals = edgeTraversals
        this.properties = properties
    }

    fun withRunGraphIndex(runGraphIndex: Int): GraphTraversal {
        this.runGraphIndex = runGraphIndex
        return this
    }

    fun withResultGraphIndex(resultGraphIndex: Int): GraphTraversal {
        this.resultGraphIndex = resultGraphIndex
        return this
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

    fun withDescription(description: Message?): GraphTraversal {
        this.description = description
        return this
    }

    /**
     * Values of relevant expressions at the start of the graph traversal that may change during graph traversal.
     */
    fun getInitialState(): InitialState__1? {
        return initialState
    }

    /**
     * Values of relevant expressions at the start of the graph traversal that may change during graph traversal.
     */
    fun setInitialState(initialState: InitialState__1?) {
        this.initialState = initialState
    }

    fun withInitialState(initialState: InitialState__1?): GraphTraversal {
        this.initialState = initialState
        return this
    }

    /**
     * Values of relevant expressions at the start of the graph traversal that remain constant for the graph traversal.
     */
    fun getImmutableState(): ImmutableState__1? {
        return immutableState
    }

    /**
     * Values of relevant expressions at the start of the graph traversal that remain constant for the graph traversal.
     */
    fun setImmutableState(immutableState: ImmutableState__1?) {
        this.immutableState = immutableState
    }

    fun withImmutableState(immutableState: ImmutableState__1?): GraphTraversal {
        this.immutableState = immutableState
        return this
    }

    /**
     * The sequences of edges traversed by this graph traversal.
     */
    fun getEdgeTraversals(): List<EdgeTraversal>? {
        return edgeTraversals
    }

    /**
     * The sequences of edges traversed by this graph traversal.
     */
    fun setEdgeTraversals(edgeTraversals: List<EdgeTraversal>?) {
        this.edgeTraversals = edgeTraversals
    }

    fun withEdgeTraversals(edgeTraversals: List<EdgeTraversal>?): GraphTraversal {
        this.edgeTraversals = edgeTraversals
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

    fun withProperties(properties: PropertyBag?): GraphTraversal {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(GraphTraversal::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("runGraphIndex")
        sb.append('=')
        sb.append(this.runGraphIndex)
        sb.append(',')
        sb.append("resultGraphIndex")
        sb.append('=')
        sb.append(this.resultGraphIndex)
        sb.append(',')
        sb.append("description")
        sb.append('=')
        sb.append((if ((this.description == null)) "<null>" else this.description))
        sb.append(',')
        sb.append("initialState")
        sb.append('=')
        sb.append((if ((this.initialState == null)) "<null>" else this.initialState))
        sb.append(',')
        sb.append("immutableState")
        sb.append('=')
        sb.append((if ((this.immutableState == null)) "<null>" else this.immutableState))
        sb.append(',')
        sb.append("edgeTraversals")
        sb.append('=')
        sb.append((if ((this.edgeTraversals == null)) "<null>" else this.edgeTraversals))
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
        result = ((result * 31) + (if ((this.initialState == null)) 0 else initialState.hashCode()))
        result = ((result * 31) + (if ((this.description == null)) 0 else description.hashCode()))
        result = ((result * 31) + (if ((this.immutableState == null)) 0 else immutableState.hashCode()))
        result = ((result * 31) + this.runGraphIndex)
        result = ((result * 31) + this.resultGraphIndex)
        result = ((result * 31) + (if ((this.edgeTraversals == null)) 0 else edgeTraversals.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is GraphTraversal) == false) {
            return false
        }
        val rhs = other
        return ((((((((this.initialState === rhs.initialState) || ((this.initialState != null) && initialState.equals(
            rhs.initialState
        ))) && ((this.description === rhs.description) || ((this.description != null) && description.equals(rhs.description)))) && ((this.immutableState === rhs.immutableState) || ((this.immutableState != null) && immutableState.equals(
            rhs.immutableState
        )))) && (this.runGraphIndex == rhs.runGraphIndex)) && (this.resultGraphIndex == rhs.resultGraphIndex)) && ((this.edgeTraversals === rhs.edgeTraversals) || ((this.edgeTraversals != null) && (this.edgeTraversals == rhs.edgeTraversals)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }
}
