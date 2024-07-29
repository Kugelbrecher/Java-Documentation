package com.javabean;

public class Test {
    public static void main(String[] args) {
        // javabean only provides get set methods
        // as it is used for data storage
        Student s1 = new Student();
        s1.setName("John");
        s1.setScore(90);
        System.out.println(s1.getName() + " " + s1.getScore());

        // application:
        // 1. data storage in Student class
        // 2. data operation in StudentOperator class

        StudentOperator operator = new StudentOperator(s1);
        operator.printPass();
    }
}
