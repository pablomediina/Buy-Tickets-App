package model;


public class TotalToPay {
    private double departurePay;
    private double returnPay;
    private double fee;
    private double vehicle;
    private double discount;
    private double totalPerPassenger;
    private double total;
    private double totalToPay;

    public TotalToPay(double departurePay, double returnPay, double fee, double vehicle, double discount, double totalPerPassenger, double total, double totalToPay) {
        this.departurePay = departurePay;
        this.returnPay = returnPay;
        this.fee = fee;
        this.vehicle = vehicle;
        this.discount = discount;
        this.totalPerPassenger = totalPerPassenger;
        this.total = total;
        this.totalToPay = totalToPay;
    }

    public double getDeparturePay() {
        return departurePay;
    }

    public void setDeparturePay(double departurePay) {
        this.departurePay = departurePay;
    }

    public double getReturnPay() {
        return returnPay;
    }

    public void setReturnPay(double returnPay) {
        this.returnPay = returnPay;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getVehicle() {
        return vehicle;
    }

    public void setVehicle(double vehicle) {
        this.vehicle = vehicle;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotalPerPassenger() {
        return totalPerPassenger;
    }

    public void setTotalPerPassenger(double totalPerPassenger) {
        this.totalPerPassenger = totalPerPassenger;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalToPay() {
        return totalToPay;
    }

    public void setTotalToPay(double totalToPay) {
        this.totalToPay = totalToPay;
    }   
}