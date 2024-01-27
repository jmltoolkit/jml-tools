package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * A physical or virtual address, or a range of addresses, in an 'addressable region' (memory or a binary file).
 */
@Generated("jsonschema2pojo")
class Address {
    /**
     * The address expressed as a byte offset from the start of the addressable region.
     */
    /**
     * The address expressed as a byte offset from the start of the addressable region.
     */
    /**
     * The address expressed as a byte offset from the start of the addressable region.
     */
    @SerializedName("absoluteAddress")
    @Expose
    var absoluteAddress: Int = -1
    /**
     * The address expressed as a byte offset from the absolute address of the top-most parent object.
     */
    /**
     * The address expressed as a byte offset from the absolute address of the top-most parent object.
     */
    /**
     * The address expressed as a byte offset from the absolute address of the top-most parent object.
     */
    @SerializedName("relativeAddress")
    @Expose
    var relativeAddress: Int = 0
    /**
     * The number of bytes in this range of addresses.
     */
    /**
     * The number of bytes in this range of addresses.
     */
    /**
     * The number of bytes in this range of addresses.
     */
    @SerializedName("length")
    @Expose
    var length: Int = 0
    /**
     * An open-ended string that identifies the address kind. 'data', 'function', 'header','instruction', 'module', 'page', 'section', 'segment', 'stack', 'stackFrame', 'table' are well-known values.
     */
    /**
     * An open-ended string that identifies the address kind. 'data', 'function', 'header','instruction', 'module', 'page', 'section', 'segment', 'stack', 'stackFrame', 'table' are well-known values.
     */
    /**
     * An open-ended string that identifies the address kind. 'data', 'function', 'header','instruction', 'module', 'page', 'section', 'segment', 'stack', 'stackFrame', 'table' are well-known values.
     */
    @SerializedName("kind")
    @Expose
    var kind: String? = null
    /**
     * A name that is associated with the address, e.g., '.text'.
     */
    /**
     * A name that is associated with the address, e.g., '.text'.
     */
    /**
     * A name that is associated with the address, e.g., '.text'.
     */
    @SerializedName("name")
    @Expose
    var name: String? = null
    /**
     * A human-readable fully qualified name that is associated with the address.
     */
    /**
     * A human-readable fully qualified name that is associated with the address.
     */
    /**
     * A human-readable fully qualified name that is associated with the address.
     */
    @SerializedName("fullyQualifiedName")
    @Expose
    var fullyQualifiedName: String? = null
    /**
     * The byte offset of this address from the absolute or relative address of the parent object.
     */
    /**
     * The byte offset of this address from the absolute or relative address of the parent object.
     */
    /**
     * The byte offset of this address from the absolute or relative address of the parent object.
     */
    @SerializedName("offsetFromParent")
    @Expose
    var offsetFromParent: Int = 0
    /**
     * The index within run.addresses of the cached object for this address.
     */
    /**
     * The index within run.addresses of the cached object for this address.
     */
    /**
     * The index within run.addresses of the cached object for this address.
     */
    @SerializedName("index")
    @Expose
    var index: Int = -1
    /**
     * The index within run.addresses of the parent object.
     */
    /**
     * The index within run.addresses of the parent object.
     */
    /**
     * The index within run.addresses of the parent object.
     */
    @SerializedName("parentIndex")
    @Expose
    var parentIndex: Int = -1

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
     * @param offsetFromParent
     * @param parentIndex
     * @param relativeAddress
     * @param kind
     * @param length
     * @param name
     * @param index
     * @param fullyQualifiedName
     * @param properties
     * @param absoluteAddress
     */
    constructor(
        absoluteAddress: Int,
        relativeAddress: Int,
        length: Int,
        kind: String?,
        name: String?,
        fullyQualifiedName: String?,
        offsetFromParent: Int,
        index: Int,
        parentIndex: Int,
        properties: PropertyBag?
    ) : super() {
        this.absoluteAddress = absoluteAddress
        this.relativeAddress = relativeAddress
        this.length = length
        this.kind = kind
        this.name = name
        this.fullyQualifiedName = fullyQualifiedName
        this.offsetFromParent = offsetFromParent
        this.index = index
        this.parentIndex = parentIndex
        this.properties = properties
    }

