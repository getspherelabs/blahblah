package io.spherelabs.blahblahfake.internal

import io.spherelabs.blahblahyaml.parser.yamlParser
import io.spherelabs.blahblahyaml.provider.YamlProvider
import io.spherelabs.blahblahyaml.provider.yamlProvider

/**
 * [BlahBlahConfig] defines configuration options for the BlahBlah instance.
 */
public interface BlahBlahConfig {
    public val locale: String
    public val retryLimit: Int
    public val yamlProvider: YamlProvider
    public val path: String

    /**
     * Builder class for constructing instances of [BlahBlahConfig].
     *
     * @property locale The default locale for the configuration (default is "en").
     * @property retryLimit The retry limit for the configuration (default is 0).
     * @property provider The YAML provider for the configuration.
     * @property path The path for the YAML resource (default is an empty string).
     */
    public data class Builder(
        public var locale: String = "en",
        public var retryLimit: Int = 0,
        public var provider: YamlProvider? = null,
        public var path: String = ""
    )
}

/**
 * [configs] creates and configures a [BlahBlahConfig] instance using a DSL-style configuration.
 *
 * @param builder The DSL block for configuring the [BlahBlahConfig.Builder].
 * @return A configured [BlahBlahConfig] instance.
 */
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
