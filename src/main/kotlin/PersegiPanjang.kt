class PersegiPanjang : BangunDatar {
    override fun luas(s1: Double?, s2: Double?): Double {
        return if (s1 == null || s2 == null) {
            0.0
        } else {
            (s1 * s2)
        }
    }

    override fun keliling(s1: Double?, s2: Double?): Double {
        return if (s1 == null || s2 == null) {
            0.0
        } else {
            (2 * (s1 + s2))
        }

    }
}