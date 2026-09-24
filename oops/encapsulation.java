class Student {

    // Private variables 
    // Encapsulation: The variables are hidden from outside access
    private String name;
    private int age;

    // Setter for name
    //sets the value of the private variable name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    //gets the value of the private variable name
    public String getName() {
        return this.name;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for age
    public int getAge() {
        return this.age;
    }
}

public class encapsulation {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Pranav");
        s1.setAge(20);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}