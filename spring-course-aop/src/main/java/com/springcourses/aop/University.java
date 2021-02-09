package com.springcourses.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student student1 = new Student("Katty Perry", 3, 7.5);
        Student student2 = new Student("Asap Rocky", 4, 8.5);
        Student student3 = new Student("Lil Wayne", 5, 9.5);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents() {
        System.out.println("Information from method getStudents");
        System.out.println(students);
        return students;
    }
}
