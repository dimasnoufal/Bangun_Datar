fun main() {
    val mainMenu = MainMenu()
    val persegiPanjang = PersegiPanjang()

    println("====================")
    println("Hitung Luas dan Keliling Bangun Datar :")
    println("1. Persegi Panjang")
    println("2. Segitiga Siku")
    println("3. Lingkaran")
    println("Masukan Menu : ")
    val pilihan = readlnOrNull()

    mainMenu.MainMenu(pilihan)

}

