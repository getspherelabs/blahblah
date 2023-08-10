package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.FoodPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

class FoodModule(
    private val provider: Provider
) {
    val ingredient: Ingredient get() = Ingredient(provider.get(FoodPath.Ingredient))
    val spice: Spice get() = Spice(provider.get(FoodPath.Spice))
    val measurement: Measurement get() = Measurement(provider.get(FoodPath.Measurement))
    val size: Size get() = Size(provider.get(FoodPath.Size))
}

@JvmInline
value class Ingredient(private val value: String) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Spice(private val value: String) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Size(private val value: String) {
    override fun toString(): String {
        return value
    }
}

internal fun foodModule(yamlProvider: () -> YamlProvider): FoodModule {
    return FoodModule(provider = provider {
        type(ProviderType.Food)
        yamlProvider(yamlProvider())
    })
}