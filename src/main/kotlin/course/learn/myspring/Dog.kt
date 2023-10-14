package course.learn.myspring

import org.springframework.stereotype.Component

@Component
class Dog : Pet {

    var name = "Sharik"

    init {
        println("Dog created $this")
    }

    override fun say() {
        println("$name: Bark-Bark")
    }

    private fun init() {
        println("Dog : init method $this")
    }

    private fun destroy() {
        println("Dog : destroy method $this")
    }
}