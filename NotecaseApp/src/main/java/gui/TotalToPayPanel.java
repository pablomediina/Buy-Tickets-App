package gui;

import controller.Controller;
import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import model.Ticket;
import static gui.DashboardPanel.ShowJPanel;


public class TotalToPayPanel extends javax.swing.JPanel {

    private static Controller controller;
    private Ticket ticket;

    public TotalToPayPanel(Controller controller, Ticket ticketToBuy) {
        this.controller = controller;
        this.ticket = ticketToBuy;        
        initComponents();
        initStyles();
        calculateTotal();
    }
    
    private void initStyles() {
        buyButton.setForeground(Color.blue);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        returnText = new javax.swing.JLabel();
        departureValue = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        returnValue = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buyButton = new javax.swing.JButton();
        totalToPayValue = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        totalToPayText = new javax.swing.JLabel();
        passegers = new javax.swing.JLabel();
        feeText = new javax.swing.JLabel();
        totalPerPassengersValue = new javax.swing.JLabel();
        feeValue = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totalPerPassengerText = new javax.swing.JLabel();
        vehicleText = new javax.swing.JLabel();
        vehiculoBox = new javax.swing.JLabel();
        departureText = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        discountValue = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        totalText = new javax.swing.JLabel();
        totalValue = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        discounts = new javax.swing.JComboBox<>();
        jProgressBar1 = new javax.swing.JProgressBar();

        setPreferredSize(new java.awt.Dimension(921, 531));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(921, 531));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TOTAL A PAGAR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        returnText.setText("Viaje de vuelta");

        departureValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        departureValue.setText("0");

        jLabel1.setText("€");

        returnValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        returnValue.setText("0");

        jLabel2.setText("€");

