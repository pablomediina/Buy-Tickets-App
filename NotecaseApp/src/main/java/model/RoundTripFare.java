package model;


public class RoundTripFare {
    String type;
    int value;

    public RoundTripFare(String type,int value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }
    
    public int getValue() {
        return value;
    }
}