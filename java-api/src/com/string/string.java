package com.string;

// no need to import java.lang package, String class is in java.lang package

// String object is immutable, once created, cannot be modified
// any modification will create a new object, so the reference will change and the old object will be garbage collected

// a double quote string is stored in string pool, if the same string is created again, it will refer to the same object in the pool
public class string {
    public static void main(String[] args) {
        // 1. direct assignment
        String str1 = "Hello World";
        System.out.println(str1);

        // 2. using new keyword
        String str2 = new String("Hello World"); // not recommended -> redundant
        System.out.println(str2);

        String str3 = new String();
        System.out.println(str3); // empty string

        // 3. using char array
        char[] ch = {'H', 'e', 'l', 'l', 'o'};
        String str4 = new String(ch);
        System.out.println(str4);

        // 4. using byte array
        byte[] b = {65, 66, 67, 68, 69};
        String str5 = new String(b); // convert byte into ASCII: A, B, C, D, E
        System.out.println(str5);


        // constructor in string class, common methods
        // 1. public int length()
        System.out.println(str1.length());
        // 2. public char charAt(int index)
        char c = str1.charAt(0);
        System.out.println(c);

        for (int i = 0; i < str1.length(); i++) {
            char curChar = str1.charAt(i);
            System.out.println(curChar);
        }

        // 3. public char toCharArray()
        char[] chars = str1.toCharArray();
        System.out.println(chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        // 4. public boolean equals(Object obj) -> compare value not reference
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // false
        System.out.println(str1 == str2); // false --> compare reference not value, ref is diff since str2 is created by new keyword
        // string pool case:
        String str7 = "Hello World";
        System.out.println(str1 == str7); // true -> same object in string pool

        // 5. public boolean equalsIgnoreCase(String str)
        // -> compare value but ignore case, commonly for verification code comparison

        // 6. public String substring(int beginIndex)
        String subStr = str1.substring(6);
        System.out.println(subStr); // World

        String subStr2 = str1.substring(0, 5); // does not include end index
        System.out.println(subStr2); // Hello

        // 7. public String replace(char oldChar, char newChar)
        String replacedStr = str4.replace('o', 'a');
        System.out.println(replacedStr); // Hella
        // -> use case: replace dirty words with *

        // 8. public boolean contains(CharSequence s)
        System.out.println(str1.contains("Hello")); // true
        System.out.println(str1.contains("hello")); // false

        // 9. public boolean startsWith(String prefix), endsWith(String suffix)
        System.out.println(str1.startsWith("Hello")); // true
        System.out.println(str1.endsWith("World")); // true

        // 10. public String[] split(String regex)
        String str6 = "Hello,World,Java";
        String[] strArr = str6.split(",");
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i]);
        }


    }
}
