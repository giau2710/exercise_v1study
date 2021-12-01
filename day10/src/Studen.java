public class Studen {
    private String  fullName;
    private int id;
    private String dateOfBirth;
    private int mobile;
    private String natives;
    private String classs;
    private String phoneNo;

    public Studen() {
    }

    public Studen(String fullName, int id, String dateOfBirth, int mobile, String natives, String classs, String phoneNo) {
        this.fullName = fullName;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.mobile = mobile;
        this.natives = natives;
        this.classs = classs;
        this.phoneNo = phoneNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getNatives() {
        return natives;
    }

    public void setNatives(String natives) {
        this.natives = natives;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String display() {
        return "Studen{" +
                "fullName='" + fullName + '\'' +
                ", id=" + id +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", mobile=" + mobile +
                ", natives='" + natives + '\'' +
                ", classs='" + classs + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}
