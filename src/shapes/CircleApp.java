package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        System.out.println("Please enter the radius of the circle");
        double userRadius = Input.getDouble();
        Circle userCircle = new Circle(userRadius);

    }
}
