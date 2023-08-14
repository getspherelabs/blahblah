package io.spherelabs.blahblahresource

import kotlinx.cinterop.ObjCObjectVar

public actual class Resource {
    public actual fun read(path: String): String {
        val pathParts = path.toString().split("[.|/]".toRegex())

        val currentPath = NSBundle.mainBundle.pathForResource(
            "${pathParts[2]}",
            pathParts[3]
        ) ?: throw IllegalArgumentException("$path: No such file or directory")

        val error = alloc<ObjCObjectVar<NSError?>>()
        NSString.stringWithContentsOfFile(currentPath, NSUTF8StringEncoding, error.ptr)
            ?: throw IllegalArgumentException("$path: Read failed: ${error.value}")
    }
}
