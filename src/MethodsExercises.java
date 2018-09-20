import java.util.*;


public class MethodsExercises {
    Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num1 = 4;
        int num2 = 2;
        System.out.println(add(num1, num2));
        System.out.println(subtract(num1, num2));
        System.out.println(multiply(num1, num2));
        System.out.println(divide(num1, num2));

        System.out.println("Enter num for factorial computation");

        int facNum = s.nextInt();
        System.out.println(fac(facNum));

        System.out.println("Enter num of sides for a pair of dice.");
        System.out.println("Roll dice");


        int userInput = getInt(1,10);



    }

    public static int getInt(){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        return num;
    }

    public static int getInt(int min, int max){
        System.out.println("Input # between " + min + " and " + max + ": ");
        int number = getInt();

        if(number >= min && number <= max){
            return number;
        } else {
            System.out.println(number + " is outside the range of " + min + " and " + max);

            return getInt(min, max);
        }
    }

    private static int add(int num1, int num2){
        return num1 + num2;

    }
    private static int subtract(int num1, int num2){
        return num1 - num2;

    }
    private static int multiply(int num1, int num2){
        return num1 * num2;

    }
    private static int divide(int num1, int num2){
        if (num2 == 0){
            throw new IllegalArgumentException("ARGUMENT CANNOT BE 0");
        }
        return num1 / num2;

    }
    private static int mod(int num1, int num2){
        return num1 % num2;
    }

    private static int fac(int num){
        if(num == 1)
            return num;

        return num * fac(num-1);
    }


}
