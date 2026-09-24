class pen {
    String color;
    String type;

    // Normal constructor
    pen() {
    }

    // Copy constructor
    pen(pen p) {
        this.color = p.color;
        this.type = p.type;
    }

    public void printinfo() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

public class oops {
    public static void main(String[] args) {

        // First object
        pen pen1 = new pen();
        pen1.color = "red";
        pen1.type = "gel";

        // Copy pen1 into pen2
        pen pen2 = new pen(pen1);

        // Print both
        pen1.printinfo();
        pen2.printinfo();
    }
}