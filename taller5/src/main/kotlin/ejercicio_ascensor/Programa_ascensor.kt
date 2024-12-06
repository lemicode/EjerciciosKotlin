package ejercicio_ascensor

import kotlin.math.absoluteValue

fun main() {
    print("Ingrese la cantidad de pisos que tiene el edificio: ")
    val cantidadPisos = readLine()!!.toInt().absoluteValue
    print("Ingrese la cantidad de sotanos que tiene el edificio: ")
    val cantidadSotanos = readLine()!!.toInt().absoluteValue
    print("Ingrese el piso actual del ascensor: ")
    val pisoActual = readLine()!!.toInt()
    val objetoAscensor = Ascensor(cantidadPisos, cantidadSotanos, pisoActual)
    println("El ascensor le da la bienvenida, el edificio tiene ${objetoAscensor.getCantidadPisos()} pisos y " +
            "${objetoAscensor.getCantidadSotanos()} sotanos, " +
            "en total ${objetoAscensor.determinarTotalPisosIncluyendoSotanos()} pisos.")
    do {
        print("Desea subir o bajar un piso? (bajar/subir): ")
        val respuesta = readLine()!!.toString()
        if (respuesta != "bajar" && respuesta != "subir") {
            println("El piso actual es ${objetoAscensor.getPisoActual()}")
        } else {
            when(respuesta) {
                "subir" -> println("Subiendo... Ahora se encuentra en el piso ${objetoAscensor.subirPiso()}")
                "bajar" -> println("Bajando... Ahora se encuentra en el piso ${objetoAscensor.bajarPiso()}")
            }
        }
        print("Desea salir del ascensor? (si/no): ")
        val confirmacion = readLine()!!.toString()
    } while (confirmacion != "si" && confirmacion != "s")
}