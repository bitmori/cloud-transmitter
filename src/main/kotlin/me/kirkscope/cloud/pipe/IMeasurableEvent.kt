package me.kirkscope.cloud.pipe

interface IMeasurableEvent<out K, out V>: Map.Entry<K, V> {
    val length: Int
}