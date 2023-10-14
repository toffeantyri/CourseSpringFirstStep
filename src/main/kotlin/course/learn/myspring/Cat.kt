package course.learn.myspring

import org.springframework.stereotype.Component

@Component("catBean")
class Cat : Pet {

    var name = "Murzik"

    constructor() {
        println("Cat created $this")
    }

    override fun say() {
        println("${name}: Meow-meow")
    }

    private fun init() {
        println("Cat : init method $this")
    }

    private fun destroy() {
        println("Cat : destroy method $this")
    }
}