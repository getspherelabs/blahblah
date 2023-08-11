package io.spherelabs.blahblahfake.provider

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi
import io.spherelabs.blahblahfake.exception.UninitializedProviderTypeException
import io.spherelabs.blahblahyaml.provider.YamlProvider

internal fun provider(block: ProviderBuilder.() -> Unit): Provider {
    val dsl = ProviderBuilder()
    dsl.block()
    return dsl.build()
}

/**
 * [ProviderBuilder] for creating and configuring Provider instances using DSL-style configuration.
 */
@BlahBlahInternalApi
internal class ProviderBuilder {
    private var providerType: ProviderType? = null
    private lateinit var yamlProvider: YamlProvider

    /**
     * Sets the provider type for the Provider instance.
     *
     * @param type The type of the provider.
     */
    fun type(type: ProviderType) {
        providerType = type
    }

    /**
     * Sets the YAML provider for the Provider instance.
     *
     * @param provider The YAML provider to use.
     */
    fun yamlProvider(provider: YamlProvider) {
        yamlProvider = provider
    }

    /**
     * [build] is a factory function that builds and returns a Provider instance
     * based on the configured options.
     *
     * @return A configured Provider instance.
     * @throws UninitializedProviderTypeException If the provider type is not initialized.
     */
    fun build(): Provider {
        return when (providerType) {
            ProviderType.Address -> AddressProvider(yamlProvider)
            ProviderType.Animal -> AnimalProvider(yamlProvider)
            ProviderType.App -> AppProvider(yamlProvider)
            ProviderType.University -> UniversityProvider(yamlProvider)
            ProviderType.Artist -> ArtistProvider(yamlProvider)
            ProviderType.Company -> CompanyProvider(yamlProvider)
            ProviderType.Compass -> CompassProvider(yamlProvider)
            ProviderType.Internet -> InternetProvider(yamlProvider)
            ProviderType.Lorem -> LoremProvider(yamlProvider)
            ProviderType.Hipster -> HipsterProvider(yamlProvider)
            ProviderType.Name -> NameProvider(yamlProvider)
            ProviderType.CreditCard -> CreditCardProvider(yamlProvider)
            ProviderType.Color -> ColorProvider(yamlProvider)
            ProviderType.Commerce -> CommerceProvider(yamlProvider)
            ProviderType.Team -> TeamProvider(yamlProvider)
            ProviderType.Hacker -> HackerProvider(yamlProvider)
            ProviderType.IdNumber -> IdNumberProvider(yamlProvider)
            ProviderType.Emoji -> EmojiProvider(yamlProvider)
            ProviderType.Book -> BookProvider(yamlProvider)
            ProviderType.Cat -> CatProvider(yamlProvider)
            ProviderType.SuperHero -> SuperHeroProvider(yamlProvider)
            ProviderType.Code -> CodeProvider(yamlProvider)
            ProviderType.ChuckNorris -> ChuckNorrisProvider(yamlProvider)
            ProviderType.Educator -> EducatorProvider(yamlProvider)
            ProviderType.Space -> SpaceProvider(yamlProvider)
            ProviderType.Yoda -> YodaProvider(yamlProvider)
            ProviderType.Music -> MusicProvider(yamlProvider)
            ProviderType.File -> FileProvider(yamlProvider)
            ProviderType.GameOfThrones -> GameOfThronesProvider(yamlProvider)
            ProviderType.Pokemon -> PokemonProvider(yamlProvider)
            ProviderType.Food -> FoodProvider(yamlProvider)
            ProviderType.Esports -> EsportsProvider(yamlProvider)
            ProviderType.Ancient -> AncientProvider(yamlProvider)
            ProviderType.TwinPeaks -> TwinPeaksProvider(yamlProvider)
            ProviderType.LordOfTheRings -> LoremProvider(yamlProvider)
            ProviderType.Zelda -> ZeldaProvider(yamlProvider)
            ProviderType.RockBand -> RockBandProvider(yamlProvider)
            ProviderType.Job -> JobProvider(yamlProvider)
            null -> throw UninitializedProviderTypeException()
        }
    }
}
