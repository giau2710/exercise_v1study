public class Student extends IStudentMark {
    int[] subjectMarkList = new int[5];

    public float aveCal() {
        float sumMark = 0;
        for (int ml : subjectMarkList) {
            sumMark =sumMark+ ml;
        }
        return averageMark = sumMark / subjectMarkList.length;
    }

    public String display() {
        return  "FULLNAME: " + getFullName() +
                " ID: " + getId() +
                " CLASS: " + getCla() +
                " SEMESTER: " + getSemester();
    }
}
