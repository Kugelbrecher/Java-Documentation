package com.application;

import java.util.Random;

public class VerificationCode {
    public static void main(String[] args) {
        String code = createCode(6);
        System.out.println(code);
    }

    public static String createCode(int n) {
        Random r = new Random();
        String code = "";
        for (int i = 0; i <= n; i++) {
            int type = r.nextInt(3);
            switch (type) {
                case 0:
                    // random a number from 0-9
                    code += r.nextInt(10);
                    break;
                case 1:
                    // random a capitalized letter A:65 Z:65+25
                    char ch1 = (char) (r.nextInt(26) + 65);
                    code += ch1;
                    break;
                case 2:
                    // random a capitalized letter a:97 z:97+25
                    char ch2 = (char) (r.nextInt(26) + 97);
                    code += ch2;
                    break;
            }
        }
    return code;
    }

}
