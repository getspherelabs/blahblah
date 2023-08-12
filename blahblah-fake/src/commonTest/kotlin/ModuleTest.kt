import io.spherelabs.blahblahfake.internal.BlahBlah
import io.spherelabs.blahblahfake.internal.blah
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertNotNull

class ModuleTest {

    private lateinit var blah: BlahBlah

    @BeforeTest
    fun setup() {
        blah = blah()
    }

    @Test
    fun `check the artist module works properly`() {
        val artist = blah.artist
        val name = artist.name

        assertNotNull(name)
    }

    @Test
    fun `check the company module works properly`() {
        val company = blah.company
        val name = company.name
        val bs = company.bs
        val profession = company.profession
        val buzzwords = company.buzzwords

        assertNotNull(name)
        assertNotNull(bs)
        assertNotNull(buzzwords)
        assertNotNull(profession)
    }

    @Test
    fun `check the internet works properly`() {
        val internet = blah.internet
        val mozilla = internet.userAgent.mozilla
        val aol = internet.userAgent.aol
        val safari = internet.userAgent.safari
        val imageDimension = internet.imageDimension

        assertNotNull(mozilla)
        assertNotNull(aol)
        assertNotNull(safari)
        assertNotNull(imageDimension)
    }

    @Test
    fun `check the hipster works properly`() {
        val hipster = blah.hipster
        val words = hipster.words

        assertNotNull(words)
    }

    @Test
    fun `check the lorem works properly`() {
        val lorem = blah.lorem
        val words = lorem.words
        val supplemental = lorem.supplemental

        assertNotNull(words)
        assertNotNull(supplemental)
    }

    @Test
    fun `check the credit card works properly`() {
        val creditCard = blah.creditCard
        val types = creditCard.types
        val expiryDates = creditCard.expiryDates
        val numbers = creditCard.numbers

        assertNotNull(types)
        assertNotNull(expiryDates)
        assertNotNull(numbers)
    }

    @Test
    fun `check the team works properly`() {
        val team = blah.team
        val name = team.name
        val sport = team.sport
        val creature = team.creature

        assertNotNull(name)
        assertNotNull(sport)
        assertNotNull(creature)
    }

    @Test
    fun `check the hacker works properly`() {
        val hacker = blah.hacker
        val action = hacker.action
        val abbreviation = hacker.abbreviation
        val noun = hacker.noun
        val adj = hacker.adjective

        assertNotNull(action)
        assertNotNull(abbreviation)
        assertNotNull(noun)
        assertNotNull(adj)
    }

    @Test
    fun `check the emoji works properly`() {
        val emoji = blah.emoji
        val name = emoji.name

        println(name)
        assertNotNull(emoji)
    }

    @Test
    fun `check the book works properly`() {
        val book = blah.book
        val title = book.title
        val author = book.author
        val genre = book.genre
        val publisher = book.publisher

        assertNotNull(title)
        assertNotNull(author)
        assertNotNull(genre)
        assertNotNull(publisher)
    }

    @Test
    fun `check the cat works properly`() {
        val cat = blah.cat
        val name = cat.name
        val breed = cat.breed
        val registry = cat.registry

        assertNotNull(name)
        assertNotNull(breed)
        assertNotNull(registry)
    }

    @Test
    fun `check the code works properly`() {
        val code = blah.code
        val asin = code.asin

        assertNotNull(asin)
    }

    @Test
    fun `check the education works properly`() {
        val education = blah.education
        val name = education.name
        val type = education.course.type
        val subject = education.course.subject

        assertNotNull(name)
        assertNotNull(type)
        assertNotNull(subject)
    }
}
