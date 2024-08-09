package aoc

import org.springframework.stereotype.Component

@Component
class SchoolLibrary : AbstractLibrary() {

    override fun getBook() {
        println("Мы берем книгу из SchoolLibrary")
    }

    override fun getBookById(book: Book) {
        println("Мы берем книгу ${book.id} из SchoolLibrary")
    }

}