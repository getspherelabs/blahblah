package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.TeamPath
import io.spherelabs.blahblahfake.provider.Provider
import kotlin.jvm.JvmInline

public class TeamModule(
    private val provider: Provider
) {
    public val creature: Creature get() = Creature(provider.get(TeamPath.Creature))
    public val name: Name get() = Name(provider.get(TeamPath.Name))
    public val sport: Sport get() = Sport(provider.get(TeamPath.Sport))
}

@JvmInline
public value class Creature(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Sport(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}
