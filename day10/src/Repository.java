import java.util.ArrayList;
import java.util.Scanner;

public class Repository {
    Scanner input = new Scanner(System.in);
    ArrayList<Studen> listStudent = new ArrayList<>();
    int id = 0;

    public void add() {
        ++id;
        System.out.print("Nhap ten:");
        String fullName = input.nextLine();
        System.out.print("Nhap Ngay sinh:");
        String dayOfBirth = input.nextLine();
        System.out.print("Nhap noi o:");
        String natives = input.nextLine();
        System.out.print("Nhap lop:");
        String classs = input.nextLine();
        System.out.print("Nhap phoneNo:");
        String phoneNo = input.nextLine();
        System.out.print("Nhap sdt:");
        int mobile = input.nextInt();
        input.nextLine();
        Studen studen = new Studen(fullName, id, dayOfBirth, mobile, natives, classs, phoneNo);
        listStudent.add(studen);
    }

    public void view() {
        for (Studen st : listStudent) {
            System.out.println(st.display());
        }
    }
    public void search(){
        System.out.println("Nhap lop");
        String classSearch=input.nextLine();
        for (Studen st : listStudent) {
            if(classSearch.equals(st.getClasss())){
                System.out.println(st.display());
            }else {
                System.out.println("K co thanh vien nay trong lop");
            }
        }
    }
}
