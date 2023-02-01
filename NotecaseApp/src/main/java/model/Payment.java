package model;


public interface Payment {
    public abstract Ticket pay(Ticket ticket);
}