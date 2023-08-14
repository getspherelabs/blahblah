package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.DessertPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

public class DessertModule(
    private val provider: Provider
) {
    public val variety: Variety get() = Variety(provider.get(DessertPath.Variety))
    public val topping: Topping get() = Topping(provider.get(DessertPath.Topping))
    public val flavor: Flavor get() = Flavor(provider.get(DessertPath.Flavor))
}

@JvmInline
public value class Variety(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Topping(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Flavor(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

internal fun dessertModule(yamlProvider: () -> YamlProvider): DessertModule {
    return DessertModule(
        provider = provider {
            type(ProviderType.Dessert)
            yamlProvider(yamlProvider())
        }
    )
}
