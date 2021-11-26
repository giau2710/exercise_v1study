package day3;



public class Fish extends Animal implements IMarineAnimal {

    public Fish(long id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void swim() {
        System.out.println("Boi............");
    }
}
