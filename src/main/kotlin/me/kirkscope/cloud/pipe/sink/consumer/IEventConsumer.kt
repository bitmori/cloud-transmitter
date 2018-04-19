package me.kirkscope.cloud.pipe.sink.consumer

import java.io.Closeable

interface IEventConsumer<in T> : Closeable {
    fun receive(event: T)
}

interface IFallibleConsumer<in T> : Closeable {
    fun receive(events: Collection<T>): Boolean
}

interface IFlushableConsumer<in T> : IEventConsumer<T> {
    fun flush()
}