package com.constructor;

public class Student {
    String name;
    double score;
    // a constructor is when the class is the same name as the class
    // constructor without parameter
    public Student() {
        System.out.println("This is a constructor without parameter");
    }

    // constructor with parameter
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
        System.out.println("This is a constructor with parameter");
    }
}
