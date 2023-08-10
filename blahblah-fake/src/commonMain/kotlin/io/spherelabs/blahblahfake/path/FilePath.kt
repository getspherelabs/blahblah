package io.spherelabs.blahblahfake.path

enum class FilePath (override val value: String): Path {
    Extension("file.extension"),
    Type("file.mime_type")
}