package util;
import java.util.Scanner;

public class Input {
    private Scanner scan;

    public Input() {
        scan = new Scanner(System.in).useDelimiter("\n");
    }


    public String getString() {
        return scan.next();

    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public int getInt() {
        return scan.nextInt();
    }

    public int getInt(int min, int max) {
        System.out.println("Input a number between " + min + " and " + max);
        return getInt();
    }

    public double getDouble() {
        return scan.nextDouble();
    }

    public double getDouble(double min, double max) {
        System.out.println("Input a number between " + min + " and " + max);
        return getDouble();
    }

    public boolean yesNo() {
        System.out.println("input yes or y to continue");
        String userInput = getString();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }
}