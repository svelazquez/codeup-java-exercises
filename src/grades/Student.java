package grades;

import java.util.*;
import util.Input;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student (String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    //returns student's name
    public String getName(){
        return name;
    }

    //adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    //returns the average of the student's grades
    public double getGradeAverage(){
        double total = 0;
        double average;
        for(int i = 0; i< grades.size(); i++){
            total += grades.get(i);
        }

        average = (total / grades.size());


        return average;
    }


    public static void main(String[] args) {
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


    }
}
