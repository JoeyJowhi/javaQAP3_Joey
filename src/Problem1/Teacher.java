package Problem1;

public class Teacher extends Person {
    protected String subject;
    protected double salary;


    //Constructors
    public Teacher(String name, int age, char gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }


    //Instance Methods
    public String toString() {
        return String.format("%s   Subject: %s\n   Salary: $%,.2f\n", super.toString(), this.subject, this.salary);
    }


    //Getter Methods
    public String getSubject() {
        return this.subject;
    }

    public double getSalary() {
        return this.salary;
    }


    //Setter Methods
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}