package io.spherelabs.blahblahyaml

import okio.Path
import platform.Foundation.NSFileManager
import platform.Foundation.NSString
import platform.Foundation.NSUTF8StringEncoding
import platform.Foundation.create

/**
 * Reads the content of a file at the specified path and returns it as a string.
 *
 * @param path The path to the file to be read.
 * @return The content of the file as a string.
 */
internal actual fun readPath(path: Path): String {
    val manager = NSFileManager.defaultManager

    println(manager.currentDirectoryPath)
    val currentPath = "Input Absolut Path To resource"
    val data = manager.contentsAtPath(path.name) ?: throw IllegalArgumentException("Cannot open input file $path")

    return NSString.create(data, NSUTF8StringEncoding).toString()
}
