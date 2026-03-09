fun main(){
    println("\n==== Coba iterasi yang +1 ====")

    for (i in 1 ..10){
        println("ini angka ke: $i")
    }


    println("\n==== coba iterasi yang -1 ====")
    for (i in 10 downTo 1){

        println("ini angka ke: $i")
    }

    println("\n==== Coba iterasi yang +2 ====")

    for (i in 1 ..10 step 2){
        println("ini angka ke: $i")
    }

    println("\n==== Coba iterasi yang LIST ====")

    val kumpulanBuah = listOf("Apel", "pisang", "semangka")
    for (buah in kumpulanBuah){
        println("- $buah")

    }

    var hitung=1
    while (hitung<=5){
        println("nilai skrg: $hitung")
        hitung++
    }


}