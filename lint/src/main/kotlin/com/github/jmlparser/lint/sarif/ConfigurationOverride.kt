package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * Information about how a specific rule or notification was reconfigured at runtime.
 */
@Generated("jsonschema2pojo")
class ConfigurationOverride {
    /**
     * Information about a rule or notification that can be configured at runtime.
     * (Required)
     */
    @SerializedName("configuration")
    @Expose
    private var configuration: ReportingConfiguration? = null

    /**
     * Information about how to locate a relevant reporting descriptor.
     * (Required)
     */
    @SerializedName("descriptor")
    @Expose
    private var descriptor: ReportingDescriptorReference? = null

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
     * @param configuration
     * @param descriptor
     * @param properties
     */
    constructor(
        configuration: ReportingConfiguration?,
        descriptor: ReportingDescriptorReference?,
        properties: PropertyBag?
    ) : super() {
        this.configuration = configuration
        this.descriptor = descriptor
        this.properties = properties
    }

    /**
     * Information about a rule or notification that can be configured at runtime.
     * (Required)
     */
    fun getConfiguration(): ReportingConfiguration? {
        return configuration
    }

    /**
     * Information about a rule or notification that can be configured at runtime.
     * (Required)
     */
    fun setConfiguration(configuration: ReportingConfiguration?) {
        this.configuration = configuration
    }

    fun withConfiguration(configuration: ReportingConfiguration?): ConfigurationOverride {
        this.configuration = configuration
        return this
    }

    /**
     * Information about how to locate a relevant reporting descriptor.
     * (Required)
     */
    fun getDescriptor(): ReportingDescriptorReference? {
        return descriptor
    }

    /**
     * Information about how to locate a relevant reporting descriptor.
     * (Required)
     */
    fun setDescriptor(descriptor: ReportingDescriptorReference?) {
        this.descriptor = descriptor
    }

    fun withDescriptor(descriptor: ReportingDescriptorReference?): ConfigurationOverride {
        this.descriptor = descriptor
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

    fun withProperties(properties: PropertyBag?): ConfigurationOverride {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(ConfigurationOverride::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("configuration")
        sb.append('=')
        sb.append((if ((this.configuration == null)) "<null>" else this.configuration))
        sb.append(',')
        sb.append("descriptor")
        sb.append('=')
        sb.append((if ((this.descriptor == null)) "<null>" else this.descriptor))
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
        result = ((result * 31) + (if ((this.configuration == null)) 0 else configuration.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        result = ((result * 31) + (if ((this.descriptor == null)) 0 else descriptor.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is ConfigurationOverride) == false) {
            return false
        }
        val rhs = other
        return ((((this.configuration === rhs.configuration) || ((this.configuration != null) && configuration.equals(
            rhs.configuration
        ))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(rhs.properties)))) && ((this.descriptor === rhs.descriptor) || ((this.descriptor != null) && descriptor.equals(
            rhs.descriptor
        ))))
    }
}
