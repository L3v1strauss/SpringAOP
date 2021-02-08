package com.springcourses.aop;

import com.springcourses.aop.aspects.Book;
import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook(Book book) {
        System.out.println("Берем книгу из UniLibrary" + " " + book.getName());
    }

    public void getMagazine(int i) {
        System.out.println("Берем журнал из UniLibrary");
    }


}
