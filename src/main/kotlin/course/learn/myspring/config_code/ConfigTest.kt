package course.learn.myspring.config_code

import course.learn.myspring.Person
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {

    val context = AnnotationConfigApplicationContext(MyConfig::class.java)

    val person = context.getBean("personBean", Person::class.java)
    val person2 = context.getBean("personBean", Person::class.java)

    println(person.name + " " + person.age)
    person.callYourFirstPet()
    person.callYourSecondPet()


    println(person2.name + " " + person.age)
    person2.callYourFirstPet()
    person2.callYourSecondPet()


}