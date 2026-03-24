package problem2;


public class Demo {


    public static void main(String[] args) {

        Point testPoint = new Point(3.0f, 4.0f);
        System.out.println(testPoint);

        MovablePoint testMove = new MovablePoint(3.0f, 4.0f, 1.0f, 2.0f);
        testMove.move();
        System.out.println(testMove);
    }
}
