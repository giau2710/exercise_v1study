package day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Repository {
    Scanner input = new Scanner(System.in);
    ArrayList<Animal> animalsList = new ArrayList<>();

    public void add(AnimalType animalType) {
        long id = System.currentTimeMillis() / 1000;
        System.out.print("Nhap ten: ");
        String name = input.nextLine();
        System.out.print("Nhap tuoi: ");
        int age = input.nextInt();
        input.nextLine();
        switch (animalType) {
            case CROCODILE:
                animalsList.add(new Crocodile(id, name, age));
                break;
            case CAT:
                animalsList.add(new Cat(id, name, age));
                break;
            case FISH:
                animalsList.add(new Fish(id, name, age));
                break;
        }

    }
    public void remove(){
        System.out.print("Nhap id co con vat muon xoa: ");
        long idRemove = input.nextInt();
        boolean idExist=false;
        for (Animal a:animalsList) {
            if(a.getId()==idRemove){
                idExist=true;
                animalsList.remove(a);
                System.out.println("Da xoa thanh cong");
                break;
            }

        }
        if(!idExist){
            System.out.println("Khong tim thay id!");
        }
    }
    public void viewAnimal(){
        for (Animal animal : animalsList) {
            System.out.println(animal.toString());
        }
    }
    public void viewTerrestrialAnimals(){
        for (Animal animal : animalsList) {
            if(!(animal instanceof IMarineAnimal))
            System.out.println(animal);
        }
    }
    public void viewMarineAnimals(){
        for (Animal animal : animalsList) {
            if(!(animal instanceof ITerrestrialAnimal))
                System.out.println(animal);
        }
    }
}
