package com.springcourses.aop.aspects;

import com.springcourses.aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice : логируем получение списка студентов" +
//                "перед методом getStudents");
//    }
//
//    @AfterReturning(pointcut = "execution(* getStudents())",
//    returning = "students")
//    public void AfterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurename();
//        nameSurname = "Mr." + nameSurname;
//        firstStudent.setNameSurename(nameSurname);
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 0.5;
//        firstStudent.setAvgGrade(avgGrade);
//        System.out.println("AfterReturningGetStudentsLoggingAdvice : логируем получение списка студентов" +
//                "после работы методом getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())",
//    throwing = "exception")
//    public void AfterThrowingGetStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("AfterThrowingGetStudentsLoggingAdvice : логгируем выброс исключения " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: логгируем нормальное окончание метода" +
                " или выброс исключения");
    }
}
