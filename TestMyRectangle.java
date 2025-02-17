public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(1, 5);
        MyPoint bottomRight = new MyPoint(5, 1);
        MyRectangle rect = new MyRectangle(topLeft, bottomRight);

        System.out.println("Rectangle: " + rect);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}