        buyButton.setText("Comprar");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        totalToPayValue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalToPayValue.setText("0");
        totalToPayValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalToPayValueActionPerformed(evt);
            }
        });

        jLabel8.setText("€");

        totalToPayText.setText("TOTAL A PAGAR");

        passegers.setText("x1 Pasajero(s)");

        feeText.setText("Tarifa");

        totalPerPassengersValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalPerPassengersValue.setText("0");

        feeValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        feeValue.setText("0");

        jLabel6.setText("€");

        jLabel3.setText("€");

        totalPerPassengerText.setText("Total por pasajero");

        vehicleText.setText("Vehículo");

        vehiculoBox.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        vehiculoBox.setText("0");

        departureText.setText("Viaje de ida");

        jLabel4.setText("€");

        discountValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        discountValue.setText("-0");

        jLabel5.setText("€");

        totalText.setText("Total");

        totalValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalValue.setText("0");

        jLabel7.setText("€");

        discounts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- seleccionar descuento -", "Residente Canario", "Familia Numerosa", "Subvención Militar", "Descuento Guardia Civil" }));
        discounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalPerPassengerText, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(returnText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(departureText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(22, 22, 22))
                            .addComponent(feeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vehicleText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totalText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalToPayText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(discounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vehiculoBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(departureValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(returnValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(feeValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalPerPassengersValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(discountValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(totalToPayValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addGap(115, 115, 115))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(115, 115, 115))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(115, 115, 115))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(115, 115, 115))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(106, 106, 106))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passegers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departureText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(departureValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(returnValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(feeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(feeValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicleText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vehiculoBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalPerPassengerText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalPerPassengersValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passegers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(discountValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(discounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalToPayValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buyButton)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalToPayText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        jProgressBar1.setForeground(new java.awt.Color(0, 47, 108));
        jProgressBar1.setValue(66);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        ShowJPanel(new PaymentPanel(controller, ticket));
    }//GEN-LAST:event_buyButtonActionPerformed

    private void discountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountsActionPerformed
        String discount = discounts.getSelectedItem().toString();
        double total = Double.parseDouble(totalPerPassengersValue.getText()) * Double.parseDouble(ticket.getPassengers());
        
        BigDecimal rc = new BigDecimal(total * 0.25);
        rc = rc.setScale(2, RoundingMode.HALF_UP);
        
        BigDecimal fm = new BigDecimal(total * 0.4);
        fm = fm.setScale(2, RoundingMode.HALF_UP);
        
        BigDecimal sm = new BigDecimal(total * 0.55);
        sm = sm.setScale(2, RoundingMode.HALF_UP);
        
        BigDecimal dg = new BigDecimal(total * 0.6);
        dg = dg.setScale(2, RoundingMode.HALF_UP);
        
        BigDecimal rcSub = new BigDecimal(total - rc.doubleValue());
        rcSub = rcSub.setScale(2, RoundingMode.HALF_UP);
        
        BigDecimal fmSub = new BigDecimal(total - fm.doubleValue());
        fmSub = fmSub.setScale(2, RoundingMode.HALF_UP);
        
        BigDecimal smSub = new BigDecimal(total - sm.doubleValue());
        smSub = smSub.setScale(2, RoundingMode.HALF_UP);
        
        BigDecimal dgSub = new BigDecimal(total - dg.doubleValue());
        dgSub = dgSub.setScale(2, RoundingMode.HALF_UP);
        
        if (discount == "Residente Canario") {
            totalToPayValue.setText(String.valueOf(rc.doubleValue()));
            discountValue.setText("-" + String.valueOf(rcSub.doubleValue()));
        }
        else if (discount == "Familia Numerosa") {
            totalToPayValue.setText(String.valueOf(fm.doubleValue()));
            discountValue.setText("-" + String.valueOf(fmSub.doubleValue()));
        }
        else if (discount == "Subvención Militar") {
            totalToPayValue.setText(String.valueOf(sm.doubleValue()));
            discountValue.setText("-" + String.valueOf(smSub.doubleValue()));
        }
        else if (discount == "Descuento Guardia Civil") {
            totalToPayValue.setText(String.valueOf(dg.doubleValue()));
            discountValue.setText("-" + String.valueOf(dgSub.doubleValue()));
        }
        else {
            totalToPayValue.setText(String.valueOf(total));
            discountValue.setText("-0");
        }
    }//GEN-LAST:event_discountsActionPerformed

    private void totalToPayValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalToPayValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalToPayValueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buyButton;
    private javax.swing.JLabel departureText;
    private javax.swing.JLabel departureValue;
    private javax.swing.JLabel discountValue;
    private javax.swing.JComboBox<String> discounts;
    private javax.swing.JLabel feeText;
    private javax.swing.JLabel feeValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel passegers;
    private javax.swing.JLabel returnText;
    private javax.swing.JLabel returnValue;
    private javax.swing.JLabel totalPerPassengerText;
    private javax.swing.JLabel totalPerPassengersValue;
    private javax.swing.JLabel totalText;
    private javax.swing.JLabel totalToPayText;
    private javax.swing.JTextField totalToPayValue;
    private javax.swing.JLabel totalValue;
    private javax.swing.JLabel vehicleText;
    private javax.swing.JLabel vehiculoBox;
    // End of variables declaration//GEN-END:variables

    private void calculateTotal() {
        double total = 0;

        total = total + ticket.getJourney().getPrice();
        departureValue.setText(String.valueOf(ticket.getJourney().getPrice()));
        
        double roundTrip = 0.0;
        switch (ticket.getRoundTrip().getValue()) {
            case 1 -> { 
                returnValue.setText(String.valueOf(0));
                roundTrip = ticket.getRoundTrip().getValue() * ticket.getJourney().getPrice();
            }
            case 2 -> {
                returnValue.setText(String.valueOf(ticket.getJourney().getPrice()));
                roundTrip = ticket.getRoundTrip().getValue() * ticket.getJourney().getPrice();
            }


        }
        
        double total_withoutFee = total + roundTrip;
        
        BigDecimal totalWithFee = new BigDecimal(total_withoutFee * ticket.getFee().getPrice());
        totalWithFee = totalWithFee.setScale(2, RoundingMode.HALF_UP);
        total = totalWithFee.doubleValue();
        
        BigDecimal fee = new BigDecimal(total - total_withoutFee);
        fee = fee.setScale(2, RoundingMode.HALF_UP);
        feeValue.setText(String.valueOf(fee.doubleValue()));
        
        total = total + ticket.getVehicle().getPrice();
        
        vehiculoBox.setText(String.valueOf(ticket.getVehicle().getPrice()));
        
        BigDecimal TxP = new BigDecimal(total);
        TxP = TxP.setScale(2, RoundingMode.HALF_UP);
        totalPerPassengersValue.setText(String.valueOf(TxP.doubleValue()));
        
        total = total * Double.parseDouble(ticket.getPassengers());
        
        passegers.setText("x" + ticket.getPassengers() + " pasajero(s)");
        
        BigDecimal totalRounded = new BigDecimal(total);
        totalRounded = totalRounded.setScale(2, RoundingMode.HALF_UP);
        totalValue.setText(String.valueOf(totalRounded.doubleValue()));
        totalToPayValue.setText(String.valueOf(totalRounded.doubleValue()));
    }
}