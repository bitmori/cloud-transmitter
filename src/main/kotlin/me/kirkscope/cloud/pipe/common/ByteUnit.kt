package me.kirkscope.cloud.pipe.common

/**
 * Taken from
 * https://github.com/fabian-barney/Utils/blob/master/utils/src/com/barney4j/utils/unit/ByteUnit.java
 *
 * Copyright 2011 Fabian Barney
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @author Fabian Barney
 * @enhancer Kirk Yang
 */
enum class ByteUnit {
    /** <pre>
     * Byte (B)
     * 1 Byte
    </pre> */
    BYTE {
        override fun toBytes(d: Double) = d

        override fun convert(d: Double, u: ByteUnit) = u.toBytes(d)
    },

    /** <pre>
     * Kibibyte (KiB)
     * 2^10 Byte = 1.024 Byte
    </pre> */
    KIB {
        override fun toBytes(d: Double) = d.safeMulti(C_KIB)

        override fun convert(d: Double, u: ByteUnit) = u.toKiB(d)
    },

    /** <pre>
     * Mebibyte (MiB)
     * 2^20 Byte = 1.024 * 1.024 Byte = 1.048.576 Byte
    </pre> */
    MIB {
        override fun toBytes(d: Double) = d.safeMulti(C_MIB)

        override fun convert(d: Double, u: ByteUnit) = u.toMiB(d)
    },

    /** <pre>
     * Gibibyte (GiB)
     * 2^30 Byte = 1.024 * 1.024 * 1.024 Byte = 1.073.741.824 Byte
    </pre> */
    GIB {
        override fun toBytes(d: Double) = d.safeMulti(C_GIB)

        override fun convert(d: Double, u: ByteUnit) = u.toGiB(d)
    },

    /** <pre>
     * Tebibyte (TiB)
     * 2^40 Byte = 1.024 * 1.024 * 1.024 * 1.024 Byte = 1.099.511.627.776 Byte
    </pre> */
    TIB {
        override fun toBytes(d: Double) = d.safeMulti(C_TIB)

        override fun convert(d: Double, u: ByteUnit) = u.toTiB(d)
    },

    /** <pre>
     * Pebibyte (PiB)
     * 2^50 Byte = 1.024 * 1.024 * 1.024 * 1.024 * 1.024 Byte = 1.125.899.906.842.624 Byte
    </pre> */
    PIB {
        override fun toBytes(d: Double) = d.safeMulti(C_PIB)

        override fun convert(d: Double, u: ByteUnit) = u.toPiB(d)
    },

    /** <pre>
     * Exbibyte (EiB)
     * 2^60 Byte = 1.024 * 1.024 * 1.024 * 1.024 * 1.024 * 1.024 Byte = 1.152.921.504.606.846.976 Byte
    </pre> */
    EIB {
        override fun toBytes(d: Double) = d.safeMulti(C_EIB)

        override fun convert(d: Double, u: ByteUnit) = u.toEiB(d)
    },

    /** <pre>
     * Zebibyte (ZiB)
     * 2^70 Byte = 1.024 * 1.024 * 1.024 * 1.024 * 1.024 * 1.024 * 1.024 Byte = 1.180.591.620.717.411.303.424 Byte
    </pre> */
    ZIB {
        override fun toBytes(d: Double) = d.safeMulti(C_ZIB)

        override fun convert(d: Double, u: ByteUnit) = u.toZiB(d)
    },

    /** <pre>
     * Yobibyte (ZiB)
     * 2^80 Byte = 1.024 * 1.024 * 1.024 * 1.024 * 1.024 * 1.024 * 1.024 * 1.024 Byte = 1.208.925.819.614.629.174.706.176 Byte
    </pre> */
    YIB {
        override fun toBytes(d: Double) = d.safeMulti(C_YIB)

        override fun convert(d: Double, u: ByteUnit) = u.toYiB(d)
    },

    /** <pre>
     * Kilobyte (kB)
     * 10^3 Byte = 1.000 Byte
    </pre> */
    KB {
        override fun toBytes(d: Double) = d.safeMulti(C_KB)

        override fun convert(d: Double, u: ByteUnit) = u.toKB(d)
    },

    /** <pre>
     * Megabyte (MB)
     * 10^6 Byte = 1.000.000 Byte
    </pre> */
    MB {
        override fun toBytes(d: Double) = d.safeMulti(C_MB)

        override fun convert(d: Double, u: ByteUnit) = u.toMB(d)
    },

