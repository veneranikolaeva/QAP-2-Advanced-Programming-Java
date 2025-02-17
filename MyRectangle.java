public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getters for topLeft and bottomRight points
    public MyPoint getTopLeft() { return topLeft; }
    public MyPoint getBottomRight() { return bottomRight; }

    // Calculating the area of the rectangle
    public double getArea() {
        double width = bottomRight.getX() - topLeft.getX();
        double height = topLeft.getY() - bottomRight.getY(); 
        return width * height;
    }

    // Calculating the perimeter of the rectangle
    public double getPerimeter() {
        double width = bottomRight.getX() - topLeft.getX();
        double height = topLeft.getY() - bottomRight.getY();
        return 2 * (width + height);
    }


    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ",bottomRight=" + bottomRight + "]";
    }
}
