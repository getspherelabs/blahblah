package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.CompanyPath
import io.spherelabs.blahblahfake.provider.Provider
import kotlin.jvm.JvmInline

class CompanyModule(
    private val provider: Provider
) {
    val bs: Bs get() = Bs(provider.get(CompanyPath.Bs))
    val buzzwords: Buzzwords get() = Buzzwords(provider.get(CompanyPath.Buzzwords))
    val industry: Industry get() = Industry(provider.get(CompanyPath.Industry))
    val profession: Profession get() = Profession(provider.get(CompanyPath.Profession))
    val name: Name get() = Name(provider.get(CompanyPath.Name))
}

@JvmInline
value class Bs(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Buzzwords(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Industry(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Profession(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}