@file:OptIn(ExperimentalForeignApi::class)

package io.spherelabs.blahblahresource

import kotlinx.cinterop.BetaInteropApi
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.ObjCObjectVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.value
import platform.Foundation.NSBundle
import platform.Foundation.NSError
import platform.Foundation.NSString
import platform.Foundation.NSUTF8StringEncoding
import platform.Foundation.stringWithContentsOfFile

public actual class Resource {

    @OptIn(ExperimentalForeignApi::class, BetaInteropApi::class)
    public actual fun read(path: String): String = memScoped {
        memScoped {
            println("Ios Path: $path")

            val pathParts = path.split("[.|/]".toRegex())

            val currentPath = NSBundle.mainBundle.pathForResource(
                pathParts[1],
                pathParts[2]
            ) ?: throw IllegalArgumentException("$path: No such file or directory")

            val error = alloc<ObjCObjectVar<NSError?>>()
            NSString.stringWithContentsOfFile(currentPath, NSUTF8StringEncoding, error.ptr)
                ?: throw IllegalArgumentException("$path: Read failed: ${error.value}")
        }
    }
}
