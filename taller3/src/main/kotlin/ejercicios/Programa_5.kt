package ejercicios

fun main() {
    print("Ingrese un numero: ")
    val numero = readLine()!!.toInt()
    var suma = 0
    repeat (numero) {
        suma += it + 1
    }
    println("La sumatoria es igual a $suma")
}