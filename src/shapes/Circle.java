package shapes;

public class Circle {
    private double radius;
    private static final double pi = Math.PI;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius){
        System.out.printf("Area of the circle is: %.2f%n",getArea(radius));
        System.out.printf("Circumference of the circle is: %.2f%n",getCircumference(radius));
    }

    public static double getArea(double radius){
        return pi * (radius * radius);
    }

    public static double getCircumference(double radius){
        return pi * 2 * radius;
    }

}
