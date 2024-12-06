package ejercicios

fun main () {
    print("Ingrese un numero: ")
    val num = readLine()!!.toInt()
    println("El factorial de $num es ${hallarFactorial(num)}")
}

fun hallarFactorial(num: Int): Int {
    var factorial = 1
    for (i in num downTo 1) {
        factorial *= i
    }
    return factorial
}