package io.spherelabs.blahblahyaml

data class YamlParam(
    var separator: Int,
    var category: String,
    var check: Boolean,
    var values: LinkedHashMap<String, LinkedHashMap<String, String>>
)

