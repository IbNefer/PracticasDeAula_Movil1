package PracticaDeAula3.Publication

import Publication.Libro
import Publication.ArticuloRevista

fun main() {
    val libro = Libro("Cien Años de Soledad", "Gabriel García Márquez", "Daniel")
    val articulo = ArticuloRevista("La Física del Caos", "Lisa Randall", "Revista Científica")

    println("Libro: ${libro.titulo} de ${libro.Autor}, ${libro.numeroPaginas} páginas")
    println("Artículo: ${articulo.titulo} de ${articulo.Autor}, publicado en ${articulo.nombreRevista}")
}

