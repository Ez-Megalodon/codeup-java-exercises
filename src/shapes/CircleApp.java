package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Please enter the radius of the circle");
        double userRadius = input.getDouble();
        Circle userCircle = new Circle(userRadius);

    }
}
