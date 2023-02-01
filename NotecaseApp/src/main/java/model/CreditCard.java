package model;


public class CreditCard implements Payment {
    private String cardNum;
    private String expirationDate;
    private String cvv;

    public CreditCard(String cardNum, String expirationDate, String cvv) {
        this.cardNum = cardNum;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }   

    @Override
    public Ticket pay(Ticket ticket) {
         return ticket;
    }
}