package me.kire.re.oop.classes

class Person(val name: String, val age: Int)

fun Person.isAdult() = age >= 18

val Person.document: String
    get() = "Name: $name, Age: $age, Adult: ${this.isAdult()}"

fun main() {
    val person = Person("Alice", 25)
    println("Is ${person.name} an adult? ${person.isAdult()}")
    println("Name: ${person.name}, Age: ${person.age}")
    println(person.document)
}