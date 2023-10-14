package course.learn.myspring

import kotlin.properties.Delegates

class Person(private val firstPet: Pet) {

    var secondPet: Pet? = null // you can use lateinit (setter generate by name)

    var age by Delegates.notNull<Int>()

    lateinit var name: String

    fun callYourFirstPet() {
        println("Hello! Where are your, my first pet?")
        firstPet.say()
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