package ejercicios

import java.util.*

fun main() {
    print("Hola mundo")
}

/**
 *
 * Taller 01
 *
 */

/** Punto 1: Traduzca a Kotlin las siguientes expresiones matemáticas */

/**
 * Enunciado: S = √((X-m)^2)/(n-1)
 * Entradas
 * Variable X --> Double --> x
 * Variable m --> Double --> m
 * Variable n --> Double --> n
 * Salida
 * Raíz cuadrada --> Double --> S
 */
fun resolverEcuacionA(X: Double, m: Double, n: Double): Double {
    val S = Math.sqrt((Math.pow((X - m), 2.0)/(n - 1)))
    return S
}

/**
 * Enunciado: P = -(y^3-1)/((y+1)-√(y+1))
 * Entradas
 * Variable y --> Double --> y
 * Salida
 * Cociente --> Double --> P
 */
fun resolverEcuacionB(y: Double): Double {
    val P = (Math.pow(y, 3.0) - 1)/((y + 1) - Math.sqrt(y + 1))
    return P
}

/**
 * Enunciado: Z = (x((x^2)+1)^3)/((√2x)+1)
 * Entradas
 * Variable x --> Double --> x
 * Salida
 * Cociente --> Double --> Z
 */
fun resolverEcuacionC(x: Double): Double {
    val Z = (x*(Math.pow((Math.pow(x, 2.0) + 1), 3.0)))/(Math.sqrt(2 * x) + 1)
    return Z
}

/**
 * Enunciado: T = 1 - (((x-2)^(1/n))/(x^3))
 * Entradas
 * Variable n --> Double --> n
 * Variable x --> Double --> x
 * Salida
 * Cociente --> Double --> T
 */
fun resolverEcuacionD(n: Double, x: Double): Double {
    val T = 1 - (Math.pow((x - 2), 1/n)/Math.pow(x, 3.0))
    return T
}

/**
 * Enunciado: s = ((x!=y)&&(x<=y))
 * Entradas
 * Variable x --> Double --> x
 * Variable y --> Double --> y
 * Salida
 * Valor de verdad --> Boolean --> s
 */
fun resolverEcuacionE(x: Double, y: Double): Boolean {
    var s = ((x!=y)&&(x<=y))
    return s
}

/**
 * Enunciado: s = ((a>=b*c)||(b<=c))
 * Entradas
 * Variable a --> Double --> a
 * Variable b --> Double --> b
 * Variable c --> Double --> c
 * Salida
 * Valor de verdad --> Boolean --> s
 */
fun resolverEcuacionF(a: Double, b: Double, c: Double): Boolean {
    var s = ((a>=b*c)||(b<=c))
    return s
}

/** Punto 2: Evalúe paso a paso las siguientes expresiones aritméticas */

/**
 * Enunciado: 30+8*3/6-4%6
 * Salida
 * Valor --> Int --> valor
 */
fun resolverOperacionA(): Int {
    /**
     * Explicación resolutiva de la precedencia de operadores:
     * 1. 8 * 3 = 24
     * 2. 24 / 6 = 4
     * 3. 4 % 6 = 4
     * 4. 30 + 4 = 34
     * 5. 34 - 4 = 30 (Resultado final)
     */
    var valor = 30+8*3/6-4%6
    return valor
}

/**
 * Enunciado: 30.0/20.0-2.5*3.0
 * Salida
 * Valor --> Double --> valor
 */
fun resolverOperacionB(): Double {
    /**
     * Explicación resolutiva de la precedencia de operadores:
     * 1. 2.5 * 3.0 = 7.5
     * 2. 30.0 / 20.0 = 1.5
     * 3. 1.5 - 7.5 = -6.0 (Resultado final)
     */
    var valor = 30.0/20.0-2.5*3.0
    return valor
}

/**
 * Enunciado: 8/4/2*6
 * Salida
 * Valor --> Int --> valor
 */
fun resolverOperacionC(): Int {
    /**
     * Explicación resolutiva de la precedencia de operadores:
     * 1. 8 / 4 = 2
     * 2. 2 / 2 = 1
     * 3. 1 * 6 = 6 (Resultado final)
     */
    var valor = 8/4/2*6
    return valor
}

/** Punto 3: Realice el modelaje correspondiente a los siguientes
 * problemas. Escriba el encabezado de la función, las pruebas
 * correspondientes y el cuerpo completo de la función.
 */

/**
 * Enunciado: Realice una función que halle el área de un triángulo.
 * Entradas
 * Base --> Double --> b
 * Altura --> Double --> a
 * Salida
 * Área --> Double --> area
 */
