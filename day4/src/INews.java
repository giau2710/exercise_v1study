public abstract class INews {
    int id;
    String title;
    String publistDay;
    String author;
    String content;
    float averageRate;

    public INews() {

    }

    public INews(int id, String title, String publistDay, String author, String content, float averageRate) {
        this.id = id;
        this.title = title;
        this.publistDay = publistDay;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublistDay() {
        return publistDay;
    }

    public void setPublistDay(String publistDay) {
        this.publistDay = publistDay;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public String display() {
        return "title: " + getTitle() + ", " +
               "publistDay:" + getPublistDay() + ", " +
               "author:" + getAuthor() + ", " +
               "content:" + getContent() + ", ";
    }

}
