package course.learn.myspring

import jakarta.annotation.PostConstruct
import jakarta.annotation.PreDestroy
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
@Scope("prototype")
class Dog : Pet {

    var name = "Sharik"

    init {
        println("Dog created $this")
    }

    override fun say() {
        println("$name: Bark-Bark")
    }

    @PostConstruct
    private fun init() {
        println("Dog : init method $this")
    }

    @PreDestroy
    private fun destroy() {
        println("Dog : destroy method $this")
    }
}