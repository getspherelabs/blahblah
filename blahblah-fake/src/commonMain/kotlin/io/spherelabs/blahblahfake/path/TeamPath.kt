package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class TeamPath(override val value: String) : Path {
    Creature("team.creature"),
    Name("team.name"),
    Sport("team.sport")
}
