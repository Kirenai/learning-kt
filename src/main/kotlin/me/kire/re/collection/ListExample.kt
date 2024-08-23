package me.kire.re.collection

fun main() {
    println("mutableList")
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.add(6)
    mutableList.forEach { println(it) }

    println("unMutableList")
    val unMutableList = listOf(1, 2, 3, 4, 5)
    unMutableList.forEach { println(it) }
}