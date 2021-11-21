package day1;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner input = new Scanner(System.in);
        menu();
        int choose;
        while (true) {
            System.out.print("Nhap chuc nang: ");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    shop.addProduct();
                    break;
                case 2:
                    shop.removeProduct();
                    break;
                case 3:
                    shop.iterateProductList();
                    break;
                case 4:
                    shop.searchProduct();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Nhap dung chuc nang:");
                    break;
            }
        }


    }

    public static void menu() {
        System.out.println("-------------------------");
        System.out.println("1.Add new product");
        System.out.println("2.Remove product");
        System.out.println("3.Iterate product list");
        System.out.println("4.Search product");
        System.out.println("5.Exit");
        System.out.println("-------------------------");

    }
}
