package ejercicios

fun main() {
    print("Ingrese el valor de las ventas: ")
    var ventas = readLine()!!.toDouble()
    while (ventas > 0) {
        println("La comision es de ${calcularComision(ventas)}")
        print("Ingrese el valor de las ventas: ")
        ventas = readLine()!!.toDouble()
    }
}

fun calcularComision(ventas: Double): Double {
    return if (ventas < 50000) {
        (ventas * 7) / 100
    } else if (ventas >= 50000 && ventas < 100000) {
        ((ventas * 9) / 100) + 5000
    } else if (ventas >= 100000 && ventas < 200000) {
        ((ventas * 11) / 100) + 10000
    } else if (ventas >= 200000 && ventas < 500000) {
        ((ventas * 13) / 100) + 20000
    } else {
        ((ventas * 15) / 100) + 40000
    }
}