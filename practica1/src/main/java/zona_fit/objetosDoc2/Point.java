package zona_fit.objetosDoc2;

public class Point {
    private int x = 0;
    private int y = 0;

    public Point(int a, int b) {
        this.x = a;
        this.y = b;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public int getX() {
        return this.x;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}