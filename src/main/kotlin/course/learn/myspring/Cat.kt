package course.learn.myspring

class Cat : Pet {
    init {
        println("Init Cat $this")
    }
    override fun say() {
        println("Meow-meow")
    }
}