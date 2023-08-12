package io.spherelabs.blahblahfake.path

import io.spherelabs.blahblahfake.annotation.BlahBlahInternalApi

@BlahBlahInternalApi
internal enum class BankPath(override val value: String) : Path {
    Name("bank.name"),
    SwiftBic("bank.swift_bic")
}
