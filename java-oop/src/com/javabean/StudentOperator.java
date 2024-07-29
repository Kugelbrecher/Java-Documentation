package com.javabean;

public class StudentOperator {
    // create a Student object to pass data
    private Student student;

    public StudentOperator(Student student) {
        this.student = student;
    }

    public void printPass() {
        if (student.getScore() >= 60) {
            System.out.println(student.getName() + " passed");
        } else {
            System.out.println(student.getName() + " failed");
        }
    }
}
