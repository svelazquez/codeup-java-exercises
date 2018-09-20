import java.util.*;

public class HighLow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random(0);
        int random = rand.nextInt(1 + 100);


        System.out.println("Enter a number");
        int num = s.nextInt();
        System.out.println(random);

        while(num != random){
            if(num < random){
                System.out.println("HIGHER");
                num = s.nextInt();

            } else if (num > random){
                System.out.println("LOWER");
                num = s.nextInt();
            } else {
                System.out.println("ERROR");
            }
        }
        System.out.println("GOOD GUESS");


    }

}
