class poly {
    String name;
    int age;

// method overloading
//compile time polymorphism

    public void printinfo(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    public void printinfo(int age) {
        this.age = age;
        System.out.println(this.age);
    }

    public void printinfo(String name , int age){
        this.name=name;
        this.age=age;
        System.out.println(this.name+" "+this.age);
    }
}
public class polymapishm {
    public static void main(String[] args) {
        poly s1 = new poly();
        s1.printinfo("pranav");
        s1.printinfo(22);
        s1.printinfo("pranav", 22);
    }
}