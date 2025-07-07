package Problem3;

public class Circle extends Shape {
    private double a, b;


    //Constructors
    public Circle(String name, double a, double b) {
        super(name);

        if (a == b) {
            this. a = a;
            this. b = b;
        } else {
            System.out.println("\n   Error: Both given axis must be equal for the shape to be a circle.\n");
            System.exit(0);
        }
    }


    //Inherited Methods
    @Override public double getArea() {
        return Math.PI * this.a * this.b;
    }

    @Override public double getPerimeter() {
        return 2 * Math.PI * this.a;
    }


    //Interface Methods
    @Override public void scale(double factor) {
        this.a *= factor;
        this.b *= factor;
    }
}