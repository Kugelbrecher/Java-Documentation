package com.basic.variable;

public class VariableDemo3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int c = 5;

        System.out.println(a + b);
        System.out.println(a - b);

        System.out.println(a * b);

        System.out.println(a / b);
        System.out.println(c / b); // 2 -> highest length is int
        System.out.println(1.0 * c / b); // 2.5

        System.out.println(a % b);
        System.out.println(c % b);

        System.out.println("abc" + a + 'a'); // abc10a
        System.out.println(a + 'a' + "abc"); // 107abc -> ASCII of a
        System.out.println('a' + a + "abc"); // 107abc -> ASCII

        //System.out.println(a++); // still 10
        a++;
        System.out.println(a); // 11
        ++a;
        System.out.println(a); // 12
        a--;
        System.out.println(a); // 11
        --a;
        System.out.println(a); // 10

        int i = 10;
        int rs = ++i; // add first then assign
        System.out.println(rs); // 11
        System.out.println(i); // 11
        int i2 = 10;
        int rs2 = i2++; // assign first then add
        System.out.println(rs2); // 11
        System.out.println(i2); // 10

        int x = 5;
        int y = 3;
        // x: 5 6 5 4
        // y: 3 4 3
        //        6 -  5  +  5  - 4   + 4   + 3
        int z = ++x - --x + x-- - ++y + y-- + 3;
        System.out.println(z);
        System.out.println(x);
        System.out.println(y);
    }
}
