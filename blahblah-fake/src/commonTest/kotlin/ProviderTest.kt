import io.spherelabs.blahblahfake.exception.UninitializedProviderTypeException
import io.spherelabs.blahblahfake.exception.UnsupportedPathException
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.parser.yamlParser
import io.spherelabs.blahblahyaml.provider.yamlProvider
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class ProviderTest {


    @Test
    fun `check the path is correct type`() {
        val yamlProvider = yamlProvider {
            yamlParser = yamlParser {
                resourcePath {
                    "src/commonTest/resources/en.yml"
                }
                sectionKey = "blah-blah"
            }
        }


        assertFailsWith(UninitializedProviderTypeException::class, "ProviderType has not been initialized") {
            val provider = provider {
                yamlProvider(yamlProvider)
            }
        }
    }
}