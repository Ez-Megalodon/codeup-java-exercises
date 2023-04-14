package movies;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        boolean userConfirm;
        do {
            System.out.println("What would you like to do?\n");

            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");

            System.out.println("Enter your choice:");
            String userChoice = input.getString();

            if (userChoice.equalsIgnoreCase("1")){
                System.out.println("*/ All movies \\*");
                for(Movie movie : MoviesArray.findAll()){
                    System.out.printf("%s -- %s%n",movie.getName(),movie.getCategory());
                }
            }
            if (userChoice.equalsIgnoreCase("2")){
                System.out.println("*/ Movies with the category of 'animated' \\*");
                for(Movie movie : MoviesArray.findAll()){
                    if (movie.getCategory().equalsIgnoreCase("animated")){
                        System.out.printf("%s -- %s%n",movie.getName(),movie.getCategory());
                    }
                }
            }
            if (userChoice.equalsIgnoreCase("3")){
                System.out.println("*/ Movies with the category of 'drama' \\*");
                for(Movie movie : MoviesArray.findAll()){
                    if (movie.getCategory().equalsIgnoreCase("drama")){
                        System.out.printf("%s -- %s%n",movie.getName(),movie.getCategory());
                    }
                }
            }
            if (userChoice.equalsIgnoreCase("4")){
                System.out.println("*/ Movies with the category of 'horror' \\*");
                for(Movie movie : MoviesArray.findAll()){
                    if (movie.getCategory().equalsIgnoreCase("horror")){
                        System.out.printf("%s -- %s%n",movie.getName(),movie.getCategory());
                    }
                }
            }
            if (userChoice.equalsIgnoreCase("5")){
                System.out.println("*/ Movies with the category of 'scifi' \\*");
                for(Movie movie : MoviesArray.findAll()){
                    if (movie.getCategory().equalsIgnoreCase("scifi")){
                        System.out.printf("%s -- %s%n",movie.getName(),movie.getCategory());
                    }
                }
            }
            userConfirm = input.yesNo("\n------Would you like to continue? [y/n]-----");
        } while (userConfirm);

    }
}
