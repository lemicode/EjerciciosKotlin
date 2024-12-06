package ejercicios

fun main() {
    val listadoCiudades: MutableList<String> = mutableListOf()
    do {
        print("Ingrese ciudad para el listado: ")
        val ciudad = readLine()!!.toString()
        listadoCiudades.add(ciudad)
    } while (ciudad != "" && ciudad != "0")
    print("Ingrese ciudad a buscar: ")
    val ciudad = readLine()!!.toString()
    println("La ciudad ${if (encontrarCiudad(listadoCiudades, ciudad)) "se encuentra en el listado" 
        else "NO se encuentra en el listado"}")
}

fun encontrarCiudad(listado: MutableList<String>, ciudadConsultada: String): Boolean  {
    return listado.find{ it == ciudadConsultada } == ciudadConsultada
}