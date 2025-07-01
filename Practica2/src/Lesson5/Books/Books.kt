package Lesson5.Books

open class Books(val title: String, val author: String){
      var currentPage = 0

      open fun readPage() {
        currentPage += 1
        println("Reading page $currentPage of '$title', written by $author.")
      }

}

open class ebook(title: String, author: String, val format: String = "text"): Books(title, author){
    var countWord: Int = 0

    override fun readPage() {
        countWord += 250
        println("I read more than $countWord of the book $title.")

    }
}
