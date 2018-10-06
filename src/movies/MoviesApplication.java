package movies;
import java.util.*;
import util.Input;


public class MoviesApplication {

    private static void getMovies(String genre){
        Movie[] movies = MoviesArray.findAll();
        if(genre.equals("all")){
            for(int i = 0; i<movies.length; i++)
                System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());

        } else {
            for(Movie movie: movies){
                if(movie.getCategory().equals(genre))
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void main(String[] args) {
        Input in = new Input();
        Boolean answer;

        do {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category");
            System.out.println("Enter your choice: ");
            int input = in.getInt();

            //get selected movies
            switch (input) {
                case 1: //view movies
                    getMovies("all");
                    break;
                case 2: //animated
                    getMovies("animated");
                    break;
                case 3: //drama
                    getMovies("drama");
                    break;
                case 4: //horror
                    getMovies("horror");
                    break;
                case 5: //scifi
                    getMovies("scifi");
                    break;
            }

            System.out.println("\nWould you like to view more movies?");
            answer = in.yesNo();
        }while(answer);

        System.out.println("Alright, goodbye");
    }

}
