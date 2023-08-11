package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.FilePath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

public class FileModule(
    private val provider: Provider
) {
    public val extension: Extension get() = Extension(provider.get(FilePath.Extension))
    public val type: Type get() = Type(provider.get(FilePath.Type))
}

@JvmInline
public value class Extension(private val value: String) {
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
