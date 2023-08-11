package io.spherelabs.blahblahfake.path

internal enum class EsportsPath(override val value: String) : Path {
    Player("esports.players"),
    Team("esports.teams"),
    Event("esports.events"),
    League("esports.leagues"),
    Game("esports.games")
}
