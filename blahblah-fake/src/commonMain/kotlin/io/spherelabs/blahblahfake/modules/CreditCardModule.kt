package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.CreditCardPath
import io.spherelabs.blahblahfake.provider.Provider
import kotlin.jvm.JvmInline

public class CreditCardModule(
    private val provider: Provider
) {
    public val numbers: Numbers get() = Numbers(provider.get(CreditCardPath.Numbers))
    public val expiryDates: ExpiryDates get() = ExpiryDates(provider.get(CreditCardPath.ExpiryDates))
    public val types: Types get() = Types(provider.get(CreditCardPath.Types))
}

@JvmInline
public value class Numbers(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class ExpiryDates(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Types(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}
