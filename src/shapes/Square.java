package shapes;

public class Square extends Rectangle{
    protected int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public Square (int side){
        this.side = side;
        super.setLength(side);
        super.setWidth(side);
    }

    public int getArea() {
        return (int) Math.pow(side, 2);
    }

    public int getPerimeter(){
        return 4 * side;
    }
}
