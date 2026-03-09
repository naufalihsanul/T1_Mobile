fun main(){
    println("==== LIST =====\n")

    println("=== Immutable list ===")
//    ini gabisa dia kalo pake listOf , solusinya pakai mutableListOf
    val fruits = listOf("apple","banana", "orange", "manggo")

    val kumpulanBuah = mutableListOf("apple", "banana")
    println("initial: $kumpulanBuah")

    kumpulanBuah.add("mangga")
    println("intial: $kumpulanBuah")

    kumpulanBuah.add(1,"semangka")
    println("intial: $kumpulanBuah")

    kumpulanBuah[0] = "kiwi"
    println("intial: $kumpulanBuah")

    kumpulanBuah.remove("banana")
    println("intial: $kumpulanBuah")

    kumpulanBuah.removeAt(2)
    println("intial: $kumpulanBuah")


    for ((index,fruit) in fruits.withIndex()){
        println("${index+1}: $fruit")

    }




}