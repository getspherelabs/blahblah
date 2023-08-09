import io.spherelabs.blahblahyaml.readPath
import io.spherelabs.blahblahyaml.parser.yamlParser
import okio.Path.Companion.toPath
import kotlin.test.*


class YamlParserTest {

    @Test
    fun `check yaml parser is working properly`() {
        val yamlParser = yamlParser {
            resourcePath { "src/commonTest/resources/en.yml" }
            sectionKey = "blah-blah"
        }

        val result = yamlParser.values()
        assertNotNull(result)
        assertEquals(1, result.values.size)
    }

    @Test
    fun `check read resources is working properly`() {
        val result = readPath("src/commonTest/resources/en.yml".toPath())
        assertNotNull(result)
        println(result)
    }

    @Test
    fun `check yaml parser if it does not exist`() {
        assertFailsWith(IllegalStateException::class, "Section key is not initialized") {
            val yamlParser = yamlParser {
                resourcePath  {
                    "src/commonTest/resources/test.yml"
                }
            }
        }
    }
}