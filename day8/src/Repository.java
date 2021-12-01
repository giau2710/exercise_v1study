import java.util.ArrayList;
import java.util.Scanner;

public class Repository {
    ArrayList<Reader> readerList = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int id = 0;

    public void add() {
        ++id;
        System.out.print("Nhap ten");
        String name = input.nextLine();
        System.out.print("Nhap Ngay sinh:");
        String birthday = input.nextLine();
        System.out.print("Nhap email:");
        String email = input.nextLine();
        Reader reader = new Reader(id, name, birthday, email);
        readerList.add(reader);
        System.out.println("Da them thanh cong");

    }

    public void remove() {

        System.out.print("Nhap ten can xoa:");
        String nameRemove = input.nextLine();
        for (Reader rd : readerList) {
            if (nameRemove.equals(rd.getName())) {
                readerList.remove(rd);
                System.out.println("Da xoa thanh cong");
                break;
            } else {
                System.out.println("K ton tai nguoi dung co ten ban da nhap:");
            }
        }
    }

    public void view() {
        for (Reader rd : readerList) {
            System.out.println(rd.toString());
        }
    }
}
