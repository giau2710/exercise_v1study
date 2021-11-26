package day2;

public class Tiger extends Animal {
    @Override
    public void speak() {
        System.out.println("Gro grum...");
    }

    public Tiger() {
        super();
    }

    public Tiger(String name) {
        super(name);
    }

    public Tiger(String name, int age) {
        super(name, age);
    }

    public Tiger(String name, int age, String description) {
        super(name, age, description);
    }
}
