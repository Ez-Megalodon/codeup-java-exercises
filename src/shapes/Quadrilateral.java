package shapes;

abstract class Quadrilateral extends Shape implements Measurable{

    protected double width;
    protected double length;

    public Quadrilateral(){
    }

    public Quadrilateral(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    abstract void setWidth(double width);

    public double getLength() {
        return this.length;
    }

    abstract void setLength(double length);

}
