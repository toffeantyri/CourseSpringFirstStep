package course.learn.myspring

class Dog : Pet {

    init {
        println("Dog created $this")
    }

    override fun say() {
        println("Bark-Bark")
    }

    fun init() {
        println("Dog : init method $this")
    }

    fun destroy() {
        println("Dog : destroy method $this")
    }
}