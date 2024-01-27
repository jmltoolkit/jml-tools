package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import java.util.*
import javax.annotation.processing.Generated

/**
 * A location visited by an analysis tool while simulating or monitoring the execution of a program.
 */
@Generated("jsonschema2pojo")
class ThreadFlowLocation {
    /**
     * The index within the run threadFlowLocations array.
     */
    /**
     * The index within the run threadFlowLocations array.
     */
    /**
     * The index within the run threadFlowLocations array.
     */
    @SerializedName("index")
    @Expose
    var index: Int = -1

    /**
     * A location within a programming artifact.
     */
    @SerializedName("location")
    @Expose
    private var location: Location? = null

    /**
     * A call stack that is relevant to a result.
     */
    @SerializedName("stack")
    @Expose
    private var stack: Stack? = null
    /**
     * A set of distinct strings that categorize the thread flow location. Well-known kinds include 'acquire', 'release', 'enter', 'exit', 'call', 'return', 'branch', 'implicit', 'false', 'true', 'caution', 'danger', 'unknown', 'unreachable', 'taint', 'function', 'handler', 'lock', 'memory', 'resource', 'scope' and 'value'.
     */
    /**
     * A set of distinct strings that categorize the thread flow location. Well-known kinds include 'acquire', 'release', 'enter', 'exit', 'call', 'return', 'branch', 'implicit', 'false', 'true', 'caution', 'danger', 'unknown', 'unreachable', 'taint', 'function', 'handler', 'lock', 'memory', 'resource', 'scope' and 'value'.
     */
    /**
     * A set of distinct strings that categorize the thread flow location. Well-known kinds include 'acquire', 'release', 'enter', 'exit', 'call', 'return', 'branch', 'implicit', 'false', 'true', 'caution', 'danger', 'unknown', 'unreachable', 'taint', 'function', 'handler', 'lock', 'memory', 'resource', 'scope' and 'value'.
     */
    @SerializedName("kinds")
    @Expose
    var kinds: Set<String>? = LinkedHashSet()

    /**
     * An array of references to rule or taxonomy reporting descriptors that are applicable to the thread flow location.
     */
    @SerializedName("taxa")
    @Expose
    private var taxa: Set<ReportingDescriptorReference>? = LinkedHashSet<ReportingDescriptorReference>()
    /**
     * The name of the module that contains the code that is executing.
     */
    /**
     * The name of the module that contains the code that is executing.
     */
    /**
     * The name of the module that contains the code that is executing.
     */
    @SerializedName("module")
    @Expose
    var module: String? = null

    /**
     * A dictionary, each of whose keys specifies a variable or expression, the associated value of which represents the variable or expression value. For an annotation of kind 'continuation', for example, this dictionary might hold the current assumed values of a set of global variables.
     */
    @SerializedName("state")
    @Expose
    private var state: State? = null
    /**
     * An integer representing a containment hierarchy within the thread flow.
     */
    /**
     * An integer representing a containment hierarchy within the thread flow.
     */
    /**
     * An integer representing a containment hierarchy within the thread flow.
     */
    @SerializedName("nestingLevel")
    @Expose
    var nestingLevel: Int = 0
    /**
     * An integer representing the temporal order in which execution reached this location.
     */
    /**
     * An integer representing the temporal order in which execution reached this location.
     */
    /**
     * An integer representing the temporal order in which execution reached this location.
     */
    @SerializedName("executionOrder")
    @Expose
    var executionOrder: Int = -1
    /**
     * The Coordinated Universal Time (UTC) date and time at which this location was executed.
     */
    /**
     * The Coordinated Universal Time (UTC) date and time at which this location was executed.
     */
    /**
     * The Coordinated Universal Time (UTC) date and time at which this location was executed.
     */
    @SerializedName("executionTimeUtc")
    @Expose
    var executionTimeUtc: Date? = null
    /**
     * Specifies the importance of this location in understanding the code flow in which it occurs. The order from most to least important is "essential", "important", "unimportant". Default: "important".
     */
    /**
     * Specifies the importance of this location in understanding the code flow in which it occurs. The order from most to least important is "essential", "important", "unimportant". Default: "important".
     */
    /**
     * Specifies the importance of this location in understanding the code flow in which it occurs. The order from most to least important is "essential", "important", "unimportant". Default: "important".
     */
    @SerializedName("importance")
    @Expose
    var importance: Importance? = Importance.fromValue("important")

    /**
     * Describes an HTTP request.
     */
    @SerializedName("webRequest")
    @Expose
    private var webRequest: WebRequest? = null

