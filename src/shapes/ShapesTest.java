package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Rectangle box2 = new Square(5);
        // I can determine which getArea/getPerimeter methods are called by looking at the subclass.
        // i.e. variable type of Rectangle but with the subclass of Square
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());
    }
}
