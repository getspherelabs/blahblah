package io.spherelabs.blahblahfake.path

internal enum class CompassPath(override val value: String) : Path {
    Direction("compass.direction"),
    Abbreviation("compass.abbreviation"),
    Azimuth("compass.azimuth")
}
