package aoc

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.stereotype.Component


@Component
@Aspect
class AspectLibrary {

    //@Before("execution(* *getBook())") //it work too
    //@Before("execution(public (*) getBook())")
    @Before("execution(* getBook())")
    //@Before("execution(public void getBook())") //it work too
    fun beforeGetBookAdvice() {
        println("beforeGetBookAdvice попытка взять книгу")
    }
}