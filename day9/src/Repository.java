import java.util.*;

public class Repository {
    Move move = new Move();
    ArrayList<Move> moveList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int id = 0;

    public void add() {
        ++id;
        System.out.print("Nhap ten:");
        String name = scanner.nextLine();
        System.out.print("Nhap tac gia:");
        String director = scanner.nextLine();
        System.out.print("Nhap Ngay xuat ban:");
        String publishDate = scanner.nextLine();
        System.out.println("Nhap danh gia:");
        int[] rateList = new int[move.rateList.length];
        for (int i = 0; i < move.rateList.length; i++) {
            System.out.printf("Đánh giá thu %d:", i + 1);
            move.rateList[i] = scanner.nextInt();
            rateList[i] = move.rateList[i];
        }
        scanner.nextLine();
        Move move = new Move(id, name, publishDate, director, rateList);
        moveList.add(move);


    }

    public void view() {
        for (Move m : moveList) {
            System.out.println(m.toString());
        }
    }


    public void viewSort() {
        Collections.sort(moveList, new Comparator<Move>() {
            @Override
            public int compare(Move o1, Move o2) {
                return (int) (o1.average() - o2.average());
            }
        });
        for (Move m : moveList) {
            System.out.println(m.toString());
        }
    }


    public void remove() {
        System.out.println("Nhap ten muon xoa:");
        String nameRemove = scanner.nextLine();
        for (Move m : moveList) {
            if (nameRemove.equals(m.getName())) {
                moveList.remove(m);
                System.out.println("Da xoa thanh cong");
                break;
            }
        }
    }
}
