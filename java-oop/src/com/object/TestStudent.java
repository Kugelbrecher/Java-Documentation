package com.object;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Alice";
        student1.languageScore = 80;
        student1.mathScore = 90;
        student1.printTotalScore();
        student1.printAverageScore();

        Student student2 = new Student();
        student2.name = "Bob";
        student2.languageScore = 70;
        student2.mathScore = 85;
        student2.printTotalScore();
        student2.printAverageScore();
    }
}
