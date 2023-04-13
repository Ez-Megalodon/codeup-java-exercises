package shapes;

public class Circle {
    private double radius;
    private final double pi = Math.PI;

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return pi * (this.radius * this.radius);
    }

    public double getCircumference(){
        return pi * 2 * this.radius;
    }

}
