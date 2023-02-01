package model;


public class VehicleFare {
    String type;
    double price;

    public VehicleFare(String type, double price) {
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