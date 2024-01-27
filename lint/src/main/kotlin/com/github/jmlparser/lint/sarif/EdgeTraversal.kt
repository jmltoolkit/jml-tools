package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * Represents the traversal of a single edge during a graph traversal.
 */
@Generated("jsonschema2pojo")
class EdgeTraversal {
    /**
     * Identifies the edge being traversed.
     * (Required)
     */
    /**
     * Identifies the edge being traversed.
     * (Required)
     */
    /**
     * Identifies the edge being traversed.
     * (Required)
     */
    @SerializedName("edgeId")
    @Expose
    var edgeId: String? = null

    /**
     * Encapsulates a message intended to be read by the end user.
     */
    @SerializedName("message")
    @Expose
    private var message: Message? = null

    /**
     * The values of relevant expressions after the edge has been traversed.
     */
    @SerializedName("finalState")
    @Expose
    private var finalState: FinalState? = null
    /**
     * The number of edge traversals necessary to return from a nested graph.
     */
    /**
     * The number of edge traversals necessary to return from a nested graph.
     */
    /**
     * The number of edge traversals necessary to return from a nested graph.
     */
    @SerializedName("stepOverEdgeCount")
    @Expose
    var stepOverEdgeCount: Int = 0

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
     * @param edgeId
     * @param stepOverEdgeCount
     * @param message
     * @param finalState
     * @param properties
     */
    constructor(
        edgeId: String?,
        message: Message?,
        finalState: FinalState?,
        stepOverEdgeCount: Int,
        properties: PropertyBag?
    ) : super() {
        this.edgeId = edgeId
        this.message = message
        this.finalState = finalState
        this.stepOverEdgeCount = stepOverEdgeCount
        this.properties = properties
    }

    fun withEdgeId(edgeId: String?): EdgeTraversal {
        this.edgeId = edgeId
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

    fun withMessage(message: Message?): EdgeTraversal {
        this.message = message
        return this
    }

    /**
     * The values of relevant expressions after the edge has been traversed.
     */
    fun getFinalState(): FinalState? {
        return finalState
    }

    /**
     * The values of relevant expressions after the edge has been traversed.
     */
    fun setFinalState(finalState: FinalState?) {
        this.finalState = finalState
    }

    fun withFinalState(finalState: FinalState?): EdgeTraversal {
        this.finalState = finalState
        return this
    }

    fun withStepOverEdgeCount(stepOverEdgeCount: Int): EdgeTraversal {
        this.stepOverEdgeCount = stepOverEdgeCount
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

    fun withProperties(properties: PropertyBag?): EdgeTraversal {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(EdgeTraversal::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("edgeId")
        sb.append('=')
        sb.append((if ((this.edgeId == null)) "<null>" else this.edgeId))
        sb.append(',')
        sb.append("message")
        sb.append('=')
        sb.append((if ((this.message == null)) "<null>" else this.message))
        sb.append(',')
        sb.append("finalState")
        sb.append('=')
        sb.append((if ((this.finalState == null)) "<null>" else this.finalState))
        sb.append(',')
        sb.append("stepOverEdgeCount")
        sb.append('=')
        sb.append(this.stepOverEdgeCount)
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
        result = ((result * 31) + (if ((this.edgeId == null)) 0 else edgeId.hashCode()))
        result = ((result * 31) + (if ((this.message == null)) 0 else message.hashCode()))
        result = ((result * 31) + this.stepOverEdgeCount)
        result = ((result * 31) + (if ((this.finalState == null)) 0 else finalState.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is EdgeTraversal) == false) {
            return false
        }
        val rhs = other
        return ((((((this.edgeId === rhs.edgeId) || ((this.edgeId != null) && (this.edgeId == rhs.edgeId))) && ((this.message === rhs.message) || ((this.message != null) && message.equals(
            rhs.message
        )))) && (this.stepOverEdgeCount == rhs.stepOverEdgeCount)) && ((this.finalState === rhs.finalState) || ((this.finalState != null) && finalState.equals(
            rhs.finalState
        )))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(rhs.properties))))
    }
}
