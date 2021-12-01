public class Student {
    static int count;
    int id;
    String name;
    String grade;
    float mathMark;
    float physicMark;
    float chemistryMark;
    float average ;

    public Student() {
    }

    public Student(int id, String name, String grade, float mathMark, float physicMark, float chemistryMark) {
        count++;
        this.id = count;
        this.name = name;
        this.grade = grade;
        this.mathMark = mathMark;
        this.physicMark = physicMark;
        this.chemistryMark = chemistryMark;
    }

    public Student( String name, String grade, float mathMark, float physicMark, float chemistryMark,float average) {

        this.name = name;
        this.grade = grade;
        this.mathMark = mathMark;
        this.physicMark = physicMark;
        this.chemistryMark = chemistryMark;
        this.average=average;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public float getMathMark() {
        return mathMark;
    }

    public void setMathMark(float mathMark) {
        this.mathMark = mathMark;
    }

    public float getPhysicMark() {
        return physicMark;
    }

    public void setPhysicMark(float physicMark) {
        this.physicMark = physicMark;
    }

    public float getChemistryMark() {
        return chemistryMark;
    }

    public void setChemistryMark(float chemistryMark) {
        this.chemistryMark = chemistryMark;
    }



    public String display() {
        return "Student{" +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", average=" + average+
                '}';
    }
}
