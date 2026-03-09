fun main(){
    println("==== SISTEM PENILAIAN ====")

    print("masukan nama: ")
    val nama = readln()
    print("masukan Nilai UTS (0 - 100) : ")
    val nilaiUTS = readln().toInt()
    print("masukan Nilai UAS (0 - 100) : ")
    val nilaiUAS = readln().toInt()
    print("Masukkan Nilai Tugas (0-100): ")
    val nilaiTugas = readln().toInt()

    println("===== HASIL PENILAIAN =====")

    println("nama\t: $nama")
    println("nilai UTS\t: $nilaiUTS (Bobot 30%)")
    println("nilai UAS\t: $nilaiUAS (Bobot 40%)")
    println("nilai Tugas\t: $nilaiTugas (Bobot 30%)")

    println("-----------------------------")
    val nilaiAkhir: Double = (nilaiUTS * 0.3) + (nilaiUAS * 0.4) + (nilaiTugas * 0.3)
    println("Nilai akhir\t: $nilaiAkhir")


    when(nilaiAkhir){
        in 85.0..100.0 -> println("Grade\t\t: A\nKeterangan\t: Sangat Baik")
        in 70.0..84.0 -> println("Grade\t\t: B\nKeterangan\t:  Baik")
        in 60.0..69.0 -> println("Grade\t\t: C\nKeterangan\t:  Cukup")
        in 50.0..59.0 -> println("Grade\t\t: D\nKeterangan\t:  Kurang")
        in 0.0..49.0 -> println("Grade\t\t: E\nKeterangan\t:  Sangat Kurang ")
    }

    if (nilaiAkhir>= 60){
        println("status\t\t: Lulus")
        println()
        println("Selamat! Anda dinyatakan LULUS")

    }
    else{
        println("status\t\t: Tidak lulus")
        println()
        println("Maaf Anda dinyatakan Tidak ")

    }








}