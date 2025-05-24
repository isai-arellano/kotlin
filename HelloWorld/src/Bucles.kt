/**
* CreatedBy: Isaí
* 24/05/25
*/

fun main(){
    println("Bucles")
    println("For") // for : Por cada elemento haz algo.
    for (i in 1..5){
        println(i)
    }
    for (i in 1..8 step 2){
        println("step 2 $i")
    }

    val volwels: String = "aeiou"
    for (i in 0..volwels.length - 1){
        println("$i = ${volwels.get(i)}")
    }

    for (volwel in volwels){
        println(volwel)
    }

    println("Operadores de incremento")
    val name: String = "Isaí"
    var lengthName: Int = 0
    var balance: Int = 100
    for(word in name) {
        println(word)
        lengthName++ // Esto es igual que la linea 31
        // lengthName = lengthName + 1
        balance--

    }
    println("Longitud de nombre: $lengthName")
    println("Saldo: $balance")
}