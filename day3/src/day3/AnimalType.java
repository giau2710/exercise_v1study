package day3;

public enum AnimalType {
    CAT(1),
    FISH(2),
    CROCODILE(3);
    private final int value;

    private AnimalType(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }
}
