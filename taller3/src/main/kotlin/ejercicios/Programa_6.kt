package ejercicios

fun main() {
    print("Ingrese un numero: ")
    val num = readLine()!!.toInt()
    for (i in 1 .. 10) println("$num x $i = ${num * i}")
}

