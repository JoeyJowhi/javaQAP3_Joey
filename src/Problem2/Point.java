package Problem2;

public class Point {
    private float x, y;


    //Constructors
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }


    //Instance Methods
    public String toString() {
        return String.format("(%,.2f, %,.2f)", this.x, this.y);
    }


    //Getter Methods
    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float[] getXY() {
        return new float[] {this.x, this.y};
    }


    //Setter Methods
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
}