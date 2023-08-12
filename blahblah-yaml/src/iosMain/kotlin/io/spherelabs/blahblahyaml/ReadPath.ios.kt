package io.spherelabs.blahblahyaml

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.ObjCObjectVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.value
import okio.Path
import platform.Foundation.NSBundle
import platform.Foundation.NSError
import platform.Foundation.NSString
import platform.Foundation.NSUTF8StringEncoding
import platform.Foundation.stringWithContentsOfFile

// @OptIn(UnsafeNumber::class)
// public actual class Resource actual constructor(private val path: String) {
//    private val absolutePath = NSBundle.mainBundle.pathForResource(
//        path.substringBeforeLast("."),
//        path.substringAfterLast(".")
//    )
//
//    public actual fun exists(): Boolean = absolutePath != null
//
//    public actual fun readText(): String = memScoped {
//        if (absolutePath == null) {
//            throw FileReadException("$path: No such file or directory")
//        }
//        val error = alloc<ObjCObjectVar<NSError?>>()
//        NSString.stringWithContentsOfFile(absolutePath, NSUTF8StringEncoding, error.ptr)
//            ?: throw FileReadException("$path: Read failed: ${error.value}")
//    }
//
//    public actual fun readBytes(): ByteArray = memScoped {
//        if (absolutePath == null) {
//            throw FileReadException("$path: No such file or directory")
//        }
//        val error = alloc<ObjCObjectVar<NSError?>>()
//        val data = NSData.dataWithContentsOfFile(absolutePath, NSDataReadingUncached, error.ptr)
//        val bytes = data?.bytes ?: throw FileReadException("$path: Read failed: ${error.value}")
//        bytes.readBytes(data.length.toInt())
//    }
// }

/**
 * Reads the content of a file at the specified path and returns it as a string.
 *
 * @param path The path to the file to be read.
 * @return The content of the file as a string.
 */
@OptIn(ExperimentalForeignApi::class)
internal actual fun readPath(path: Path): String = memScoped {
    println("Ios Path: $path")

    val pathParts = path.toString().split("[.|/]".toRegex())

    val currentPath = NSBundle.mainBundle.pathForResource(
        "resources/${pathParts[3]}",
        pathParts[4]
    ) ?: throw IllegalArgumentException("$path: No such file or directory")

    val error = alloc<ObjCObjectVar<NSError?>>()
    NSString.stringWithContentsOfFile(currentPath, NSUTF8StringEncoding, error.ptr)
        ?: throw IllegalArgumentException("$path: Read failed: ${error.value}")
}

public fun exists(path: Path): Boolean {
    val currentPath = NSBundle.mainBundle.pathForResource(
        path.toString().substringBefore("."),
        path.toString().substringAfterLast(".")
    )

    return currentPath != null
}