    /**
     * Describes the response to an HTTP request.
     */
    @SerializedName("webResponse")
    @Expose
    private var webResponse: WebResponse? = null

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
     * @param taxa
     * @param nestingLevel
     * @param stack
     * @param webRequest
     * @param importance
     * @param module
     * @param executionTimeUtc
     * @param index
     * @param kinds
     * @param executionOrder
     * @param webResponse
     * @param location
     * @param state
     * @param properties
     */
    constructor(
        index: Int,
        location: Location?,
        stack: Stack?,
        kinds: Set<String>?,
        taxa: Set<ReportingDescriptorReference>?,
        module: String?,
        state: State?,
        nestingLevel: Int,
        executionOrder: Int,
        executionTimeUtc: Date?,
        importance: Importance?,
        webRequest: WebRequest?,
        webResponse: WebResponse?,
        properties: PropertyBag?
    ) : super() {
        this.index = index
        this.location = location
        this.stack = stack
        this.kinds = kinds
        this.taxa = taxa
        this.module = module
        this.state = state
        this.nestingLevel = nestingLevel
        this.executionOrder = executionOrder
        this.executionTimeUtc = executionTimeUtc
        this.importance = importance
        this.webRequest = webRequest
        this.webResponse = webResponse
        this.properties = properties
    }

