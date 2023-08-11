package io.spherelabs.blahblahfake.path

internal enum class IdNumberPath (override val value: String): Path {
    Valid("id_number.valid"),
    Invalid("id_number.invalid")
}
