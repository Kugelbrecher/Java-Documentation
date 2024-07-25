package com.encapsulation;

public class Student {
    public String name;
    private double score;

    // how can we access the private field?
    public void setScore(double score) {
        // control the value of score provided by the user
        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
            return;
        }
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    private void printPass() {
        System.out.println(score >= 60 ? "Pass" : "Fail");
    }
}
