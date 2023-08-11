package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class CompassPath(override val value: String) : Path {
    Direction("compass.direction"),
    Abbreviation("compass.abbreviation"),
    Azimuth("compass.azimuth")
}
