import io.spherelabs.blahblahyaml.parser.yamlParser
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNotNull

class YamlParserTest {

    @Test
    fun `check yaml parser is working properly`() {
        val yamlParser = yamlParser {
            resourcePath { "/en.yml" }
            sectionKey = "blah-blah"
        }

        val result = yamlParser.values()
        assertNotNull(result)
        assertEquals(53, result.values.size)
    }

    @Test
    fun `check yaml parser if it does not exist`() {
        assertFailsWith(IllegalStateException::class, "Section key is not initialized") {
            yamlParser {
                resourcePath {
                    "/en.yml"
                }
            }
        }
    }
}
