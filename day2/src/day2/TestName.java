package day2;


import java.util.Scanner;

public class TestName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cage cage = new Cage();
        Zoo zoo = new Zoo();
        while (true) {
            menu();
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    zoo.addCage(cage);
                    break;
                case 2:
                    System.out.print("Nhap id chuong muon xoa:");
                    zoo.removeCage(input.nextInt());
                    break;
                case 3:
                    Animal animal = null;
                    int option;
                    do {
                        System.out.println("1.Cat");
                        System.out.println("2.Dog");
                        System.out.println("3.Tiger");
                        option = input.nextInt();
                    } while (option != 1 && option != 2 && option != 3);
                    switch (option) {
                        case 1:
                            animal = new Cat();
                            break;
                        case 2:
                            animal = new Dog();
                            break;
                        case 3:
                            animal = new Tiger();
                            break;
                        default:
                            break;
                    }
                    boolean exist = false;
                    for (Cage cage1 : zoo.cageList) {
                        if (cage1.cageNumber % 4 == option) {
                            exist = true;
                            zoo.cageList.get(zoo.cageList.indexOf(cage1)).addAnimal(animal);
                            System.out.println("them con vat thanh cong");
                            break;
                        }
                    }
                    if (!exist) {
                        System.out.println("Khong co chuong de them phu hop");
                    }
                    break;
                case 4:
                    if (zoo.cageList.isEmpty()) {
                        System.out.println("Khong co chuong nao de xoa con vat");
                    }else {
                        String name;
                        do {
                            name=input.nextLine();
                        }while (name.length()==0);
                        for (Cage cage1: zoo.cageList){
                            for (Animal animal1: cage.animalsList){
                                if(name==animal1.name){
                                    zoo.cageList.get(zoo.cageList.indexOf(cage1)).removeAnimal(name);
                                    System.out.println("Đa xoa con vat thanh cong");
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Danh sach cac con vat trong so thu");
                    for (Cage cage1: zoo.cageList){
                        for (Animal animal1: cage1.animalsList){
                            animal1.viewInfo();
                            animal1.speak();
                        }
                    }
                    break;
                case 6:
                    System.exit(0);

                default:
                    System.out.println("chon dung chuc nang");
                    break;
            }
        }

    }

    public static void menu() {
        System.out.println("--------------------");
        System.out.println("1.Add cage");
        System.out.println("2.Remove cage");
        System.out.println("3.Add animal");
        System.out.println("4.Remove animal");
        System.out.println("5.Iterate animals");
        System.out.println("6.Exit");
        System.out.println("--------------------");
        System.out.print("Moi ban nhap lua chon:");
    }
}
