package Problem1;

public class Student extends Person {
    protected String IDNum;
    protected double GPA;


    //Constructors
    public Student(String name, int age, String gender, String IDNum, double GPA) {
        super(name, age, gender);
        this.IDNum = IDNum;
        this.GPA = GPA;
    }


    //Getter Methods
    public String getIDNum() {
        return this.IDNum;
    }

    public double getGPA() {
        return this.GPA;
    }


    //Setter Methods
    public void setIDNum(String IDNum) {
        this.IDNum = IDNum;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}