package ejercicios

fun main() {
    print("Ingrese la altura: ")
    val altura = readLine()!!.toDouble()
    print("ingrese el angulo: ")
    val angulo = readLine()!!.toDouble()
    println("La longitud de la escalera es de: ${calcularLongitudEscalera(altura, angulo)}")
}

fun calcularLongitudEscalera(altura: Double, angulo: Double): Double {
    return altura / Math.sin(angulo)
}