package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider

internal fun universityModule(yamlProvider: YamlProvider): UniversityModule {
    return UniversityModule(provider = provider {
        type(ProviderType.University)
        yamlProvider(yamlProvider)
    })
}


internal fun addressModule(yamlProvider: YamlProvider): AddressModule {
    return AddressModule(provider = provider {
        type(ProviderType.Address)
        yamlProvider(yamlProvider)
    })
}

internal fun animalModule(yamlProvider: YamlProvider): AnimalModule {
    return AnimalModule(provider = provider {
        type(ProviderType.Animal)
        yamlProvider(yamlProvider)
    })
}

internal fun appModule(yamlProvider: YamlProvider): AppModule {
    return AppModule(provider = provider {
        type(ProviderType.App)
        yamlProvider(yamlProvider)
    })
}
