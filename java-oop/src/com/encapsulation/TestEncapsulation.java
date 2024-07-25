package com.encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Alice";
//        student1.score // cannot access private field

        student1.setScore(120);
        System.out.println(student1.getScore()); // 0.0 as default null value for double
        student1.setScore(80);
        System.out.println(student1.getScore());
    }
}
