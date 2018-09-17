import java.util.*;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {

            System.out.println("Enter a whole number, my guy");
            int userInput = s.nextInt();
            System.out.println("You entered \'" + userInput + "\' my guy");

            System.out.println("Enter length & width & height");
            int length = s.nextInt();
            int width = s.nextInt();
            int height = s.nextInt();
            System.out.println("Area: " + length * width + "\nPerimeter: " + (length * 2 + width * 2) + "\nVolume: " + length * width * height);
        } catch (InputMismatchException e ) {
            System.out.println("not a number!");
        }

            System.out.println("Enter 3 words pls");
            String word1 = s.next();
            String word2 = s.next();
            String word3 = s.next();

            System.out.println(word1 + "\n" + word2 + "\n" + word3);

        System.out.println("Enter a sentence");
        s.nextLine();
        String sentence = s.nextLine();
        System.out.println(sentence);



    }
}
