/**
 * CreatedBy: Isaí
 * 16/05/25
 */

fun main(){
    println("BOOLEANS: ") // Tipo boolean = 1 bit, verdadero(1) o falso(0).
    val imIsai: Boolean = true
    println("Soy Isaí")
    println(imIsai)

    val imChinese: Boolean = false
    println("Soy de China")
    println(imChinese)

    println("ENTEROS: ")
    val jobs: Byte = 3 // -128 - 127
    println("Trabajos: ")
    println(jobs)
    val maxValueByte = Byte.MAX_VALUE
    val minValueByte = Byte.MIN_VALUE

    val daysWorker: Short = 500 // -32768 - 32767
    println("Días trabajados: ")
    println(daysWorker)
    val maxValueShort = Short.MAX_VALUE
    val minValueShort = Short.MIN_VALUE

    val minutesWorker: Int = 300_430
    println("Minutos trabajados: ")
    println(minutesWorker)
    val maxValueInt = Int.MAX_VALUE
    val minValueInt = Int.MIN_VALUE

    val secondsWorker: Long = 200_000_000_000L
    println("Segundos trabajados: ")
    println(secondsWorker)
    val maxValueLong = Long.MAX_VALUE
    val minValueLong = Long.MIN_VALUE

    println("DECIMALES: ")
    val stature: Float = 1.60f
    println("Estatura")
    println(stature)
    val maxValueFloat = Float.MAX_VALUE
    val minValueFloat = Float.MIN_VALUE

    val actualHeight: Double = 1.603_333_333
    println("Estatura real: ")
    println(actualHeight)
    val maxValueDouble = Float.MAX_VALUE
    val minValueDouble = Float.MIN_VALUE

    println("TEXTOS: ")
    val initial1: Char = 'I'
    val initial2: Char = 'A'
    val caseSpecial: Char = '\n' // No permite mas de una letra
    print(initial1)
    print(initial2)
    print(caseSpecial)

    val initials: String = "IA"
    print(initials)

    val casesSpecials: String = "\tI\'A'\\" // Diagonal invertida indica que sigue un caso especial
    println(casesSpecials)

    println("Entrada de datos (readline) ")
    val name = readln() // Entrada estandar de datos
    println(name)
    println("Concatenación:")
    println("Hola " + name + "!") // Juntar cadenas de caracteres

    println("String TEMPLATES: ")
    println("Hola $name") // Nos sirve para concatenar sin tener que poner los simbolos +
    val nameLenght = name.length
    println("Longitud de nombre: $nameLenght")
    println("Longitud de nombre: ${name.length}") // Se puede acceder a propiedades o funciones con {}

    println("Multiline String: ") // Raw String - Sirve para concatenar strings de forma organizada
    val multiLines: String = """
        Hola estoy "escribiendo"
            con sangría!
    """
    println(multiLines)


    println("Nulos en Kotlin: ")
    var earnings: Int? = null // Siempre que algo puede ser nulo , debe ser marcado con su signo "?"
    println("Salario: $earnings")
    var userName: String? = "Isaí"
    userName = null // Utilizando ? , le decimos a Kotlin que lo que viene despues de ? , posiblemente sea null, esto para que Kotlin tome sus precaucones
    println("Longitud de nombre de usuario con ? : ${userName?.length}")


    val randomUserName: String? = "Isaiii"
    userName = randomUserName!! // Utilizando !!, le decimos a Kotlin que estamos seguros que viene un dato (esto es responsabilidad de nosotros asegurarnos que no venga en null
    println("Longitud de nombre de usuario con !! : ${userName.length}")


    println("Operador Elvis: ") // ? : = Si lo que esta a la izquierda del ?: no es null, entonces ocupalo , de lo contrario utiliza el valor despues del operador elvis.
    var programmingLanguage: String? = "Kotlin"
    programmingLanguage = null
    val defaultProgrammingLanguage = "Swift"
    println("Yo programo en : ${programmingLanguage ?: defaultProgrammingLanguage}")







}