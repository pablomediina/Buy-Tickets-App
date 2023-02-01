package gui;

import controller.Controller;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.Ticket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CreditCardPanel extends javax.swing.JPanel {
    
    private static Controller controller;
    private final Ticket ticket;

    public CreditCardPanel(Controller controller, Ticket ticketToBuy) {
        this.controller = controller;
        this.ticket = ticketToBuy;
        initComponents();
        initStyles();
    }
    
    private void initStyles() {
        num.setText("Número de Trajeta de Crédito/Débito");
        num.setForeground(Color.gray);
        valid.setText("Válido hasta MM/YY");
        valid.setForeground(Color.gray);
        cvv.setText("CVV");
        cvv.setForeground(Color.gray);
        payButton.setForeground(Color.blue);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        num = new javax.swing.JTextField();
        valid = new javax.swing.JTextField();
        cvv = new javax.swing.JTextField();
        img = new javax.swing.JLabel();
        payButton = new javax.swing.JButton();
        header = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(382, 195));

        num.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        num.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                numMousePressed(evt);
            }
        });

        valid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        valid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                validMousePressed(evt);
            }
        });

        cvv.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cvv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cvvMousePressed(evt);
            }
        });

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pago.jpg"))); // NOI18N

        payButton.setText("Pagar");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        header.setText("Introduce los datos de su tarjeta de crédito:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(valid, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cvv))
                            .addComponent(num))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(img)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(144, 144, 144))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(payButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valid, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(payButton)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        if(num.getText().length() != 16 || !num.getText().matches("\\d+") || !valid.getText().matches("(0[1-9]|1[0-2])/[0-9]{2}")|| cvv.getText().length() != 3 || !cvv.getText().matches("\\d+")){
            JOptionPane.showMessageDialog(this, "Ingrese todos los datos correctamente", "Error", JOptionPane.ERROR_MESSAGE);
        } else{
            try {
                controller.uploadTicket(ticket);
            } catch (Exception ex) {
                Logger.getLogger(CreditCardPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_payButtonActionPerformed

    private void validMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validMousePressed
        if (num.getText().equals("")) {
            num.setText("Número de Trajeta de Crédito/Débito");
            num.setForeground(Color.gray);
        }
        if (valid.getText().equals("Válido hasta MM/YY")) {
            valid.setText("");
            valid.setForeground(Color.black);
        }
        if (cvv.getText().equals("")) {
            cvv.setText("CVV");
            cvv.setForeground(Color.gray);
        }
    }//GEN-LAST:event_validMousePressed

    private void numMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numMousePressed
        if (num.getText().equals("Número de Trajeta de Crédito/Débito")) {
            num.setText("");
            num.setForeground(Color.black);
        }
        if (valid.getText().equals("")) {
            valid.setText("Válido hasta MM/YY");
            valid.setForeground(Color.gray);
        }
        if (cvv.getText().equals("")) {
            cvv.setText("CVV");
            cvv.setForeground(Color.gray);
        }
    }//GEN-LAST:event_numMousePressed

    private void cvvMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cvvMousePressed
        if (num.getText().equals("")) {
            num.setText("Número de Trajeta de Crédito/Débito");
            num.setForeground(Color.gray);
        }
        if (valid.getText().equals("")) {
            valid.setText("Válido hasta MM/YY");
            valid.setForeground(Color.gray);
        }
        if (cvv.getText().equals("CVV")) {
            cvv.setText("");
            cvv.setForeground(Color.black);
        }
    }//GEN-LAST:event_cvvMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cvv;
    private javax.swing.JLabel header;
    private javax.swing.JLabel img;
    private javax.swing.JTextField num;
    private javax.swing.JButton payButton;
    private javax.swing.JTextField valid;
    // End of variables declaration//GEN-END:variables
}
