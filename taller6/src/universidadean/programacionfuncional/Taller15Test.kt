package universidadean.programacionfuncional

import com.github.doyaaaaaken.kotlincsv.dsl.csvReader
import ean.collections.IList
import ean.collections.TList
import ean.collections.sort
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.File

internal class Taller15Test {

    // Configura las listas para los métodos relacionados con productos
    private fun configurarEscenariosProductos(): IList<Producto> {
        return TList(
            Producto(1, "Papa", 20, 2000),
            Producto(2, "Arroz", 5, 800),
            Producto(3, "Jamón", 120, 6_000),
            Producto(4, "Queso", 280, 15_000),
            Producto(5, "Pera", 33, 5_400),
            Producto(6, "Cebolla", 316, 815),
            Producto(7, "Leche", 177, 4_500),
            Producto(999, "Café", 511, 14_750)
        )
    }

    // Configura las listas para los métodos relacionados con departamentos
    private fun leerArchivoDepartamentos(): IList<Departamento> {
        val lista: IList<Departamento> = TList()

        try {
            val file: File = File("./data/departamentos.csv")
            val rows: List<Map<String, String>> = csvReader().readAllWithHeader(file)

            for (row: Map<String, String> in rows) {
                val nombre: String = row["Departamento"]!!
                val poblacion: Int = row["Población"]!!.toInt()
                val superficie: Double = row["Superficie"]!!.toDouble()
                val densidad: Double = row["Densidad"]!!.toDouble()
                val IDH6: Double = row["IDH6"]!!.toDouble()
                val fechaCreacion: Int = row["Fecha de creación"]!!.toInt()

                val dpto = Departamento(nombre, poblacion, superficie, densidad, IDH6, fechaCreacion)
                lista.add(dpto)
            }
        }
        catch (ex: Exception) {
            ex.printStackTrace()
        }
        return lista
    }

    // Configura las listas para los métodos relacionados con municipios
    private fun leerArchivoMunicipios(): IList<Municipio> {
        val listM: IList<Municipio> = TList()
        try {
            val file: File = File("./data/municipios.csv")
            val rows: List<Map<String, String>> = csvReader().readAllWithHeader(file)

            for (row: Map<String, String> in rows) {
                val codigo: Int = row["código"]!!.toInt()
                val nombre: String = row["nombre"]!!
                val departamento: String = row["departamento"]!!
                val poblacionUrbana: Int = row["poblaciónUrbana"]!!.toInt()
                val poblacionRural: Int = row["poblaciónRural"]!!.toInt()
                val esCapital: Boolean = row["esCapital"]!!.toInt() == 1

                val mun = Municipio(codigo, nombre, departamento, poblacionUrbana, poblacionRural, esCapital)
                listM.add(mun)
            }
        }
        catch (ex: Exception) {
            ex.printStackTrace()
        }
        return listM
    }

    // Configura la lista de rectangulos
    private fun configurarRectangulos(): IList<Rectangulo> {
        val lr: IList<Rectangulo> = TList()

        lr.add(Rectangulo(4.0, 10.0))
        lr.add(Rectangulo(8.0, 6.0))
        lr.add(Rectangulo(3.0, 3.0))
        lr.add(Rectangulo(4.0, 3.0))
        lr.add(Rectangulo(2.0, 10.0))
        lr.add(Rectangulo(6.0, 6.0))
        lr.add(Rectangulo(3.0, 4.0))
        lr.add(Rectangulo(5.0, 8.0))
        lr.add(Rectangulo(9.0, 11.0))
        lr.add(Rectangulo(20.0, 12.0))
        lr.add(Rectangulo(6.0, 10.0))
        lr.add(Rectangulo(14.0, 18.5))
        lr.add(Rectangulo(4.0, 5.0))
        lr.add(Rectangulo(10.0, 10.0))
        lr.add(Rectangulo(8.0, 6.0))
        lr.add(Rectangulo(21.0, 3.0))
        lr.add(Rectangulo(5.0, 5.0))
        return lr
    }

    // Configura la lista de triángulos
    private fun configurarTriangulos(): IList<Triangulo> {
        val lt: IList<Triangulo> = TList()

        lt.add(Triangulo(1, 3.0, 4.0, 5.0))
        lt.add(Triangulo(2, 4.0, 10.0, 2.0))
        lt.add(Triangulo(3, 3.0, 4.0, 5.0))
        lt.add(Triangulo(4, 8.0, 6.0, 15.0))
        lt.add(Triangulo(5, 4.0, 5.0, 4.0))
        lt.add(Triangulo(6, 12.0, 15.0, 15.0))
        lt.add(Triangulo(7, 15.0, 36.0, 39.0))
        lt.add(Triangulo(8, 2.0, 2.0, 3.0))
        lt.add(Triangulo(9, 23.0, 24.0, 25.0))
        lt.add(Triangulo(10, 52.0, 20.0, 48.0))
        return lt
    }

