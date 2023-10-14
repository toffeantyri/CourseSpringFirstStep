package course.learn.myspring

//@Component("catBean")
//@Scope("singleton")
class Cat : Pet {

    var name = "Murzik"

    constructor() {
        println("Cat created $this")
    }

    override fun say() {
        println("${name}: Meow-meow")
    }

    //@PostConstruct
    private fun init() {
        println("Cat : init method $this")
    }

    //@PreDestroy
    private fun destroy() {
        println("Cat : destroy method $this")
    }
}