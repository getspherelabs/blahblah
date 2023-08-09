package io.spherelabs.blahblahfake.path

enum class CompassPath(override val value: String) : Path {
    Direction("compass.direction"),
    Abbreviation("compass.abbreviation"),
    Azimuth("compass.azimuth")
}