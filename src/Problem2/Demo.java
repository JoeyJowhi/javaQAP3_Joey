package Problem2;

public class Demo {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(2.3f, 4.4f, 12.2f, 10.1f);
        MovablePoint p2 = new MovablePoint(6.2f, 3.3f, 0.8f, 19.7f);

        System.out.println(p1);
        System.out.println(p2);
        p1.move();
        p2.move();
        System.out.println("\n" + p1);
        System.out.println(p2);
    }
}