fun calcularAreaTriangulo(b: Double, a: Double): Double {
    val area = (b * a) / 2
    return area
}

/**
 * Enunciado: Si alquilar una bicicleta tiene cierto valor y puede
 * transportar dos personas, determine cuántas bicicletas necesito y
 * cuánto dinero voy a gastar en alquilarlas, para transportar a
 * todos los estudiantes de la universidad.
 * Entradas
 * Total de estudiantes --> Int --> totalEstudiantes
 * Costo del alquiler de una bicicleta --> Double --> alquilerBicicleta
 * Salidas
 * Número total de bicicletas --> Double --> totalBicicletas
 * Costo total del alquiler --> Double --> totalAlquiler
 */
fun calcularTotalRecursosAlquiler(totalEstudiantes: Int, alquilerBicicleta: Double): Pair<Double, Double> {
    var totalBicicletas = totalEstudiantes.toDouble() / 2.0
    var totalAlquiler = alquilerBicicleta * totalBicicletas
    return Pair(totalBicicletas, totalAlquiler)
}

/**
 * Enunciado: Según el DANE, el número de desempleados corresponde
 * al 8.15% de la población activa. Escriba una función que permita
 * determinar cuántas personas desempleadas hay actualmente en Colombia.
 * Entradas
 * Total de habitantes de Colombia --> Int --> totalHabitantes
 * Salida
 * Total desempleados en Colombia --> Double --> totalDesempleados
 */
fun calcularTotalDesempleadosColombia(totalHabitantes: Int): Double {
    var totalDesempleados = totalHabitantes * 0.0815
    return totalDesempleados
}

/**
 * Enunciado: Se desea determinar cuántos dólares se puede adquirir
 * con cierta cantidad de pesos colombianos.
 * Entradas
 * Cantidad de pesos colombianos --> Double --> pesos
 * TRM (Tasa Representativa del Mercado) --> Double --> trm
 * Salida
 * Total de dólares --> String --> totalDolares
 */
fun calcularDolares(pesos: Double, trm: Double): String {
    var totalDolares = "%.2f".format((pesos / trm))
    return totalDolares
}

/**
 * Enunciado: Una empresa que contrata personal requiere determinar
 * la edad de las personas que solicitan trabajo, pero cuando se les
 * realiza la entrevista sólo se les pregunta el año en que nacieron.
 * Realice el algoritmo para solucionar este problema.
 * Entradas
 * Año de nacimiento --> Int --> anioNacimiento
 * Salida
 * Edad --> Int --> edad
 */
fun calcularEdad(anioNacimiento: Int): Int {
    var edad = Calendar.getInstance().get(Calendar.YEAR) - anioNacimiento
    return edad
}

/**
 * Enunciado: Un estacionamiento requiere determinar el cobro que
 * debe aplicar a las personas que lo utilizan. Considere que el
 * cobro es con base en las horas que lo disponen y que las fracciones
 * de hora se toman como completas y realice una función que permita
 * determinar el cobro.
 * Entradas
 * Tiempo de estacionamiento en minutos --> Int --> minutos
 * Costo de una hora --> Double --> costoHora
 * Salida
 * Costo total de estacionamiento --> Double --> costoTotal
 */
fun calcularCostoTotalEstacionamiento(minutos: Int, costoHora: Double): Double {
    var cantidadHoras = (minutos / 60)
    var minutosExcedentes = minutos % 60
    if (cantidadHoras > 0 && minutosExcedentes > 0) {
        cantidadHoras++
    }
    var costoTotal = costoHora * cantidadHoras.toDouble()
    return costoTotal
}

/**
 * Enunciado: Pinturas “La brocha gorda” requiere determinar
 * cuánto cobrar por trabajos de pintura. Considere que se
 * cobra por m2. Realice una funciòn que le permita saber
 * cuánto cobrar a un cliente.
 * Entradas
 * Área a pintar --> Double --> area
 * Costo m2 de pintura --> Double --> costoM2
 * Salida
 * Costo total del trabajo --> Double --> costoTotal
 */
fun calcularCostoTrabajo(area: Double, costoM2: Double): Double {
    var costoTotal = area * costoM2
    return costoTotal
}

/**
 * Enunciado: Se requiere determinar el tiempo que tarda una
 * persona en llegar de una ciudad a otra en bicicleta, considerando
 * que lleva una velocidad constante. Realice una función para tal fin.
 * Entradas
 * Distancia en Km de una ciudad a otra --> Double --> distancia
 * Velocidad (km/h) --> Double --> velocidad
 * Salida
 * Tiempo de recorrido en horas --> Double --> tiempoRecorrido
 */
