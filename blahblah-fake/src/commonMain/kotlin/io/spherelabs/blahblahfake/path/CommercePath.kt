package io.spherelabs.blahblahfake.path

internal enum class CommercePath(override val value: String) : Path {
    Department("commerce.department"),
    Adjective("commerce.product_name.adjective"),
    Material("commerce.product_name.material"),
    Product("commerce.product_name.product"),
    PromotionCodeAdj("commerce.promotion_code.adjective"),
    PromotionCodeNoun("commerce.promotion_code.noun")
}
