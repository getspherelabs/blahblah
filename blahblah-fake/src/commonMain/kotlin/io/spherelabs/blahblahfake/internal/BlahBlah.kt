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
import io.spherelabs.blahblahfake.modules.EducationModule
import io.spherelabs.blahblahfake.modules.EmojiModule
import io.spherelabs.blahblahfake.modules.EsportsModule
import io.spherelabs.blahblahfake.modules.FileModule
import io.spherelabs.blahblahfake.modules.FoodModule
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
import io.spherelabs.blahblahfake.modules.RockBandModule
import io.spherelabs.blahblahfake.modules.SpaceModule
import io.spherelabs.blahblahfake.modules.SuperHeroModule
import io.spherelabs.blahblahfake.modules.TeamModule
import io.spherelabs.blahblahfake.modules.UniversityModule
import io.spherelabs.blahblahfake.modules.UuidModule
import io.spherelabs.blahblahfake.modules.YodaModule
import io.spherelabs.blahblahfake.modules.ZeldaModule

/**
 * [BlahBlah] that provides access to various modules for generating different types of fake data.
 */
public interface BlahBlah {
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
    public val team: TeamModule
    public val hacker: HackerModule
    public val idNumber: IdNumberModule
    public val emoji: EmojiModule
    public val book: BookModule
    public val cat: CatModule
    public val superHero: SuperHeroModule
    public val code: CodeModule
    public val chuckNorris: ChuckNorrisModule
    public val education: EducationModule
    public val space: SpaceModule
    public val yoda: YodaModule
    public val music: MusicModule
    public val file: FileModule
    public val gameOfThrones: GameOfThronesModule
    public val pokemon: PokemonModule
    public val food: FoodModule
    public val esports: EsportsModule
    public val ancient: AncientModule
    public val zelda: ZeldaModule
    public val rockBand: RockBandModule
    public val job: JobModule
    public val uuid: UuidModule
}

/**
 * [blah] is a builder function that creates an instance of [BlahBlah] with customizable configuration options.
 *
 * @param newLocale The new locale to use (default is "en").
 * @param resourcePath A function providing the resource path (default is a test resource path).
 * @return An instance of [BlahBlah] configured with the specified options.
 */
public fun blah(
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
