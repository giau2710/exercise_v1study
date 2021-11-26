package day3;


public abstract class Animal {
    private long id;
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Animal " +
                "id: " + id +
                ", name: " + name +
                ", age: " + age +
                ",type: " + (this instanceof ITerrestrialAnimal ? "Tren can" : "Duoi nuoc");
    }
}
