package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.EsportsPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

public class EsportsModule(
    private val provider: Provider
) {

    public val player: Player get() = Player(provider.get(EsportsPath.Player))
    public val team: Team get() = Team(provider.get(EsportsPath.Team))
    public val event: Event get() = Event(provider.get(EsportsPath.Event))
    public val league: League get() = League(provider.get(EsportsPath.League))
    public val game: Game get() = Game(provider.get(EsportsPath.Game))
}

internal fun esportsModule(yamlProvider: () -> YamlProvider): EsportsModule {
    return EsportsModule(provider = provider {
        type(ProviderType.Esports)
        yamlProvider(yamlProvider())
    })
}

@JvmInline
public value class Player(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Team(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Event(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class League(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Game(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}
