package aoc

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {
    val config = AnnotationConfigApplicationContext(MyConfig::class.java)

    val library1 = config.getBean("uniLibrary", UniLibrary::class.java)
    val library2 = config.getBean("schoolLibrary", SchoolLibrary::class.java)
    library1.getBook()
    library2.getBook()

    library1.returnBook()
    library1.takeMagazine()

    config.close()

}