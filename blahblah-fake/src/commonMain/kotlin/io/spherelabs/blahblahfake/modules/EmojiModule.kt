package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.EmojiPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider

public class EmojiModule(
    private val provider: Provider
) {
    public val name: Name get() = Name(provider.get(EmojiPath.Emoji))
}

internal fun emojiModule(yamlProvider: () -> YamlProvider): EmojiModule {
    return EmojiModule(
        provider = provider {
            type(ProviderType.Emoji)
            yamlProvider(yamlProvider())
        }
    )
}
