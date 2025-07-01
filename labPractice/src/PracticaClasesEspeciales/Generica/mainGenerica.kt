package PracticaClasesEspeciales.Generica

fun main() {
    val cajaDeTexto = Caja("Hola Mundo 👋")

    val cajaVacia = Caja<Int?>(null)

    println("Probando la Caja de Texto ")
    println("Contenido: ${cajaDeTexto.obtenerContenido()}")
    println("¿Está vacía?: ${cajaDeTexto.estaVacia()}")

    println(" Probando la Caja Vacía ")
    println("Contenido: ${cajaVacia.obtenerContenido()}")
    println("¿Está vacía?: ${cajaVacia.estaVacia()}")
}