package me.kire.re

import me.kire.re.enums.Color
import me.kire.re.enums.Direction
import me.kire.re.enums.IntArithmetics
import me.kire.re.enums.ProtocolState
import me.kire.re.enums.RGB
import me.kire.re.enums.printAllValues
import kotlin.enums.enumEntries

fun main() {
    val direction = Direction.EAST
    println("Direction: $direction")

    val color = Color.RED
    println("Color: $color")

    val protocolState = ProtocolState.WAITING
    println("Initial Protocol State: $protocolState")
    val signal = protocolState.signal()
    println("After signal: $signal")

    val plus = IntArithmetics.PLUS
    val result = plus.applyAsInt( 10, 5)
    println("IntArithmetics PLUS result: $result")

    val times = IntArithmetics.TIMES
    val timesResult = times.applyAsInt( 10, 5)
    println("IntArithmetics TIMES result: $timesResult")

    for(color in RGB.entries) println(color)
    println("The first color is: ${RGB.valueOf("RED")}")

    val enumEntries = enumEntries<RGB>()
    println("Enum entries: $enumEntries")

    printAllValues<RGB>()
}