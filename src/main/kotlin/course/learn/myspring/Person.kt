package course.learn.myspring

class Person(val firstPet: Pet) {

    var secondPet: Pet? = null // you can use lateinit (setter generate by name)

    fun callYourFirstPet() {
        println("Hello! Where are your, my first pet?")
        firstPet.say()
    }

    fun callYourSecondPet() {
        println("Hello! Where are your, my second pet?")
        secondPet?.say()
    }

}