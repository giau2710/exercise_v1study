import java.util.Scanner;

public class Test {
    public static void menu() {
        System.out.println("1. Insert new Student\n" +
                "2. View list of Students\n" +
                "3. Average Mark ..\n" +
                "4. Exit\n");
        System.out.print("Nhap lua chon:");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Repository rp = new Repository();
        int option;
        while (true) {
            menu();
            option = input.nextInt();
            switch (option) {
                case 1:
                    rp.add();
                    break;
                case 2:
                    rp.viewListStudent();
                    break;
                case 3:
                    rp.viewListStudentAverage();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Nhap lai dung chuc nang:");
                    break;
            }

        }
    }
}
