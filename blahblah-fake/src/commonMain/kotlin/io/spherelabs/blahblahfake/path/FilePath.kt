package io.spherelabs.blahblahfake.path

internal enum class FilePath (override val value: String): Path {
    Extension("file.extension"),
    Type("file.mime_type")
}
