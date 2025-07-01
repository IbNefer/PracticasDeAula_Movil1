package Lesson5.otherBooks

import kotlin.random.Random

const val MAX_BOOKS = 5

class Book(val title: String, val author: String, val year: Int, var pages: Int) {

    fun canBorrow(currentBooks: Int): Boolean {
        return currentBooks < MAX_BOOKS
    }

    fun printUrl() {
        println("${title.replace(" ", "_")} catalog page: ${BASE_URL}${title.replace(" ", "_")}.html")
    }

    companion object {
        const val BASE_URL = "https://library.mybooks.org/catalog/"
    }
}

fun Book.weight(): Double {
    return pages * 1.5
}

fun Book.tornPages(count: Int) {
    pages = (pages - count).coerceAtLeast(0)
}

class Puppy {
    fun playWithBook(book: Book) {
        val torn = Random.nextInt(1, 11)
        println("Puppy tore out $torn pages from '${book.title}'!")
        book.tornPages(torn)
    }
}

fun main() {
    val book = Book("The Alchemist", "Paulo Coelho", 1988, pages = 100)

    println("Can you borrow more books? ${book.canBorrow(3)}")
    println("Can you borrow more books? ${book.canBorrow(5)}")

    book.printUrl()
    println("Initial book weight: ${book.weight()} grams")

    val puppy = Puppy()

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("Remaining pages: ${book.pages}, Current weight: ${book.weight()} grams")
    }

    println("The book '${book.title}' has no more pages left.")
}


