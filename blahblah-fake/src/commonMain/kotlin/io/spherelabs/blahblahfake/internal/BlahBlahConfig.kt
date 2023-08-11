package io.spherelabs.blahblahfake.internal

import io.spherelabs.blahblahyaml.parser.yamlParser
import io.spherelabs.blahblahyaml.provider.YamlProvider
import io.spherelabs.blahblahyaml.provider.yamlProvider


public interface BlahBlahConfig {
    public val locale: String
    public val retryLimit: Int
    public val yamlProvider: YamlProvider
    public val path: String

    public data class Builder(
        public var locale: String = "en",
        public var retryLimit: Int = 0,
        public var provider: YamlProvider? = null,
        public var path: String = ""
    )
}

public inline fun configs(builder: BlahBlahConfig.Builder.() -> Unit): BlahBlahConfig {
    val config = BlahBlahConfig.Builder().apply(builder)

    return object : BlahBlahConfig {
        override val locale: String = config.locale
        override val retryLimit: Int = config.retryLimit
        override val path: String = config.path

        override val yamlProvider: YamlProvider = yamlProvider {
            yamlParser = yamlParser {
                locale = config.locale
                resourcePath { config.path }
                sectionKey = "blah-blah"
            }
        }
    }
}
