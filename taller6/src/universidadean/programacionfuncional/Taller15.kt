package universidadean.programacionfuncional

import ean.collections.IList
import kotlin.math.pow
import kotlin.math.sqrt

// Esta clase guarda la información de un producto de una tienda
data class Producto(val codigo: Int, val nombre: String, val cantidad: Int, val precio: Int)

// Esta clase guarda la información de un departamento del país
data class Departamento(
    val nombre: String,
    val poblacion: Int,
    val superficie: Double,
    val densidad: Double,
    val IDH: Double,
    val añoCreacion: Int)

// Esta clase guarda la información de un municipio del pais
data class Municipio(
    val codigo: Int,
    val nombre: String,
    val departamento: String,
    val poblacionUrbana: Int,
    val poblacionRural: Int,
    val esCapital: Boolean
)

// Esta clase guarda la información de un rectángulo
data class Rectangulo(val base: Double, val altura: Double) {
    // Hallar el área del rectangulo
    fun area(): Double = base * altura
}

// Esta clase guarda la información de un triángulo
data class Triangulo(val id: Int,
                     val lado1: Double,
                     val lado2: Double,
                     val lado3: Double)

//-------------------------------------------------------------------
// Operaciones con la clase Departamento
//-------------------------------------------------------------------

/**
 * Obtener el nombre del departamento más antiguo de toda la lista.
 * Si la lista está vacía, retorne null
 */
fun metodo6(dptos: IList<Departamento>): String? {
    return dptos.minWith(compareBy { it.añoCreacion })!!.nombre
}

/**
 * Retorna el  departamento que tiene la superficie más grande
 * pero con una población superior a la población que se pasa
 * como parámetro.
 */
fun metodo7(dptos: IList<Departamento>, poblacion: Int): Departamento? {
    return dptos.filter{ it.poblacion > poblacion}.maxWith(compareBy { it.superficie })
}

/**
 * Retorne la lista de los nombres de los departamentos creados
 * en el siglo XX y que tenga un IDH entre 0.85 y 0.95
 */
fun metodo8(dptos: IList<Departamento>): IList<String> {
    return dptos.filter { (it.añoCreacion >= 1900 && it.añoCreacion < 2000) && (it.IDH >= 0.85 && it.IDH <= 0.95) }
        .map { it.nombre }
}

/**
 * Retorne el porcentaje de departamentos de la lista cuya densidad
 * esté por debajo del valor que se pasa como parámetro
 */
fun metodo9(deptos: IList<Departamento>, valor: Double): Double {
    return ((deptos.filter { it.densidad < valor }.count() * 100).toDouble() / deptos.count())
}

/**
 * Retorne el promedio de superficie de los departamentos de la lista
 * cuya poblacion sea superior a la población del departamento con menor
 * IDH de toda la lista
 */
fun metodo10(deptos: IList<Departamento>): Double {
    val d: IList<Departamento> = deptos.filter { it.poblacion > deptos.minWith(compareBy { it.IDH })!!.poblacion }
    return d.sumByDouble { it.superficie } / d.count()
}

//-------------------------------------------------------------------
// Operaciones con la clase Municipio
//-------------------------------------------------------------------

/**
 * Determinar y retornar cuántos municipios de la lista son capitales
 */
fun metodo11(muns: IList<Municipio>): Int {
    return muns.filter{it.esCapital}.count()
}

/*
 * Determinar el nombre del municipio que no es capital y que pertenece al
 * departamento que se recibe como parámetro y que tiene la población urbana
 * más grande
 */
fun metodo12(m: IList<Municipio>, depto: String): String {
    TODO("Completar")
}

/**
 * Retornar el promedio de la población total (suma de la población rural y población urbana)
 * de aquellos municipios de la lista que pertenecen al departamento que se pasa
 * como parámetro y cuyo código sea múltiplo de 3 o de 5
 */
fun metodo13(municipios: IList<Municipio>, departamento: String): Double {
    TODO("Completar")
}

/**
 * Retorne el nombre del primer municipio que inicia con J en toda la lista
 */
fun metodo14(muns: IList<Municipio>): String {
    TODO("Completar")
}


/**
 * Retorne cuantos municipios de la lista que tienen un código
 * de 4 dígitos poseen una poblacion rural superior a la población
 * urbana
 */
fun metodo15(muns: IList<Municipio>): Int {
    TODO("Completar")
}

//-------------------------------------------------------------------
// Operaciones con la clase Producto
//-------------------------------------------------------------------

/*
 * Obtener el nombre de todos los productos cuyo código es par
 */
fun metodo1(productos: IList<Producto>): IList<String> {
    TODO("Completar")
}

/**
 * Obtener cuántos productos tienen un precio inferior al producto
 * cuyo código se pasa como parámetro
 */
fun metodo2(productos: IList<Producto>, codProducto: Int): Int {
    TODO("Completar")
}

/**
 * Obtener una lista con los códigos de los productos cuya cantidad sea
 * superior a la cantidad mínima que se pasa como parámetro y cuyo precio
 * esté entre mil y diez mil pesos.
 *
 */
fun metodo3(productos: IList<Producto>, cantidadMinima: Int): IList<Int> {
    TODO("Completar")
}

/**
 * EL inventario total de la lista es la suma de la multiplicación de la cantidad por el precio
 * de todos y cada uno de los productos de la lista. Este método permite saber si el
 * inventario de la lista es superior al millón de pesos o no.
 */
fun metodo4(prods: IList<Producto>): Boolean {
    TODO("Completar")
}

/**
 * Obtener el promedio de la cantidad de aquellos productos cuyo precio
 * esté por debajo del promedio de precio de todos los productos de la lista
 */
fun metodo5(prods: IList<Producto>): Double {
    TODO("Completar")
}

//-------------------------------------------------------------------
// Operaciones con la clase Producto
//-------------------------------------------------------------------

fun metodo16(rects: IList<Rectangulo>): Int {
    TODO("¿Cuántos rectángulos de la lista son cuadrados?")
}

fun metodo17(rects: IList<Rectangulo>): Double {
    TODO("Promedio del área de los rectangulos cuya base es inferior a su altura")
}

fun metodo18(rects: IList<Rectangulo>): Rectangulo {
    TODO("Obtener el rectangulo de mayor área de la lista")

}

fun metodo19(rects: IList<Rectangulo>, areaMin: Double): IList<Double> {
    TODO("Lista con las diagonales de aquellos cuadrados cuya area sea superior al area que se pasa como parámetro")
}

/**
 * Un triangulo es rectangulo si un lado (el mas largo) es igual a la raiz cuadrada de
 * la suma de los cuadrados de los otros dos lados
 */
fun esRectangulo(t: Triangulo): Boolean {
    TODO("Retorna true si t es triangulo rectangulo")
}

fun areaTriangulo(t: Triangulo): Double {
    TODO("Hallar el área del triángulo a partir de la fórmula de Herón")
}

fun metodo20(triangulos: IList<Triangulo>): IList<Double> {
    TODO("Lista de áreas de aquellos triangulos rectangulos de la lista")
}

fun metodo21(triangulos: IList<Triangulo>): IList<Int> {
    fun esIsosceles(t: Triangulo) = t.lado1 == t.lado2 || t.lado2 == t.lado3 || t.lado1 == t.lado3
    //TODO("Obtener la lista de identificadores de aquellos triangulos isosceles cuya área no supere 10")
    return triangulos.filter { esIsosceles(it) && areaTriangulo(it) <= 10.0 }.map { it.id }
}