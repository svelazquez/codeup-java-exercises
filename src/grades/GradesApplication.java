package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //create students HasMap. keys are string github usernames.
        //values are Student objects
        HashMap<String, Student> students = new HashMap<>();

        Student twi = new Student("Twilight Sparkle");
        Student rainbow = new Student("Rainbow Dash");
        Student apple = new Student("Applejack");
        Student flutter =new Student("Fluttershy");
        Student pinkie = new Student("Pinkie Pie");
        Student rarity = new Student("Rarity");



        twi.addGrade(100);
        twi.addGrade(99);
        twi.addGrade(100);
        System.out.println(twi.getGradeAverage());

        rainbow.addGrade(79);
        rainbow.addGrade(81);
        rainbow.addGrade(80);

        apple.addGrade(88);
        apple.addGrade(87);
        apple.addGrade(85);

        flutter.addGrade(84);
        flutter.addGrade(82);

        pinkie.addGrade(75);
        pinkie.addGrade(77);

        rarity.addGrade(91);
        rarity.addGrade(94);


        students.put("book-horse", twi);
        students.put("rainboomBelow2", rainbow);
        students.put("applefan201", apple);
        students.put("cry-f0al", flutter);
        students.put("partycannon", pinkie);
        students.put("ultraRARITY", rarity);
        boolean confirm = true;
        while(confirm) {
            System.out.println("Welcome!\n" +
                    "Here are the github usernames of our students:\n\n"
                    + students.keySet());

            System.out.println("\nWhich student would you like to see more information on?\n");
            String input = s.next();

            System.out.println("Name: " + students.get(input).getName()
                    + " - Github Username: " + input);
            System.out.println("Current Average: " + students.get(input).getGradeAverage());

            System.out.println("Would you like to see another student?");
            String yes = s.next();
            if(!yes.equalsIgnoreCase("y") || !yes.equalsIgnoreCase("yes")){
                confirm = false;
            }
        }


    }

}
