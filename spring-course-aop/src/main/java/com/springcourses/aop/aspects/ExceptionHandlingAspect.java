package com.springcourses.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {
    @Before("com.springcourses.aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeExceptionHandlingAdvice() {
        System.out.println("beforeExceptionHandlingAdvice: ловим/обрабатываем исключение" +
                " при попытке получить книгу/журнал");
    }
}
