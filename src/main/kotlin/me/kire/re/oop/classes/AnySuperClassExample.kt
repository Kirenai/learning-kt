package me.kire.re.oop.classes

class Persona(val nombre: String) {
    override fun toString(): String {
        return "Nombre: $nombre"
    }
}

fun dameTipo(obj: Any): Any {
    return obj::class.simpleName ?: "Desconocido"
}

fun main() {
    val number: Any = 42
    val numberNull : Any? = null

    println(number)
    println(numberNull)

    val p1: Any = Persona("Kire")
    println(p1)

    println(dameTipo(p1))
}