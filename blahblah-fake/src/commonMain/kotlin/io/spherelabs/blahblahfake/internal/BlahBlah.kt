package io.spherelabs.blahblahfake.internal

import io.spherelabs.blahblahfake.dictionary.*
import io.spherelabs.blahblahfake.dictionary.Name
import io.spherelabs.blahblahfake.modules.*
import io.spherelabs.blahblahyaml.parser.yamlParser
import io.spherelabs.blahblahyaml.provider.yamlProvider
import kotlin.Number

interface BlahBlah {
    public val address: AddressModule
    public val app: AppModule
    public val business: Business
    public val animal: AnimalModule
    public val university: UniversityModule
    public val company: Company
    public val gender: Gender
    public val internet: Internet
    public val lorem: Lorem
    public val name: Name
    public val phoneNumber: PhoneNumber
    public val team: Team
    public val number: Number
    public val bank: Bank
    public val date: Date
    public val hobbit: Hobbit
    public val car: Car
    public val programmingLanguage: ProgrammingLanguage
    public val vehicle: Vehicle
    public val house: House
}

internal class DefaultBlahBlah(
    private val configuration: BlahBlahConfig
) : BlahBlah {

    override val address: AddressModule by lazy {
        addressModule(configuration.yamlProvider)
    }

    override val animal: AnimalModule by lazy {
        animalModule(configuration.yamlProvider)
    }

    override val app: AppModule by lazy {
        appModule(configuration.yamlProvider)
    }

    override val university: UniversityModule by lazy {
        universityModule(configuration.yamlProvider)
    }

    override val business: Business
        get() = TODO("Not yet implemented")

    override val company: Company
        get() = TODO("Not yet implemented")
    override val gender: Gender
        get() = TODO("Not yet implemented")
    override val internet: Internet
        get() = TODO("Not yet implemented")
    override val lorem: Lorem
        get() = TODO("Not yet implemented")
    override val name: Name
        get() = TODO("Not yet implemented")
    override val phoneNumber: PhoneNumber
        get() = TODO("Not yet implemented")
    override val team: Team
        get() = TODO("Not yet implemented")
    override val number: Number
        get() = TODO("Not yet implemented")
    override val bank: Bank
        get() = TODO("Not yet implemented")
    override val date: Date
        get() = TODO("Not yet implemented")
    override val hobbit: Hobbit
        get() = TODO("Not yet implemented")
    override val car: Car
        get() = TODO("Not yet implemented")
    override val programmingLanguage: ProgrammingLanguage
        get() = TODO("Not yet implemented")
    override val vehicle: Vehicle
        get() = TODO("Not yet implemented")
    override val house: House
        get() = TODO("Not yet implemented")
}

fun blahBlah(newLocale: String = "en"): BlahBlah {
    return DefaultBlahBlah(
        configuration = configs {
            locale = newLocale
            provider = yamlProvider {
                yamlParser = yamlParser {
                    locale = newLocale
                    resourcePath = "src/commonTest/resources/en.yml"
                    sectionKey = "blah-blah"
                }
            }
        }
    )
}