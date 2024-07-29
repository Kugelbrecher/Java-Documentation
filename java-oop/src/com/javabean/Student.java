package com.javabean;

public class Student {
    // 1. all fields should be private in java bean
    private String name;
    private double score;

    // 3. public constructor without args
    // if we do not provide this, java auto create it
    // shortcut: right click -> generate -> constructor
    public Student() {
    }

    // if there is a constructor with param, a non-param also be provided
    public Student(double score, String name) {
        this.score = score;
        this.name = name;
    }

    // 2. provide get set method for private fields
    // shortcut: right click -> generator -> getter setter
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
