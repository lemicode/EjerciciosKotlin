package ejercicios

fun main() {
    print("Ingrese el valor de x: ")
    val x = readLine()!!.toDouble()
    print("Ingrese el valor de y: ")
    val y = readLine()!!.toDouble()
    println("El resultado es: ${encontrarValor(x, y)}")
}

fun encontrarValor(x: Double, y: Double): Double {
    return Math.pow(x, 2.0) - (2 * x * y) + Math.pow(y, 2.0)
}