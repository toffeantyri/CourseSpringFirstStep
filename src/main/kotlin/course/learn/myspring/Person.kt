package course.learn.myspring

import org.springframework.beans.factory.annotation.Value

//@Component("personBean")
class Person {
    var firstPet: Pet? = null

    //    @Qualifier("dog")
//    @Autowired
    var secondPet: Pet? = null // you can use lateinit (setter generate by name)

    @Value("36")
    var age: Int? = null

    @Value("\${person.name}")
    var name: String? = null

    //@Autowired
    constructor(/*@Qualifier("catBean") */firstPet: Pet) {
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