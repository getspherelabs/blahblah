package io.spherelabs.blahblahyaml.provider

import io.spherelabs.blahblahyaml.annotation.YamlProviderDsl
import io.spherelabs.blahblahyaml.parser.YamlParser


@YamlProviderDsl
class YamlProviderBuilder {
    var yamlParser: YamlParser? = null

    fun build(): YamlProvider = DefaultYamlProvider(
        yamlParser = checkNotNull(yamlParser) {
            "Yaml parser is not initialized"
        }
    )
}

inline fun yamlProvider(providerBuilder: YamlProviderBuilder.() -> Unit): YamlProvider {
    val builder = YamlProviderBuilder()
    builder.providerBuilder()
    return builder.build()
}