    @Test
    fun pruebaMetodo1() {
        val listap = configurarEscenariosProductos()

        assertEquals(TList("Arroz", "Cebolla", "Queso"), metodo1(listap).sort());
        println("Prueba superada!!!")
    }

    @Test
    fun pruebaMetodo2() {
        val listap = configurarEscenariosProductos()

        assertEquals(7, metodo2(listap, 4))
        assertEquals(2, metodo2(listap, 1))
        println("Prueba superada!!")
    }

    @Test
    fun pruebaMetodo3() {
        val listap = configurarEscenariosProductos()

        assertEquals(TList(1, 3, 5, 7), metodo3(listap, 10).sort())
        println("Prueba superada!!!")
    }

    @Test
    fun pruebaMetodo4() {
        val listap = configurarEscenariosProductos()

        assertTrue(metodo4(listap))
        assertFalse(metodo4(listap.filter { it.cantidad < 100 }))
        println("Prueba superada!!!")
    }

    @Test
    fun pruebaMetodo5() {
        val listaP = configurarEscenariosProductos()

        assertEquals(111.83333, metodo5(listaP), 1e-5)
        println("Prueba superada!!!")
    }

    @Test
    fun pruebaMetodo6() {
        val listaD = leerArchivoDepartamentos()

        assertEquals("Bogotá", metodo6(listaD))
        println("Prueba superada!!!")
    }

    @Test
    fun pruebaMetodo7() {
        val listaD = leerArchivoDepartamentos()

        assertEquals("Amazonas", metodo7(listaD, 0)!!.nombre)
        assertEquals("Antioquia", metodo7(listaD, 1_000_000)!!.nombre)
        assertNull(metodo7(listaD, 15_000_000))
        println("Prueba superada!!!")
    }

    @Test
    fun pruebaMetodo8() {
        val listaD = leerArchivoDepartamentos()

        assertEquals(TList("Casanare", "Valle del Cauca"), metodo8(listaD))
        println("Prueba superada!!!")
    }

    @Test
    fun pruebaMetodo9() {
        val listaD = leerArchivoDepartamentos()

        assertEquals(15.151515, metodo9(listaD, 5.0), 1e-6)
        assertEquals(75.757575, metodo9(listaD, 100.0), 1e-6)
        println("Prueba superada!!!")
    }

    @Test
    fun pruebaMetodo10() {
        val listaD = leerArchivoDepartamentos()

        assertEquals(25807.47368, metodo10(listaD), 1e-5)
        println("Prueba superada!!!")
    }

    @Test
    fun pruebaMetodo11() {
        val lm = leerArchivoMunicipios()

        assertEquals(32, metodo11(lm))
        println("Prueba superada!!!")
    }

    @Test
    fun pruebaMetodo12() {
        val lm = leerArchivoMunicipios()

        assertEquals("Puerto Nariño", metodo12(lm, "Amazonas"))
        assertEquals("Duitama", metodo12(lm, "Boyacá"))
        assertEquals("Soledad", metodo12(lm, "Atlántico"))
        println("Prueba superada!!!")
    }

    @Test
    fun pruebaMetodo13() {
        val lm = leerArchivoMunicipios()

        assertEquals(38710.31578, metodo13(lm, "Huila"), 1e-5)
        assertEquals(21835.4, metodo13(lm, "Caquetá"))
        println("Prueba superada!!!")
    }

    @Test
    fun pruebaMetodo14() {
        val lm = leerArchivoMunicipios()

        assertEquals("Jambaló", metodo14(lm))
        println("Prueba superada!!!")
    }

    @Test
    fun pruebaMetodo15() {
        val lm = leerArchivoMunicipios()

        assertEquals(104, metodo15(lm))
        println("Prueba superada!!!")
    }

    @Test
    fun pruebaMetodo16() {
        val lr = configurarRectangulos()

        assertEquals(4, metodo16(lr))
        println("Prueba superada!!!")
    }

    @Test
    fun pruebaMetodo17() {
        val lr = configurarRectangulos()

        assertEquals(68.75, metodo17(lr))
        println("Prueba superada!!!")
    }

    @Test
    fun pruebaMetodo18() {
        val lr = configurarRectangulos()

        assertEquals(Rectangulo(base=14.0, altura=18.5), metodo18(lr))
        println("Prueba superada!!!")
    }

    @Test
    fun pruebaMetodo19() {
        val lr = configurarRectangulos()
        val res = metodo19(lr, 100.0).sort()

        assertEquals(2, res.size)
        assertEquals(23.2002155, res[0], 1e-7)
        assertEquals(23.3238, res[1], 1e-4)
        println("Prueba superada!!!")
    }

    @Test
    fun pruebaMetodo20() {
        val lt = configurarTriangulos()

        assertEquals(TList(6.0, 6.0, 270.0, 480.0), metodo20(lt).sort())
        println("Prueba superada!!!")
    }

    @Test
    fun pruebaMetodo21() {
        val lt = configurarTriangulos()

        assertEquals(TList(5, 8), metodo21(lt).sort())
        println("Prueba superada!!!")
    }
}