    fun withIndex(index: Int): ThreadFlowLocation {
        this.index = index
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

    fun withLocation(location: Location?): ThreadFlowLocation {
        this.location = location
        return this
    }

    /**
     * A call stack that is relevant to a result.
     */
    fun getStack(): Stack? {
        return stack
    }

    /**
     * A call stack that is relevant to a result.
     */
    fun setStack(stack: Stack?) {
        this.stack = stack
    }

    fun withStack(stack: Stack?): ThreadFlowLocation {
        this.stack = stack
        return this
    }

    fun withKinds(kinds: Set<String>?): ThreadFlowLocation {
        this.kinds = kinds
        return this
    }

    /**
     * An array of references to rule or taxonomy reporting descriptors that are applicable to the thread flow location.
     */
    fun getTaxa(): Set<ReportingDescriptorReference>? {
        return taxa
    }

    /**
     * An array of references to rule or taxonomy reporting descriptors that are applicable to the thread flow location.
     */
    fun setTaxa(taxa: Set<ReportingDescriptorReference>?) {
        this.taxa = taxa
    }

    fun withTaxa(taxa: Set<ReportingDescriptorReference>?): ThreadFlowLocation {
        this.taxa = taxa
        return this
    }

    fun withModule(module: String?): ThreadFlowLocation {
        this.module = module
        return this
    }

    /**
     * A dictionary, each of whose keys specifies a variable or expression, the associated value of which represents the variable or expression value. For an annotation of kind 'continuation', for example, this dictionary might hold the current assumed values of a set of global variables.
     */
    fun getState(): State? {
        return state
    }

    /**
     * A dictionary, each of whose keys specifies a variable or expression, the associated value of which represents the variable or expression value. For an annotation of kind 'continuation', for example, this dictionary might hold the current assumed values of a set of global variables.
     */
    fun setState(state: State?) {
        this.state = state
    }

    fun withState(state: State?): ThreadFlowLocation {
        this.state = state
        return this
    }

    fun withNestingLevel(nestingLevel: Int): ThreadFlowLocation {
        this.nestingLevel = nestingLevel
        return this
    }

    fun withExecutionOrder(executionOrder: Int): ThreadFlowLocation {
        this.executionOrder = executionOrder
        return this
    }

    fun withExecutionTimeUtc(executionTimeUtc: Date?): ThreadFlowLocation {
        this.executionTimeUtc = executionTimeUtc
        return this
    }

    fun withImportance(importance: Importance?): ThreadFlowLocation {
        this.importance = importance
        return this
    }

    /**
     * Describes an HTTP request.
     */
    fun getWebRequest(): WebRequest? {
        return webRequest
    }

    /**
     * Describes an HTTP request.
     */
    fun setWebRequest(webRequest: WebRequest?) {
        this.webRequest = webRequest
    }

    fun withWebRequest(webRequest: WebRequest?): ThreadFlowLocation {
        this.webRequest = webRequest
        return this
    }

    /**
     * Describes the response to an HTTP request.
     */
    fun getWebResponse(): WebResponse? {
        return webResponse
    }

    /**
     * Describes the response to an HTTP request.
     */
    fun setWebResponse(webResponse: WebResponse?) {
        this.webResponse = webResponse
    }

    fun withWebResponse(webResponse: WebResponse?): ThreadFlowLocation {
        this.webResponse = webResponse
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

    fun withProperties(properties: PropertyBag?): ThreadFlowLocation {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(ThreadFlowLocation::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("index")
        sb.append('=')
        sb.append(this.index)
        sb.append(',')
        sb.append("location")
        sb.append('=')
        sb.append((if ((this.location == null)) "<null>" else this.location))
        sb.append(',')
        sb.append("stack")
        sb.append('=')
        sb.append((if ((this.stack == null)) "<null>" else this.stack))
        sb.append(',')
        sb.append("kinds")
        sb.append('=')
        sb.append((if ((this.kinds == null)) "<null>" else this.kinds))
        sb.append(',')
        sb.append("taxa")
        sb.append('=')
        sb.append((if ((this.taxa == null)) "<null>" else this.taxa))
        sb.append(',')
        sb.append("module")
        sb.append('=')
        sb.append((if ((this.module == null)) "<null>" else this.module))
        sb.append(',')
        sb.append("state")
        sb.append('=')
        sb.append((if ((this.state == null)) "<null>" else this.state))
        sb.append(',')
        sb.append("nestingLevel")
        sb.append('=')
        sb.append(this.nestingLevel)
        sb.append(',')
        sb.append("executionOrder")
        sb.append('=')
        sb.append(this.executionOrder)
        sb.append(',')
        sb.append("executionTimeUtc")
        sb.append('=')
        sb.append((if ((this.executionTimeUtc == null)) "<null>" else this.executionTimeUtc))
        sb.append(',')
        sb.append("importance")
        sb.append('=')
        sb.append((if ((this.importance == null)) "<null>" else this.importance))
        sb.append(',')
        sb.append("webRequest")
        sb.append('=')
        sb.append((if ((this.webRequest == null)) "<null>" else this.webRequest))
        sb.append(',')
        sb.append("webResponse")
        sb.append('=')
        sb.append((if ((this.webResponse == null)) "<null>" else this.webResponse))
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
        result = ((result * 31) + (if ((this.taxa == null)) 0 else taxa.hashCode()))
        result = ((result * 31) + this.nestingLevel)
        result = ((result * 31) + (if ((this.stack == null)) 0 else stack.hashCode()))
        result = ((result * 31) + (if ((this.webRequest == null)) 0 else webRequest.hashCode()))
        result = ((result * 31) + (if ((this.importance == null)) 0 else importance.hashCode()))
        result = ((result * 31) + (if ((this.module == null)) 0 else module.hashCode()))
        result = ((result * 31) + (if ((this.executionTimeUtc == null)) 0 else executionTimeUtc.hashCode()))
        result = ((result * 31) + this.index)
        result = ((result * 31) + (if ((this.kinds == null)) 0 else kinds.hashCode()))
        result = ((result * 31) + this.executionOrder)
        result = ((result * 31) + (if ((this.webResponse == null)) 0 else webResponse.hashCode()))
        result = ((result * 31) + (if ((this.location == null)) 0 else location.hashCode()))
        result = ((result * 31) + (if ((this.state == null)) 0 else state.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is ThreadFlowLocation) == false) {
            return false
        }
        val rhs = other
        return (((((((((((((((this.taxa === rhs.taxa) || ((this.taxa != null) && (this.taxa == rhs.taxa))) && (this.nestingLevel == rhs.nestingLevel)) && ((this.stack === rhs.stack) || ((this.stack != null) && stack.equals(
            rhs.stack
        )))) && ((this.webRequest === rhs.webRequest) || ((this.webRequest != null) && webRequest.equals(rhs.webRequest)))) && ((this.importance == rhs.importance) || ((this.importance != null) && (this.importance == rhs.importance)))) && ((this.module === rhs.module) || ((this.module != null) && (this.module == rhs.module)))) && ((this.executionTimeUtc === rhs.executionTimeUtc) || ((this.executionTimeUtc != null) && (this.executionTimeUtc == rhs.executionTimeUtc)))) && (this.index == rhs.index)) && ((this.kinds === rhs.kinds) || ((this.kinds != null) && (this.kinds == rhs.kinds)))) && (this.executionOrder == rhs.executionOrder)) && ((this.webResponse === rhs.webResponse) || ((this.webResponse != null) && webResponse.equals(
            rhs.webResponse
        )))) && ((this.location === rhs.location) || ((this.location != null) && location.equals(rhs.location)))) && ((this.state === rhs.state) || ((this.state != null) && state.equals(
            rhs.state
        )))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(rhs.properties))))
    }


    /**
     * Specifies the importance of this location in understanding the code flow in which it occurs. The order from most to least important is "essential", "important", "unimportant". Default: "important".
     */
    @Generated("jsonschema2pojo")
    enum class Importance(private val value: String) {
        @SerializedName("important")
        IMPORTANT("important"),
        @SerializedName("essential")
        ESSENTIAL("essential"),
        @SerializedName("unimportant")
        UNIMPORTANT("unimportant");

        override fun toString(): String {
            return this.value
        }

        fun value(): String {
            return this.value
        }

        companion object {
            private val CONSTANTS: MutableMap<String, Importance> = HashMap()

            init {
                for (c in entries) {
                    CONSTANTS[c.value] = c
                }
            }

            fun fromValue(value: String): Importance {
                val constant = CONSTANTS[value]
                requireNotNull(constant) { value }
                return constant
            }
        }
    }
}
