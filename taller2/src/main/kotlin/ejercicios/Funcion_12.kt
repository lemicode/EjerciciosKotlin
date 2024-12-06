package ejercicios

fun main() {
    print("Ingrese un dia: ")
    val dia = readLine()!!.toString()
    println("El dia posterior es: ${retornarDiaPosterior(dia)}")
}

fun retornarDiaPosterior(dia: String): String {
    return when(dia) {
        "lunes" -> "martes"
        "martes" -> "miercoles"
        "miercoles" -> "jueves"
        "jueves" -> "viernes"
        "viernes" -> "sabado"
        "sabado" -> "domingo"
        "domingo" -> "lunes"
        else -> "ingreso un valor que no es valido"
    }
}