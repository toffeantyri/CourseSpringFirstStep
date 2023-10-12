package course.learn.myspring

class Person(val pet: Pet) {

    fun callYourPet() {
        println("Hello! Where are your, my dear pet?")
        pet.say()
    }

}