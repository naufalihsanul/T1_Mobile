import java.text.NumberFormat

fun namaOrang(a: String) {
    println("hai $a")
}

fun main(){
    val nama: String = "nopal"
    val umur:Int = 21
    val alamat: String = "jln sunan giri 4 g 20"

    println("nama saya adalah: $nama")
    println("umur saya sekarang: $umur")
    println("dan saya tinggal di: $alamat")

    namaOrang("alya")

//    var itu bisa di ganti atau di timpa sedangkan val gabisa
    var nama_orang: String

    nama_orang = "dias"
    println("sekarang namanya $nama_orang")


    val harga: Int = 15_000
    val jumlahBarang: Int = 5;

    var totalHarga : Int = harga * jumlahBarang

    println("total yang harus kamu bayar: ${NumberFormat.getNumberInstance().format(totalHarga)}")


}