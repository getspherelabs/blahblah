import io.spherelabs.blahblahfake.internal.BlahBlah
import io.spherelabs.blahblahfake.internal.blahBlah
import kotlin.test.*

class ModuleTest {

    private lateinit var blah: BlahBlah

    @BeforeTest
    fun setup() {
        blah = blahBlah()
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
}
