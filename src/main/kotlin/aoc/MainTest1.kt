package aoc

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {
    val config = AnnotationConfigApplicationContext(MyConfig::class.java)

    val library = config.getBean("library", Library::class.java)
    library.getBook()

    config.close()

}