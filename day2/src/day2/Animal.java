package day2;

public abstract class Animal {
    String name;
    int age;
    String description;

    void viewInfo() {
        System.out.println("Ten:" + name);
        System.out.println("Tuoi:" + age);
        System.out.println("Mo ta:" + description);
    }

    public abstract void speak();

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, String description) {
        this.name = name;
        this.age = age;
        this.description = description;
    }
}
