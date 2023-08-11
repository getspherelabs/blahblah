package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class CatPath (override val value: String): Path {
    Name("cat.name"),
    Breed("cat.breed"),
    Registry("cat.registry")
}
