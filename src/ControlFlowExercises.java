import java.util.*;

public class ControlFlowExercises {
    public static void main(String[] args) {
       Scanner s  = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInt = s.nextInt();
        System.out.println("Table Incoming");
        System.out.println();
        System.out.println(" number   |   squared  |   cubed   ");
        System.out.println("--------  | ---------- | --------- ");
        System.out.printf("%-10s| %-10s | %-10s",
                            userInt,
                            userInt * userInt,
                            userInt * userInt * userInt);
    }
}
