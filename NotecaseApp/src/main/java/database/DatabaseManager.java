package database;

import java.sql.SQLException;
import java.util.List;
import model.Ticket;

public interface DatabaseManager {
    public void connect() throws ClassNotFoundException;
    public void disconnect() throws SQLException;
    public void register(Ticket ticket) throws Exception;
    public void delete(int ticketId) throws Exception;
    public List<Ticket> toList(String name) throws Exception;
    public Ticket getTicketById(int ticketId) throws Exception;
}