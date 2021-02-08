package com.springcourses.aop;

import org.springframework.stereotype.Component;

@Component
public class Library extends AbstractLibrary {

    public void getBook() {
        System.out.println("Мы берем книгу");
    }
}
