package Problem1;

public class Person {
    protected String name;
    protected int age;
    protected String gender;


    //Constructors
    public Person (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    //Instance Methods
    public String toString() {
        return String.format("\n   Name: %s\n   Age: %d\n   Gender: %s\n", this.name, this.age, this.gender);
    }


    //Getter Methods
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }


    //Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender (String gender) {
        this.gender = gender;
    }
}