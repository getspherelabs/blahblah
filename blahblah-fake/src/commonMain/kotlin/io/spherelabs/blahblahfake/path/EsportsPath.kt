package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class EsportsPath(override val value: String) : Path {
    Player("esports.players"),
    Team("esports.teams"),
    Event("esports.events"),
    League("esports.leagues"),
    Game("esports.games")
}
