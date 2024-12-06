package ejercicios

fun main() {
    print("Ingrese un numero entero: ")
    val num = readLine()!!.toInt()
    if(num > 0 && num < 100) {
        val (decenas, unidades) = descomponer(num)
        val equivalenteDecenas = obtenerDecena(decenas)
        val equivalenteUnidades = obtenerUnidades(unidades)
        println("La conversion a numero romano es: ${equivalenteDecenas + equivalenteUnidades}")
    } else {
        println("Ingrese un numero mayor a 0 y menor a 100")
    }
}

fun descomponer(num: Int): Pair<Int, Int> {
    return Pair((num / 10), (num % 10))
}

fun obtenerUnidades(num: Int): String {
    return when(num) {
        1 -> "I"
        2 -> "II"
        3 -> "III"
        4 -> "IV"
        5 -> "V"
        6 -> "VI"
        7 -> "VII"
        8 -> "VIII"
        9 -> "IX"
        else -> ""
    }
}

fun obtenerDecena(num: Int): String {
    return when(num) {
        1 -> "X"
        2 -> "XX"
        3 -> "XXX"
        4 -> "XL"
        5 -> "L"
        6 -> "LX"
        7 -> "LXX"
        8 -> "LXXX"
        9 -> "XC"
        else -> ""
    }
}