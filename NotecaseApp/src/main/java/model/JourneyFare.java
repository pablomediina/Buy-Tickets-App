package model;


public class JourneyFare {
    String from;
    String to;
    String time;
    double price;

    public JourneyFare(String from, String to, String time, double price) {
        this.from = from;
        this.to = to;
        this.time = time;
        this.price = price;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getTime() {
        return time;
    }

    public double getPrice() {
        return price;
    }
}