public class TestMyLine {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(1, 2, 4, 6);
        System.out.println("Line 1: " + line1);
        System.out.println("Line 1 Length: " + line1.getLength());
        System.out.println("Line 1 Gradient: " + line1.getGradient());


        MyPoint p1 = new MyPoint(10,20);
        MyPoint p2 = new MyPoint(30,40);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println("Line 2: " + line2);
        System.out.println("Line 2 Length: " + line2.getLength());
        System.out.println("Line 2 Gradient: " + line2.getGradient());

    }
}
