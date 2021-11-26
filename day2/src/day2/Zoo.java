package day2;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    ArrayList<Cage> cageList = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    public void addCage(Cage c) {
        System.out.println("Nhap ma chuong");
        c.cageNumber =input.nextInt();
        cageList.add(c);
        System.out.println("Da them chuong thanh cong " + c.cageNumber);
    }

    public void removeCage(int idCage) {
        if (cageList.isEmpty()) {
            System.out.println("chua co chuong ");
        } else {
            boolean existCage = false;
            for (Cage cage : cageList) {
                if (idCage == cage.cageNumber) {
                    existCage = true;
                    cageList.remove(cage);
                    System.out.println("Da xoa chuong thanh cong");
                    break;
                }
            }
            if (!existCage) {
                System.out.println("Khong tim thay chuong ban can xoa!");
            }
        }

    }
}