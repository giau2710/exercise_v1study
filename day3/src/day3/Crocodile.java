package day3;

public class Crocodile extends Animal implements IMarineAnimal, ITerrestrialAnimal {
    public Crocodile(long id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void swim() {
        System.out.println("Boi...........");
    }

    @Override
    public void run() {
        System.out.println("Chay...........");
    }
}
