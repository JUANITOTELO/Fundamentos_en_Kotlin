package retos1

fun main() {
    // Solicitar peso del bebé
    print("Ingrese el peso del bebé en kilogramos: ")
    val pesoBebe = readln()!!.toDouble()

    // Solicitar edad del bebé
    print("Ingrese la edad del bebé en meses: ")
    val edadBebe = readln()!!.toInt()

    // Calcular la dosis de la vacuna
    val dosisVacuna = (pesoBebe + 10) * edadBebe / 10 * 8

    // Mostrar resultado
    println("La dosis de la vacuna es: $dosisVacuna ml")
}
