package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.CompanyPath
import io.spherelabs.blahblahfake.provider.Provider
import kotlin.jvm.JvmInline

public class CompanyModule(
    private val provider: Provider
) {
    public val bs: Bs get() = Bs(provider.get(CompanyPath.Bs))
    public val buzzwords: Buzzwords get() = Buzzwords(provider.get(CompanyPath.Buzzwords))
    public val industry: Industry get() = Industry(provider.get(CompanyPath.Industry))
    public val profession: Profession get() = Profession(provider.get(CompanyPath.Profession))
    public val name: Name get() = Name(provider.get(CompanyPath.Name))
}

@JvmInline
public value class Bs(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Buzzwords(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Industry(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Profession(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}
