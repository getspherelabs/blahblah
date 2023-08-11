package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.CommercePath
import io.spherelabs.blahblahfake.provider.Provider
import kotlin.jvm.JvmInline

public class CommerceModule(
    private val provider: Provider
) {
    public val department: Department get() = Department(provider.get(CommercePath.Department))
    public val product: Product get() = Product(provider)
    public val promotionCode: PromotionCode get() = PromotionCode(provider)
}

@JvmInline
public value class Department(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

public class Product(
    private val provider: Provider
) {
    public val adjective: Adjective get() = Adjective(provider.get(CommercePath.Adjective))
    public val material: Material get() = Material(provider.get(CommercePath.Material))
    public val self: Self get() = Self(provider.get(CommercePath.Product))
}

@JvmInline
public value class Self(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}


@JvmInline
public value class Material(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Adjective(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

public class PromotionCode(
    private val provider: Provider
) {
    public val adjective: Adjective get() = Adjective(provider.get(CommercePath.PromotionCodeAdj))
    public val noun: Noun get() = Noun(provider.get(CommercePath.PromotionCodeNoun))
}


@JvmInline
public value class Noun(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}



