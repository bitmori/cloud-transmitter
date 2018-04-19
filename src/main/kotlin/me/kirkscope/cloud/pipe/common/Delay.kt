package me.kirkscope.cloud.pipe.common

import java.util.concurrent.TimeUnit
import java.util.regex.Pattern

class Delay private constructor(val delay: Int, val unit: TimeUnit){
    companion object {
        fun of(delay: Int, unit: TimeUnit) = Delay(delay, unit)
        fun of(input: String): Delay {
            val str = input.trim().replace(',', '.')
            val millis = str.toIntOrNull()
            if (millis != null) {
                return of(millis, TimeUnit.MILLISECONDS)
            }
            val m = Pattern.compile("([\\d.,]+)\\s*(\\w)").matcher(str).apply { find() }
            val ch = m.group(2)[0].toLowerCase()
            if (timeUnitMap[ch] != null) {
                val unit = timeUnitMap[ch]!!
                val size = m.group(1).toInt()
                return of(size, unit)
            }
            throw IllegalArgumentException()
        }

        private val timeUnitMap = mapOf('h' to TimeUnit.HOURS, 'm' to TimeUnit.MINUTES, 's' to TimeUnit.SECONDS)
    }
}