package Problem3;

public class Demo {
    public static void main(String[] args) {
        Ellipse ellipse = new Ellipse("ellis", 13, 18);

        Circle circle = new Circle("ciri", 5, 5);

        Triangle triangle = new Triangle("trianne", 14, 23, 12);

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle("quill", 20, 20, 20);

        Shape[] shapeArray = new Shape[] {ellipse, circle, triangle, equilateralTriangle};

        for (Shape s : shapeArray) {
            System.out.println(s);
        }
    }
}