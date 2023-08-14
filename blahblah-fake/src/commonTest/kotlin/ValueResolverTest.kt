
import io.spherelabs.blahblahfake.internal.resolver
import io.spherelabs.blahblahyaml.parser.yamlParser
import io.spherelabs.blahblahyaml.provider.yamlProvider
import kotlin.test.Test
import kotlin.test.assertNotNull

class ValueResolverTest {

    @Test
    fun `check the value resolver works properly`() {
        val yamlProvider = yamlProvider {
            yamlParser = yamlParser {
                resourcePath {
                    "/en.yml"
                }
                sectionKey = "blah-blah"
            }
        }

        val result = resolver { yamlProvider.get("address.country") }

        assertNotNull(result)
    }
}
