package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        String userChoice;

        System.out.println("Welcome to MovieLister!");
        System.out.println("What would you like to do?");

        do {
            showMenu();
            System.out.println("Enter your choice: ");
            userChoice = input.getString();

            if (userChoice.equals("1")) {
                showAll();

            } else if (userChoice.equals("2")) {
                showMoviesByCategory("animated");

            } else if (userChoice.equals("3")) {
                showMoviesByCategory("drama");
            }

        }
    }
}