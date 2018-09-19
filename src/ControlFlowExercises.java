import java.util.*;

public class ControlFlowExercises {
    public static void main(String[] args) {
       Scanner s  = new Scanner(System.in);
       boolean confirm = true;
       while(confirm) {
           System.out.println("Enter a grade");
           int g = s.nextInt();

           char lGrade = ' ';
           if (g >= 0) {
               if (g < 60) lGrade = 'F';
               else if (g <= 66) lGrade = 'D';
               else if (g <= 79) lGrade = 'C';
               else if (g <= 89) lGrade = 'B';
               else lGrade = 'A';
           }
           System.out.println(lGrade);
           System.out.print("");
           System.out.println("Continue?");
           String input = s.next();
           if(!input.toLowerCase().contains("y")) {
               System.out.println("Catch ya later");
               confirm = false;
           }
       }
    }
}
