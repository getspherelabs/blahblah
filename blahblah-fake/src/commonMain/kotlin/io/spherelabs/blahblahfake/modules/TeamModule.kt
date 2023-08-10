package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.TeamPath
import io.spherelabs.blahblahfake.provider.Provider
import kotlin.jvm.JvmInline

class TeamModule(
    private val provider: Provider
) {
    val creature: Creature get() = Creature(provider.get(TeamPath.Creature))
    val name: Name get() = Name(provider.get(TeamPath.Name))
    val sport: Sport get() = Sport(provider.get(TeamPath.Sport))
}

@JvmInline
value class Creature(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Sport(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}