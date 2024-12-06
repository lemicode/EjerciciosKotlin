package ejercicio_pendulo

fun main() {
    print("Ingrese la longitud de la cuerda: ")
    val l = readLine()!!.toDouble()
    print("Ingrese la aceleracion del pendulo: ")
    val a = readLine()!!.toDouble()
    val objetoPendulo = Pendulo(l, a)
    println("El periodo de oscilacion del pendulo es ${objetoPendulo.calcularPeriodoOscilacion()}")
}