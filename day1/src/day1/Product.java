package day1;

public class Product {
    String name;
    String description;
    double price;
    int[] rate;

    public Product() {

    }

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int[] getRate() {
        return rate;
    }

    public void setRate(int[] rate) {
        this.rate = rate;
    }

    public void viewInfo() {
        System.out.println("Ten:" + name);
        System.out.println("Gia:" + price);
        System.out.println("Mo ta:" + description);
    }
}
