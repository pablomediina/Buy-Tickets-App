package gui;

import java.awt.Color;


public class HomePanel extends javax.swing.JPanel {

    public HomePanel() {
        initComponents();
        initStyles();
    }
    
    private void initStyles() {
        jLabel2.putClientProperty("FlatLaf.style", "font: light $h1.regular.font");
        jLabel2.setForeground(Color.black);
        jLabel3.putClientProperty("FlatLaf.styleClass", "large");
        jLabel3.setForeground(Color.black);
        jLabel4.putClientProperty("FlatLaf.styleClass", "large");
        jLabel4.setForeground(Color.black);
        jLabel5.putClientProperty("FlatLaf.styleClass", "large");
        jLabel5.setForeground(Color.black);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        imgBoat = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(921, 531));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(921, 531));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("¡Bienvenid@!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 26, 565, 31));

        jLabel3.setText("Proyecto de Ingeniería del Software Curso 22/23 hecho por:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 75, 970, -1));

        jLabel4.setText("• Pablo Medina");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 109, 540, -1));

        jLabel5.setText("• Andrea Mayor");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 143, 540, -1));

        imgBoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoInicio.jpg"))); // NOI18N
        jPanel1.add(imgBoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgBoat;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}