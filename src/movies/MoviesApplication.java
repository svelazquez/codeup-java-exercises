package movies;
import java.util.*;


public class MoviesApplication {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Movie[] movies = MoviesArray.findAll();

        System.out.println("What would you like to do?");
        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");
        System.out.println("Enter your choice: ");
        int input = s.nextInt();
        System.out.println(input);


    }
}
