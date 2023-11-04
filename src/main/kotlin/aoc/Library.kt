package aoc

import org.springframework.stereotype.Component

@Component("library")
class Library {

    fun getBook() {
        println("Мы берем книгу")
    }

}