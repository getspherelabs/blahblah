package io.spherelabs.blahblahyaml.parser

import io.spherelabs.blahblahyaml.annotation.YamlParserDsl
import net.mamoe.yamlkt.Yaml

@YamlParserDsl
class YamlParserBuilder(private val yaml: Yaml) {
    var locale: String = "en"
    var resourcePath: String? = null
    var sectionKey: String? = null

    fun build(): YamlParser = DefaultYamlParser(
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

inline fun yamlParser(yaml: Yaml = Yaml(), parserBuilder: YamlParserBuilder.() -> Unit): YamlParser {
    val builder = YamlParserBuilder(yaml)
    builder.parserBuilder()
    return builder.build()
}
