package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.FilePath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

class FileModule(
    private val provider: Provider
) {
    val extension: Extension get() = Extension(provider.get(FilePath.Extension))
    val type: Type get() = Type(provider.get(FilePath.Type))
}

@JvmInline
value class Extension(private val value: String) {
    override fun toString(): String {
        return value
    }
}

internal fun fileModule(yamlProvider: () -> YamlProvider): FileModule {
    return FileModule(provider = provider {
        type(ProviderType.File)
        yamlProvider(yamlProvider())
    })
}
