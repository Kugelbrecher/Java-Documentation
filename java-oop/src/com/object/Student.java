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

// we can have multiple classes in one file, but only one public class
//     and the public class should have the same name as the file
class Car {
    String brand;
    String color;
    int price;
}