
import io.spherelabs.blahblahfake.internal.resolver
import io.spherelabs.blahblahyaml.parser.yamlParser
import io.spherelabs.blahblahyaml.provider.yamlProvider
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class ValueResolverTest {

    @Test
    fun `check the value resolver works properly`() {
        val yamlProvider = yamlProvider {
            yamlParser = yamlParser {
                resourcePath = "src/commonTest/resources/en.yml"
                sectionKey = "blah-blah"
            }
        }

        val result = resolver { yamlProvider.get("address.country") }

        assertNotNull(result)
        assertEquals("Argentina", result)
    }
}