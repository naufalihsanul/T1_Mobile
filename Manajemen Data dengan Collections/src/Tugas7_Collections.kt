data class NilaiMahasiswa(
    val nim: String,
    val nama: String,
    val mataKuliah: String,
    val nilai: Int
)

fun main() {
    val daftarMahasiswa = listOf(
        NilaiMahasiswa("2024001", "Budi Santoso", "Pemrograman", 85),
        NilaiMahasiswa("2024002", "Ani Wijaya", "Pemrograman", 92),
        NilaiMahasiswa("2024003", "Citra Dewi", "Pemrograman", 68),
        NilaiMahasiswa("2024004", "Dani Pratama", "Pemrograman", 45),
        NilaiMahasiswa("2024005", "Eka Putri", "Pemrograman", 78),
        NilaiMahasiswa("2024006", "Fajar Ramadhan", "Pemrograman", 88),
        NilaiMahasiswa("2024007", "Gita Permata", "Pemrograman", 72),
        NilaiMahasiswa("2024008", "Hadi Saputra", "Pemrograman", 55),
        NilaiMahasiswa("2024009", "Indah Lestari", "Pemrograman", 80),
        NilaiMahasiswa("2024010", "Joko Susilo", "Pemrograman", 63)
    )

    println("===== DATA NILAI MAHASISWA =====")
    for (mhs in daftarMahasiswa) {
        println("${mhs.nim} | ${mhs.nama} | ${mhs.nilai}")
    }

    val rataRata = daftarMahasiswa.map { it.nilai }.average()
    val tertinggi = daftarMahasiswa.maxByOrNull { it.nilai }
    val terendah = daftarMahasiswa.minByOrNull { it.nilai }

    println("\n===== STATISTIK =====")
    println("Total Mahasiswa : ${daftarMahasiswa.size}")
    println("Rata-rata Nilai : $rataRata")
    println("Nilai Tertinggi : ${tertinggi?.nilai} (${tertinggi?.nama})")
    println("Nilai Terendah  : ${terendah?.nilai} (${terendah?.nama})")

    println("\n===== MAHASISWA LULUS (>= 70) =====")
    val lulus = daftarMahasiswa.filter { it.nilai >= 70 }
    for (mhs in lulus) {
        println("${mhs.nama} - ${mhs.nilai}")
    }

    println("\n===== MAHASISWA TIDAK LULUS (< 70) =====")
    val tidakLulus = daftarMahasiswa.filter { it.nilai < 70 }
    for (mhs in tidakLulus) {
        println("${mhs.nama} - ${mhs.nilai}")
    }

    println("\n===== URUTAN NILAI TERBESAR =====")
    val urutBesar = daftarMahasiswa.sortedByDescending { it.nilai }
    for (mhs in urutBesar) {
        println("${mhs.nama}: ${mhs.nilai}")
    }

    println("\n===== JUMLAH PER GRADE =====")
    val gradeA = daftarMahasiswa.filter { it.nilai >= 85 }.size
    val gradeB = daftarMahasiswa.filter { it.nilai in 75..84 }.size
    val gradeC = daftarMahasiswa.filter { it.nilai in 65..74 }.size
    val gradeD = daftarMahasiswa.filter { it.nilai in 50..64 }.size
    val gradeE = daftarMahasiswa.filter { it.nilai < 50 }.size

    println("Grade A: $gradeA mahasiswa")
    println("Grade B: $gradeB mahasiswa")
    println("Grade C: $gradeC mahasiswa")
    println("Grade D: $gradeD mahasiswa")
    println("Grade E: $gradeE mahasiswa")

    println("\n===== CARI MAHASISWA (Nama: Ani) =====")
    val cari = daftarMahasiswa.filter { it.nama.contains("Ani") }
    for (mhs in cari) {
        println("Ditemukan: ${mhs.nama} dengan nilai ${mhs.nilai}")
    }
}