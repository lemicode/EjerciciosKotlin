package ejercicios

import java.lang.Math.ceil

fun main() {
    print("Ingrese el No. de estudiantes gordos: ")
    val gordos = readLine()!!.toInt()
    print("Ingrese el No. de estudiantes flacos: ")
    val flacos = readLine()!!.toInt()
    print("Ingrese el No. de sillas: ")
    val sillas = readLine()!!.toInt()
    println("Se requieren ${calcularBuses(gordos, flacos, sillas)} buses")
}

fun calcularBuses(gordos: Int, flacos: Int, sillas: Int): Int {
    require(sillas > 0)
    return ceil(((gordos * 2.0) + flacos) / sillas).toInt()
}