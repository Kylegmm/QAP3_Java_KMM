package Problem3;
public class PointDemo {
    public static void main(String[] args) {
        Point p1 = new Point(2.0f, 3.0f);
        System.out.println(p1);  // Output: (2.0,3.0)

        MovablePoint mp1 = new MovablePoint(2.0f, 3.0f, 1.0f, 1.5f);
        System.out.println(mp1);  // Output: (2.0,3.0), speed=(1.0,1.5)
        mp1.move();
        System.out.println(mp1);  // Output: (3.0,4.5), speed=(1.0,1.5)

        MovablePoint mp2 = new MovablePoint(0.5f, 0.5f);
        mp2.setXY(1.0f, 1.0f);
        System.out.println(mp2);  // Output: (1.0,1.0), speed=(0.5,0.5)
        mp2.move();
        System.out.println(mp2);  // Output: (1.5,1.5), speed=(0.5,0.5)
    }
}
