package zona_fit.objetosDoc2;

public class CreateObjectDemo {

    public static void main(String[] args) {
    var originOne = new Point(23, 94);

    var recOne = new Rectangle(originOne);

    var recTwo = new Rectangle(50, 100);

        System.out.println("Origin " + originOne);

        System.out.println("Rectangle 1 - width " + recOne.getWidth() + " Heigth: " + recOne.getHeight());

        System.out.println("Rectangle 1 -area " + recOne.getArea());

        recTwo.setOrigin(originOne);

        System.out.println("Rectangle 2 position " + recTwo.getOrigin());

        recTwo.move(40, 72);

        System.out.println("Rectangle 2 position " + recTwo.getOrigin());

        //try creating your own objects!
        var myPoint = new Point(10, 20);
        var myRect = new Rectangle(myPoint , 30, 40);
        System.out.println("My rectangle area " + myRect.getArea());
    }
}
