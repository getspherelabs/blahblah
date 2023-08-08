package io.spherelabs.blahblahfake.path

enum class BankPath(override val value: String): Path {
    Name("bank.name"),
    SwiftBic("bank.swift_bic")
}