package course.learn.myspring

import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val context: ClassPathXmlApplicationContext = ClassPathXmlApplicationContext("applicationContext.xml")

    val person = context.getBean("myPerson", Person::class.java)

    person.apply {
        callYourFirstPet()
        callYourSecondPet()
        sayMyNameIs()
        sayMyAge()
    }
    context.close()

}