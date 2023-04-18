class Lingkaran : BangunDatar {

    private val pi: Double = 3.1415

    override fun luas(s1: Double?, s2: Double?): Double {
        return 0.0
    }

    override fun keliling(s1: Double?, s2: Double?): Double {
        return 0.0
    }

    fun luas(r: Double?): Double {
        return if (r == null) {
            0.0
        } else {
            (pi * r * r)
        }
    }

    fun keliling(r: Double?): Double {
        return if (r == null) {
            0.0
        } else {
            (2 * pi * r)
        }
    }

}