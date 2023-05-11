import sun.applet.Main

class MainMenu {
    fun MainMenu(pilihan: String?) {

        do {

            println("====================")
            println("Hitung Luas dan Keliling Bangun Datar :")
            println("1. Persegi Panjang")
            println("2. Segitiga Siku")
            println("3. Lingkaran")
            println("Masukan Menu : ")

            var pilihan_ = pilihan
            pilihan_ = readlnOrNull()

            if (pilihan_!!.toInt() > 1) {
                Memilih(pilihan_)
            }
        } while (pilihan_!!.toInt() < 1)


    }

    fun Memilih(pilihan_: String?) {
        var s1: Double?
        var s2: Double?
        val r: Double?
        val inputS1: String?
        val inputS2: String?

        val persegiPanjang = PersegiPanjang()
        val segitigaSiku = SegitigaSiku()
        val lingkaran = Lingkaran()

        when (pilihan_) {
            "1" -> {
                print("Masukan panjang persegi Panjang: ")
                inputS1 = readlnOrNull()
                s1 = if (inputS1 == "") {
                    null
                } else {
                    inputS1?.toDouble()
                }
                print("Masukan lebar persegi: ")
                inputS2 = readlnOrNull()?.trim()
                s2 = if (inputS2 == "") {
                    null
                } else {
                    inputS2?.toDouble()
                }
                println("Luas Persegi Panjang: " + persegiPanjang.luas(s1, s2))
                println("Keliling Persegi Panjang: " + persegiPanjang.keliling(s1, s2))
            }

            "2" -> {
                print("Masukan panjang segitiga: ")
                inputS1 = readlnOrNull()
                s1 = if (inputS1 == "") {
                    null
                } else {
                    inputS1?.toDouble()
                }
                print("Masukan lebar persegi: ")
                inputS2 = readlnOrNull()?.trim()
                s2 = if (inputS2 == "") {
                    null
                } else {
                    inputS2?.toDouble()
                }
                println("Luas segitiga Siku: " + segitigaSiku.luas(s1, s2))
                println("Keliling segitiga Siku: " + segitigaSiku.keliling(s1, s2))
            }

            "3" -> {
                print("Masukan jari-jari lingkaran: ")
                inputS1 = readlnOrNull()
                r = if (inputS1 == "") {
                    null
                } else {
                    inputS1?.toDouble()
                }
                println("Luas lingkaran: " + lingkaran.luas(r))
                println("Keliling lingkaran: " + lingkaran.keliling(r))
            }

            else -> println("Tidak ada pilihan")
        }

    }
}