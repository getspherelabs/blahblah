package io.spherelabs.blahblahfake.modules

import io.spherelabs.blahblahfake.path.InternetPath
import io.spherelabs.blahblahfake.provider.Provider
import kotlin.jvm.JvmInline

public class InternetModule(
    private val provider: Provider
) {
    public val freeEmail: FreeEmail get() = FreeEmail(provider.get(InternetPath.FreeEmail))
    public val safeEmail: SafeEmail get() = SafeEmail(provider.get(InternetPath.SafeEmail))
    public val domainSuffix: DomainSuffix get() = DomainSuffix(provider.get(InternetPath.DomainSuffix))
    public val avatar: Avatar get() = Avatar(provider.get(InternetPath.Avatar))
    public val imageCategory: ImageCategory get() = ImageCategory(provider.get(InternetPath.ImageCategory))
    public val imageDimension: ImageDimension get() = ImageDimension(provider.get(InternetPath.ImageDimension))
    public val userAgent: UserAgent get() = UserAgent(provider)
}

@JvmInline
public value class FreeEmail(
    private val value: String
) {
    override fun toString(): String {
       return value
    }
}


@JvmInline
public value class SafeEmail(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}


@JvmInline
public value class DomainSuffix(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}


@JvmInline
public value class Avatar(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class ImageCategory(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class ImageDimension(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

public class UserAgent(
    private val provider: Provider
) {
    public val aol: Aol get() = Aol(provider.get(InternetPath.Aol))
    public val chrome: Chrome get() = Chrome(provider.get(InternetPath.Chrome))
    public val internetExplorer: InternetExplorer get() = InternetExplorer(provider.get(InternetPath.InternetExplorer))
    public val opera: Opera get() = Opera(provider.get(InternetPath.Opera))
    public val netscape: Netscape get() = Netscape(provider.get(InternetPath.Netscape))
    public val safari: Safari get() = Safari(provider.get(InternetPath.Safari))
    public val mozilla: Mozilla get() = Mozilla(provider.get(InternetPath.Mozilla))
}

@JvmInline
public value class Aol(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Chrome(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class InternetExplorer(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Opera(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Netscape(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Safari(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

@JvmInline
public value class Mozilla(
    private val value: String
) {
    override fun toString(): String {
        return value
    }
}

