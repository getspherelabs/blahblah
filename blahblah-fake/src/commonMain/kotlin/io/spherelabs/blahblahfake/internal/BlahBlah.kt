package io.spherelabs.blahblahfake.internal


import io.spherelabs.blahblahfake.modules.*


interface BlahBlah {
    public val address: AddressModule
    public val app: AppModule
    public val animal: AnimalModule
    public val university: UniversityModule
    public val artist: ArtistModule
    public val company: CompanyModule
    public val compass: CompassModule
    public val internet: InternetModule
    public val lorem: LoremModule
    public val hipster: HipsterModule
    public val name: NameModule
    public val creditCard: CreditCardModule
    public val color: ColorModule
    public val commerce: CommerceModule
}

internal class DefaultBlahBlah(
    private val configuration: BlahBlahConfig
) : BlahBlah {

    override val address: AddressModule by lazy {
        addressModule { configuration.yamlProvider }
    }

    override val animal: AnimalModule by lazy {
        animalModule { configuration.yamlProvider }
    }

    override val app: AppModule by lazy {
        appModule { configuration.yamlProvider }
    }

    override val university: UniversityModule by lazy {
        universityModule { configuration.yamlProvider }
    }

    override val artist: ArtistModule by lazy {
        artistModule { configuration.yamlProvider }
    }

    override val company: CompanyModule by lazy {
        companyModule { configuration.yamlProvider }
    }

    override val compass: CompassModule by lazy {
        compassModule { configuration.yamlProvider }
    }

    override val internet: InternetModule by lazy {
        internetModule { configuration.yamlProvider }
    }

    override val lorem: LoremModule by lazy {
        loremModule { configuration.yamlProvider }
    }

    override val hipster: HipsterModule by lazy {
        hipsterModule { configuration.yamlProvider }
    }

    override val name: NameModule by lazy {
        nameModule { configuration.yamlProvider }
    }

    override val creditCard: CreditCardModule by lazy {
        creditCardModule { configuration.yamlProvider }
    }

    override val color: ColorModule by lazy {
        colorModule { configuration.yamlProvider }
    }

    override val commerce: CommerceModule by lazy {
        commerceModule { configuration.yamlProvider }
    }
}

fun blahBlah(
    newLocale: String = "en",
    resourcePath: () -> String = { "src/commonTest/resources/en.yml" }
): BlahBlah {
    return DefaultBlahBlah(
        configuration = configs {
            locale = newLocale
            path = resourcePath.invoke()
        }
    )
}