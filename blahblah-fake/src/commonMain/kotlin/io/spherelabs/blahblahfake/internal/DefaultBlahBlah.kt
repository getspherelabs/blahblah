package io.spherelabs.blahblahfake.internal

import io.spherelabs.blahblahfake.modules.AddressModule
import io.spherelabs.blahblahfake.modules.AncientModule
import io.spherelabs.blahblahfake.modules.AnimalModule
import io.spherelabs.blahblahfake.modules.AppModule
import io.spherelabs.blahblahfake.modules.ArtistModule
import io.spherelabs.blahblahfake.modules.BookModule
import io.spherelabs.blahblahfake.modules.CatModule
import io.spherelabs.blahblahfake.modules.ChuckNorrisModule
import io.spherelabs.blahblahfake.modules.CodeModule
import io.spherelabs.blahblahfake.modules.ColorModule
import io.spherelabs.blahblahfake.modules.CommerceModule
import io.spherelabs.blahblahfake.modules.CompanyModule
import io.spherelabs.blahblahfake.modules.CompassModule
import io.spherelabs.blahblahfake.modules.CreditCardModule
import io.spherelabs.blahblahfake.modules.DemographicModule
import io.spherelabs.blahblahfake.modules.DessertModule
import io.spherelabs.blahblahfake.modules.EducationModule
import io.spherelabs.blahblahfake.modules.EmojiModule
import io.spherelabs.blahblahfake.modules.EsportsModule
import io.spherelabs.blahblahfake.modules.FileModule
import io.spherelabs.blahblahfake.modules.FoodModule
import io.spherelabs.blahblahfake.modules.FriendsModule
import io.spherelabs.blahblahfake.modules.GameOfThronesModule
import io.spherelabs.blahblahfake.modules.HackerModule
import io.spherelabs.blahblahfake.modules.HipsterModule
import io.spherelabs.blahblahfake.modules.IdNumberModule
import io.spherelabs.blahblahfake.modules.InternetModule
import io.spherelabs.blahblahfake.modules.JobModule
import io.spherelabs.blahblahfake.modules.LoremModule
import io.spherelabs.blahblahfake.modules.MusicModule
import io.spherelabs.blahblahfake.modules.NameModule
import io.spherelabs.blahblahfake.modules.PokemonModule
import io.spherelabs.blahblahfake.modules.QuoteModule
import io.spherelabs.blahblahfake.modules.RickyAndMortyModule
import io.spherelabs.blahblahfake.modules.RockBandModule
import io.spherelabs.blahblahfake.modules.SpaceModule
import io.spherelabs.blahblahfake.modules.SuperHeroModule
import io.spherelabs.blahblahfake.modules.TeamModule
import io.spherelabs.blahblahfake.modules.UniversityModule
import io.spherelabs.blahblahfake.modules.UuidModule
import io.spherelabs.blahblahfake.modules.YodaModule
import io.spherelabs.blahblahfake.modules.ZeldaModule
import io.spherelabs.blahblahfake.modules.addressModule
import io.spherelabs.blahblahfake.modules.ancientModule
import io.spherelabs.blahblahfake.modules.animalModule
import io.spherelabs.blahblahfake.modules.appModule
import io.spherelabs.blahblahfake.modules.artistModule
import io.spherelabs.blahblahfake.modules.bookModule
import io.spherelabs.blahblahfake.modules.catModule
import io.spherelabs.blahblahfake.modules.chuckNorrisModule
import io.spherelabs.blahblahfake.modules.codeModule
import io.spherelabs.blahblahfake.modules.colorModule
import io.spherelabs.blahblahfake.modules.commerceModule
import io.spherelabs.blahblahfake.modules.companyModule
import io.spherelabs.blahblahfake.modules.compassModule
import io.spherelabs.blahblahfake.modules.creditCardModule
import io.spherelabs.blahblahfake.modules.demographicModule
import io.spherelabs.blahblahfake.modules.dessertModule
import io.spherelabs.blahblahfake.modules.educationModule
import io.spherelabs.blahblahfake.modules.emojiModule
import io.spherelabs.blahblahfake.modules.esportsModule
import io.spherelabs.blahblahfake.modules.fileModule
import io.spherelabs.blahblahfake.modules.foodModule
import io.spherelabs.blahblahfake.modules.friendsModule
import io.spherelabs.blahblahfake.modules.gameOfThronesModule
import io.spherelabs.blahblahfake.modules.hackerModule
import io.spherelabs.blahblahfake.modules.hipsterModule
import io.spherelabs.blahblahfake.modules.idNumberModule
import io.spherelabs.blahblahfake.modules.internetModule
import io.spherelabs.blahblahfake.modules.jobModule
import io.spherelabs.blahblahfake.modules.loremModule
import io.spherelabs.blahblahfake.modules.musicModule
import io.spherelabs.blahblahfake.modules.nameModule
import io.spherelabs.blahblahfake.modules.pokemonModule
import io.spherelabs.blahblahfake.modules.quoteModule
import io.spherelabs.blahblahfake.modules.rickyAndMortyModule
import io.spherelabs.blahblahfake.modules.rockBandModule
import io.spherelabs.blahblahfake.modules.spaceModule
import io.spherelabs.blahblahfake.modules.superHeroModule
import io.spherelabs.blahblahfake.modules.teamModule
import io.spherelabs.blahblahfake.modules.universityModule
import io.spherelabs.blahblahfake.modules.uuidModule
import io.spherelabs.blahblahfake.modules.yodaModule
import io.spherelabs.blahblahfake.modules.zeldaModule

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

    override val team: TeamModule by lazy {
        teamModule { configuration.yamlProvider }
    }

    override val hacker: HackerModule by lazy {
        hackerModule { configuration.yamlProvider }
    }

    override val idNumber: IdNumberModule by lazy {
        idNumberModule { configuration.yamlProvider }
    }

    override val emoji: EmojiModule by lazy {
        emojiModule { configuration.yamlProvider }
    }

    override val book: BookModule by lazy {
        bookModule { configuration.yamlProvider }
    }

    override val cat: CatModule by lazy {
        catModule { configuration.yamlProvider }
    }

    override val superHero: SuperHeroModule by lazy {
        superHeroModule { configuration.yamlProvider }
    }

    override val code: CodeModule by lazy {
        codeModule { configuration.yamlProvider }
    }

    override val chuckNorris: ChuckNorrisModule by lazy {
        chuckNorrisModule { configuration.yamlProvider }
    }

    override val education: EducationModule by lazy {
        educationModule { configuration.yamlProvider }
    }

    override val space: SpaceModule by lazy {
        spaceModule { configuration.yamlProvider }
    }

    override val yoda: YodaModule by lazy {
        yodaModule { configuration.yamlProvider }
    }

    override val music: MusicModule by lazy {
        musicModule { configuration.yamlProvider }
    }

    override val file: FileModule by lazy {
        fileModule { configuration.yamlProvider }
    }

    override val gameOfThrones: GameOfThronesModule by lazy {
        gameOfThronesModule { configuration.yamlProvider }
    }

    override val pokemon: PokemonModule by lazy {
        pokemonModule { configuration.yamlProvider }
    }

    override val food: FoodModule by lazy {
        foodModule { configuration.yamlProvider }
    }

    override val esports: EsportsModule by lazy {
        esportsModule { configuration.yamlProvider }
    }

    override val ancient: AncientModule by lazy {
        ancientModule { configuration.yamlProvider }
    }

    override val zelda: ZeldaModule by lazy {
        zeldaModule { configuration.yamlProvider }
    }

    override val rockBand: RockBandModule by lazy {
        rockBandModule { configuration.yamlProvider }
    }

    override val job: JobModule by lazy {
        jobModule { configuration.yamlProvider }
    }

    override val uuid: UuidModule by lazy {
        uuidModule()
    }

    override val dessert: DessertModule by lazy {
        dessertModule { configuration.yamlProvider }
    }

    override val demographic: DemographicModule by lazy {
        demographicModule { configuration.yamlProvider }
    }

    override val friends: FriendsModule by lazy {
        friendsModule { configuration.yamlProvider }
    }

    override val rickyAndMorty: RickyAndMortyModule by lazy {
        rickyAndMortyModule { configuration.yamlProvider }
    }

    override val quote: QuoteModule by lazy {
        quoteModule { configuration.yamlProvider }
    }
}
