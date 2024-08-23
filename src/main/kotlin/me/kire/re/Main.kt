package me.kire.re

import java.util.Scanner
import kotlin.random.Random

fun main() {
    val scanner = Scanner(System.`in`)
    val randomValue = Random.nextInt(0, 100)

    while (true) {
        print("Guess a number between 0 and 100: ")
        val guess = scanner.nextInt()
        if (guess == randomValue) {
            println("You guessed it!")
            break
        } else if (guess < randomValue) {
            println("Too low!")
        } else {
            println("Too high!")
        }
    }
}