package com.thisdemo;

public class TestThis {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1);
        student1.printThis();

        System.out.println("--------------------");

        Student student2 = new Student();
        System.out.println(student2);
        student2.printThis();

        System.out.println("--------------------");

        Student student3 = new Student();
        student3.score = 80;
        student3.printPass(60);
    }
}
