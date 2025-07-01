package Lesson5.Littlelibrary

class Book(val title: String, val author: String, val year: Int) {

    fun getTitleAuthor(): Pair<String, String> {
        return Pair(title, author)
    }

    fun bookInfo(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}
