package com.arraylist;
import java.util.Scanner;
import java.util.ArrayList;

public class FoodOperator {
    private ArrayList<Food> foodList = new ArrayList<>();

    public void addFood() {
        Food food = new Food();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter food name: ");
        String name = scanner.next();
        food.setName(name);

        System.out.println("Enter food price: ");
        double price = scanner.nextDouble();
        food.setPrice(price);

        System.out.println("Enter food category: ");
        String category = scanner.next();
        food.setCategory(category);

        foodList.add(food);

        System.out.println("Food added successfully!");
    }

    public void printFoodList() {
        if (foodList.size() == 0) {
            System.out.println("No food available!");
            return;
        }

        for (int i = 0; i < foodList.size(); i++) {
            Food food = foodList.get(i);
            System.out.println("Food name: " + food.getName());
            System.out.println("Food price: " + food.getPrice());
            System.out.println("Food category: " + food.getCategory());
            System.out.println("====================================");
        }
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Food Management System");
            System.out.println("1. Add food");
            System.out.println("2. Print food list");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            String choice = scanner.next();

            switch (choice) {
                case "1":
                    addFood();
                    break;
                case "2":
                    printFoodList();
                    break;
                case "3":
                    System.exit(0);
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
