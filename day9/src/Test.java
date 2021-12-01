import java.util.Scanner;

public class Test {
    public static void menu() {
        System.out.println("------------------------");
        System.out.println("   1. Insert new Movie\n" +
                "   2. View list of Movie\n" +
                "   3. Sort Movie by Average List\n" +
                "   4. Delete a movie\n" +
                "   5. Exit");
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
                    rp.viewSort();
                    break;
                case 4:
                    rp.remove();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Nhap dung chuc nang");
                    break;
            }

        }
    }
}
