import java.util.Arrays;

public class Move extends IMove  {
    int[] rateList = new int[3];

    public Move() {
    }

    public Move(int id, String name, String publishDate, String director, int[] rateList) {
        super(id, name, publishDate, director, rateList);
        this.rateList = rateList;
    }


    public float average() {
        float sum = 0;
        for (int rl : rateList) {
            sum += rl;
        }
        return averageRate = sum / 3;
    }

    @Override
    public String toString() {
        return "Move{" +
                "} " + super.toString()+"Trung binh"+average();
    }

}
