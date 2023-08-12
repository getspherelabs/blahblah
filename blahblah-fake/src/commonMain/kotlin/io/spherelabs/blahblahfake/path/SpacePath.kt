package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class SpacePath(override val value: String) : Path {
    Planet("space.planet"),
    Moon("space.moon"),
    Galaxy("space.galaxy"),
    Nebula("space.nebula"),
    Star("space.star"),
    Cluster("space.star_cluster"),
    Constellation("space.constellation"),
    Agency("space.agency"),
    AgencyAbr("space.agency_abv"),
    SpaceCraft("space.nasa_space_craft"),
    Company("space.company"),
    Measurement("space.distance_measurement"),
    Meteor("space.meteorite")
}
