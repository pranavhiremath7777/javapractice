interface Father {
    void money();
}

interface Mother {
    void cooking();
}

class Child implements Father, Mother {

    public void money() {
        System.out.println("Father gives money");
    }

    public void cooking() {
        System.out.println("Mother teaches cooking");
    }
}

public class interfacedemo {
    public static void main(String[] args) {

        Child c = new Child();

        c.money();
        c.cooking();
    }
}