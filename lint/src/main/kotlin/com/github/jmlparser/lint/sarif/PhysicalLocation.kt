package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * A physical location relevant to a result. Specifies a reference to a programming artifact together with a range of bytes or characters within that artifact.
 */
@Generated("jsonschema2pojo")
class PhysicalLocation {
    /**
     * A physical or virtual address, or a range of addresses, in an 'addressable region' (memory or a binary file).
     */
    @SerializedName("address")
    @Expose
    private var address: Address? = null

    /**
     * Specifies the location of an artifact.
     */
    @SerializedName("artifactLocation")
    @Expose
    private var artifactLocation: ArtifactLocation? = null

    /**
     * A region within an artifact where a result was detected.
     */
    @SerializedName("region")
    @Expose
    private var region: Region? = null

    /**
     * A region within an artifact where a result was detected.
     */
    @SerializedName("contextRegion")
    @Expose
    private var contextRegion: Region? = null

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
     * @param address
     * @param contextRegion
     * @param region
     * @param artifactLocation
     * @param properties
     */
    constructor(
        address: Address?,
        artifactLocation: ArtifactLocation?,
        region: Region?,
        contextRegion: Region?,
        properties: PropertyBag?
    ) : super() {
        this.address = address
        this.artifactLocation = artifactLocation
        this.region = region
        this.contextRegion = contextRegion
        this.properties = properties
    }

    /**
     * A physical or virtual address, or a range of addresses, in an 'addressable region' (memory or a binary file).
     */
    fun getAddress(): Address? {
        return address
    }

    /**
     * A physical or virtual address, or a range of addresses, in an 'addressable region' (memory or a binary file).
     */
    fun setAddress(address: Address?) {
        this.address = address
    }

    fun withAddress(address: Address?): PhysicalLocation {
        this.address = address
        return this
    }

    /**
     * Specifies the location of an artifact.
     */
    fun getArtifactLocation(): ArtifactLocation? {
        return artifactLocation
    }

    /**
     * Specifies the location of an artifact.
     */
    fun setArtifactLocation(artifactLocation: ArtifactLocation?) {
        this.artifactLocation = artifactLocation
    }

    fun withArtifactLocation(artifactLocation: ArtifactLocation?): PhysicalLocation {
        this.artifactLocation = artifactLocation
        return this
    }

    /**
     * A region within an artifact where a result was detected.
     */
    fun getRegion(): Region? {
        return region
    }

    /**
     * A region within an artifact where a result was detected.
     */
    fun setRegion(region: Region?) {
        this.region = region
    }

    fun withRegion(region: Region?): PhysicalLocation {
        this.region = region
        return this
    }

    /**
     * A region within an artifact where a result was detected.
     */
    fun getContextRegion(): Region? {
        return contextRegion
    }

    /**
     * A region within an artifact where a result was detected.
     */
    fun setContextRegion(contextRegion: Region?) {
        this.contextRegion = contextRegion
    }

    fun withContextRegion(contextRegion: Region?): PhysicalLocation {
        this.contextRegion = contextRegion
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

    fun withProperties(properties: PropertyBag?): PhysicalLocation {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(PhysicalLocation::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("address")
        sb.append('=')
        sb.append((if ((this.address == null)) "<null>" else this.address))
        sb.append(',')
        sb.append("artifactLocation")
        sb.append('=')
        sb.append((if ((this.artifactLocation == null)) "<null>" else this.artifactLocation))
        sb.append(',')
        sb.append("region")
        sb.append('=')
        sb.append((if ((this.region == null)) "<null>" else this.region))
        sb.append(',')
        sb.append("contextRegion")
        sb.append('=')
        sb.append((if ((this.contextRegion == null)) "<null>" else this.contextRegion))
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
        result = ((result * 31) + (if ((this.contextRegion == null)) 0 else contextRegion.hashCode()))
        result = ((result * 31) + (if ((this.address == null)) 0 else address.hashCode()))
        result = ((result * 31) + (if ((this.region == null)) 0 else region.hashCode()))
        result = ((result * 31) + (if ((this.artifactLocation == null)) 0 else artifactLocation.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is PhysicalLocation) == false) {
            return false
        }
        val rhs = other
        return ((((((this.contextRegion === rhs.contextRegion) || ((this.contextRegion != null) && contextRegion.equals(
            rhs.contextRegion
        ))) && ((this.address === rhs.address) || ((this.address != null) && address.equals(rhs.address)))) && ((this.region === rhs.region) || ((this.region != null) && region.equals(
            rhs.region
        )))) && ((this.artifactLocation === rhs.artifactLocation) || ((this.artifactLocation != null) && artifactLocation.equals(
            rhs.artifactLocation
        )))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(rhs.properties))))
    }
}
