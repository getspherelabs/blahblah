import kotlin.test.Test
import kotlin.test.assertEquals

class PathTest {

    @Test
    fun `check the parts of path`() {
        val currentPath = "./en.yml"
        val path = currentPath.split("[.|/]".toRegex())
        println(path)
        assertEquals("en", path[2])
        assertEquals("yml", path[3])
    }
}
