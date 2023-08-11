package io.spherelabs.blahblahfake.modules

import com.benasher44.uuid.uuid4
import kotlin.jvm.JvmInline

public class UuidModule {
    public val uuid: UUID get() = UUID(uuid4().toString())
}

@JvmInline
public value class UUID(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

internal fun uuidModule(): UuidModule {
    return UuidModule()
}
