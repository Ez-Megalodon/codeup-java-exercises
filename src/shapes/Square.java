package shapes;

public class Square extends Quadrilateral{

    public Square (){
    }

    public Square (double side){
        super.width = side;
        super.length = side;
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
        super.length = length;
    }
}
