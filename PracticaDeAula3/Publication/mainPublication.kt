package PracticaDeAula3.Publication

fun main() {
    val libro = Libro("Cien Años de Soledad", "Gabriel García Márquez", 417)
    val articulo = ArticuloDeRevista("La Física del Caos", "Lisa Randall", "Revista Científica")

    println("Libro: ${libro.titulo} de ${libro.autor}, ${libro.numeroPaginas} páginas")
    println("Artículo: ${articulo.titulo} de ${articulo.autor}, publicado en ${articulo.nombreRevista}")
}
