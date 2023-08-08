package io.spherelabs.blahblahfake.provider

import io.spherelabs.blahblahfake.exception.UninitializedProviderTypeException
import io.spherelabs.blahblahyaml.provider.YamlProvider

fun provider(block: ProviderBuilder.() -> Unit): Provider {
    val dsl = ProviderBuilder()
    dsl.block()
    return dsl.build()
}

class ProviderBuilder {
    private var providerType: ProviderType? = null
    private lateinit var yamlProvider: YamlProvider

    fun type(type: ProviderType) {
        providerType = type
    }

    fun yamlProvider(provider: YamlProvider) {
        yamlProvider = provider
    }

    fun build(): Provider {
        return when (providerType) {
            ProviderType.Address -> AddressProvider(yamlProvider)
            ProviderType.Animal -> AnimalProvider(yamlProvider)
            ProviderType.App -> AppProvider(yamlProvider)
            ProviderType.University -> UniversityProvider(yamlProvider)
            null -> throw UninitializedProviderTypeException()

        }
    }
}