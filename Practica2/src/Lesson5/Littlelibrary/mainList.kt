package Lesson5.Littlelibrary

fun main() {
    val allBooks = setOf("El alquimista", "El guerrero de luz", "El vencedor")

    val library = mapOf(allBooks to "Paolo Coelho")

    val containsHamlet = library.keys.any { bookSet ->
        bookSet.contains("EL alquimista")
    }
    println("Library contains 'El alquimista': $containsHamlet")

    val moreBooks = mutableMapOf<String, String>()
    moreBooks["El poder del silencio"] = "Carlos Castaneda"

    val bookTitle = "Moby Dick"
    val author = moreBooks.getOrPut(bookTitle) { "Herman Melville" }

    println("Author of $bookTitle: $author")

    println("More Books")
    moreBooks.forEach { (title, author) ->
        println("$title by $author")
    }
}
