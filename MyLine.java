public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Getters and setters for begin and end points (individual coordinates and arrays)
    public MyPoint getBegin() { return begin; }
    public void setBegin(MyPoint begin) { this.begin = begin; }
    public MyPoint getEnd() { return end; }
    public void setEnd(MyPoint end) { this.end = end; }
    public int getBeginX() { return begin.getX(); }
    public void setBeginX(int x) { begin.setX(x); }
    // ... similar getters and setters for beginY, endX, endY, beginXY, endXY


    public double getLength() {
        return begin.distance(end);
    }

    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff); // atan2 handles all quadrants correctly
    }

    @Override
    public String toString() {
        return "MyLine[begin=" + begin + ",end=" + end + "]";
    }
}
