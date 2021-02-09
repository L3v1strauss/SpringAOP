package com.springcourses.aop;

public class Student {
    private String nameSurename;
    private int course;
    private double avgGrade;

    public Student(String nameSurename, int course, double avgGrade) {
        this.nameSurename = nameSurename;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getNameSurename() {
        return nameSurename;
    }

    public void setNameSurename(String nameSurename) {
        this.nameSurename = nameSurename;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurename='" + nameSurename + '\'' +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
