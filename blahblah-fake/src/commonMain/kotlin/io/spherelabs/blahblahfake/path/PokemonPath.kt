package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class PokemonPath(override val value: String) : Path {
    Name("pokemon.names"),
    Location("pokemon.locations")
}
