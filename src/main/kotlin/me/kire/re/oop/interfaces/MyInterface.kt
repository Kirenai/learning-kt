package me.kire.re.oop.interfaces

interface MyInterface {
    fun bar()

    fun foo() {
        println("foo in MyInterface")
    }
}

class Child : MyInterface {
    override fun bar() {
        println("bar in Child")
    }

}

fun main() {
    val myInterface = Child()
    myInterface.bar()
    myInterface.foo()
}