package ejercicios

fun main() {
    val listadoAlturas: MutableList<Double> = mutableListOf()
    do {
        print("Ingrese la altura en metros: ")
        val altura = readLine()!!.toDouble()
        if(altura <= 0) break
        listadoAlturas.add(altura)
    } while (altura > 0)
    val (cantidadAlturasDebajoPromedio, alturaPromedio) = calcularPromedioAlturas(listadoAlturas)
    println("En total $cantidadAlturasDebajoPromedio alturas estan por debajo del promedio que es $alturaPromedio m")
}

fun calcularPromedioAlturas(listado: MutableList<Double>): Pair<Int, Double> {
    var conteoAlturas = 0
    val alturaPromedio = listado.average()
    for (altura in listado) {
        if (altura < alturaPromedio) conteoAlturas++
    }
    return conteoAlturas to alturaPromedio
}