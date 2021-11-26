package day3;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void menu() {
        System.out.println(
                "   1. Tạo cá sấu\n" +
                        "   2. Tạo mèo\n" +
                        "   3. Tạo cá\n" +
                        "   4. Xem động vật trên cạn\n" +
                        "   5. Xem động vật duoi nuoc\n" +
                        "   6. Xem tất cả động vật\n" +
                        "   7. Xóa động vật\n" +
                        "   8. Thoát");
        System.out.print("Moi chon chuc nang:");
    }

    public static void main(String[] args) {
        Repository repository = new Repository();
        Scanner input = new Scanner(System.in);
        repository.animalsList.add(new Crocodile(1,"Ca sau", 2));
        repository.animalsList.add(new Cat(2,"Meo", 2));
        repository.animalsList.add(new Fish(3,"Ca ca", 2));
        while (true) {
            menu();
            int choise = input.nextInt();
            switch (choise) {
                case 1:
                    repository.add(AnimalType.CROCODILE);
                    break;
                case 2:
                    repository.add(AnimalType.CAT);
                    break;
                case 3:
                    repository.add(AnimalType.FISH);
                    break;
                case 4:
                    repository.viewTerrestrialAnimals();
                    break;
                case 5:
                    repository.viewMarineAnimals();
                    break;
                case 6:
                    repository.viewAnimal();
                    break;
                case 7:
                    repository.remove();
                    break;
                case 8:
                   return;
                default:
                    break;

            }
        }
    }
}