fun calcularTiempoRecorrido(distancia: Double, velocidad: Double): Double {
    var tiempoRecorrido = distancia / velocidad
    return tiempoRecorrido
}

/**
 * Enunciado: Realice un algoritmo para determinar cuánto pagará
 * finalmente una persona por un artículo equis, considerando que
 * tiene un descuento de 5%, y debe pagar 19% de IVA (debe retornar
 * el precio con descuento y el precio final).
 * Entradas
 * Costo del artículo --> Double --> costoArticulo
 * Salida
 * Valor final a pagar --> Double --> valorFinal
 */
fun calcularCostoRealArticulo(costoArticulo: Double): Double {
    var valorFinal = (costoArticulo + (costoArticulo * 0.19)) - (costoArticulo * 0.05)
    return valorFinal
}

/**
 * Enunciado: Realice una función para determinar la nota
 * final que obtendrá un alumno considerando que realiza tres
 * exámenes, de los cuales el primero y el segundo tienen una
 * ponderación de 25%, mientras que el tercero de 50%.
 * Entradas
 * Nota primer examen --> Double --> notaPrimerExamen
 * Nota segundo examen --> Double --> notaSegundoExamen
 * Nota tercer examen --> Double --> notaTercerExamen
 * Salida
 * Nota final --> Double --> notaFinal
 */
fun calcularNotaFinal(
    notaPrimerExamen : Double,
    notaSegundoExamen: Double,
    notaTercerExamen : Double): Double {
    val baseCalificativa = 5.0
    var notaFinal = (((notaPrimerExamen * 25) / baseCalificativa)  +
            ((notaSegundoExamen * 25) / baseCalificativa)  +
            ((notaTercerExamen  * 50) / baseCalificativa)) * 0.05
    return notaFinal
}

/**
 * Enunciado: Se tiene el nombre y la edad de tres personas.
 * Se desea saber el nombre y la edad de la persona de menor edad.
 * Entradas
 * personas --> Array<Pair<String, Int>> --> personas
 * Salida
 * Persona de menor edad --> String --> nombrPersonaMenorEdad
 */
fun calcularPersonaMenorEdad(personas: Array<Pair<String, Int>>): String {
    var i = 0
    for (persona in personas) {
        if (personas.get(0).second > persona.second) {
            var temporal = persona
            personas.set(i, personas.get(0))
            personas.set(0, temporal)
        }
        i++
    }
    var nombrPersonaMenorEdad = personas.get(0).first
    return "$nombrPersonaMenorEdad es la persona de menor edad."
}

/**
 * Clase Beca
 * Descripción: Tipo de dato necesario para crear el ArrayList de la función calcularBecas
 * Propiedades:
 * Nombre del estudiante --> String --> nombreEstudiante
 * Edad --> Int --> edad
 * Promedio académico --> Double --> promedio
 * Valor de la beca --> Doube --> valorBeca
 */
data class Beca<T1, T2, T3, T4> (
    var nombreEstudiante: String,
    var edad            : Int,
    var promedio        : Double,
    var valorBeca       : Double)

/**
 * Enunciado: El presidente de la república ha decidido estimular a todos
 * los estudiantes de una universidad mediante la asignación de becas mensuales,
 * para esto se tomarán en consideración los siguientes criterios: Para alumnos
 * mayores de 18 años con promedio mayor o igual a 90, la beca será de $2000.00;
 * con promedio mayor o igual a 75, de$1000.00; para los promedios menores de 75
 * pero mayores o iguales a 60, de $500.00; a los demás se les enviará una carta
 * de invitación incitándolos a que estudien más en el próximo ciclo escolar. A
 * los alumnos de 18 años o menores de esta edad, con promedios mayores o iguales
 * a 90, se les dará $3000; con promedios menores a 90 pero mayores o iguales a 80,
 * $2000; para los alumnos con promedios menores a 80 pero mayores o iguales a 60,
 * se les dará $100, y a los alumnos que tengan promedios menores a 6 se les enviará
 * carta de invitación. Realice la función correspondiente.
 * Entradas
 * Listado de estudiantes: nombre, edad y promedio por fila --> Array<Triple<String, Int, Double>> --> estudiantes
 * Salida
 * Informe de las becas --> String --> informe
 */
