package io.spherelabs.blahblahfake.provider

import io.spherelabs.blahblahfake.path.Path

interface Provider {
    fun get(path: Path): String
}