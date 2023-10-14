package course.learn.myspring

import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {

    val context = ClassPathXmlApplicationContext("applicationContext3.xml")

//
//    val cat = context.getBean("catBean", Cat::class.java)
//    val dog = context.getBean("dog", Pet::class.java)
//
//    val dog2 = context.getBean("dog", Dog::class.java).apply {
//        name = "Tuzik"
//    }
//
//    cat.say()
//    dog.say()
//    dog2.say()

    val person = context.getBean("personBean", Person::class.java)

//    person.callYourFirstPet()
//    person.callYourSecondPet()
    println(person.name)
    println(person.age)

    context.close()

}
