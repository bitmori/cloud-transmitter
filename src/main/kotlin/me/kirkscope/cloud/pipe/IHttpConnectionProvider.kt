package me.kirkscope.cloud.pipe

import java.io.Closeable
import java.io.IOException
import java.net.URI


interface IHttpConnectionProvider: Closeable {
    val INSTANCE_ID_HEADER: String
        get() = "X-Cloud-Transmitter-Instance-Id"
    val COOKIE_HEADER: String
        get() = "Cookie"

    @Throws(IOException::class)
    fun doJSONDataPost(url: URI, jsonEntity: String): Int
}