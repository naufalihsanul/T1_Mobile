fun main(){
    val umur = 21


    if (umur <= 20){
        println("masih di bawah umur y")

    }
    else{
        println("kerja woii")
    }

    println("bisa")



    val hari = 3;

    when (hari){
            1->println("hari senin")
            2->println("hari selasa")
            3->println("hari rabu")
            4->println("hari kamis")
            5->println("hari jumat")
            6->println("hari sabtu")
            7->println("hari minggu")
        else -> println("tidak valid")
    }

    val nilaiSaya = readln().toIntOrNull()

    when (nilaiSaya){
        in 85..100->println("nilai kamu A")
        in 70..84->println("nilai kamu B")
        in 50..59->println("nilai kamu C")
        in 0..49->println("nilai kamu E")
        else -> println("tidak valid")
    }
}