package model;


public class FeeFare {
    String type;
    double price;

    public FeeFare(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}