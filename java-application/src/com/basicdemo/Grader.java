package com.basicdemo;

import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        System.out.println("average score is: " + getAverageScore(6));
    }

    public static double getAverageScore(int num) {
        int[] scores = new int[num];
        Scanner sc = new Scanner(System.in);
        // shortcut: scores.fori
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter score from " + (i + 1) + " grader: ");
            int score = sc.nextInt();
            scores[i] = score;
        }

        int maxScore = 0;
        int minScore = scores[0];
        int sumScore = 0;
        for (int i = 0; i < scores.length; i++) {
            int curScore = scores[i];
            if (curScore > maxScore) {
                maxScore = curScore;
            }
            else if (curScore < minScore) {
                minScore = curScore;
            }
            sumScore += curScore;
        }

        double avgScore = 1.0 * (sumScore - minScore - maxScore) / (num - 2);
        return avgScore;
    }
}