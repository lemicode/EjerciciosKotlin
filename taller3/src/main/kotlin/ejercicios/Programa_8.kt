package ejercicios

fun main() {
    print("Ingrese el numero: ")
    val num = readLine()!!.toInt()
    println("El numero $num ${if (obtenerCantidadDivisores(num) == 2) { "es primo" } else {"no es primo"} }")
}