package me.kirkscope.cloud.pipe

enum class AuthenticationType(val headerKey: String, val cookieKey: String) {
    JWT("Authorization: Bearer", ""),
    SKEY("", "skey")
}