package day3;

public class Cat extends Animal implements ITerrestrialAnimal  {
    public Cat(long id, String name, int age) {
        super(id,name,age);
    }

    @Override
    public void run() {
        System.out.println("Chay.........");
    }
}
