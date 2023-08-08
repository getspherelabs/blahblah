import io.spherelabs.blahblahfake.internal.BlahBlah
import io.spherelabs.blahblahfake.internal.blahBlah
import kotlin.test.*

class BlahBlahTest {

    private lateinit var blah: BlahBlah

    @BeforeTest
    fun setup() {
        blah = blahBlah()
    }

    @Test
    fun `check the blah blah works properly`() {
        val city = blah.address.city
        val state = blah.address.state

        println(city)
        println(state)

        assertNotNull(city)
        assertNotNull(state)
    }

    @Test
    fun `check the street address gets successfully`() {
        val streetAddress = blah.address.streetAddress

        println(streetAddress)

        assertNotNull(streetAddress)
        assertTrue(streetAddress.isDigit())
    }

    @Test
    fun `check the animal gets successfully`() {
        val animal = blah.animal.name

        println(animal)
        assertNotNull(animal)
    }

    @Test
    fun `check the app gets successfully`() {
        val version = blah.app.version
        val author = blah.app.author
        val name = blah.app.name

        println(version)
        println(author)
        println(name)

        assertNotNull(version)
        assertNotNull(author)
    }
}