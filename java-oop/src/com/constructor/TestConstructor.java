package com.constructor;

public class TestConstructor {
    public static void main(String[] args) {
        // create object without parameter
        Student student1 = new Student();
        student1.name = "Jane Doe";
        student1.score = 80.0;
        System.out.println("Name: " + student1.name);
        System.out.println("Score: " + student1.score);

        // create object with parameter
        // we do not need to assign properties to the object with this constructor
        Student student2 = new Student("John Doe", 90.0);
        System.out.println("Name: " + student2.name);
        System.out.println("Score: " + student2.score);

        // in the Teacher class, we did not create a constructor
        //   it will automatically create a default constructor without parameter,
        //   we can find it in out folder
        Teacher teacher = new Teacher();
        // if we create a constructor with parameter, then the default constructor will be gone
    }

}
