package com.basic.variable;

public class VariableDemo {
    public static void main(String[] args) {
        //1. integer
        int age = 23;
        System.out.println(age);

        //2. float
        double score = 99.5;
        System.out.println(score);

        //3. assign
        int age2; // optional assigning the value
        age2 = 35;
        age2 = age2 + 1;
        System.out.println(age2);

        //4. variable can only be referred within {}
        {
            int a = 19;
            System.out.println(a);
        }
    }
}
