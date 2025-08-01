package Problem3and4;

public class EquilateralTriangle extends Shape {
    private double side1, side2, side3;


    //Constructors
    public EquilateralTriangle(String name, double side1, double side2, double side3) {
        if (side1 != side2 || side2 != side3 || side3 != side1) {
            System.out.println("\n   Error: Invalid side values were given for creation of a EquilateralTriangle object.\n");
            System.exit(0);
        }

        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    //Inherited Methods
    @Override public double getArea() {
        double s = (side1 + side2 + side3) / 2;

        return Math.sqrt(s * ((s - side1) * (s - side2) * (s - side3)));
    }

    @Override public double getPerimeter() {
        return side1 + side2 + side3;
    }


    //Interface Methods
    @Override public void scale(double factor) {
        this.side1 *= factor;
        this.side2 *= factor;
        this.side3 *= factor;
    }
}