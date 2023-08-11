package io.spherelabs.blahblahfake.internal

public fun blahBlah(
    newLocale: String = "en",
    resourcePath: () -> String = { "src/commonTest/resources/en.yml" }
): BlahBlah {
    return DefaultBlahBlah(
        configuration = configs {
            locale = newLocale
            path = resourcePath.invoke()
        }
    )
}
