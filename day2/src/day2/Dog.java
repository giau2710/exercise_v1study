package day2;

public class Dog extends Animal{
    @Override
    public void speak() {
        System.out.println("Go go go");
    }
    public Dog() {
        super();
    }

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog(String name, int age, String description) {
        super(name, age, description);
    }
}
