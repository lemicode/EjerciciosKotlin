package ejercicios

fun main() {
    print("Ingrese un numero: ")
    val num = readLine()!!.toInt()
    println("La suma de los divisores de $num es igual a ${sumarDivisores(num)}")
}

fun sumarDivisores(num: Int): Int {
    var suma = 0
    for (n in 1 until num) {
        if (num % n == 0) {
            suma += n
        }
    }
    return suma
}