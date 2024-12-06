package ejercicios

fun main() {
    print("Ingrese el sueldo: ")
    val sueldo = readLine()!!.toDouble()
    val (arriendo, comida) = calcularGastos(sueldo)
    println("En arriendo se gasto: ${arriendo}")
    println("En comida se gasto: ${comida}")
    println("Del sueldo quedo: ${sueldo - (arriendo + comida)}")
}

fun calcularGastos(sueldo: Double): Pair<Double, Double> {
    val gastoArriendo = (sueldo * 40) / 100
    val gastoComida = (sueldo * 15) / 100
    return Pair(gastoArriendo, gastoComida)
}