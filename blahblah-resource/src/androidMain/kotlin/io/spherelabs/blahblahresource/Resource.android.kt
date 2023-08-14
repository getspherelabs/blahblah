package io.spherelabs.blahblahresource

import java.nio.charset.Charset

public actual class Resource {
    public actual fun read(path: String): String {
        return Resource::class.java.getResourceAsStream(path).use {
            it.readBytes().toString(Charset.defaultCharset())
        }
    }
}