    /** <pre>
     * Gigabyte (GB)
     * 10^9 Byte = 1.000.000.000 Byte
    </pre> */
    GB {
        override fun toBytes(d: Double) = d.safeMulti(C_GB)

        override fun convert(d: Double, u: ByteUnit) = u.toGB(d)
    },

    /** <pre>
     * Terabyte (TB)
     * 10^12 Byte = 1.000.000.000.000 Byte
    </pre> */
    TB {
        override fun toBytes(d: Double) = d.safeMulti(C_TB)

        override fun convert(d: Double, u: ByteUnit) = u.toTB(d)
    },

    /** <pre>
     * Petabyte (PB)
     * 10^15 Byte = 1.000.000.000.000.000 Byte
    </pre> */
    PB {
        override fun toBytes(d: Double) = d.safeMulti(C_PB)

        override fun convert(d: Double, u: ByteUnit) = u.toPB(d)
    },

    /** <pre>
     * Exabyte (EB)
     * 10^18 Byte = 1.000.000.000.000.000.000 Byte
    </pre> */
    EB {
        override fun toBytes(d: Double) = d.safeMulti(C_EB)

        override fun convert(d: Double, u: ByteUnit) = u.toEB(d)
    },

    /** <pre>
     * Zettabyte (ZB)
     * 10^21 Byte = 1.000.000.000.000.000.000.000 Byte
    </pre> */
    ZB {
        override fun toBytes(d: Double) = d.safeMulti(C_ZB)

        override fun convert(d: Double, u: ByteUnit) = u.toZB(d)
    },

    /** <pre>
     * Yottabyte (YB)
     * 10^24 Byte = 1.000.000.000.000.000.000.000.000 Byte
    </pre> */
    YB {
        override fun toBytes(d: Double) = d.safeMulti(C_YB)

        override fun convert(d: Double, u: ByteUnit) = u.toYB(d)
    };


    abstract fun toBytes(d: Double): Double

    fun toKiB(d: Double) = toBytes(d) / C_KIB

    fun toMiB(d: Double) = toBytes(d) / C_MIB

    fun toGiB(d: Double) = toBytes(d) / C_GIB

    fun toTiB(d: Double) = toBytes(d) / C_TIB

    fun toPiB(d: Double) = toBytes(d) / C_PIB

    fun toEiB(d: Double) = toBytes(d) / C_EIB

    fun toZiB(d: Double) = toBytes(d) / C_ZIB

    fun toYiB(d: Double) = toBytes(d) / C_YIB

    fun toKB(d: Double) = toBytes(d) / C_KB

    fun toMB(d: Double) = toBytes(d) / C_MB

    fun toGB(d: Double) = toBytes(d) / C_GB

    fun toTB(d: Double) = toBytes(d) / C_TB

    fun toPB(d: Double) = toBytes(d) / C_PB

    fun toEB(d: Double) = toBytes(d) / C_EB

    fun toZB(d: Double) = toBytes(d) / C_ZB

    fun toYB(d: Double) = toBytes(d) / C_YB

    abstract fun convert(d: Double, u: ByteUnit): Double

    companion object {
        internal val C_KIB = Math.pow(2.0, 10.0)
        internal val C_MIB = Math.pow(2.0, 20.0)
        internal val C_GIB = Math.pow(2.0, 30.0)
        internal val C_TIB = Math.pow(2.0, 40.0)
        internal val C_PIB = Math.pow(2.0, 50.0)
        internal val C_EIB = Math.pow(2.0, 60.0)
        internal val C_ZIB = Math.pow(2.0, 70.0)
        internal val C_YIB = Math.pow(2.0, 80.0)

        internal val C_KB = Math.pow(10.0, 3.0)
        internal val C_MB = Math.pow(10.0, 6.0)
        internal val C_GB = Math.pow(10.0, 9.0)
        internal val C_TB = Math.pow(10.0, 12.0)
        internal val C_PB = Math.pow(10.0, 15.0)
        internal val C_EB = Math.pow(10.0, 18.0)
        internal val C_ZB = Math.pow(10.0, 21.0)
        internal val C_YB = Math.pow(10.0, 24.0)

        private val MAX = Double.MAX_VALUE

        internal fun Double.safeMulti(multi: Double): Double {
            val limit = MAX / multi
            return when {
                this > limit -> Double.MAX_VALUE
                this < -limit -> Double.MIN_VALUE
                else -> this * multi
            }
        }
    }
}