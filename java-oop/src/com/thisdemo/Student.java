package com.thisdemo;

public class Student {
    double score;

    public void printThis() {
        // this is a reference variable that refers to the current object
        System.out.println(this);
    }

    public void printPass(double score) {
        // avoid conflict between instance variable and local variable
        if (this.score >= score) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }
}
