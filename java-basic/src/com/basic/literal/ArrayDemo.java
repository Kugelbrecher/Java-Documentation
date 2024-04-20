package com.basic.literal;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        // 1.
        int[] ages = new int[]{12, 24, 30};
        double[] scores = new double[]{89.5, 98.7, 92.3};
        // gives reference, not value
        System.out.println(ages);
        System.out.println(scores);

        // 2.
        int[] ages2 = {12, 24, 30};
        double[] scores2 = {89.5, 98.7, 92.3};
        System.out.println(ages2[1]);
        ages2[2] = 12;
        System.out.println(ages2[2]);
        System.out.println(scores2.length);

        // 3.
        int ages3[] = {12, 24, 30};
        double scores3[] = {89.5, 98.7, 92.3};
        int sum = 0;
        for (int i = 0; i < ages3.length; i++) {
            System.out.println(ages3[i]);
            sum += ages3[i];
        }
        System.out.println("total ages: " + sum);

        // 4.
        int[] ages4 = new int[3]; // [0,0,0], same for byte, short, char, int, long
        ages4[0] = 12;
        ages4[1] = 24;
        ages4[2] = 30;
        System.out.println(ages4[2]);
        double[] scores4 = new double[3]; // [0.0,...]
        boolean[] check = new boolean[3]; // [false,...]
        // others, like String -> null
        String[] names = new String[3];
        System.out.println(names[2]);

        // example
        double[] scores1 = new double[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < scores1.length; i++) {
            System.out.println("Grade of " + (i + 1) + ':');
            double score = sc.nextDouble();
            scores1[i] = score;
        }

        double sum1 = 0;
        for (int i = 0; i < scores1.length; i++) {
            sum1 += scores[i];
        }
        System.out.println(sum1);

    }
}
