package me.kire.re.oop.statics

class MyClass {
    override fun toString(): String {
        return "MyClass"
    }

    companion object {
        const val SOME_PROPERTY = 6
        fun create(): MyClass = MyClass()
    }

}

class MyClassCompanion {
    override fun toString(): String {
        return "MyClassCompanion"
    }

    companion object Factory {
        fun create(): MyClassCompanion = MyClassCompanion()
    }
}

fun main() {
    println("Companion object without name")
    val create = MyClass.create()
    println(create)
    println(MyClass.SOME_PROPERTY)

    println("Companion object with name")
    val obj = MyClassCompanion.create()
    println(obj)
}