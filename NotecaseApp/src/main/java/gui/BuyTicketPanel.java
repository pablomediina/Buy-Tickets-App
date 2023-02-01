package gui;

import com.toedter.calendar.JDateChooser;
import controller.Controller;
import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Ticket;
import static gui.DashboardPanel.ShowJPanel;
import model.FeeFare;
import model.JourneyFare;
import model.RoundTripFare;
import model.VehicleFare;

public class BuyTicketPanel extends javax.swing.JPanel {
    
    private static Controller controller;
    
    public BuyTicketPanel(Controller controller) {
        this.controller = controller;
        initComponents();
        InitStyles();
        updateCalendar();
    }

    private void InitStyles() {
        header.putClientProperty("FlatLaf.styleClass", "h1");
        header.setForeground(Color.black);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rates = new javax.swing.ButtonGroup();
        vehicles = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        buyButton = new javax.swing.JButton();
        header = new javax.swing.JLabel();
        journeyBox = new javax.swing.JComboBox<>();
        roundTripBox = new javax.swing.JCheckBox();
        canaryIslands = new javax.swing.JLabel();
        passengersIcon = new javax.swing.JLabel();
        p60Box = new javax.swing.JSpinner();
        pasengerText = new javax.swing.JLabel();
        fee0 = new javax.swing.JRadioButton();
        fee1 = new javax.swing.JRadioButton();
        fee2 = new javax.swing.JRadioButton();
        feeText = new javax.swing.JLabel();
        feeIcon = new javax.swing.JLabel();
        vehiclesText = new javax.swing.JLabel();
        vehicle0 = new javax.swing.JRadioButton();
        vehicle1 = new javax.swing.JRadioButton();
        vehicle2 = new javax.swing.JRadioButton();
        vehicle3 = new javax.swing.JRadioButton();
        vehicle4 = new javax.swing.JRadioButton();
        vehicle5 = new javax.swing.JRadioButton();
        touringIcon = new javax.swing.JLabel();
        largeVehicleIcon = new javax.swing.JLabel();
        mopedIcon = new javax.swing.JLabel();
        bikeIcon = new javax.swing.JLabel();
        motorcycleIcon = new javax.swing.JLabel();
        departureDateText = new javax.swing.JLabel();
        returnDateText = new javax.swing.JLabel();
        departureDateBox = new com.toedter.calendar.JDateChooser();
        returnDateBox = new com.toedter.calendar.JDateChooser();
        babyText = new javax.swing.JLabel();
        kidText = new javax.swing.JLabel();
        youngText = new javax.swing.JLabel();
        adultText = new javax.swing.JLabel();
        elderText = new javax.swing.JLabel();
        pAdultBox = new javax.swing.JSpinner();
        p26Box = new javax.swing.JSpinner();
        pChildrenBox = new javax.swing.JSpinner();
        pBabyBox = new javax.swing.JSpinner();
        jProgressBar1 = new javax.swing.JProgressBar();
        journeyText = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(921, 531));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(921, 531));

        buyButton.setBackground(new java.awt.Color(18, 90, 173));
        buyButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buyButton.setForeground(new java.awt.Color(255, 255, 255));
        buyButton.setText("Comprar");
        buyButton.setBorderPainted(false);
        buyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        header.setText("Comprar Ticket");

        journeyBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {controller.model.getJourneys().get(0).getFrom() + " - " + controller.model.getJourneys().get(0).getTo() + " (" + controller.model.getJourneys().get(0).getTime() + ")", controller.model.getJourneys().get(1).getFrom() + " - " +controller.model.getJourneys().get(1).getTo() + " (" + controller.model.getJourneys().get(1).getTime() + ")", controller.model.getJourneys().get(2).getFrom() + " - " +controller.model.getJourneys().get(2).getTo() + " (" + controller.model.getJourneys().get(2).getTime() + ")", controller.model.getJourneys().get(3).getFrom() + " - " +controller.model.getJourneys().get(3).getTo() + " (" + controller.model.getJourneys().get(3).getTime() + ")"}));

        roundTripBox.setSelected(true);
        roundTripBox.setText("Ida y Vuelta");
        roundTripBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundTripBoxActionPerformed(evt);
            }
        });

        canaryIslands.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mapa.jpg"))); // NOI18N

        passengersIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pasajeros.png"))); // NOI18N

        p60Box.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));

        pasengerText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pasengerText.setText("PASAJEROS");

        rates.add(fee0);
        fee0.setText(controller.model.getFees().get(0).getType());

        rates.add(fee1);
        fee1.setText(controller.model.getFees().get(1).getType());

        rates.add(fee2);
        fee2.setText(controller.model.getFees().get(2).getType());

        feeText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        feeText.setText("TARIFAS");

        feeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tarifas.png"))); // NOI18N

        vehiclesText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vehiclesText.setText("VEHÍCULOS");

        vehicles.add(vehicle0);
        vehicle0.setText(controller.model.getVehicles().get(0).getType());

        vehicles.add(vehicle1);
        vehicle1.setText(controller.model.getVehicles().get(1).getType());

        vehicles.add(vehicle2);
        vehicle2.setText(controller.model.getVehicles().get(2).getType());

        vehicles.add(vehicle3);
        vehicle3.setText(controller.model.getVehicles().get(3).getType());

        vehicles.add(vehicle4);
        vehicle4.setText(controller.model.getVehicles().get(4).getType());

        vehicles.add(vehicle5);
        vehicle5.setText(controller.model.getVehicles().get(5).getType());

        touringIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/suv.png"))); // NOI18N

        largeVehicleIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caravana.png"))); // NOI18N

        mopedIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/motocicleta.png"))); // NOI18N

        bikeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bicicleta.png"))); // NOI18N

        motorcycleIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moto.png"))); // NOI18N

        departureDateText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        departureDateText.setText("FECHA IDA");

        returnDateText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        returnDateText.setText("FECHA VUELTA");

        babyText.setText("BEBÉS (0-3)");

        kidText.setText("NIÑOS (4-11)");

        youngText.setText("JÓVENES (<26)");

        adultText.setText("ADULTOS");

        elderText.setText(">60 AÑOS");

        pAdultBox.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));

        p26Box.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));

        pChildrenBox.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));

        pBabyBox.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));

        jProgressBar1.setForeground(new java.awt.Color(0, 47, 108));
        jProgressBar1.setValue(10);

        journeyText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        journeyText.setText("VIAJE");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(departureDateText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(101, 101, 101)
                                .addComponent(returnDateText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(111, 111, 111))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(departureDateBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(returnDateBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(68, 68, 68)))
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(feeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(46, 46, 46))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(fee0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(24, 24, 24))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(fee2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(70, 70, 70)))
                                .addGap(222, 222, 222)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bikeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(motorcycleIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(fee1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(feeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(274, 274, 274))))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(journeyBox, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(roundTripBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8))
                            .addComponent(canaryIslands, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(adultText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(5, 5, 5))
                                    .addComponent(elderText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(kidText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(8, 8, 8))
                                    .addComponent(youngText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(babyText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(19, 19, 19)))
                                .addGap(18, 18, 18)))
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pBabyBox)
                            .addComponent(pChildrenBox)
                            .addComponent(p26Box)
                            .addComponent(pAdultBox)
                            .addComponent(p60Box))
                        .addGap(67, 67, 67)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(vehicle0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(28, 28, 28))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(vehicle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(57, 57, 57))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(vehicle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(2, 2, 2))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(vehicle3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30))
                            .addComponent(vehicle5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vehicle4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(touringIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(largeVehicleIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mopedIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(49, 49, 49))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(712, 712, 712)
                .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(journeyText)
                        .addGap(347, 347, 347)
                        .addComponent(passengersIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(pasengerText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(90, 90, 90)
                        .addComponent(vehiclesText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passengersIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pasengerText)
                    .addComponent(vehiclesText)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(journeyText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(journeyBox)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(roundTripBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(2, 2, 2)))
                        .addGap(10, 10, 10)
                        .addComponent(canaryIslands, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(babyText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(pBabyBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(kidText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(pChildrenBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(youngText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(p26Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(adultText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(pAdultBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(elderText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(p60Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(vehicle0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(vehicle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(vehicle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(vehicle3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(touringIcon)
                        .addGap(18, 18, 18)
                        .addComponent(largeVehicleIcon)
                        .addGap(18, 18, 18)
                        .addComponent(mopedIcon)))
                .addGap(8, 8, 8)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(returnDateText)
                            .addComponent(departureDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(departureDateBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(returnDateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(feeText))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                        .addComponent(vehicle4)
                                        .addGap(18, 18, 18)))
                                .addGap(10, 10, 10)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fee0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(vehicle5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(bikeIcon)
                                .addGap(18, 18, 18)
                                .addComponent(motorcycleIcon)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(feeIcon)
                            .addComponent(fee1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fee2)
                    .addComponent(buyButton))
                .addGap(19, 19, 19)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, 539, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        
        JourneyFare journey = null;
        String journeySelected = journeyBox.getSelectedItem().toString();
        
        for (JourneyFare journeyFare : controller.model.getJourneys()) {
            if (journeySelected.equals(journeyFare.getFrom() + " - " + journeyFare.getTo() + " (" + journeyFare.getTime() + ")")) 
                journey = journeyFare;
        }

        RoundTripFare roundTrip = controller.model.getRoundTrips().get(1);
        if (!roundTripBox.isSelected()) roundTrip = controller.model.getRoundTrips().get(0);

        int pBaby = (int) pBabyBox.getValue();
        int pChildren = (int) pChildrenBox.getValue();
        int p26 = (int) p26Box.getValue();
        int pAdult = (int) pAdultBox.getValue();
        int p60 = (int) p60Box.getValue();
        String passengers = String.valueOf(pBaby + pChildren + p26 + pAdult + p60);

        FeeFare fee = null;
        if (fee0.isSelected()) fee = controller.model.getFees().get(0);
        if (fee1.isSelected()) fee = controller.model.getFees().get(1);
        if (fee2.isSelected()) fee = controller.model.getFees().get(2);

        VehicleFare vehicle = null;
        if (vehicle0.isSelected()) vehicle = controller.model.getVehicles().get(0);
        if (vehicle1.isSelected()) vehicle = controller.model.getVehicles().get(1);
        if (vehicle2.isSelected()) vehicle = controller.model.getVehicles().get(2);
        if (vehicle3.isSelected()) vehicle = controller.model.getVehicles().get(3);
        if (vehicle4.isSelected()) vehicle = controller.model.getVehicles().get(4);
        if (vehicle5.isSelected()) vehicle = controller.model.getVehicles().get(5);

        String departureDate = getDate(departureDateBox);

        String returnDate = getDate(returnDateBox);
        String returnTime = returnDate;
        if (!roundTripBox.isSelected()) returnTime = "-";
        
        if (journey == controller.model.getJourneys().get(0) || passengers.equals("0") || fee == null || vehicle == null || departureDate.length() != 10) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            journeyBox.requestFocus();
            return;
        }
        if (roundTripBox.isSelected()) {
            if (returnTime.length() != 10) {
                javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                journeyBox.requestFocus();
                return;
            }
            if (departureDateBox.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Selecciona la fecha", "Error", JOptionPane.ERROR_MESSAGE);                   
                return;
            }
        }

        Ticket ticket = new Ticket();
        ticket.setJourney(journey);
        ticket.setPassengers(passengers);
        ticket.setRoundTrip(roundTrip);
        ticket.setDepartureDate(departureDate);
        ticket.setReturnDate(returnDate);
        ticket.setFee(fee);
        ticket.setVehicle(vehicle);
        
        journeyBox.setSelectedIndex(0);
        roundTripBox.setSelected(true);
        pBabyBox.setValue(0);
        pChildrenBox.setValue(0);
        p26Box.setValue(0);
        pAdultBox.setValue(0);
        p60Box.setValue(0);
        vehicles.clearSelection();
        rates.clearSelection();
        departureDateBox.setDate(null);
        returnDateBox.setDate(null);
        
        ShowJPanel(new TotalToPayPanel(controller, ticket));
    }//GEN-LAST:event_buyButtonActionPerformed

    private void roundTripBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundTripBoxActionPerformed
        if (!roundTripBox.isSelected()) {
            returnDateBox.setEnabled(false);
        }
        if (roundTripBox.isSelected()) {
            returnDateBox.setEnabled(true);
        }
    }//GEN-LAST:event_roundTripBoxActionPerformed
    
    private String getDate(JDateChooser jd){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        if (jd.getDate() !=null) return dateFormat.format(jd.getDate());
        else return null;
    }
    
    private void updateCalendar() {
    departureDateBox.setMinSelectableDate(new Date());
    departureDateBox.addPropertyChangeListener((PropertyChangeEvent evt) -> {
        if ("date".equals(evt.getPropertyName())) returnDateBox.setSelectableDateRange((Date) evt.getNewValue(), null);
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adultText;
    private javax.swing.JLabel babyText;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bikeIcon;
    private javax.swing.JButton buyButton;
    private javax.swing.JLabel canaryIslands;
    private com.toedter.calendar.JDateChooser departureDateBox;
    private javax.swing.JLabel departureDateText;
    private javax.swing.JLabel elderText;
    private javax.swing.JRadioButton fee0;
    private javax.swing.JRadioButton fee1;
    private javax.swing.JRadioButton fee2;
    private javax.swing.JLabel feeIcon;
    private javax.swing.JLabel feeText;
    private javax.swing.JLabel header;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JComboBox<String> journeyBox;
    private javax.swing.JLabel journeyText;
    private javax.swing.JLabel kidText;
    private javax.swing.JLabel largeVehicleIcon;
    private javax.swing.JLabel mopedIcon;
    private javax.swing.JLabel motorcycleIcon;
    private javax.swing.JSpinner p26Box;
    private javax.swing.JSpinner p60Box;
    private javax.swing.JSpinner pAdultBox;
    private javax.swing.JSpinner pBabyBox;
    private javax.swing.JSpinner pChildrenBox;
    private javax.swing.JLabel pasengerText;
    private javax.swing.JLabel passengersIcon;
    private javax.swing.ButtonGroup rates;
    private com.toedter.calendar.JDateChooser returnDateBox;
    private javax.swing.JLabel returnDateText;
    private javax.swing.JCheckBox roundTripBox;
    private javax.swing.JLabel touringIcon;
    private javax.swing.JRadioButton vehicle0;
    private javax.swing.JRadioButton vehicle1;
    private javax.swing.JRadioButton vehicle2;
    private javax.swing.JRadioButton vehicle3;
    private javax.swing.JRadioButton vehicle4;
    private javax.swing.JRadioButton vehicle5;
    private javax.swing.ButtonGroup vehicles;
    private javax.swing.JLabel vehiclesText;
    private javax.swing.JLabel youngText;
    // End of variables declaration//GEN-END:variables
}