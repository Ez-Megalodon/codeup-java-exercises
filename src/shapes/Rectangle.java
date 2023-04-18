package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int width, int length) {
        super.length = length;
        super.width = width;
    }

    public double getPerimeter(){
        return 2 * length + 2 * width;
    }

    public double getArea() {
        return length * width;
    }

    void setWidth(double width) {
        super.width = width;
    }

    void setLength(double length) {
        super.width = length;
    }
}
