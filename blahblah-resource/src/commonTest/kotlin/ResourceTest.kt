import io.spherelabs.blahblahresource.Resource
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertNotNull

class ResourceTest {

    private lateinit var resource: Resource

    @BeforeTest
    fun setup() {
        resource = Resource()
    }

    @Test
    fun `check the resource works properly`() {
        val result = resource.read("/en.yml")

        assertNotNull(result)
    }

    @Test
    fun `check the resource does not exists`() {
        assertFailsWith(NullPointerException::class, "") {
            resource.read("/eng.yml")
        }
    }
}
