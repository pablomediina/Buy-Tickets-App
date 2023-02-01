package gui;


import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import controller.Controller;
import java.awt.BorderLayout;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.UIManager;


public class DashboardPanel extends javax.swing.JFrame {
    
    private static Controller controller;
    
    public DashboardPanel(Controller controller) {
        this.controller = controller;
        FlatMaterialLighterIJTheme.setup();
        UIManager.put( "Button.arc", 999 );
        initComponents();
        initStyles();
        setDate();
        initContent();
    }
    
    private void initStyles() {
        date.putClientProperty( "FlatLaf.styleClass", "h1" );
    }
    
    private void setDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        date.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }
    
    private void initContent() {
        ShowJPanel(new HomePanel());
    }
    
    public static void ShowJPanel(JPanel p) {
        p.setSize(750, 430);
        p.setLocation(0,0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        buyButton = new javax.swing.JButton();
        myticketsButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        date = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMinimumSize(new java.awt.Dimension(1191, 640));

        menu.setBackground(new java.awt.Color(0, 47, 108));
        menu.setPreferredSize(new java.awt.Dimension(280, 640));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logopng.png"))); // NOI18N

        buyButton.setBackground(new java.awt.Color(0, 47, 108));
        buyButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buyButton.setForeground(new java.awt.Color(255, 255, 255));
        buyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoLupa.png"))); // NOI18N
        buyButton.setText("Comprar Ticket");
        buyButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(0, 0, 0)));
        buyButton.setBorderPainted(false);
        buyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buyButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buyButton.setIconTextGap(10);
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        myticketsButton.setBackground(new java.awt.Color(0, 47, 108));
        myticketsButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        myticketsButton.setForeground(new java.awt.Color(255, 255, 255));
        myticketsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoTicket.png"))); // NOI18N
        myticketsButton.setText("Mis Tickets");
        myticketsButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(0, 0, 0)));
        myticketsButton.setBorderPainted(false);
        myticketsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        myticketsButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        myticketsButton.setIconTextGap(10);
        myticketsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myticketsButtonActionPerformed(evt);
            }
        });

        homeButton.setBackground(new java.awt.Color(0, 47, 108));
        homeButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoHome.png"))); // NOI18N
        homeButton.setText("Inicio");
        homeButton.setActionCommand("Home");
        homeButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(0, 0, 0)));
        homeButton.setBorderPainted(false);
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        homeButton.setIconTextGap(10);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(myticketsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myticketsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        header.setBackground(new java.awt.Color(223, 234, 246));
        header.setPreferredSize(new java.awt.Dimension(744, 150));

        date.setText("Hoy es {dayname} {day} de {month} del {year}");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
                        .addGap(1, 1, 1))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void myticketsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myticketsButtonActionPerformed
        try {
            ShowJPanel(new MyTicketsPanel(controller));
        } catch (Exception ex) {
            Logger.getLogger(DashboardPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_myticketsButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        ShowJPanel(new HomePanel());
    }//GEN-LAST:event_homeButtonActionPerformed

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        ShowJPanel(new BuyTicketPanel(controller));
    }//GEN-LAST:event_buyButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new DashboardPanel(controller).setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton buyButton;
    private static javax.swing.JPanel content;
    private javax.swing.JLabel date;
    private javax.swing.JPanel header;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel menu;
    private javax.swing.JButton myticketsButton;
    // End of variables declaration//GEN-END:variables
}