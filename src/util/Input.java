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
        int input;
        try {
            input = Integer.valueOf(getString());
            return input;
        } catch (NumberFormatException e ) {
            System.out.println("Input is not a valid integer");
            return getInt();
        }
    }
    public int getInt(String prompt){
        System.out.println(prompt);
        return getInt();
    }

    public int getInt(int min, int max) {
        System.out.println("Input a number between " + min + " and " + max);
        return getInt();
    }

    public double getDouble() {
        double input;
        try {
            input = Double.valueOf(getString());
            return input;
        } catch (NumberFormatException e) {
            System.out.println("Input is not valid");
            return getDouble();
        }
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return getDouble();
    }

    public double getDouble(double min, double max) {
        System.out.println("Input a number between " + min + " and " + max);
        return getDouble();
    }

    public int getBinary(String num){
        return Integer.valueOf(num, 2);
    }


    public int getHexadecimal(String num){
        return Integer.valueOf(num, 16);
    }

    public boolean yesNo() {
        System.out.println("Input yes or y to continue");
        String userInput = getString();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }
}