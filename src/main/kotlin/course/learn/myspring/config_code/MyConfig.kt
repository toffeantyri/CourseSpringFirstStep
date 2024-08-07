package course.learn.myspring.config_code

import course.learn.myspring.Cat
import course.learn.myspring.Dog
import course.learn.myspring.Person
import course.learn.myspring.Pet
import org.springframework.context.annotation.*

@Configuration
@ComponentScan("course.learn.myspring")
@PropertySource("classpath:application.properties")
class MyConfig {


    @Bean
    @Scope("singleton")
    fun catBean(): Pet {
        return Cat()
    }

    @Bean
    fun dogBean(): Pet {
        return Dog()
    }

    @Bean
    @Scope("prototype")
    fun personBean(): Person {
        return Person(catBean()).apply {
            secondPet = dogBean()
        }
    }

}