package io.spherelabs.blahblahyaml

import okio.Path
import platform.Foundation.NSFileManager
import platform.Foundation.NSString
import platform.Foundation.NSUTF8StringEncoding
import platform.Foundation.create


actual fun readPath(path: Path): String {
    val manager = NSFileManager.defaultManager

    println(manager.currentDirectoryPath)
    val currentPath = "Input Absolut Path To resource"
    val data = manager.contentsAtPath(path.name) ?: throw IllegalArgumentException("Cannot open input file $path")

    return NSString.create(data, NSUTF8StringEncoding).toString()
}
