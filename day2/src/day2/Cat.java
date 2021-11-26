package day2;

public class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Meo meo meo");
    }
    public Cat() {
        super();
    }

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name, int age, String description) {
        super(name, age, description);
    }
}
