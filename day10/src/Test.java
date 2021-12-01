import java.util.Scanner;

public class Test {
    public static void menu() {
        System.out.println("------------------------");
        System.out.println("   1. Insert new Student\n" +
                "   2. View list of Students\n" +
                "   3. Search Students\n" +
                "   4. Exit");
        System.out.println("------------------------");
        System.out.print("Chon chuc nang: ");
    }

    public static void main(String[] args) {
        Repository rp = new Repository();
        Scanner input = new Scanner(System.in);
        int choose;
        while (true) {
            menu();
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    rp.add();
                    break;
                case 2:
                    rp.view();
                    break;
                case 3:
                    rp.search();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Nhap dung chuc nang");
                    break;
            }

        }
    }
}