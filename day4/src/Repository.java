import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Repository {
    News news = new News();
//    ngay
    Date d = new Date(System.currentTimeMillis());
    DateFormat df = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");

    Scanner input = new Scanner(System.in);
    Hashtable<Integer,News> newsList = new Hashtable();
    int id = 0;

    public void add() {
        news.id = ++id;
        System.out.println("id của tin này là: " + id);
        System.out.print("Nhap tieu de: ");
        news.title = input.nextLine();
        news.publistDay = df.format(d);
        System.out.println("Ngay suat ban: " + news.publistDay);
        System.out.print("Nhap tac gia: ");
        news.author = input.nextLine();
        System.out.print("Nhap noi dung: ");
        news.content = input.nextLine();
        System.out.println("Nhap cac danh gia:");
        for (int i = 0; i < news.rateList.length; i++) {
            System.out.printf("Đánh giá thu %d:", i+1);
            news.rateList[i] = input.nextInt();
        }
        input.nextLine();
        newsList.put(news.id,news);
    }

    public void view() {
        System.out.println("Danh sach tin");
        Set<Integer> keySet = newsList.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + news.display());
        }
    }
    public void viewAverage(){
        System.out.println("Danh sach tin co trung binh cong");

        Set<Integer> keySet = newsList.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + news.display());
        }
        System.out.println("Trung binh cong: "+news.caculate());
    }
}
