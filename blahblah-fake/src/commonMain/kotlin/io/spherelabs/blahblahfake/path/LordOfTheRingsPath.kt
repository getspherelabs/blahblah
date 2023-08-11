package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class LordOfTheRingsPath(override val value: String) : Path {
    Character("lord_of_the_rings.characters"),
    Location("lord_of_the_rings.locations")
}
