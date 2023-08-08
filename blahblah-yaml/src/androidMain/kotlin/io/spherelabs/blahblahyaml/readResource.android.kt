package io.spherelabs.blahblahyaml

import okio.FileSystem
import okio.Path
import okio.buffer

actual fun readPath(path: Path): String {
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