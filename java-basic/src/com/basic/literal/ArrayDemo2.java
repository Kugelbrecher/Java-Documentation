package com.basic.literal;

import java.util.Random;
import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = arr1;

        // point to same location
        System.out.println(arr1);
        System.out.println(arr2);

        // both arrays change
        arr2[5] = 99;
        System.out.println(arr1[0]);

        int[] arr3 = null;
        System.out.println(arr3); // null
        //System.out.println(arr3[0]); // NullPointerException -> not stored in memory

        // find max
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        System.out.println("max: " + max);

        // reverse array
        int[] arr4 = {10, 20, 30, 40, 50};

        for (int i = 0, j = arr4.length - 1; i < j; i++, j--) {
            int temp = arr4[i];
            arr4[i] = arr4[j];
            arr4[j] = temp;
        }

        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }

        // random switch
        Random r = new Random();
        for (int i = 0; i < arr4.length; i++) {
            int index = r.nextInt(arr4.length);
            int temp = arr4[index];
            arr4[index] = arr4[i];
            arr4[i] = temp;
        }

        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }

    }
}
