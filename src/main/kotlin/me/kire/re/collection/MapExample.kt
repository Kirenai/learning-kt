package me.kire.re.collection

fun main() {
    println("Map:")
    val pair = Pair("1", "One")
    val pair2 = Pair("2", "Two")
    val values = mapOf(pair, pair2)
    values.forEach { (key, value) -> println("$key -> $value") }

    println("Mutable map:")
    val mutableValues = mutableMapOf("1" to "One", "2" to "Two")
    mutableValues["3"] = "Three"
    mutableValues.forEach { (key, value) -> println("$key -> $value") }
}
