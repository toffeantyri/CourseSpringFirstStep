package course.learn.myspring.config_code

import course.learn.myspring.Person
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {

    val context = AnnotationConfigApplicationContext(MyConfig::class.java)

    val person = context.getBean("personBean", Person::class.java)

    person.callYourFirstPet()
    person.callYourSecondPet()
    println(person.name)
    println(person.age)

}