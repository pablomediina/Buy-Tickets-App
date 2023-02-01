package model;


public class PayPal implements Payment {
    private String email;
    private String pass;

    public PayPal(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public Ticket pay(Ticket ticket) {
        return ticket;
    }
}