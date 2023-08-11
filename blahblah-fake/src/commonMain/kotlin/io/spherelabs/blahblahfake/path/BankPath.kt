package io.spherelabs.blahblahfake.path

internal enum class BankPath(override val value: String): Path {
    Name("bank.name"),
    SwiftBic("bank.swift_bic")
}
