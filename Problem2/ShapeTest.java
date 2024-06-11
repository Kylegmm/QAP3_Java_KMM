package Problem2;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s = new Shape("Red", true);
        Circle c = new Circle(5.0);
        Circle c1 = new Circle(5.0, "blue", true);
        Rectangle r = new Rectangle(2.0, 3.0);
        Rectangle r1 = new Rectangle(2.0, 3.0, "green", false);
        Square sq = new Square(4.0);
        Square sq1 = new Square(4.0, "yellow", true);

        System.out.println(s);
        System.out.println(c);
        System.out.println("Area: " + c.getArea() + ", Perimeter: " + c.getPerimeter());
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea() + ", Perimeter: " + c1.getPerimeter());
        System.out.println(r);
        System.out.println("Area: " + r.getArea() + ", Perimeter: " + r.getPerimeter());
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea() + ", Perimeter: " + r1.getPerimeter());
        System.out.println(sq);
        System.out.println("Area: " + sq.getArea() + ", Perimeter: " + sq.getPerimeter());
        System.out.println(sq1);
        System.out.println("Area: " + sq1.getArea() + ", Perimeter: " + sq1.getPerimeter());
    }
}
