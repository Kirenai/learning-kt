package me.kire.re.arrays

fun main() {
    val miArray = Array(5) { 15 }

//    miArray[2] = 7

    val miArray2 = intArrayOf(1, 7, 9, 25)

    lateinit var miArray3: Array<String>

    println(miArray[2])
    println(miArray.joinToString())

    println(miArray2.joinToString())

    miArray3 = arrayOf("Hola", "Mundo", "Desde", "Kotlin")

    println(miArray3.joinToString())

    val stringNumeros = arrayOf("5", "10", "15", "20")
    val numeros = stringNumeros.map { it.toInt() }.toIntArray()
    val suma = numeros.sum()

    println("Has introducido ${numeros.size} números")

    for (numero in numeros) {
        println("Número: $numero")
    }
}