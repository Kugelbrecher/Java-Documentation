package com.basic.workflow;

public class ConditionDemo {
    public static void main(String[] args) {
        double score = 98.5;
        String grade = score >= 60 ? "passed" : "failed";
        System.out.println(grade);


        double t = 36.9;
        if (t < 18.9) {
            System.out.println("not enough money");
        } else {
            System.out.println("payment done");
        }


        int age = 300;
        if (age >= 0 && age < 18) {
            System.out.println("child");
        } else if (age >= 18 && age < 24) {
            System.out.println("young age");
        } else if (age >= 24 && age < 54) {
            System.out.println("prime age");
        } else {
            System.out.println("retired");
        }


        String week = "Monday";
        switch (week) {
            case "Monday":
                System.out.println("This is Monday");
                break;
            case "Tuesday":
                System.out.println("This is Tuesday");
                break;
            case "Wednesday":
                System.out.println("This is Wednesday");
                break;
            case "Thursday":
                System.out.println("This is Thursday");
                break;
            default:
                System.out.println("not a valid week");
        }
        // 1. not support double, float, long with switch:
        // long type: not necessary as int is already lots of units
        // double: double + double not as expected in math

        // 2. case can only be followed by value, not variable

        // 3. break is a must, o.w. will not support and print without case check


    }
}
