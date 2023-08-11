package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class CreditCardPath(override val value: String) : Path {
    Numbers("credit_card.credit_card_numbers"),
    ExpiryDates("credit_card.credit_card_expiry_dates"),
    Types("credit_card.credit_card_types")
}
