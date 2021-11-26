public class News extends INews {
    int[] rateList = new int[3];
    public void ratelist(){

    }
    public float caculate(){
       float sumRate=0;
        for (int rl:rateList) {
            sumRate=sumRate+rl;
        }
      return averageRate= sumRate/rateList.length;

    }


}
