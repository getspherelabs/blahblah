package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider

internal fun universityModule(yamlProvider: () -> YamlProvider): UniversityModule {
    return UniversityModule(
        provider = provider {
            type(ProviderType.University)
            yamlProvider(yamlProvider())
        }
    )
}

internal fun addressModule(yamlProvider: () -> YamlProvider): AddressModule {
    return AddressModule(
        provider = provider {
            type(ProviderType.Address)
            yamlProvider(yamlProvider())
        }
    )
}

internal fun animalModule(yamlProvider: () -> YamlProvider): AnimalModule {
    return AnimalModule(
        provider = provider {
            type(ProviderType.Animal)
            yamlProvider(yamlProvider())
        }
    )
}

internal fun appModule(yamlProvider: () -> YamlProvider): AppModule {
    return AppModule(
        provider = provider {
            type(ProviderType.App)
            yamlProvider(yamlProvider())
        }
    )
}

internal fun artistModule(yamlProvider: () -> YamlProvider): ArtistModule {
    return ArtistModule(
        provider = provider {
            type(ProviderType.Artist)
            yamlProvider(yamlProvider())
        }
    )
}

internal fun companyModule(yamlProvider: () -> YamlProvider): CompanyModule {
    return CompanyModule(
        provider = provider {
            type(ProviderType.Company)
            yamlProvider(yamlProvider())
        }
    )
}

internal fun compassModule(yamlProvider: () -> YamlProvider): CompassModule {
    return CompassModule(
        provider = provider {
            type(ProviderType.Compass)
            yamlProvider(yamlProvider())
        }
    )
}

internal fun internetModule(yamlProvider: () -> YamlProvider): InternetModule {
    return InternetModule(
        provider = provider {
            type(ProviderType.Internet)
            yamlProvider(yamlProvider())
        }
    )
}

internal fun loremModule(yamlProvider: () -> YamlProvider): LoremModule {
    return LoremModule(
        provider = provider {
            type(ProviderType.Lorem)
            yamlProvider(yamlProvider())
        }
    )
}

internal fun hipsterModule(yamlProvider: () -> YamlProvider): HipsterModule {
    return HipsterModule(
        provider = provider {
            type(ProviderType.Hipster)
            yamlProvider(yamlProvider())
        }
    )
}

internal fun nameModule(yamlProvider: () -> YamlProvider): NameModule {
    return NameModule(
        provider = provider {
            type(ProviderType.Name)
            yamlProvider(yamlProvider())
        }
    )
}

internal fun creditCardModule(yamlProvider: () -> YamlProvider): CreditCardModule {
    return CreditCardModule(
        provider = provider {
            type(ProviderType.CreditCard)
            yamlProvider(yamlProvider())
        }
    )
}

internal fun colorModule(yamlProvider: () -> YamlProvider): ColorModule {
    return ColorModule(
        provider = provider {
            type(ProviderType.Color)
            yamlProvider(yamlProvider())
        }
    )
}

internal fun commerceModule(yamlProvider: () -> YamlProvider): CommerceModule {
    return CommerceModule(
        provider = provider {
            type(ProviderType.Commerce)
            yamlProvider(yamlProvider())
        }
    )
}

internal fun teamModule(yamlProvider: () -> YamlProvider): TeamModule {
    return TeamModule(
        provider = provider {
            type(ProviderType.Team)
            yamlProvider(yamlProvider())
        }
    )
}
