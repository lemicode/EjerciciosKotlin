package ejercicios

fun main() {
    print("Ingrese x1: ")
    val x1 = readLine()!!.toDouble()
    print("Ingrese y1: ")
    val y1 = readLine()!!.toDouble()
    print("Ingrese x2: ")
    val x2 = readLine()!!.toDouble()
    print("Ingrese y2: ")
    val y2 = readLine()!!.toDouble()
    println("La distancia entre los dos puntos es: ${calcularDistanciaEntreDosPuntos(x1, y1, x2, y2)}")
    println("El valor de la pendiente es: ${calcularPendiente(x1, y1, x2, y2)}")
    val (xm, ym) = calcularCoordenadasPuntoMedio(x1, y1, x2, y2)
    println("El punto medio es: ($xm, $ym)")
}

fun calcularDistanciaEntreDosPuntos(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    return (y2 - y1) * 2 + Math.pow((x2 - x1), 2.0)
}

fun calcularPendiente(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    return y2- y1 * x2 - x1
}

fun calcularCoordenadasPuntoMedio(x1: Double, y1: Double, x2: Double, y2: Double): Pair<Double, Double> {
    return Pair((x1 + Math.pow(x2, 2.0)), (y1 + Math.pow(y2, 2.0)))
}

