package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());

//        Square box2 = new Square(5);
//        // I can determine which getArea/getPerimeter methods are called by looking at the subclass.
//        // i.e. variable type of Rectangle but with the subclass of Square
//        // or I could just print it in the console.
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

        Quadrilateral myShape;

        myShape = new Rectangle(5, 10);
        System.out.println("Rectangle Area => " + myShape.getArea());
        System.out.println("Rectangle Perimeter => " + myShape.getPerimeter());
        System.out.println("Rectangle Length => " + myShape.getLength());

        myShape = new Square(5);
        System.out.println("\nSquare Area => " + myShape.getArea());
        System.out.println("Square Perimeter => " + myShape.getPerimeter());
        System.out.println("Square Length => " + myShape.getLength());

    }
}
