import io.spherelabs.blahblahyaml.parser.yamlParser
import io.spherelabs.blahblahyaml.provider.yamlProvider
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class YamlProviderTest {

    @Test
    fun `check provider works properly`() {
        val provider = yamlProvider {
            yamlParser = yamlParser {
                resourcePath { "src/commonTest/resources/en.yml" }
                sectionKey = "blah-blah"
            }
        }

        assertNotNull(provider.get("address.country"))
        assertEquals('a', provider.get("address.country").last())
    }
}
