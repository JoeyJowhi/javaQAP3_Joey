package Problem3;

public abstract class Shape implements Scalable {
    private String name;


    //Constructors
    public Shape(String name) {
        this.name = name;
    }


    //Inheritance Methods
    public abstract double getArea();

    public abstract double getPerimeter();


    //Instance Methods
    public String toString() {
        return String.format("\n   %s: [\n      Area: %,.2f\n      Perimeter: %,.2f\n   ]\n", this.name, this.getArea(), this.getPerimeter());
    }
}