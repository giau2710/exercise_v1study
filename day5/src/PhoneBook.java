import java.util.*;

public class PhoneBook implements IPhoneBook {
    ArrayList<String> sortedList = new ArrayList<>();

    Scanner input = new Scanner(System.in);

    @Override
    public void insertPhone(String name, String phone) {
        if (sortedList.isEmpty()) {
            sortedList.add(name + "-" + phone);
            System.out.println("Da them sdt thanh cong!");
        } else {
            for (String ph : sortedList) {
                if (ph.contains(name + "-")) {
                    sortedList.set(sortedList.indexOf(ph), ph + ":" + phone);
                } else {
                    sortedList.add(name + "-" + phone);
                }
                System.out.println("Da them sdt thanh cong!");
                break;
            }

        }
    }

    @Override
    public void removePhone(String name) {
        sort();
        for (String ph : sortedList) {
            if (ph.contains(name + "-")) {
                sortedList.remove(ph);
                System.out.println("Da xoa thanh cong sdt co ten:" + name);
            } else {
                System.out.println("Không co sdt nao co ten la: " + name);
            }
            break;
        }
    }

    @Override
    public void UpdatePhone(String name, String newPhone) {
        for (String ph : sortedList) {
            if (ph.contains(name + "-")) {
                sortedList.set(sortedList.indexOf(ph),name+"-" +newPhone);
                System.out.println("Da sua thanh cong!");
            } else {
                System.out.println("Khong co sdt nao co ten can sua");
            }
            break;
        }
    }

    @Override
    public void searchPhone(String name) {
        for (String ph : sortedList) {
            if (ph.contains(name + "-")) {
                System.out.println("Sdt can tim la: "+ ph.substring(ph.indexOf("-")+1));
            } else {
                System.out.println("Khong co sdt nao co ten can tim");
            }
            break;
        }
    }


    @Override
    public void sort() {
        sortedList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }
}
