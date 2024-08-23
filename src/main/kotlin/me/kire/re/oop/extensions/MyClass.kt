package me.kire.re.oop.extensions

class MyClass {
    companion object
}

fun MyClass.sum(a: Int, b: Int): Int {
    return a + b
}

val MyClass.field: Int
    get() = 42

fun MyClass.Companion.printCompanion() {
    println("Companion")
}

fun main() {
    MyClass.printCompanion()
    val myClass = MyClass()
    println(myClass.sum(1, 2))
    println(myClass.field)
}