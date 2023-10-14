package course.learn.myspring

class Dog : Pet {

    init {
        println("Dog created $this")
    }

    override fun say() {
        println("Bark-Bark")
    }
}