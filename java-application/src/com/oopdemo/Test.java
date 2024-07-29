package com.oopdemo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];

        movies[0] = new Movie(1, "The Shawshank Redemption", 23.6, 4.5,"Frank Darabont", "Tim Robbins, Morgan Freeman, Bob Gunton", "Drama");
        movies[1] = new Movie(2, "The Godfather", 24.6, 4.7, "Francis Ford Coppola", "Marlon Brando, Al Pacino, James Caan", "Crime");
        movies[2] = new Movie(3, "The Dark Knight", 22.6, 4.8, "Christopher Nolan", "Christian Bale, Heath Ledger, Aaron Eckhart", "Action");

        MovieOperator movieOperator = new MovieOperator(movies);
        movieOperator.displayMovies();
        movieOperator.searchMovieById(2);

        while (true) {
            System.out.println("Movies System is running...");
            System.out.println("1. Display all movies");
            System.out.println("2. Search movie by id");
            System.out.println("3. Exit");
            System.out.println("Please enter your choice: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    movieOperator.displayMovies();
                    break;
                case 2:
                    System.out.println("Enter movie id: ");
                    int id = sc.nextInt();
                    movieOperator.searchMovieById(id);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}
