package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.CreditCardPath
import io.spherelabs.blahblahfake.provider.Provider
import kotlin.jvm.JvmInline

class CreditCardModule(
    private val provider: Provider
) {
    val numbers: Numbers get() = Numbers(provider.get(CreditCardPath.Numbers))
    val expiryDates: ExpiryDates get() = ExpiryDates(provider.get(CreditCardPath.ExpiryDates))
    val types: Types get() = Types(provider.get(CreditCardPath.Types))
}

@JvmInline
value class Numbers(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class ExpiryDates(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Types(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}