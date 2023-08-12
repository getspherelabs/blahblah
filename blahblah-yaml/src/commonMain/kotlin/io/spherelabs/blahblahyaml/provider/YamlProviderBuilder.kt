package io.spherelabs.blahblahyaml.provider

import io.spherelabs.blahblahyaml.annotation.YamlProviderDsl
import io.spherelabs.blahblahyaml.internal.DefaultYamlProvider
import io.spherelabs.blahblahyaml.parser.YamlParser

/**
 * [YamlProviderBuilder] creates instances of [YamlProvider] with DSL-style configuration.
 */
@YamlProviderDsl
public class YamlProviderBuilder {
    public var yamlParser: YamlParser? = null

    public fun build(): YamlProvider = DefaultYamlProvider(
        yamlParser = checkNotNull(yamlParser) {
            "Yaml parser is not initialized"
        }
    )
}

/**
 * [yamlProvider] builder function for creating a [YamlProvider] instance using a DSL-style configuration.
 *
 * @param providerBuilder DSL block for configuring the [YamlProviderBuilder].
 * @return A configured instance of [YamlProvider].
 */

public inline fun yamlProvider(providerBuilder: YamlProviderBuilder.() -> Unit): YamlProvider {
    val builder = YamlProviderBuilder()
    builder.providerBuilder()
    return builder.build()
}
