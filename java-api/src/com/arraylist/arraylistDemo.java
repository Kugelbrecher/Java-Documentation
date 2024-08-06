package com.arraylist;

import java.util.ArrayList;

public class arraylistDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Mango Lassi");
        list.add("Apple");
        list.add("Banana");
        list.add("Pineapple");

        // wrong way to remove element containing "Mango"
//        for (int i = 0; i < list.size(); i++) {
//            String ele = list.get(i);
//            if (ele.contains("Mango")) {
//                list.remove(ele);
//            }
//        }
//        System.out.println("After removing Mango: " + list); // Mango Lassi is not removed

        // solution 1: reduce index by 1 when removing element
        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            if (ele.contains("Mango")) {
                list.remove(ele);
                i--;
            }
        }
        System.out.println("Solution 1 removing Mango: " + list);

        list.add(0, "Mango");
        list.add(1, "Mango Lassi");
        // solution 2: traverse from end to start
        for (int i = list.size() - 1; i >= 0; i--) {
            String ele = list.get(i);
            if (ele.contains("Mango")) {
                list.remove(ele);
            }
        }
        System.out.println("Solution 2 removing Mango: " + list);

    }
}
