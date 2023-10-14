package course.learn.myspring

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component
import kotlin.properties.Delegates

@Component("personBean")
class Person {
    var firstPet: Pet? = null

    @Qualifier("dog")
    @Autowired
    var secondPet: Pet? = null // you can use lateinit (setter generate by name)

    var age by Delegates.notNull<Int>()
    lateinit var name: String

    @Autowired
    constructor(@Qualifier("catBean") firstPet: Pet) {
        this.firstPet = firstPet
    }

    fun callYourFirstPet() {
        println("Hello! Where are your, my first pet?")
        firstPet?.say()
    }

    fun callYourSecondPet() {
        println("Hello! Where are your, my second pet?")
        secondPet?.say()
    }

    fun sayMyNameIs() {
        println("My name is $name")
    }

    fun sayMyAge() {
        println("My age is $age")
    }

}