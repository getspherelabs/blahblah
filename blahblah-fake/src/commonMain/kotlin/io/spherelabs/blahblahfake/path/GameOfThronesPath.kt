package io.spherelabs.blahblahfake.path

internal enum class GameOfThronesPath(override val value: String) : Path {
    Character("game_of_thrones.characters"),
    House("game_of_thrones.houses"),
    City("game_of_thrones.cities"),
    Quote("game_of_thrones.quotes"),
    Dragon("game_of_thrones.dragons")
}
