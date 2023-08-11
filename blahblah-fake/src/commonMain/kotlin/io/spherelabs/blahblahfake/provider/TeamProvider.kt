package io.spherelabs.blahblahfake.provider

import io.spherelabs.blahblahfake.exception.UnsupportedPathException
import io.spherelabs.blahblahfake.internal.resolver
import io.spherelabs.blahblahfake.path.Path
import io.spherelabs.blahblahfake.path.TeamPath
import io.spherelabs.blahblahyaml.provider.YamlProvider

internal class TeamProvider(
    private val yamlProvider: YamlProvider
): Provider {

    override fun get(path: Path): String {
        return when(path) {
            is TeamPath -> resolver { yamlProvider.get(path.value) }
            else -> throw UnsupportedPathException(path)
        }
    }
}
