package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * Describes a sequence of code locations that specify a path through a single thread of execution such as an operating system or fiber.
 */
@Generated("jsonschema2pojo")
class ThreadFlow {
    /**
     * An string that uniquely identifies the threadFlow within the codeFlow in which it occurs.
     */
    /**
     * An string that uniquely identifies the threadFlow within the codeFlow in which it occurs.
     */
    /**
     * An string that uniquely identifies the threadFlow within the codeFlow in which it occurs.
     */
    @SerializedName("id")
    @Expose
    var id: String? = null

    /**
     * Encapsulates a message intended to be read by the end user.
     */
    @SerializedName("message")
    @Expose
    private var message: Message? = null

    /**
     * Values of relevant expressions at the start of the thread flow that may change during thread flow execution.
     */
    @SerializedName("initialState")
    @Expose
    private var initialState: InitialState? = null

    /**
     * Values of relevant expressions at the start of the thread flow that remain constant.
     */
    @SerializedName("immutableState")
    @Expose
    private var immutableState: ImmutableState? = null

    /**
     * A temporally ordered array of 'threadFlowLocation' objects, each of which describes a location visited by the tool while producing the result.
     * (Required)
     */
    @SerializedName("locations")
    @Expose
    private var locations: List<ThreadFlowLocation>? = ArrayList<ThreadFlowLocation>()

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
     * @param immutableState
     * @param locations
     * @param id
     * @param message
     * @param properties
     */
    constructor(
        id: String?,
        message: Message?,
        initialState: InitialState?,
        immutableState: ImmutableState?,
        locations: List<ThreadFlowLocation>?,
        properties: PropertyBag?
    ) : super() {
        this.id = id
        this.message = message
        this.initialState = initialState
        this.immutableState = immutableState
        this.locations = locations
        this.properties = properties
    }

    fun withId(id: String?): ThreadFlow {
        this.id = id
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

    fun withMessage(message: Message?): ThreadFlow {
        this.message = message
        return this
    }

    /**
     * Values of relevant expressions at the start of the thread flow that may change during thread flow execution.
     */
    fun getInitialState(): InitialState? {
        return initialState
    }

    /**
     * Values of relevant expressions at the start of the thread flow that may change during thread flow execution.
     */
    fun setInitialState(initialState: InitialState?) {
        this.initialState = initialState
    }

    fun withInitialState(initialState: InitialState?): ThreadFlow {
        this.initialState = initialState
        return this
    }

    /**
     * Values of relevant expressions at the start of the thread flow that remain constant.
     */
    fun getImmutableState(): ImmutableState? {
        return immutableState
    }

    /**
     * Values of relevant expressions at the start of the thread flow that remain constant.
     */
    fun setImmutableState(immutableState: ImmutableState?) {
        this.immutableState = immutableState
    }

    fun withImmutableState(immutableState: ImmutableState?): ThreadFlow {
        this.immutableState = immutableState
        return this
    }

    /**
     * A temporally ordered array of 'threadFlowLocation' objects, each of which describes a location visited by the tool while producing the result.
     * (Required)
     */
    fun getLocations(): List<ThreadFlowLocation>? {
        return locations
    }

    /**
     * A temporally ordered array of 'threadFlowLocation' objects, each of which describes a location visited by the tool while producing the result.
     * (Required)
     */
    fun setLocations(locations: List<ThreadFlowLocation>?) {
        this.locations = locations
    }

    fun withLocations(locations: List<ThreadFlowLocation>?): ThreadFlow {
        this.locations = locations
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

    fun withProperties(properties: PropertyBag?): ThreadFlow {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(ThreadFlow::class.java.name).append('@').append(
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
        sb.append("message")
        sb.append('=')
        sb.append((if ((this.message == null)) "<null>" else this.message))
        sb.append(',')
        sb.append("initialState")
        sb.append('=')
        sb.append((if ((this.initialState == null)) "<null>" else this.initialState))
        sb.append(',')
        sb.append("immutableState")
        sb.append('=')
        sb.append((if ((this.immutableState == null)) "<null>" else this.immutableState))
        sb.append(',')
        sb.append("locations")
        sb.append('=')
        sb.append((if ((this.locations == null)) "<null>" else this.locations))
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
        result = ((result * 31) + (if ((this.immutableState == null)) 0 else immutableState.hashCode()))
        result = ((result * 31) + (if ((this.locations == null)) 0 else locations.hashCode()))
        result = ((result * 31) + (if ((this.id == null)) 0 else id.hashCode()))
        result = ((result * 31) + (if ((this.initialState == null)) 0 else initialState.hashCode()))
        result = ((result * 31) + (if ((this.message == null)) 0 else message.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is ThreadFlow) == false) {
            return false
        }
        val rhs = other
        return (((((((this.immutableState === rhs.immutableState) || ((this.immutableState != null) && immutableState.equals(
            rhs.immutableState
        ))) && ((this.locations === rhs.locations) || ((this.locations != null) && (this.locations == rhs.locations)))) && ((this.id === rhs.id) || ((this.id != null) && (this.id == rhs.id)))) && ((this.initialState === rhs.initialState) || ((this.initialState != null) && initialState.equals(
            rhs.initialState
        )))) && ((this.message === rhs.message) || ((this.message != null) && message.equals(rhs.message)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }
}
