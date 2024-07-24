package com.object;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student(); // create an object of Student in heap memory
        student1.name = "Alice"; // property
        student1.languageScore = 80;
        student1.mathScore = 90;
        student1.printTotalScore(); // method
        student1.printAverageScore();

        Student student2 = new Student();
        student2.name = "Bob";
        student2.languageScore = 70;
        student2.mathScore = 85;
        student2.printTotalScore();
        student2.printAverageScore();

        // stack memory -> heap memory
        System.out.println(student1); // this is a reference in stack memory
        System.out.println(student2); // this is a reference in stack memory
        // the detail information of student1 and student2 are stored in heap memory

        // values of object properties are not influenced by each other
        //    however, we cannot point to the same object
        Student student3 = student1;
        student3.name = "Charlie";
        System.out.println(student1.name); // student1 is influenced by student3

        // a trash object is when no reference is pointing to it
        //    and it will be collected by the garbage collector
        student1 = null;
        System.out.println(student1.name); // gives a NullPointerException error
    }
}
