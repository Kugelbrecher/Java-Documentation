package com.object;

public class Student {
    String name;
    double languageScore;
    double mathScore;

    public void printTotalScore() {
        double total = languageScore + mathScore;
        System.out.println(name + "'s total score: " + total);
    }

    public void printAverageScore() {
        double average = (languageScore + mathScore) / 2;
        System.out.println(name + "'s average score: " + average);
    }
}
