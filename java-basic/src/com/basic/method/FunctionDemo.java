package com.basic.method;

public class FunctionDemo {
    // 1. order of methods does not matter
    // 2. method cannot contain method

    public static void main(String[] args) {
        int res = add(10, 20);
        System.out.println(res);

        printHelloWorld(3);

        int[] arr = {10, 20, 30, 40};
        printArray(arr);
    }

    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    // void <- no return
    public static void printHelloWorld(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World");
        }
    }

    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }

        System.out.println("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
} 
