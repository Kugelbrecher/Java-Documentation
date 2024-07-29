package com.basicdemo;

public class FindPrimeNumber {
    public static void main(String[] args) {
        System.out.println(search(101,200));
        System.out.println(search2(101, 200));
        System.out.println(search3(101, 200));

        int countPrime = 0;
        for (int i = 101; i <= 200; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
                countPrime++;
            }
        }
        System.out.println(countPrime);
    }


    public static int search(int start, int end) {
        int countPrime = 0;

        for (int i = start; i <= end; i++) {
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    break;
                } else {
                    countPrime++;
                }
            }
        }

        return countPrime;
    }


    public static int search2(int start, int end) {
        int countPrime = 0;
        for (int i = start; i <= end; i++) {

            boolean flag = true;

            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(i);
                countPrime++;
            }
        }

        return countPrime;
    }


    public static int search3(int start, int end) {
        int countPrime = 0;

        OUT: // assign label for outer loop
        for (int i = start; i <= end; i++) {
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    continue OUT; // break the loop to OUT loop
                }
            }

            System.out.println(i);
            countPrime++;
        }

        return countPrime;
    }

    public static boolean checkPrime(int data) {
        for (int i = 2; i < data / 2; i++) {
            if (data % i == 0) {
                return false;
            }
        }

        return true;
    }

}
