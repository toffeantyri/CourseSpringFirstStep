package course.learn.myspring

import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val context = ClassPathXmlApplicationContext("applicationContext2.xml", "applicationContext.xml")

    val pet: Pet = context.getBean("myDog", Dog::class.java)
    val pet2: Pet = context.getBean("myCat", Cat::class.java)

    println(pet == pet2)

    println(pet)
    println(pet2)


}