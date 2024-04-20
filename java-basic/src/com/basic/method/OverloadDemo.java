package com.basic.method;

public class OverloadDemo {
    public static void main(String[] args) {
        mail();
        mail("John");
        mail("John", 0);
        mail("John", 4);
    }

    public static void test() {
        System.out.println("pure test");
    }

    public static void test(int a) {
        System.out.println("ok with an argument");
    }

    void test(double a) {
        System.out.println("ok with different argument, regardless of public static");
    }

    void test(int a, int b) {
        System.out.println("ok with different number of arguments");
    }

    double test(double a, int b) {
        System.out.println("ok with different position of arguments");
        return a;
    }

    double test(int a, double b) {
        System.out.println("ok with different position of arguments");
        return b;
    }

    // example
    public static void mail() {
        System.out.println("sent an email");
    }

    public static void mail(String name) {
        System.out.println("sent an email to" + name);
    }

    public static void mail(String name, int num) {
        if (num <=0) {
            System.out.println("no email sent");
            return;
        }

        System.out.println("sent " + num + " emails to" + name);
    }

}
