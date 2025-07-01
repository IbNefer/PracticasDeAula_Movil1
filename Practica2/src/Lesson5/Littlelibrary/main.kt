package Lesson5.Littlelibrary



fun main() {
    val book = Book("1984", "George Orwell", 1949)

    val (title, author) = book.getTitleAuthor()
    println("Title and Author: $title by $author")

    val (t, a, y) = book.bookInfo()
    println("Here is your book \"$t\" written by $a in $y.")
}
