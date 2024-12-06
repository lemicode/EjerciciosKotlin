package ejercicios

fun main() {
    print("Ingrese el valor de un libro: ")
    var precio = readLine()!!.toDouble()
    while (precio > 0) {
        println("El valor neto del libro es: ${calcularPrecioNeto(precio)}")
        print("Ingrese el valor de un libro: ")
        precio = readLine()!!.toDouble()
    }
}

fun calcularPrecioNeto(precio: Double): Double {
    return if (precio < 100000) {
        precio - (precio * 12) / 100
    } else {
        precio - (precio * 18) / 100
    }
}

