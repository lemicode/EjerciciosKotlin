package ejercicio_ascensor

import kotlin.math.absoluteValue

data class Ascensor(
    private val cantidadPisos: Int = 0,
    private val cantidadSotanos: Int = 0,
    private var pisoActual: Int = 0
) {
    fun setPisoActual(pisoActualAscensor: Int) {
        this.pisoActual = pisoActualAscensor
    }

    fun getCantidadPisos() = this.cantidadPisos
    fun getCantidadSotanos() = this.cantidadSotanos
    fun getPisoActual() = this.pisoActual

    fun subirPiso(): Int {
        setPisoActual(
            if (pisoActual == -1) {
                1
            } else if(pisoActual + 1 > cantidadPisos) {
                cantidadPisos
            } else {
                pisoActual + 1
            }
        )
        return getPisoActual()
    }

    fun bajarPiso(): Int {
        setPisoActual(
            if (pisoActual == 1) {
                -1
            } else if(pisoActual - 1 < -cantidadSotanos) {
                -cantidadSotanos
            } else {
                pisoActual - 1
            }
        )
        return getPisoActual()
    }

    fun determinarTotalPisosIncluyendoSotanos(): Int {
        return cantidadPisos + cantidadSotanos
    }
}