package com.springcourses.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: trying to get back book to the library");
        long begin = System.currentTimeMillis();
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice: exception " + e + " was catched");
            targetMethodResult = "Unknown name";
//            throw e; пробрасывание исключения дальше
        }
        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: book was successfully gotten back to the library");
        System.out.println("aroundReturnBookLoggingAdvice: method returnBook have done work in a " + (end - begin) + " millis");
        return targetMethodResult;
    }
}
