package ejercicios

fun main() {
    println("Ingrese el nombre del primer hermano: ")
    val nombreHermano1 = readLine()!!.toString()
    println("Intrese la edad del primer hermano: ")
    val edadHermano1 = readLine()!!.toInt()
    println("Ingrese el nombre del segundo hermano: ")
    val nombreHermano2 = readLine()!!.toString()
    println("Intrese la edad del segundo hermano: ")
    val edadHermano2 = readLine()!!.toInt()
    println("Ingrese el nombre del tercer hermano: ")
    val nombreHermano3 = readLine()!!.toString()
    println("Intrese la edad del tercer hermano: ")
    val edadHermano3 = readLine()!!.toInt()
    val nombreHermanoMayor = calcularHermanoMayorEdad(arrayOf(
        Pair(nombreHermano1, edadHermano1),
        Pair(nombreHermano2, edadHermano2),
        Pair(nombreHermano3, edadHermano3)
    ))
    println("El nombre del hermano mayor es: ${nombreHermanoMayor}")
}

fun calcularHermanoMayorEdad(hermanos: Array<Pair<String, Int>>): String {
    var i = 0
    for (hermano in hermanos) {
        if (hermanos.get(0).second < hermano.second) {
            var temporal = hermano
            hermanos.set(i, hermanos.get(0))
            hermanos.set(0, temporal)
        }
        i++
    }
    return hermanos.get(0).first
}