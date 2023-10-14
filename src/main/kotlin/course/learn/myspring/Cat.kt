package course.learn.myspring

class Cat : Pet {

    constructor() {
        println("Cat created $this")
    }

    override fun say() {
        println("Meow-meow")
    }

    fun init() {
        println("Cat : init method $this")
    }

    fun destroy() {
        println("Cat : destroy method $this")
    }
}