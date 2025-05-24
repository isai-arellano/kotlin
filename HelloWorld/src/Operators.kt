/**
 * CreatedBy: Isaí
 * 19/05/25
 */

fun main(){ // Cualquier número puede ser convertirlo en otro tipo de número, enteros o decimales.
    println("Conversiones de números: ")
    val a: Byte = 10
    val b: Int = 5
    val c: Long = 20L
    var result: Long = a.toLong()
    println(result)

    val d: Double = 12.54
    result = d.toLong()
    println(result)
    println(a.toFloat())

    val numText: String = "5.5" // Estos se pueden convertir mientras el valor sea compatible
    println(numText.toFloat())

    println("Operadores matemáticos: \nInserte un número:")
    val x = readln()
    println("Inserte otro número: ")
    val y = readln()

    var numX = x.toInt()
    val numY = y.toInt()

    println("x + y = ${numX + numY}") // Suma
    println("x - y = ${numX - numY}") // Resta
    println("x * y = ${numX * numY}") // Multiplicación
    println("x / y = ${numX / numY}") // División
    println("x % y = ${numX % numY}") // Módulo (lo que queda después de la división)

    println("Operadores con tareas aumentadas: ")
    //numX = numX + numY
    numX += numY // Es lo mismo que la línea de arriba se puede usar con cualquier operador
    println("x + y = $numX")

}