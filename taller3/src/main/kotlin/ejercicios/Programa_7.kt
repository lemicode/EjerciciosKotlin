package ejercicios

fun main() {
    print("Ingrese un numero: ")
    var num = readLine()!!.toInt()
    println("El numero $num tiene ${obtenerCantidadDivisores(num)} divisores")
}

fun obtenerCantidadDivisores(num: Int): Int {
    var contador = 0
    repeat (num) {
        if (num % (it + 1) == 0) {
            contador++
        }
    }
    return contador
}