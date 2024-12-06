package ejercicios

fun main() {
    print("Ingrese el sueldo: ")
    val sueldo = readLine()!!.toDouble()
    val (aumento, totalSueldo) = calcularAumento(sueldo)
    println("El aumento es del ${aumento}% y el total del sueldo seria ${totalSueldo}")
}

fun calcularAumento(sueldo: Double): Pair<Int, Double> {
    val aumento = if (sueldo <= 800000) {
        10
    } else if (sueldo > 800000 && sueldo <= 1200000) {
        8
    } else {
        5
    }
    return Pair(aumento, (sueldo + ((sueldo * aumento) / 100)))
}