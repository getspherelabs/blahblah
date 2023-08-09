package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.CommercePath
import io.spherelabs.blahblahfake.provider.Provider
import kotlin.jvm.JvmInline

class CommerceModule(
    private val provider: Provider
) {
    val department: Department get() = Department(provider.get(CommercePath.Department))
    val product: Product get() = Product(provider)
    val promotionCode: PromotionCode get() = PromotionCode(provider)
}

@JvmInline
value class Department(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}

class Product(
    private val provider: Provider
) {
    val adjective: Adjective get() = Adjective(provider.get(CommercePath.Adjective))
    val material: Material get() = Material(provider.get(CommercePath.Material))
    val self: Self get() = Self(provider.get(CommercePath.Product))
}

@JvmInline
value class Self(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}


@JvmInline
value class Material(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Adjective(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}

class PromotionCode(
    private val provider: Provider
) {
    val adjective: Adjective get() = Adjective(provider.get(CommercePath.PromotionCodeAdj))
    val noun: Noun get() = Noun(provider.get(CommercePath.PromotionCodeNoun))
}


@JvmInline
value class Noun(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}



