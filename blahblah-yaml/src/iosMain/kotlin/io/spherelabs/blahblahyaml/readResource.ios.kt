package io.spherelabs.blahblahyaml

import okio.Path
import kotlin.reflect.KClass

actual fun readPath(path: Path): String {
    var manager = NSFileManager.defaultManager

    println(manager.currentDirectoryPath)
    // TODO fix this... but for now this is a hack that works.
    var path = "Input Absolut Path To resource"
    val data = manager.contentsAtPath(path) ?: throw IllegalArgumentException("Cannot open input file $path")

    return NSString.create(data, NSUTF8StringEncoding).toString()
}