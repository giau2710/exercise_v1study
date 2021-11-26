package day2;

import java.util.ArrayList;
import java.util.Scanner;

public class Cage {
    Scanner input = new Scanner(System.in);
    int cageNumber;
    ArrayList<Animal> animalsList = new ArrayList<>();

    public void addAnimal(Animal a) {
        do {
            System.out.println("Nhap ten con vat:");
            a.name = input.nextLine();
            for (Animal animal : animalsList) {
                if (a.name.equals(animal.name)) {
                    System.out.println("Ten con vat da ton tai, moi nhap ten khac1");
                    break;
                }
            }
        } while (a.name.equals(""));
        do {
            System.out.println("Nhap tuoi");
            a.age = input.nextInt();
            input.nextLine();
            if (a.age <= 0) {
                System.out.println("Moi ban nhap lai tuoi");
            }
        } while (a.age <= 0);
        do {
            System.out.println("Moi ban nhap mo ta");
            a.description = input.nextLine();
        } while (a.description.equals(""));
        animalsList.add(a);
    }

    public void removeAnimal(String name) {
        if (animalsList.isEmpty()) {
            System.out.println("Chuong chua co con vat!");
        } else {
            boolean existName=false;
            for (Animal animal: animalsList){
                if(name.equals(animal.name)){
                    existName=true;
                    animalsList.remove(animal);
                    System.out.println("Đa xoa thanh cong");
                    break;
                }
            }
            if(!existName){
                System.out.println("Khong co con vat nao trung ten");
            }
        }

    }
}
