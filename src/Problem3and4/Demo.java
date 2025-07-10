package Problem3and4;

public class Demo {
    public static Shape[] scaleArray(Shape[] shapeArray, double factor) {
        for (Shape s : shapeArray) {
            s.scale(factor);
        }

        return shapeArray;
    }

    public static void main(String[] args) {
        Ellipse ellipse = new Ellipse("ellis", 13, 18);

        Circle circle = new Circle("ciri", 5, 5);

        Triangle triangle = new Triangle("trianne", 14, 23, 12);

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle("quill", 20, 20, 20);

        Shape[] shapeArray = new Shape[] {ellipse, circle, triangle, equilateralTriangle};

        for (Shape s : shapeArray) {
            System.out.println(s);
        }

        System.out.println("---After Scaling By a Factor of 4---");


        for (Shape s : scaleArray(shapeArray, 4)) {
            System.out.println(s);
        }
    }
}