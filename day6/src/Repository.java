import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class Repository {
    Scanner input = new Scanner(System.in);
    Student student = new Student();
    Hashtable<Integer, Student> listStudent = new Hashtable<>();
    int id = 0;

    public void add() {
        student.id = ++id;
        System.out.print("Nhap ten:");
        student.fullName = input.nextLine();
        System.out.print("Nhap lop:");
        student.cla = input.nextLine();
        System.out.print("Nhap hoc ki:");
        student.semester = input.nextInt();
        System.out.println("Nhap diem:");
        for (int i = 0; i < student.subjectMarkList.length; i++) {
            System.out.printf("Nhap diem mon thu %d:", i + 1);
            student.subjectMarkList[i] = input.nextInt();
        }
        input.nextLine();
        listStudent.put(student.id, student);
    }

    public void viewListStudent() {
        System.out.println("Danh sach hoc sinh");
        Set<Integer> keySet = listStudent.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + student.display());
        }
    }
    public void viewListStudentAverage(){
        viewListStudent();
        System.out.println("AVERAGE: " +student.aveCal());
    }


}
