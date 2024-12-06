package ejercicios

fun main() {
    val listadoPalabras: MutableList<String> = mutableListOf()
    do {
        print("Ingrese palabra: ")
        val palabra = readLine()!!.toString()
        listadoPalabras.add(palabra)
    } while (palabra != "0")
    println("El total de palabras que son verbos es: ${contarVerbos(listadoPalabras)}")
}

fun contarVerbos(listado: MutableList<String>): Int {
    var conteoVerbos = 0
    for (palabra in listado) {
        if (palabra.endsWith("ar") || palabra.endsWith("er") || palabra.endsWith("ir")) conteoVerbos++
    }
    return conteoVerbos
}

