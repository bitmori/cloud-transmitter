package me.kirkscope.cloud.pipe

import java.io.Closeable

interface ICloudDataPushService<T>: Closeable {
    fun dispatch(data: T)
}