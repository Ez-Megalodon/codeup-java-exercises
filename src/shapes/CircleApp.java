package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Please enter the radius of the circle");
        double userRadius = input.getDouble();

        Circle userCircle = new Circle(userRadius);
        System.out.printf("Area of the circle is: %.2f%n",userCircle.getArea());
        System.out.printf("Circumference of the circle is: %.2f%n",userCircle.getCircumference());
    }
}
