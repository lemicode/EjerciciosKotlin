package ejercicios

fun main() {
    do {
        print("Indique el salario: ")
        val salario = readLine()!!.toDouble()
        print("Indique las ventas: ")
        val ventas = readLine()!!.toDouble()
        val comision = calcularComisionEmpleado(ventas)
        println("La comision es de $comision, y el salario neto es de ${salario + comision}")
        print("Desea continuar? (yes/no): ")
        var confirmacion = readLine()!!.toString() == "yes"
    } while (confirmacion)
}

fun calcularComisionEmpleado(ventas: Double): Double {
    return if (ventas > 50000) {
        (ventas * 15) / 100
    } else {
        0.0
    }
}