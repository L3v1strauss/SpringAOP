package com.springcourses.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Берем книгу из UniLibrary");
    }

    public void getMagazine() {
        System.out.println("Берем журнал из UniLibrary");
    }


}
