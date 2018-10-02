package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Boolean answer = true;
        Input input = new Input();
        int count = 0;

        do{
            circleStart();
            count++;
            answer = input.yesNo();
        }while(answer);
        System.out.println("Number of circles created: " + count);

    }

    public static void circleStart(){
        Input input = new Input();
        double radius = input.getDouble("Enter radius");

        Circle c = new Circle(radius);
        System.out.println(c.getArea(radius));
        System.out.println(c.getCircumference(radius));
    }


}
