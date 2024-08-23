package me.kire.re.oop.inheritance

open class Base(val p: Int) {
    override fun toString(): String {
        return "Base(p=$p)"
    }
}

class Derived(p: Int) : Base(p)

fun main() {
    val derived: Base = Derived(10)
    println(derived)
}