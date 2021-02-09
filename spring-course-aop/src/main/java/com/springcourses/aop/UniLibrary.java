package com.springcourses.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Берем книгу из UniLibrary");
        System.out.println("----------------------------------------");
    }

    public void getMagazine() {
        System.out.println("Берем журнал из UniLibrary");
        System.out.println("----------------------------------------");
    }

    public String returnBook() {
        int a = 10/0;
        System.out.println("Возвращаем книгу в UniLibrary");
        return "The war and the world";
    }

    public void returnMagazine() {
        System.out.println("Возвращаем журнал в UniLibrary");
        System.out.println("----------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Добовляем книгу из UniLibrary");
        System.out.println("----------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Добовляем журнал из UniLibrary");
        System.out.println("----------------------------------------");
    }


}
