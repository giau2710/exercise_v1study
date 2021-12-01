public class IMove {
    private int id;
    private String name;
    private String pushlishDate;
    private String director;
    private String subTitle;
    float averageRate;

    public IMove() {
    }

    public IMove(int id, String name, String pushlishDate, String director, String subTitle, float averageRate) {
        this.id = id;
        this.name = name;
        this.pushlishDate = pushlishDate;
        this.director = director;
        this.subTitle = subTitle;
        this.averageRate = averageRate;
    }



    public IMove(int id, String name, String publishDate, String director, int[] rateList) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.pushlishDate = publishDate;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPushlishDate() {
        return pushlishDate;
    }

    public String getDirector() {
        return director;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPushlishDate(String pushlishDate) {
        this.pushlishDate = pushlishDate;
    }

    public void setDirector(String director) {
        director = director;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    @Override
    public String toString() {
        return "IMove{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pushlishDate='" + pushlishDate + '\'' +
                ", Director='" + director + '\'' +
                '}';
    }

    public String diplay() {
        return "IMove{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pushlishDate='" + pushlishDate + '\'' +
                ", Director='" + director + '\'' +
                ", subTitle='" + subTitle + '\'' +
                '}';
    }
}
