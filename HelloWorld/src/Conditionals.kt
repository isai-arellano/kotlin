/**
 * CreatedBy: Isaí
 * 24/05/25
 */

fun main(){
    println("Sentencias condicionales: ")
    if (false) println("Condición exitosa")
    if (true) { // Si la condición se cumple(bool) , ejecuta las lineas internas del if
        println("Condición exitosa")
        println("=)")
    }

    println("Operadores de igualdad")
    if(1 == 1)
        println("1 es igual a 1")

    var name = "Isaí"
    if(name.equals("Esther"))
        println("Es igual")

    if(1 == 1){
        println("Es igual")
        if (1 == 2){
            println("No es igual")
        }
    }

    println("Operadores logicos")
    // not ! , Negación: se puede leer cómo: diferente de !=
    if (1 != 2) println("1 es diferente de 2")
    // or || , Uno u Otro: con que una sola opción sea valida, entonces procedemos con la acción.
    if (1 == 1 || 1 != 2) println("Al menos una condición fue valida")
    // and && , Si y solo si, las dos son positivias, entonces procedemos con la acción.
    if (1 == 1 && 1 !=2 ) println("Las dos condiciones son verdaderas")

    println("Operadores de comparación y sentencia if-else")
    val a = 15
    val b = 100
    val c = 15
    if (a > b) { // Si esto se cumple
        println("$a es mayor que $b")
    } else if (a < b) { // O si esto se cumple
        println("$a no es mayor que $b")
    } else { // Si no, entonces
        println("$a es igual que $b")
    }

    if (a >= c) println("$a es mayor o igual que $c")

    println("Sentencia when")
    println("Ingresa tu numero de tarjeta para consultar tu saldo:")
    val card = readln()
    when(card) { // Cuando(when) lo evaluado(card), coincida con alguna opción, ejecuta el código correspondiente ->
        "001" -> println("$10.0 USD")
        "011" -> println("$11.0 USD")
        "201" -> println("$201.0 USD")
        "300",
        "301" -> println("$300.0 USD")
        "320" -> {
            println("$120.0 USD")
            println("$20.0 USD")
        } else -> println("Tarjeta no valida") // Si no coincide con nada, entonces ejecuta el caso else
    }
}