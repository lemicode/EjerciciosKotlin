package ejercicios

fun main() {
    print("Ingreso el primer valor: ")
    val number1 = readLine()!!.toInt()
    print("Ingrese el segundo valor: ")
    val number2 = readLine()!!.toInt()
    println("El numero mayor es: ${obtenerNumeroMayor(number1, number2)}")
}

fun obtenerNumeroMayor(number1: Int, number2: Int): Int {
    return Math.max(number1, number2)
}