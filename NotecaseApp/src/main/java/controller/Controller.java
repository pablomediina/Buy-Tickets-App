package controller;

import database.MySqlManager;
import static gui.DashboardPanel.ShowJPanel;
import gui.MyTicketsPanel;
import gui.PayPalPanel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.Ticket;
import model.Trip;


public class Controller {

    public final Trip model;

    public Controller(Trip model) {
        this.model = model;
    } 
    
    public void uploadTicket(Ticket ticket) throws Exception {
        MySqlManager mySql = new MySqlManager();
        mySql.register(ticket);
        javax.swing.JOptionPane.showMessageDialog(new PayPalPanel(new Controller(model), ticket), "Ticket comprado exitosamente.\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        ShowJPanel(new MyTicketsPanel(new Controller(model)));
    }
    
    public void loadTickets(javax.swing.JTable jTable1) throws Exception {
        try {
            MySqlManager mySql = new MySqlManager();
            DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
            mySql.toList("").forEach((u) -> tableModel.addRow(new Object[]{u.getId(), u.getJourney().getFrom(), u.getJourney().getTo(), u.getPassengers(), u.getRoundTrip().getType(), u.getDepartureDate(), u.getReturnDate(), u.getFee().getType(), u.getVehicle().getType()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void searchTicket(javax.swing.JTable jTable1, javax.swing.JTextField userSearch) throws Exception {
        try {
            MySqlManager mySql = new MySqlManager();
            DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
            tableModel.setRowCount(0);
            mySql.toList(userSearch.getText()).forEach((u) -> tableModel.addRow(new Object[]{u.getId(), u.getJourney().getFrom(), u.getJourney().getTo(), u.getPassengers(), u.getRoundTrip().getType(), u.getDepartureDate(), u.getReturnDate(), u.getFee(), u.getVehicle()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void deleteTicket(javax.swing.JTable jTable1) {
        MySqlManager mySql = new MySqlManager();
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRows().length < 1) {
            try {
                javax.swing.JOptionPane.showMessageDialog(new MyTicketsPanel(new Controller(model)), "Debes seleccionar uno o más tickets a eliminar.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            for (int i : jTable1.getSelectedRows()) {
                try {
                    mySql.delete((int) jTable1.getValueAt(i, 0));
                    tableModel.removeRow(i);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}