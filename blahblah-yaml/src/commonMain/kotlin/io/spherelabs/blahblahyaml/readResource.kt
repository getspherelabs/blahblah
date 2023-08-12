package io.spherelabs.blahblahyaml

import okio.Path

/**
 * Reads the content of a file at the specified path and returns it as a string.
 *
 * @param path The path to the file to be read.
 * @return The content of the file as a string.
 */
internal expect fun readPath(path: Path): String
