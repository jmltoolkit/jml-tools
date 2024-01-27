package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * The analysis tool that was run.
 */
@Generated("jsonschema2pojo")
class Tool {
    /**
     * A component, such as a plug-in or the driver, of the analysis tool that was run.
     * (Required)
     */
    @SerializedName("driver")
    @Expose
    private var driver: ToolComponent? = null

    /**
     * Tool extensions that contributed to or reconfigured the analysis tool that was run.
     */
    @SerializedName("extensions")
    @Expose
    private var extensions: Set<ToolComponent>? = LinkedHashSet<ToolComponent>()

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
     * @param extensions
     * @param driver
     * @param properties
     */
    constructor(driver: ToolComponent?, extensions: Set<ToolComponent>?, properties: PropertyBag?) : super() {
        this.driver = driver
        this.extensions = extensions
        this.properties = properties
    }

    /**
     * A component, such as a plug-in or the driver, of the analysis tool that was run.
     * (Required)
     */
    fun getDriver(): ToolComponent? {
        return driver
    }

    /**
     * A component, such as a plug-in or the driver, of the analysis tool that was run.
     * (Required)
     */
    fun setDriver(driver: ToolComponent?) {
        this.driver = driver
    }

    fun withDriver(driver: ToolComponent?): Tool {
        this.driver = driver
        return this
    }

    /**
     * Tool extensions that contributed to or reconfigured the analysis tool that was run.
     */
    fun getExtensions(): Set<ToolComponent>? {
        return extensions
    }

    /**
     * Tool extensions that contributed to or reconfigured the analysis tool that was run.
     */
    fun setExtensions(extensions: Set<ToolComponent>?) {
        this.extensions = extensions
    }

    fun withExtensions(extensions: Set<ToolComponent>?): Tool {
        this.extensions = extensions
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

    fun withProperties(properties: PropertyBag?): Tool {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Tool::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("driver")
        sb.append('=')
        sb.append((if ((this.driver == null)) "<null>" else this.driver))
        sb.append(',')
        sb.append("extensions")
        sb.append('=')
        sb.append((if ((this.extensions == null)) "<null>" else this.extensions))
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
        result = ((result * 31) + (if ((this.driver == null)) 0 else driver.hashCode()))
        result = ((result * 31) + (if ((this.extensions == null)) 0 else extensions.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Tool) == false) {
            return false
        }
        val rhs = other
        return ((((this.driver === rhs.driver) || ((this.driver != null) && driver.equals(rhs.driver))) && ((this.extensions === rhs.extensions) || ((this.extensions != null) && (this.extensions == rhs.extensions)))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(
            rhs.properties
        ))))
    }
}
