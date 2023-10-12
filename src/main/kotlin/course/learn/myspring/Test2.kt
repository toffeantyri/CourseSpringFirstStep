package course.learn.myspring

import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val context: ClassPathXmlApplicationContext = ClassPathXmlApplicationContext("applicationContext.xml")
    val pet: Pet = context.getBean("myPet", Pet::class.java)
    val person = context.getBean("myPerson", Person::class.java)
    
    person.callYourPet()
    context.close()
}