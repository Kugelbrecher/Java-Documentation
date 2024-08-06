package com.arraylist;
import java.util.ArrayList;

// public ArrayList<E> constructors:
// 1. ArrayList() - creates an empty list with an initial capacity of ten.
// 2. ArrayList(int initialCapacity) - creates an empty list with the specified initial capacity.
// 3. ArrayList(Collection<? extends E> c) - creates a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.

public class arraylist {
    public static void main(String[] args) {
        // Creating an empty ArrayList
        ArrayList list0 = new ArrayList(); // can add elements of any type
        // ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<>(); // new version of Java. can avoid specifying the type in the right side

        // Adding elements to the ArrayList
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        // Displaying the elements of the ArrayList
        System.out.println("ArrayList: " + list); // print elements not memory address

        // Adding an element at a specific index
        list.add(2, "Ruby");
        System.out.println("Updated ArrayList: " + list); // Ruby will be added at index 2

        // Removing an element at a specific index
        list.remove(2);
        System.out.println("Updated ArrayList: " + list);
        // Removing the first occurrence of an element
        list.remove("Python");
        System.out.println("Updated ArrayList: " + list);

        // Getting the element at a specific index
        String element = list.get(1);
        System.out.println("Element at index 1: " + element);

        // Setting the element at a specific index
        list.set(1, "PHP");
        System.out.println("Updated ArrayList: " + list); // PHP will replace index 1 element

        // Checking if the ArrayList contains an element
        boolean contains = list.contains("Java");
        System.out.println("Contains 'Java': " + contains);

        // Getting the index of an element
        int index = list.indexOf("JavaScript");
        System.out.println("Index of 'JavaScript': " + index);

        // Getting the size of the ArrayList
        int size = list.size();
        System.out.println("Size of ArrayList: " + size);

        // Checking if the ArrayList is empty
        boolean empty = list.isEmpty();
        System.out.println("Is ArrayList empty: " + empty);

        // Removing all the elements from the ArrayList
        list.clear();
        System.out.println("ArrayList after clearing: " + list);
    }

}
