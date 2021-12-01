import java.util.ArrayList;
import java.util.Scanner;

public class Repository {
    Scanner input = new Scanner(System.in);
    ArrayList<Student> listStudent = new ArrayList<>();
    public void add() {

        System.out.print("Nhap ten:");
        String name = input.nextLine();
        System.out.print("Nhap lop:");
        String grade = input.nextLine();
        System.out.print("Nhap diem toan:");
        float mathMark = input.nextFloat();
        System.out.print("Nhap diem ly:");
        float physicMark = input.nextFloat();
        System.out.print("Nhap diem hoa:");
        float chemistryMark = input.nextFloat();
        float average = (mathMark + physicMark + chemistryMark) / 3;
        input.nextLine();
        Student student = new Student(name, grade, mathMark, physicMark, chemistryMark, average);
        listStudent.add(student);
    }

    public void viewListStudent() {
        for (Student st : listStudent) {
            System.out.println(st.display());
        }
    }

    public void viewClassifyStudent() {

        for (Student st : listStudent) {
            if (st.average >= 8.5) {
                System.out.println("Goods:" + st.display());
            } else if (st.average >= 7.0) {
                System.out.println("Fairs:" + st.display());
            } else if (st.average >= 5.0) {
                System.out.println("Normals:" + st.display());
            } else {
                System.out.println("Bads:" + st.display());
            }
        }
    }

}
