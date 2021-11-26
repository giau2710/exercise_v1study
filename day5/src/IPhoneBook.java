public interface IPhoneBook {
    void insertPhone(String name, String  phone);
    void removePhone(String name);
    void UpdatePhone(String name, String  newPhone);
    void searchPhone(String name);
    void sort ();
}
