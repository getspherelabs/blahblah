package io.spherelabs.blahblahyaml.provider

import io.spherelabs.blahblahyaml.annotation.YamlProviderDsl
import io.spherelabs.blahblahyaml.internal.DefaultYamlProvider
import io.spherelabs.blahblahyaml.parser.YamlParser


/**
 * [YamlProviderBuilder] creates instances of [YamlProvider] with DSL-style configuration.
 */
@YamlProviderDsl
class YamlProviderBuilder {
    var yamlParser: YamlParser? = null

    fun build(): YamlProvider = DefaultYamlProvider(
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

inline fun yamlProvider(providerBuilder: YamlProviderBuilder.() -> Unit): YamlProvider {
    val builder = YamlProviderBuilder()
    builder.providerBuilder()
    return builder.build()
}