    fun withAbsoluteAddress(absoluteAddress: Int): Address {
        this.absoluteAddress = absoluteAddress
        return this
    }

    fun withRelativeAddress(relativeAddress: Int): Address {
        this.relativeAddress = relativeAddress
        return this
    }

    fun withLength(length: Int): Address {
        this.length = length
        return this
    }

    fun withKind(kind: String?): Address {
        this.kind = kind
        return this
    }

    fun withName(name: String?): Address {
        this.name = name
        return this
    }

    fun withFullyQualifiedName(fullyQualifiedName: String?): Address {
        this.fullyQualifiedName = fullyQualifiedName
        return this
    }

    fun withOffsetFromParent(offsetFromParent: Int): Address {
        this.offsetFromParent = offsetFromParent
        return this
    }

    fun withIndex(index: Int): Address {
        this.index = index
        return this
    }

    fun withParentIndex(parentIndex: Int): Address {
        this.parentIndex = parentIndex
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

    fun withProperties(properties: PropertyBag?): Address {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Address::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("absoluteAddress")
        sb.append('=')
        sb.append(this.absoluteAddress)
        sb.append(',')
        sb.append("relativeAddress")
        sb.append('=')
        sb.append(this.relativeAddress)
        sb.append(',')
        sb.append("length")
        sb.append('=')
        sb.append(this.length)
        sb.append(',')
        sb.append("kind")
        sb.append('=')
        sb.append((if ((this.kind == null)) "<null>" else this.kind))
        sb.append(',')
        sb.append("name")
        sb.append('=')
        sb.append((if ((this.name == null)) "<null>" else this.name))
        sb.append(',')
        sb.append("fullyQualifiedName")
        sb.append('=')
        sb.append((if ((this.fullyQualifiedName == null)) "<null>" else this.fullyQualifiedName))
        sb.append(',')
        sb.append("offsetFromParent")
        sb.append('=')
        sb.append(this.offsetFromParent)
        sb.append(',')
        sb.append("index")
        sb.append('=')
        sb.append(this.index)
        sb.append(',')
        sb.append("parentIndex")
        sb.append('=')
        sb.append(this.parentIndex)
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
        result = ((result * 31) + this.offsetFromParent)
        result = ((result * 31) + this.parentIndex)
        result = ((result * 31) + this.relativeAddress)
        result = ((result * 31) + (if ((this.kind == null)) 0 else kind.hashCode()))
        result = ((result * 31) + this.length)
        result = ((result * 31) + (if ((this.name == null)) 0 else name.hashCode()))
        result = ((result * 31) + this.index)
        result = ((result * 31) + (if ((this.fullyQualifiedName == null)) 0 else fullyQualifiedName.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        result = ((result * 31) + this.absoluteAddress)
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Address) == false) {
            return false
        }
        val rhs = other
        return ((((((((((this.offsetFromParent == rhs.offsetFromParent) && (this.parentIndex == rhs.parentIndex)) && (this.relativeAddress == rhs.relativeAddress)) && ((this.kind === rhs.kind) || ((this.kind != null) && (this.kind == rhs.kind)))) && (this.length == rhs.length)) && ((this.name === rhs.name) || ((this.name != null) && (this.name == rhs.name)))) && (this.index == rhs.index)) && ((this.fullyQualifiedName === rhs.fullyQualifiedName) || ((this.fullyQualifiedName != null) && (this.fullyQualifiedName == rhs.fullyQualifiedName)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        )))) && (this.absoluteAddress == rhs.absoluteAddress))
    }
}
