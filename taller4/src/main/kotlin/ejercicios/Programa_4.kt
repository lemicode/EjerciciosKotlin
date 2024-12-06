package ejercicios

fun main() {
    val listadoNotas: MutableList<Double> = mutableListOf()
    do {
        print("Ingrese nota (maximo 5.0): ")
        val nota = readLine()!!.toDouble()
        if (nota <= 0.0) break
        listadoNotas.add(nota)
    } while (nota > 0.0)
    val (perdieron, pasaron, promedio) = calcularNotas(listadoNotas)
    println("Perdieron $perdieron, pasaron $pasaron y el promedio es $promedio")
}

fun calcularNotas(listado: MutableList<Double>): Triple<Int, Int, Double>  {
    var perdieron = 0
    var pasaron = 0
    for (nota in listado) {
        if (nota < 3.0) perdieron++
        else pasaron++
    }
    val promedio = listado.average()
    return Triple(perdieron, pasaron, promedio)
}