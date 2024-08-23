package me.kire.re.oop.interfaces.sam

fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

typealias DoublePredicate = (i: Double) -> Boolean

fun main() {
    val isEventWithoutSam = object : IntPredicate {
        override fun accept(i: Int): Boolean {
            return i % 2 == 0
        }
    }

    val isEventLambda = IntPredicate { it % 2 == 0 }

    println("Is 2 even? ${isEventWithoutSam.accept(2)}")
    println("Is 3 even? ${isEventLambda.accept(3)}")

    val isPositiveDouble: DoublePredicate = { it > 0 }

    println("Is 2.0 positive? ${isPositiveDouble(2.0)}")
}