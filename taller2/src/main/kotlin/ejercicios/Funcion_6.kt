package ejercicios

fun main() {
    print("Ingrese el lado a: ")
    val a = readLine()!!.toDouble()
    print("Ingrese el lado b: ")
    val b = readLine()!!.toDouble()
    print("Ingrese el lado c: ")
    val c = readLine()!!.toDouble()
    println("El area del terreno es: ${calcularAreaRectangulo(b, c) + calcularAreaTriangulo(b, a - c)} unidades cuadradas")
    println("El perimetro del terreno es: ${a + b + c + calcularHipotenusa(a - c, b)} unidades")
}

fun calcularAreaRectangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun calcularHipotenusa(co: Double, ca: Double): Double {
    return Math.sqrt((Math.pow(co, 2.0) + Math.pow(ca, 2.0)))
}

fun calcularAreaTriangulo(base: Double, altura: Double): Double {
    return (base * altura) / 2
}

