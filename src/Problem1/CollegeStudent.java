package Problem1;

public class CollegeStudent extends Student {
    protected String major;
    protected int year;


    //Constructor
    public CollegeStudent(String name, int age, char gender, String IDNum, double GPA, String major, int year) {
        super(name, age, gender, IDNum, GPA);
        this.major = major;
        this.year = year;
    }


    //Instance Methods
    public String toString() {
        return String.format("%s   Major: %s\n   Year: %d\n", super.toString(), this.major, this.year);
    }


    //Getter Methods
    public String getMajor() {
        return this.major;
    }

    public int getYear() {
        return this.year;
    }


    //Setter Methods
    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }
}