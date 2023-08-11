package io.spherelabs.blahblahfake.exception

import io.spherelabs.blahblahfake.path.Path

/**
 * [UnsupportedPathException] indicating that a provided path type is unsupported.
 *
 * @param path The unsupported path for which the exception is raised.
 */
internal class UnsupportedPathException(path: Path) : Exception("Unsupported path type: $path")
