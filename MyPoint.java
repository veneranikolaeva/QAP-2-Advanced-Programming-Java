public class MyPoint {
    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public int[] getXY() { return new int[] {x, y}; }
    public void setXY(int x, int y) { this.x = x; this.y = y; }

    public double distance(MyPoint anotherPoint) {
        int xDiff = this.x - anotherPoint.x;
        int yDiff = this.y - anotherPoint.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}