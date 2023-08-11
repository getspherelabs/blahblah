package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class ZeldaPath(override val value: String) : Path {
    Game("zelda.games"),
    Character("zelda.characters")
}
