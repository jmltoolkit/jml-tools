package com.github.jmlparser.lint.sarif

import com.google.gson.annotations.Expose
import javax.annotation.processing.Generated

/**
 * An artifact relevant to a result.
 */
@Generated("jsonschema2pojo")
class Attachment {
    /**
     * Encapsulates a message intended to be read by the end user.
     */
    @SerializedName("description")
    @Expose
    private var description: Message? = null

    /**
     * Specifies the location of an artifact.
     * (Required)
     */
    @SerializedName("artifactLocation")
    @Expose
    private var artifactLocation: ArtifactLocation? = null

    /**
     * An array of regions of interest within the attachment.
     */
    @SerializedName("regions")
    @Expose
    private var regions: Set<Region>? = LinkedHashSet<Region>()

    /**
     * An array of rectangles specifying areas of interest within the image.
     */
    @SerializedName("rectangles")
    @Expose
    private var rectangles: Set<Rectangle>? = LinkedHashSet<Rectangle>()

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
     * @param regions
     * @param rectangles
     * @param description
     * @param artifactLocation
     * @param properties
     */
    constructor(
        description: Message?,
        artifactLocation: ArtifactLocation?,
        regions: Set<Region>?,
        rectangles: Set<Rectangle>?,
        properties: PropertyBag?
    ) : super() {
        this.description = description
        this.artifactLocation = artifactLocation
        this.regions = regions
        this.rectangles = rectangles
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

    fun withDescription(description: Message?): Attachment {
        this.description = description
        return this
    }

    /**
     * Specifies the location of an artifact.
     * (Required)
     */
    fun getArtifactLocation(): ArtifactLocation? {
        return artifactLocation
    }

    /**
     * Specifies the location of an artifact.
     * (Required)
     */
    fun setArtifactLocation(artifactLocation: ArtifactLocation?) {
        this.artifactLocation = artifactLocation
    }

    fun withArtifactLocation(artifactLocation: ArtifactLocation?): Attachment {
        this.artifactLocation = artifactLocation
        return this
    }

    /**
     * An array of regions of interest within the attachment.
     */
    fun getRegions(): Set<Region>? {
        return regions
    }

    /**
     * An array of regions of interest within the attachment.
     */
    fun setRegions(regions: Set<Region>?) {
        this.regions = regions
    }

    fun withRegions(regions: Set<Region>?): Attachment {
        this.regions = regions
        return this
    }

    /**
     * An array of rectangles specifying areas of interest within the image.
     */
    fun getRectangles(): Set<Rectangle>? {
        return rectangles
    }

    /**
     * An array of rectangles specifying areas of interest within the image.
     */
    fun setRectangles(rectangles: Set<Rectangle>?) {
        this.rectangles = rectangles
    }

    fun withRectangles(rectangles: Set<Rectangle>?): Attachment {
        this.rectangles = rectangles
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

    fun withProperties(properties: PropertyBag?): Attachment {
        this.properties = properties
        return this
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Attachment::class.java.name).append('@').append(
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
        sb.append("artifactLocation")
        sb.append('=')
        sb.append((if ((this.artifactLocation == null)) "<null>" else this.artifactLocation))
        sb.append(',')
        sb.append("regions")
        sb.append('=')
        sb.append((if ((this.regions == null)) "<null>" else this.regions))
        sb.append(',')
        sb.append("rectangles")
        sb.append('=')
        sb.append((if ((this.rectangles == null)) "<null>" else this.rectangles))
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
        result = ((result * 31) + (if ((this.description == null)) 0 else description.hashCode()))
        result = ((result * 31) + (if ((this.regions == null)) 0 else regions.hashCode()))
        result = ((result * 31) + (if ((this.rectangles == null)) 0 else rectangles.hashCode()))
        result = ((result * 31) + (if ((this.artifactLocation == null)) 0 else artifactLocation.hashCode()))
        result = ((result * 31) + (if ((this.properties == null)) 0 else properties.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Attachment) == false) {
            return false
        }
        val rhs = other
        return ((((((this.description === rhs.description) || ((this.description != null) && description.equals(rhs.description))) && ((this.regions === rhs.regions) || ((this.regions != null) && (this.regions == rhs.regions)))) && ((this.rectangles === rhs.rectangles) || ((this.rectangles != null) && (this.rectangles == rhs.rectangles)))) && ((this.artifactLocation === rhs.artifactLocation) || ((this.artifactLocation != null) && artifactLocation.equals(
            rhs.artifactLocation
        )))) && ((this.properties === rhs.properties) || ((this.properties != null) && properties.equals(rhs.properties))))
    }
}
