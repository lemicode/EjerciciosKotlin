package ejercicios

fun main() {
    print("Ingrese un numero: ")
    val num = readLine()!!.toInt()
    println("El numero $num ${if(esPerfecto(num).first) {"es perfecto"} else {"no es perfecto"}} " +
            "cuyos valores corresponden a: ${esPerfecto(num).second}")
}

fun esPerfecto(num: Int): Pair<Boolean, MutableList<Int>> {
    var suma = 0
    var numeros: MutableList<Int> = mutableListOf()
    for (n in 1 until num) {
        if (num % n == 0) {
            suma += n
            numeros.add(n)
        }
    }
    return Pair(suma == num, numeros)
}

