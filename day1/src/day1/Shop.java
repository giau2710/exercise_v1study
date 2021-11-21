package day1;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    Scanner inputs = new Scanner(System.in);
    Product product = new Product();
    ArrayList<Product> productList = new ArrayList<>();

    public void addProduct() {
        System.out.print("Nhap ten san pham: ");
        product.name = inputs.nextLine();
        System.out.print("Nhap mo ta san pham: ");
        product.description = inputs.nextLine();
        do {
            System.out.print("Nhap gia san pham: ");
            product.price = inputs.nextDouble();
            if (product.price < 0) {
                System.out.println("vui long nhap dung gia san pham!");
            }
        } while (product.price < 0);

        int sizeRate;
        do {
            System.out.print("Nhap so luong danh gia:");
            sizeRate = inputs.nextInt();
        } while (sizeRate < 0);
        product.rate = new int[sizeRate];
        System.out.println("Nhap gia tri cac luot danh gia: ");
        for (int i = 0; i < product.rate.length; i++) {
            do {
                System.out.printf("Đanh gia thu %d:", i + 1);
                product.rate[i] = inputs.nextInt();
                if (product.rate[i] <= 0 || product.rate[i] > 5) {
                    System.out.println("Vui long nhap danh gia tu 1->5");
                }
                inputs.nextLine();
            } while (product.rate[i] <= 0 || product.rate[i] > 5);
        }
        productList.add(product);
    }

    public void iterateProductList() {
        if (productList.isEmpty()) {
            System.out.println("Shop chua co san pham");
        } else {
            float sumRate;
            System.out.println("Danh sach san pham cua shop");
            for (Product product : productList) {
                product.viewInfo();
                sumRate = 0;
                for (int i = 0; i < product.rate.length; i++) {
                    sumRate += product.rate[i];
                }
                System.out.println("Rate trung binh=" + sumRate / product.rate.length);
            }
        }
    }

    public void removeProduct() {
        System.out.print("Nhap ten san pham can xoa:");
        inputs.nextLine();
        String nameRemove = inputs.nextLine();
        for (Product product : productList) {
            if (product.name.equals(nameRemove)) {
                productList.remove(product);
                System.out.println("Da xoa thanh cong san pham:" + product.name);
            } else {
                System.out.println("san pham khong tim thay");
                removeProduct();
            }
            break;
        }
    }

    public void searchProduct() {
        double minPrice;
        double maxPrice;
        do {
            System.out.print("nhap gia thap:");
            minPrice = inputs.nextDouble();
            if (minPrice < 0) {
                System.out.println("Khong co gia am! Moinhap lai");
            }
            inputs.nextLine();
        } while (minPrice < 0);
        do {
            System.out.print("nhap gia cao:");
            maxPrice = inputs.nextDouble();
            if (maxPrice < minPrice) {
                System.out.printf("Hay nhap gia cao hon gia %f \n", minPrice);
            }
            inputs.nextLine();
        } while (maxPrice < minPrice);
        for (Product product : productList) {
            if (product.price > minPrice && product.price < maxPrice) {
                System.out.println("Danh sach san pham ban can tim la");
                System.out.println(product.name);
            }else {
                System.out.println("Khong tim thay san pham phu hop");
            }
            break;
        }
    }
}
