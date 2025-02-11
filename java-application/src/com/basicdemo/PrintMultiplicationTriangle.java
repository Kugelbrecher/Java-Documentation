package com.basicdemo;

public class PrintMultiplicationTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + j * i + '\t');
            }
            System.out.println( );
        }

        for (int i = 1; i <= 4; i++) {
            int spaces = 4 - i;
            int stars = 2 * i - 1;
            System.out.println(" ".repeat(spaces) + "*".repeat(stars));
        }
    }
}
