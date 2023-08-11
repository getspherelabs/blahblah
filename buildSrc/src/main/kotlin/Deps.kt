object Version {
    const val okioVersion = "3.5.0"
    const val yamlVersion = "0.12.0"
    const val ktlint = "10.3.0"
}

object Deps {
    object IO {
        const val okio = "com.squareup.okio:okio:${Version.okioVersion}"
    }

    object Yaml {
        const val kt = "net.mamoe.yamlkt:yamlkt:${Version.yamlVersion}"
    }
}
