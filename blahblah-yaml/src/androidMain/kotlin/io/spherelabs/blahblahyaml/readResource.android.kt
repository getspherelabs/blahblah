package io.spherelabs.blahblahyaml

import okio.FileSystem
import okio.Path
import okio.buffer

/**
 * Reads the content of a file at the specified path and returns it as a string.
 *
 * @param path The path to the file to be read.
 * @return The content of the file as a string.
 */
internal actual fun readPath(path: Path): String {
    val builder = StringBuilder()
    FileSystem.SYSTEM.source(path).use { fs ->
        fs.buffer().use { bfs ->
            var currLine = bfs.readUtf8Line()
            while (currLine != null) {
                builder.appendLine(currLine)
                currLine = bfs.readUtf8Line()
            }
        }
    }
    return builder.toString().trim()
}
