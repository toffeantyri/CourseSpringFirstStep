package aoc

import org.springframework.stereotype.Component

@Component
class SchoolLibrary : AbstractLibrary() {

    override fun getBook() {
        println("Мы берем книгу из SchoolLibrary")
    }

}