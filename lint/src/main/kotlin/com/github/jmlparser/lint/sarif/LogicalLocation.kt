package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * A logical location of a construct that produced a result.
 */
@Generated("jsonschema2pojo")
class LogicalLocation {
    /**
     * Identifies the construct in which the result occurred. For example, this property might contain the name of a class or a method.
     */
    /**
     * Identifies the construct in which the result occurred. For example, this property might contain the name of a class or a method.
     */
    /**
     * Identifies the construct in which the result occurred. For example, this property might contain the name of a class or a method.
     */
    @SerializedName("name")
    @Expose
    var name: String? = null
    /**
     * The index within the logical locations array.
     */
    /**
     * The index within the logical locations array.
     */
    /**
     * The index within the logical locations array.
     */
    @SerializedName("index")
    @Expose
    var index: Int = -1
    /**
     * The human-readable fully qualified name of the logical location.
     */
    /**
     * The human-readable fully qualified name of the logical location.
     */
    /**
     * The human-readable fully qualified name of the logical location.
     */
    @SerializedName("fullyQualifiedName")
    @Expose
    var fullyQualifiedName: String? = null
    /**
     * The machine-readable name for the logical location, such as a mangled function name provided by a C++ compiler that encodes calling convention, return type and other details along with the function name.
     */
    /**
     * The machine-readable name for the logical location, such as a mangled function name provided by a C++ compiler that encodes calling convention, return type and other details along with the function name.
     */
    /**
     * The machine-readable name for the logical location, such as a mangled function name provided by a C++ compiler that encodes calling convention, return type and other details along with the function name.
     */
    @SerializedName("decoratedName")
    @Expose
    var decoratedName: String? = null
    /**
     * Identifies the index of the immediate parent of the construct in which the result was detected. For example, this property might point to a logical location that represents the namespace that holds a type.
     */
    /**
     * Identifies the index of the immediate parent of the construct in which the result was detected. For example, this property might point to a logical location that represents the namespace that holds a type.
     */
    /**
     * Identifies the index of the immediate parent of the construct in which the result was detected. For example, this property might point to a logical location that represents the namespace that holds a type.
     */
    @SerializedName("parentIndex")
    @Expose
    var parentIndex: Int = -1
    /**
     * The type of construct this logical location component refers to. Should be one of 'function', 'member', 'module', 'namespace', 'parameter', 'resource', 'returnType', 'type', 'variable', 'object', 'array', 'property', 'value', 'element', 'text', 'attribute', 'comment', 'declaration', 'dtd' or 'processingInstruction', if any of those accurately describe the construct.
     */
    /**
     * The type of construct this logical location component refers to. Should be one of 'function', 'member', 'module', 'namespace', 'parameter', 'resource', 'returnType', 'type', 'variable', 'object', 'array', 'property', 'value', 'element', 'text', 'attribute', 'comment', 'declaration', 'dtd' or 'processingInstruction', if any of those accurately describe the construct.
     */
    /**
     * The type of construct this logical location component refers to. Should be one of 'function', 'member', 'module', 'namespace', 'parameter', 'resource', 'returnType', 'type', 'variable', 'object', 'array', 'property', 'value', 'element', 'text', 'attribute', 'comment', 'declaration', 'dtd' or 'processingInstruction', if any of those accurately describe the construct.
     */
    @SerializedName("kind")
    @Expose
    var kind: String? = null

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
     * @param parentIndex
     * @param kind
     * @param name
     * @param index
     * @param decoratedName
     * @param fullyQualifiedName
     * @param properties
     */
    constructor(
        name: String?,
        index: Int,
        fullyQualifiedName: String?,
        decoratedName: String?,
        parentIndex: Int,
        kind: String?,
        properties: PropertyBag?
    ) : super() {
        this.name = name
        this.index = index
        this.fullyQualifiedName = fullyQualifiedName
        this.decoratedName = decoratedName
        this.parentIndex = parentIndex
        this.kind = kind
        this.properties = properties
    }

    fun withName(name: String?): LogicalLocation {
        this.name = name
        return this
    }

    fun withIndex(index: Int): LogicalLocation {
        this.index = index
        return this
    }

    fun withFullyQualifiedName(fullyQualifiedName: String?): LogicalLocation {
        this.fullyQualifiedName = fullyQualifiedName
        return this
    }

    fun withDecoratedName(decoratedName: String?): LogicalLocation {
        this.decoratedName = decoratedName
        return this
    }

    fun withParentIndex(parentIndex: Int): LogicalLocation {
        this.parentIndex = parentIndex
        return this
    }

    fun withKind(kind: String?): LogicalLocation {
        this.kind = kind
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

    fun withProperties(properties: PropertyBag?): LogicalLocation {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(LogicalLocation::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("name")
        sb.append('=')
        sb.append((if ((this.name == null)) "<null>" else this.name))
        sb.append(',')
        sb.append("index")
        sb.append('=')
        sb.append(this.index)
        sb.append(',')
        sb.append("fullyQualifiedName")
        sb.append('=')
        sb.append((if ((this.fullyQualifiedName == null)) "<null>" else this.fullyQualifiedName))
        sb.append(',')
        sb.append("decoratedName")
        sb.append('=')
        sb.append((if ((this.decoratedName == null)) "<null>" else this.decoratedName))
        sb.append(',')
        sb.append("parentIndex")
        sb.append('=')
        sb.append(this.parentIndex)
        sb.append(',')
        sb.append("kind")
        sb.append('=')
        sb.append((if ((this.kind == null)) "<null>" else this.kind))
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
        result = ((result * 31) + this.parentIndex)
        result = ((result * 31) + (if ((this.kind == null)) 0 else kind.hashCode()))
        result = ((result * 31) + (if ((this.name == null)) 0 else name.hashCode()))
        result = ((result * 31) + this.index)
        result = ((result * 31) + (if ((this.decoratedName == null)) 0 else decoratedName.hashCode()))
        result = ((result * 31) + (if ((this.fullyQualifiedName == null)) 0 else fullyQualifiedName.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is LogicalLocation) == false) {
            return false
        }
        val rhs = other
        return (((((((this.parentIndex == rhs.parentIndex) && ((this.kind === rhs.kind) || ((this.kind != null) && (this.kind == rhs.kind)))) && ((this.name === rhs.name) || ((this.name != null) && (this.name == rhs.name)))) && (this.index == rhs.index)) && ((this.decoratedName === rhs.decoratedName) || ((this.decoratedName != null) && (this.decoratedName == rhs.decoratedName)))) && ((this.fullyQualifiedName === rhs.fullyQualifiedName) || ((this.fullyQualifiedName != null) && (this.fullyQualifiedName == rhs.fullyQualifiedName)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }
}
