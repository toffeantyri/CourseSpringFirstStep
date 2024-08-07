package aoc

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.stereotype.Component


@Component
@Aspect
class AspectLibrary {

    @Before("execution(public void aoc.UniLibrary.getBook())")
    fun beforeGetBookAdvice() {
        println("beforeGetBookAdvice попытка взять книгу из UniLibrary")
    }

    @Before("execution(public * getBook())")
    fun beforeGetBookAdvice2() {
        println("beforeGetBookAdvice попытка взять книгу из любой Library")
    }

    @Before("execution(* take*())")
    fun beforeTakeMagazineAdvice() {
        println("beforeTakeMagazineAdvice попытка взять журнал")
    }
}