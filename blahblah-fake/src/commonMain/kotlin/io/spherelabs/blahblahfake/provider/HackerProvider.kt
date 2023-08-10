package io.spherelabs.blahblahfake.provider

import io.spherelabs.blahblahfake.exception.UnsupportedPathException
import io.spherelabs.blahblahfake.internal.resolver
import io.spherelabs.blahblahfake.path.HackerPath
import io.spherelabs.blahblahfake.path.Path
import io.spherelabs.blahblahyaml.provider.YamlProvider

class HackerProvider(
    private val yamlProvider: YamlProvider
) : Provider {

    override fun get(path: Path): String {
        return when (path) {
            is HackerPath -> resolver { yamlProvider.get(path.value) }
            else -> throw UnsupportedPathException(path)
        }
    }
}