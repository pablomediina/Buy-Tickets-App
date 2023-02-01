package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.FeeFare;
import model.JourneyFare;
import model.RoundTripFare;
import model.Ticket;
import model.VehicleFare;


public class MySqlManager implements DatabaseManager {
    
    protected Connection connection;
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/notecase";
    private final String USER = "root";
    private final String PASS = "1234";
    
    @Override
    public void connect() throws ClassNotFoundException {
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
        } catch (SQLException ex) {
            Logger.getLogger(MySqlManager.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    
    @Override
    public void disconnect() throws SQLException {
        if (connection != null) {
            if (!connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public void register(Ticket ticket) throws Exception {
        try {
            this.connect();
            try (PreparedStatement st = this.connection.prepareStatement("INSERT INTO `tickets` (`from`, `to`, `passengers`, `round_trip`, `departure_date`, `return_date`, `fee`, `vehicle`) VALUES (?,?,?,?,?,?,?,?);")) {
                st.setString(1, ticket.getJourney().getFrom());
                st.setString(2, ticket.getJourney().getTo());
                st.setString(3, ticket.getPassengers());
                st.setString(4, ticket.getRoundTrip().getType());
                st.setString(5, ticket.getDepartureDate());
                st.setString(6, ticket.getReturnDate());
                st.setString(7, ticket.getFee().getType());
                st.setString(8, ticket.getVehicle().getType());
                st.executeUpdate();
            }
        } catch(ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.disconnect();
        }
    }

    @Override
    public void delete(int ticketId) throws Exception {
        try {
            this.connect();
            try (PreparedStatement st = this.connection.prepareStatement("DELETE FROM `tickets` WHERE id = ?;")) {
                st.setInt(1, ticketId);
                st.executeUpdate();
            }
        } catch(ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.disconnect();
        }
    }

    @Override
    public List<Ticket> toList(String id) throws Exception {
        List<Ticket> lista = null;
        try {
            this.connect();
            String Query = id.isEmpty() ? "SELECT * FROM tickets;" : "SELECT * FROM tickets WHERE id LIKE '%" + id + "%';";
            try (PreparedStatement st = this.connection.prepareStatement(Query)) {
                lista = new ArrayList();
                try (ResultSet rs = st.executeQuery()) {
                    while(rs.next()) {
                        Ticket ticket = new Ticket();
                        ticket.setId(rs.getInt("id"));
                        ticket.setJourney(new JourneyFare(rs.getString("from"), rs.getString("to"), "", 0.0));
                        ticket.setPassengers(rs.getString("passengers"));
                        ticket.setRoundTrip(new RoundTripFare(rs.getString("round_trip"), 0));
                        ticket.setDepartureDate(rs.getString("departure_date"));
                        ticket.setReturnDate(rs.getString("return_date"));
                        ticket.setFee(new FeeFare(rs.getString("fee"), 0.0));
                        ticket.setVehicle(new VehicleFare(rs.getString("vehicle"), 0.0));
                        lista.add(ticket);
                    }
                }
            }
        } catch(ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.disconnect();
        }
        return lista;
    }

    @Override
    public Ticket getTicketById(int ticketId) throws Exception {
        Ticket ticket = null;
        try {
            this.connect();
            try (PreparedStatement st = this.connection.prepareStatement("SELECT * FROM `tickets` WHERE id = ? LIMIT 1;")) {
                st.setInt(1, ticketId);
                try (ResultSet rs = st.executeQuery()) {
                    while(rs.next()) {
                        ticket = new Ticket();
                        ticket.setId(rs.getInt("id"));
                        ticket.setJourney(new JourneyFare(rs.getString("from"), rs.getString("to"), "", 0.0));
                        ticket.setPassengers(rs.getString("passengers"));
                        ticket.setRoundTrip(new RoundTripFare(rs.getString("round_trip"), 0));
                        ticket.setDepartureDate(rs.getString("departure_date"));
                        ticket.setReturnDate(rs.getString("return_date"));
                        ticket.setFee(new FeeFare(rs.getString("fee"), 0.0));
                        ticket.setVehicle(new VehicleFare(rs.getString("vehicle"), 0.0));
                    }
                }
            }
        } catch(ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.disconnect();
        }
        return ticket;
    }
}