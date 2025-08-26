package me.kire.re.oop.classes

@JvmInline
value class Password(private val s: String)

@JvmInline
value class People(private val fullName: String) {
    init {
        require(fullName.isNotEmpty()) {
            "Full name must not be empty"
        }
    }

    constructor(firstName: String, lastName: String) : this("$firstName $lastName") {
        require(lastName.isNotEmpty()) {
            "Last name must not be empty"
        }
    }

    val length: Int
        get() = fullName.length

    fun greet() {
        println("Hello, $fullName!")
    }
}

@JvmInline
value class UInt(val x: Int)

fun compute(x: Int) {
    println("x = $x")
}

fun main() {
    val password = Password("1234")
    println(password)

    val people = People("Kodee")
    val people1 = People("Kodee", "Reeves")
    people.greet()
    println(people1.length)

    val uint = UInt(1)
    compute(uint.x)
}
