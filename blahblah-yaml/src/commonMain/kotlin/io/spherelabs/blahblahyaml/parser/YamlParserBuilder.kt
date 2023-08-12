package io.spherelabs.blahblahyaml.parser

import io.spherelabs.blahblahyaml.annotation.YamlParserDsl
import io.spherelabs.blahblahyaml.internal.DefaultYamlParser
import net.mamoe.yamlkt.Yaml


/**
 * [YamlParserBuilder] for creating instances of [YamlParser] with configurable options.
 *
 * @param yaml The YAML parser instance used for decoding YAML content.
 * @property locale The desired locale for extracting values from the YAML content.
 */
@YamlParserDsl
public class YamlParserBuilder(private val yaml: Yaml) {
    private var resourcePath: String? = null

    public var locale: String = "en"
    public var sectionKey: String? = null

    /**
     * Sets the resource path for the YAML file.
     *
     * @param path A function providing the resource path.
     */
    public  fun resourcePath(path: () -> String) {
        resourcePath = path.invoke()
    }

    /**
     * [build] is a function that builds and returns an instance of [YamlParser]
     * with the configured options.
     *
     * @return A configured instance of [YamlParser].
     * @throws IllegalStateException if the resource path or section key is not initialized.
     */
    public fun build(): YamlParser = DefaultYamlParser(
        yaml = yaml,
        locale = locale,
        path = checkNotNull(resourcePath) {
            "Path is not initialized."
        },
        sectionKey = checkNotNull(sectionKey) {
            "Section key is not initialized."
        }
    )
}


/**
 * [yamlParser] builder function creates a [YamlParser] instance using a DSL-style configuration.
 *
 * @param yaml The YAML parser instance used for decoding YAML content.
 * @param parserBuilder DSL block for configuring the [YamlParserBuilder].
 * @return A configured instance of [YamlParser].
 */
public inline fun yamlParser(
    yaml: Yaml = Yaml(),
    parserBuilder: YamlParserBuilder.() -> Unit
): YamlParser {
    val builder = YamlParserBuilder(yaml).also(parserBuilder)
    return builder.build()
}
