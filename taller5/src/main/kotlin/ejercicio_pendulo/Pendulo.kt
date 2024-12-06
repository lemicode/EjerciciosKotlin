package ejercicio_pendulo

import kotlin.math.sqrt

class Pendulo {

    private var l: Double = 0.0 // longitud cuerda
    private var a: Double = 0.0 // aceleracion del pendulo

    constructor() {} // constructor primario
    constructor(l: Double, a: Double) {
        this.l = l
        this.a = a
    }

    // Analizadoras
    fun getLongitud() = this.l
    fun getAceleracion() = this.a

    // Modificadoras
    fun setLongitud(l: Double) {
        this.l = l
    }
    fun setAceleracion(a: Double) {
        this.a = a
    }

    // Métodos
    fun calcularPeriodoOscilacion(): Double {
        if (l == 0.0) return 0.0
        return 2 * Math.PI * sqrt(a / l)
    }
}

// Otra forma de crear clases en Kotlin

data class Pendulo2 (
    var l: Double = 0.0,
    var a: Double = 0.0
) {
    // Modificadoras
    fun setLongitud(l: Double) {
        this.l = l
    }
    fun setAceleracion(a: Double) {
        this.a = a
    }

    // Métodos
    fun calcularPeriodoOscilacion(): Double {
        if (l == 0.0) return 0.0
        return 2 * Math.PI * sqrt(a / l)
    }
}