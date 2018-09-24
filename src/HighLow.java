import java.util.*;

public class HighLow {
    public static void main(String[] args) {

        playGame();

    }

    public static int getInt(){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        return num;
    }

    public static void playGame(){
        Random rand = new Random(0);
        int random = rand.nextInt(100);

        System.out.println("Enter a number");
        int num = getInt();

        while(num != random){
            if(num < random){
                System.out.println("HIGHER");
                num = getInt();

            } else if (num > random){
                System.out.println("LOWER");
                num = getInt();
            } else {
                System.out.println("ERROR");
            }



        }
        System.out.println("💜GOOD GUESS");

        System.out.println("play again?");
        playGame();

    }



}
