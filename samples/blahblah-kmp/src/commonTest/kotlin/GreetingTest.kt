import io.spherelabs.blahblahkmp.Greeting
import kotlin.test.Test
import kotlin.test.assertNotNull

class GreetingTest {

    @Test
    fun `check the platform with blah-blah`() {
        val greeting = Greeting()

        println(greeting.greet())

        assertNotNull(greeting.greet())
    }
}
