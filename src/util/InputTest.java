package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Would you like to input a double?");

        if(input.yesNo()){
            double num = input.getDouble();
            System.out.println(("You inputted " + num));
        } else {
            System.out.println(("k"));
        }

        System.out.println(("Would you like to input an integer?"));
        if(input.yesNo()){
            int userInt = input.getInt();
            System.out.println(("You inputted " + userInt));
        }else {
            System.out.println(("k"));
        }
    }

}
