package com.application;

import java.util.Scanner;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        int[] moneys = {9, 666, 188, 520, 99999, 0};
        start(moneys);
    }

    public static void start(int[] moneys) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter arbitrary code to start lottery: ");
            sc.next(); // wait the user typing, press enter then run next code

            while (true) {
                int idx = r.nextInt(moneys.length);
                int money = moneys[idx];

                if (money != 0) {
                    System.out.println("You win: " + money + " dollars!");
                    moneys[idx] = 0;
                    break;
                }
            }
        }

        System.out.println("lottery ended");
    }
}
