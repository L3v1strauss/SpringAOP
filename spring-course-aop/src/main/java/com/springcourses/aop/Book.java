package com.springcourses.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Город ангелов")
    String name;

    public String getName() {
        return name;
    }
}
