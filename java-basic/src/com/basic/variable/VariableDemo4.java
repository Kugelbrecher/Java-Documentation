package com.basic.variable;

public class VariableDemo4 {
    public static void main(String[] args) {
        double a = 9.5;
        double b = 520;
        a += b; // ==> a = (double)(a + b);
        System.out.println(a);

        double i = 600;
        double j = 520;
        i -= j;
        System.out.println(i);

        int m = 10;
        int n = 5;
        m *= n;
        System.out.println(m);
        m /= n;
        System.out.println(m);
        m %= n;
        System.out.println(m);

        byte x = 10;
        byte y = 30;
        // Error: x = x + y; ==> x = byte(x+y);
        x += y;
        System.out.println(x);
        boolean rs = x > y; // 40 > 30
        System.out.println(rs);
        boolean rs1 = x >= y;
        System.out.println(rs1);
        boolean rs2 = x < y;
        System.out.println(rs2);
        boolean rs3 = x <= y;
        System.out.println(rs3);
        boolean rs4 = x == y;
        System.out.println(rs4);
        boolean rs5 = x != y;
        System.out.println(rs5);
        // System.out.println(x = y); // 30 -> assign x = 30

        double size = 9.8;
        int storage = 16;
        boolean res = size >= 6.95 & storage >= 32;
        System.out.println(res);
        boolean res1 = size >= 6.95 | storage >= 32;
        System.out.println(res1);
        boolean res2 = !(size >= 6.95 & storage >= 32);
        System.out.println(res2);
        boolean res3 = true ^ true;
        System.out.println(res3);
        boolean res4 = true ^ false;
        System.out.println(res4);
        boolean res5 = false && true; // same as &, stop if left side is false
        System.out.println(res5);
        boolean res6 = true || false; // same as |, stop if left side is true
        System.out.println(res6);
    }
}
