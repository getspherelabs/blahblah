package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.InternetPath
import io.spherelabs.blahblahfake.provider.Provider
import kotlin.jvm.JvmInline

class InternetModule(
    private val provider: Provider
) {
    val freeEmail: FreeEmail get() = FreeEmail(provider.get(InternetPath.FreeEmail))
    val safeEmail: SafeEmail get() = SafeEmail(provider.get(InternetPath.SafeEmail))
    val domainSuffix: DomainSuffix get() = DomainSuffix(provider.get(InternetPath.DomainSuffix))
    val avatar: Avatar get() = Avatar(provider.get(InternetPath.Avatar))
    val imageCategory: ImageCategory get() = ImageCategory(provider.get(InternetPath.ImageCategory))
    val imageDimension: ImageDimension get() = ImageDimension(provider.get(InternetPath.ImageDimension))
    val userAgent: UserAgent get() = UserAgent(provider)
}

@JvmInline
value class FreeEmail(
    val value: String
) {
    override fun toString(): String {
       return value
    }
}


@JvmInline
value class SafeEmail(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}


@JvmInline
value class DomainSuffix(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}


@JvmInline
value class Avatar(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class ImageCategory(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class ImageDimension(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}

class UserAgent(
    private val provider: Provider
) {
    val aol: Aol get() = Aol(provider.get(InternetPath.Aol))
    val chrome: Chrome get() = Chrome(provider.get(InternetPath.Chrome))
    val internetExplorer: InternetExplorer get() = InternetExplorer(provider.get(InternetPath.InternetExplorer))
    val opera: Opera get() = Opera(provider.get(InternetPath.Opera))
    val netscape: Netscape get() = Netscape(provider.get(InternetPath.Netscape))
    val safari: Safari get() = Safari(provider.get(InternetPath.Safari))
    val mozilla: Mozilla get() = Mozilla(provider.get(InternetPath.Mozilla))
}

@JvmInline
value class Aol(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Chrome(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class InternetExplorer(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Opera(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Netscape(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Safari(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
value class Mozilla(
    val value: String
) {
    override fun toString(): String {
        return value
    }
}

