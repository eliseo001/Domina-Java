package zona_fit.objetosDoc2;

public class Rectangle {
    private int width  = 0;
    private int height = 0;
    private Point origin;

    public Rectangle(){
    origin = new Point(0,0);
    }

    public Rectangle(int w, int h){
        width = w;
        height = h;
        origin = new Point(0, 0 );
    }

    public Rectangle(Point p, int w, int h){
        origin = p;
        width = w;
        height = h;
    }

    public Rectangle(Point originOne) {
    }

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void move(int x, int y){
        origin.setX(x);
        origin.setY(y);
    }

    public int getArea(){
        return width * height;
    }
}
