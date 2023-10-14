package course.learn.myspring.config_code

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@Configuration
@ComponentScan("course.learn.myspring")
@PropertySource("application.properties")
class MyConfig {

}