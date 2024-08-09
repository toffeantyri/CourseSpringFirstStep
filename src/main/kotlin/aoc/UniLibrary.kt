package aoc

import org.springframework.stereotype.Component

@Component
class UniLibrary : AbstractLibrary() {

    override fun getBook() {
        println("Мы берем книгу из UniLibrary")
    }

    override fun getBookById(book: Book) {
        println("Мы берем книгу ${book.id} из UniLibrary")
    }

    fun returnBook() {
        println("Мы возвращаем книгу в UniLibrary")
    }

    fun takeMagazine() {
        println("Мы берем журнал из UniLibrary")
    }

}