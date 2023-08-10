package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.GameOfThronesPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

class GameOfThronesModule(
    private val provider: Provider
) {
    val character: Character get() = Character(provider.get(GameOfThronesPath.Character))
    val house: House get() = House(provider.get(GameOfThronesPath.House))
    val quote: Quote get() = Quote(provider.get(GameOfThronesPath.Quote))
    val city: City get() = City(provider.get(GameOfThronesPath.City))
    val dragon: Dragon get() = Dragon(provider.get(GameOfThronesPath.Dragon))
}

@JvmInline
value class Character(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class House(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Dragon(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

internal fun gameOfThronesModule(yamlProvider: () -> YamlProvider): GameOfThronesModule {
    return GameOfThronesModule(provider = provider {
        type(ProviderType.GameOfThrones)
        yamlProvider(yamlProvider())
    })
}