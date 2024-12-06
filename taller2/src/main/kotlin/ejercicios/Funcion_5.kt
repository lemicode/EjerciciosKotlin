package ejercicios

fun main() {
    print("Ingrese el radio mayor: ")
    val radioMayor = readLine()!!.toDouble()
    print("Ingrese el radio menor: ")
    val radioMenor = readLine()!!.toDouble()
    println("El area de la corona circular es: ${calcularCoronaCircular(radioMayor, radioMenor)}")
}

fun calcularAreaCirculo(r: Double): Double {
    return  Math.PI * Math.pow(r, 2.0)
}

fun calcularCoronaCircular(radioMayor: Double, radioMenor: Double): Double {
    return calcularAreaCirculo(radioMayor) - calcularAreaCirculo(radioMenor)
}