package com.application;

public class FlightPrice {
    public static void main(String[] args) {
        double curPrice = calcualtePrice(244.5, 8, "economy class");
        System.out.println(curPrice);
    }

    public static double calcualtePrice(double price, int month, String type) {
        if (month >= 5 && month <= 12) {
            switch (type) {
                case "business class":
                    price *= 0.9;
                    break;
                case "economy class":
                    price *= 0.85;
                    break;
            }
        } else {
            switch (type) {
                case "business class":
                    price *= 0.7;
                    break;
                case "economy class":
                    price *= 0.65;
                    break;
            }
        }
        return price;
    }

}
