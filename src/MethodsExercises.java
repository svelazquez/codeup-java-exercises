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
        System.out.println("Roll dice?");


        System.out.println("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1,10);


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
