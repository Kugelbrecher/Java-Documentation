package com.basic.variable;

import javax.xml.validation.SchemaFactoryLoader;

public class VariableDemo2 {
    public static void main(String[] args) {
        //1. auto type conversion
        // byte -> short -> int -> long -> float -> double
        // char -> int
        byte a = 12; //8units
        int b = a; //32units 4bytes
        System.out.println(a);
        System.out.println(b);

        int c = 100;
        double d = c;
        System.out.println(d);

        char ch = 'a';
        int i = ch;
        System.out.println(i);


        //2. auto type conversion from arithmetic expression
        // determined by longest data type
        byte x = 10;
        int y = 20;
        long z = 30;
        long rs = x + y + z;
        System.out.println(rs);

        double rs2 = x + y + 30.0;
        System.out.println(rs2);

        // byte short char -> int
        short j = 30;
        int k = x + j;
        System.out.println(k);

        //3. enforced type conversion
        // larger to smaller
        int p = 20;
        byte q = (byte)p;
        System.out.println(q); // 20

        int p2 = 200;
        byte q2 = (byte)p2;
        System.out.println(q2); // -56 data loss

        double p3 = 99.5;
        int q3 = (int)p3;
        System.out.println(q3); // 90 remove decimals


    }
}
