package ejercicios

fun main() {
    print("Ingrese el valor a: ")
    val a = readLine()!!.toDouble()
    print("Ingrese el valor b: ")
    val b = readLine()!!.toDouble()
    print("Ingrese la operacion a realizar: ")
    val op = readLine()!!.toString()
    val (resultado, operacion) = establecerOperacion(a, b, op)
    if(resultado >= 0) println("La operacion ingresada es ${operacion} y el resultado es ${resultado}")
    else println(operacion)
}

fun establecerOperacion(a: Double, b:Double, operation: String): Pair<Double, String> {
    return when(operation) {
        "+" -> Pair(a + b, "suma")
        "-" -> Pair(a - b, "resta")
        "*" -> Pair(a * b, "multiplicacion")
        "/" -> Pair(a / b, "division")
        "%" -> Pair(a % b, "modulo")
        "**" -> Pair(Math.pow(a, b), "potenciacion")
        else -> Pair(-1.0, "Debe ingresar una operacion valida")
    }
}