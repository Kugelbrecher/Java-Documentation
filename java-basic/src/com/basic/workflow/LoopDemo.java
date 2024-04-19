package com.basic.workflow;

public class LoopDemo {
    public static void main(String[] args) {
        for(int i = 0; i < 11; i++) {
            System.out.println("i=" + i);
            if(i == 4) {
                break;
            }
        }


        for (int j = 0; j <= 10; j+=2) {
            if (j == 4) {
                continue;
            }
            System.out.println("j=" + j);
        }


        int i = 5;
        while (i > 0) {
            System.out.println("i=" + i);
            i--;
        }


        do {
            System.out.println("print first then check");
        } while (false);

        int m = 3;
        do {
            System.out.println("m=" + m);
            m--;
        } while (m > 0);

    }
}
