package Problem3;

public class Ellipse extends Shape {
    private double a, b;


    //Constructors
    public Ellipse(String name, double a, double b) {
        super(name);

        if (a > b || a == b) {
            this.a = a;
            this.b = b;
        } else {
            this.a = b;
            this.b = a;
        }
    }


    //Inherited Methods
    @Override public double getArea() {
        return Math.PI * this.a * this.b;
    }

    @Override public double getPerimeter() {

        //If a == b, does p = 2πr. Else, does this formula:
        //p = π√(2(a^2 + b^2) - (a - b)^2 / 2)
        return this.a == this.b ? 2 * Math.PI * this.a : Math.PI * Math.sqrt((2 * (Math.pow(this.a, 2) + Math.pow(this.b, 2))) - (Math.pow((this.a - this.b), 2) / 2));
    }
}
