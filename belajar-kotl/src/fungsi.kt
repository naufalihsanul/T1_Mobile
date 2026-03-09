fun sayHello (){
    println("hey")
}

fun sapaGw(namanya: String){
    println("haloooo $namanya")
}

fun tambah(a: Int, b: Int): Int{
    return a+b;
}


fun main(){
    sayHello()
    sapaGw("nopal")
    val nilai = tambah(5,4)
    println(nilai)
}