fun calcularBecas(estudiantes: Array<Triple<String, Int, Double>>): String {
    var becas: ArrayList<Beca<String, Int, Double, Double>> = arrayListOf()
    var valorBeca: Double = 0.00
    for (estudiante in estudiantes) {
        if (estudiante.second > 18) {
            if (estudiante.third >= 90) {
                valorBeca = 2000.0
            } else if (estudiante.third >= 75) {
                valorBeca = 1000.0
            } else if (estudiante.third >= 60) {
                valorBeca = 500.0
            } else {
                valorBeca = 0.0
            }
        } else {
            if (estudiante.third >= 90) {
                valorBeca = 3000.0
            } else if (estudiante.third >= 80) {
                valorBeca = 2000.0
            } else if (estudiante.third >= 60) {
                valorBeca = 100.0
            } else {
                valorBeca = 0.0
            }
        }
        becas.add(Beca(estudiante.first, estudiante.second, estudiante.third, valorBeca))
    }
    var informe = ""
    for (beca in becas) {
        var (nombreEstudiante, edad, promedio, tipoBeca) = beca
        if (tipoBeca != 0.0) {
            informe += "- $nombreEstudiante de $edad años, con promedio de $promedio, obtuvo una beca de $$tipoBeca.\n"
        } else {
            informe += "- $nombreEstudiante de $edad años, con promedio de $promedio, no obtuvo beca por lo tanto se le enviará una invitación.\n"
        }
    }
    return informe
}

/**
 * Enunciado: Escriba una función que halle el volumen de un cono.
 * Entradas
 * Radio --> Double --> radio
 * Altura --> Double -->altura
 * Salida
 * Volumen del cono --> Double --> volumen
 */
fun calcularVolumenCono(radio: Double, altura: Double): Double {
    val PI: Double = 3.141592
    var volumen = (PI * Math.pow(radio, 2.0) * altura) / 3.0
    return volumen
}

/**
 * Enunciado: En la universidad vamos a conectar los diversos computadores
 * que hay en una sala de cómputo con cables. Se necesita un cable para conectar
 * dos computadores, y debe haber conexión entre todos los computadores. Escriba
 * una función que determine el número de cables a comprar a partir del número de
 * computadores que hay en la sala.
 * Entradas
 * Total de computadores a conectar --> Int --> totalComputadores
 * Salida
 * Cantidad de cables a comprar --> Int --> totalCables
 */
fun calcularCantidadCables(totalComputadores: Int): Int {
    var totalCables = totalComputadores / 2
    return totalCables
}

/**
 * Enunciado: Se sabe que una batería de celular contamina 175 litros de agua.
 * ¿Cuántos litros de agua serán contaminados por la población de una ciudad en
 * un año si cada persona utiliza 2 baterías al semestre?
 * Entradas
 * Cantidad total de habitantes --> Int --> habitantes
 * Salida
 * Litros de agua contaminada por año --> Int --> totalLitros
 */
fun calcularLitrosAguaContaminada(habitantes: Int): Int {
    var totalLitros = 175 * (habitantes * 4)
    return totalLitros
}

/**
 * Enunciado: Mi proveedor de Internet me asegura que mi conexión es de 4 megabytes
 * por segundo. Escriba una función que permita determinar cuántos minutos y segundos
 * debo esperar para descargar la última película de La Mujer Maravilla.
 * Entradas
 * Peso en GB de la película de La Mujer Maravilla --> Double --> pesoPelicula
 * Salida
 * Tiempo total de descarga de la película --> String --> tiempoDescarga
 */
fun calcularTiempoDescarga(pesoPelicula: Double): String {
    var megas = pesoPelicula * 1000.0
    var totalSegundosDescarga = (megas / 4.0).toInt()
    var minutos = totalSegundosDescarga / 60
    var segundos = totalSegundosDescarga % 60
    if (!(minutos > 0 && segundos > 0)) {
        segundos = 0
    }
    var tiempoDescarga = "La película de La Mujer Maravilla se terminará de descargar en $minutos " +
            "minutos con $segundos segundos."
    return tiempoDescarga
}

/**
 * Enunciado: El valor presente de un cierto capital de dinero a una tasa de interés
 * durante años se encuentra a partir de la fórmula: VP = C/((1+t)^n)
 * Escriba una función que determine el valor presente a partir de los datos de entrada dados.
 * Entradas
 * Capital de dinero --> Double --> C
 * Tasa de interés --> Double --> t
 * Cantidad de años --> Double --> n
 * Salida
 * Valor presente --> Double --> VP
 */
fun calcularVP(C: Double, t: Double, n: Double): Double {
    val VP = C/(Math.pow((1+t), n))
    return VP
}
