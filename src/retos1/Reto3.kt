package retos1

fun main() {
    // Mostrar menú de opciones
    println("**Calculadora**")
    println("1. Suma")
    println("2. Resta")
    println("3. Multiplicación")
    println("4. División")
    println("5. Salir")

    // Pedir al usuario que elija una opción
    print("Seleccione una opción: ")
    val opcion = readln()!!.toInt()

    // Leer los números
    var num1: Double = 0.0
    var num2: Double = 0.0
    if (opcion != 5) {
        print("Ingrese el primer número: ")
        num1 = readln()!!.toDouble()
        print("Ingrese el segundo número: ")
        num2 = readln()!!.toDouble()
    }

    // Realizar la operación según la opción elegida
    var resultado: Double
    when (opcion) {
        1 -> {
            resultado = num1 + num2
            println("La suma es: $resultado")
        }
        2 -> {
            resultado = num1 - num2
            println("La resta es: $resultado")
        }
        3 -> {
            resultado = num1 * num2
            println("La multiplicación es: $resultado")
        }
        4 -> {
            if (num2 == 0.0) {
                println("No se puede dividir por cero")
            } else {
                resultado = num1 / num2
                println("La división es: $resultado")
            }
        }
        5 -> println("¡Hasta luego!")
        else -> println("Opción no válida")
    }
}
