package retos1

fun main() {
    // Ask user for temperature in Fahrenheit
    println("Ingrese la temperatura en grados Fahrenheit: ")
    val fahrenheit = readln()!!.toDouble()
    // Convert Fahrenheit to Celsius
    val celsius = (fahrenheit - 32) / 1.8

    // Print result
    println("La temperatura en grados Celsius es: $celsius")
}
