package com.basic.literal;

public class LiteralDemo {
    public static void main(String[] args) {
        //1. int
        System.out.println(666);

        //2. float
        System.out.println(99.5);

        //3. character
        System.out.println('q');
        System.out.println(' ');
        System.out.println('\n');
        System.out.println('6');
        System.out.println('\t');
        System.out.println('x');

        //4. string
        System.out.println("hello");

        //5. boolean
        System.out.println(true);
        System.out.println(false);

        //6. ASCII
        System.out.println('a' + 10); // 97 + 10 = 107
        System.out.println('A' + 10); // 65 + 10 = 75
        System.out.println('0' + 10); // 48 + 10 = 58

        //7. 2 - 8 - 16 decimals
        System.out.println(0B01100001); //2: 97
        System.out.println(0141); //8: 97
        System.out.println(0XFA); //16: 250

        //8
        // minimal unit: byte, 1byte=8bits, 1B=8b
        // 1KB = 1024B
        // 1MB = 1024KB
        // 1GB = 1024MB
        // 1TB = 1024GB
    }
}
