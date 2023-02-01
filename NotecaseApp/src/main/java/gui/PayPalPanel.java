package gui;

import controller.Controller;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Ticket;


public class PayPalPanel extends javax.swing.JPanel {
    
    private static Controller controller;
    private final Ticket ticket;

    public PayPalPanel(Controller controller, Ticket ticketToBuy) {
        this.controller = controller;
        this.ticket = ticketToBuy;
        initComponents();
        initStyles();
    }
    
    private void initStyles() {
        email.setText("Correo electrónico");
        email.setForeground(Color.black);
        pass.setText("********");
        pass.setForeground(Color.gray);
        payButton.setForeground(Color.blue);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        email = new javax.swing.JTextField();
        header = new javax.swing.JLabel();
        payButton = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(382, 195));

        email.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                emailMousePressed(evt);
            }
        });

        header.setText("Introduce los datos de su cuenta de PayPal:");

        payButton.setText("Pagar");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        pass.setText("jPasswordField1");
        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                        .addGap(117, 117, 117))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(payButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pass)
                            .addComponent(email))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void emailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMousePressed
        if (email.getText().equals("Correo electrónico")) {
            email.setText("");
            email.setForeground(Color.black);
        }
        if (pass.getText().equals("")) {
            pass.setText("********");
            pass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_emailMousePressed

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        if ( !email.getText().matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$")|| String.valueOf(pass.getPassword()).equals("********")){
            JOptionPane.showMessageDialog(this, "Ingrese todos los datos correctamente", "Error", JOptionPane.ERROR_MESSAGE);
        } else{
            try {
                controller.uploadTicket(ticket);
            } catch (Exception ex) {
                Logger.getLogger(PayPalPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_payButtonActionPerformed

    private void passMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMousePressed
        if (email.getText().equals("")) {
            email.setText("Correo electrónico");
            email.setForeground(Color.gray);
        }
        if (pass.getText().equals("********")) {
            pass.setText("");
            pass.setForeground(Color.black);
        }
    }//GEN-LAST:event_passMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel header;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton payButton;
    // End of variables declaration//GEN-END:variables
}