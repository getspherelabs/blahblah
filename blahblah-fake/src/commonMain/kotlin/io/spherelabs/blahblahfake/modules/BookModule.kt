package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.BookPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider
import kotlin.jvm.JvmInline

public class BookModule(
    private val provider: Provider
) {
    public val title: Title get() = Title(provider.get(BookPath.Title))
    public val author: Author get() = Author(provider.get(BookPath.Author))
    public val publisher: Publisher get() = Publisher(provider.get(BookPath.Publisher))
    public val genre: Genre get() = Genre(provider.get(BookPath.Genre))
}

@JvmInline
public value class Title(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Publisher(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Genre(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

internal fun bookModule(yamlProvider: () -> YamlProvider): BookModule {
    return BookModule(
        provider = provider {
            type(ProviderType.Book)
            yamlProvider(yamlProvider())
        }
    )
}
