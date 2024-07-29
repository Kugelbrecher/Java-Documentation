package com.oopdemo;

public class MovieOperator {
    private Movie[] movies;

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    public void displayMovies() {
        System.out.println("----All Movies----");
//        for (Movie movie : movies) {
//            System.out.println(movie);
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("Movie " + (i + 1) + ": " + m);
            System.out.println("ID: " + m.getId());
            System.out.println("Title: " + m.getTitle());
            System.out.println("Price: " + m.getPrice());
        }
    }

    public void searchMovieById(int id) {
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if (m.getId() == id) {
                System.out.println("Movie " + (i + 1) + ": " + m);
                System.out.println("ID: " + m.getId());
                System.out.println("Title: " + m.getTitle());
                System.out.println("Price: " + m.getPrice());
                System.out.println("Score: " + m.getScore());
                System.out.println("Director: " + m.getDirector());
                System.out.println("Actors: " + m.getActor());
                System.out.println("Info: " + m.getInfo());
            }
        }

        System.out.println("Movie with ID " + id + " not found");

    }
}
