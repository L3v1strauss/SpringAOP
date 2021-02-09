package com.springcourses.aop.aspects;

import com.springcourses.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {
    @Before("com.springcourses.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName = " + methodSignature.getName());
        if(methodSignature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for (Object arg : args) {
                if(arg instanceof Book) {
                    Book myBook = (Book) arg;
                    System.out.println("Book information - " + myBook.getName() + ", author - " +
                            myBook.getAuthor() + ", year of publication - " + myBook.getYearOfPublication());
                } else if (arg instanceof String) {
                    System.out.println("Book is added to library by " + arg);
                }
            }
        }

        System.out.println("beforeAddLoggingAdvice: логирование " +
                " попытка получить книгу/журнал");
        System.out.println("----------------------------------------");
    }


}
