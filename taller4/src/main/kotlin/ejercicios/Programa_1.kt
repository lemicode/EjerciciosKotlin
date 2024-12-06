package ejercicios

import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val listadoEdades: MutableList<Int> = mutableListOf()
    do {
        print("Ingrese edad: ")
        val edad = readLine()!!.toInt()
        listadoEdades.add(edad)
    } while (edad > 0)
    val (totalEstudiantes, edadPromedio) = calcularEdadesSigloPasado(listadoEdades)
    println("En total son $totalEstudiantes estudiantes que nacieron en el siglo XX, " +
            "y la edad promedio del listado ingresado es $edadPromedio")
}

fun calcularEdadesSigloPasado(listado: MutableList<Int>): Pair<Int, Double> {
    val simpleDateFormat = SimpleDateFormat("yyyy")
    val currentYear = simpleDateFormat.format(Date()).toInt()
    var conteoEdadesSigloPasado = 0
    var suma = 0
    var cantidadEdades = 0
    for (edad in listado) {
        if (edad <= 0) break
        if ((currentYear - edad).toString().startsWith("19")) {
            conteoEdadesSigloPasado++
        }
        suma += edad
        cantidadEdades++
    }
    val edadPromedio = suma.toDouble() / cantidadEdades
    return conteoEdadesSigloPasado to edadPromedio
}