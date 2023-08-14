package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.FriendsPath
import io.spherelabs.blahblahfake.provider.Provider
import io.spherelabs.blahblahfake.provider.ProviderType
import io.spherelabs.blahblahfake.provider.provider
import io.spherelabs.blahblahyaml.provider.YamlProvider

public class FriendsModule(
    private val provider: Provider
) {
    public val character: Character get() = Character(provider.get(FriendsPath.Character))
    public val location: Location get() = Location(provider.get(FriendsPath.Location))
    public val quote: Quote get() = Quote(provider.get(FriendsPath.Quotes))
}

internal fun friendsModule(yamlProvider: () -> YamlProvider): FriendsModule {
    return FriendsModule(
        provider = provider {
            type(ProviderType.Friends)
            yamlProvider(yamlProvider())
        }
    )
}
