
package principal;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Ver_Reserva extends javax.swing.JPanel {
    public Ver_Reserva() {
        initComponents();
        init_Components_mods();
    }
    
    public void init_Components_mods() {
        //Agregar LogoTipo
        ImageIcon imageLogo = new ImageIcon("imagenes/logotipo.png");
        Icon icono = new ImageIcon(imageLogo.getImage().getScaledInstance(imgPasteleria.getWidth(), imgPasteleria.getHeight(), Image.SCALE_DEFAULT));
        imgPasteleria.setIcon(icono);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imgPasteleria = new javax.swing.JLabel();
        titleReserve = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(214, 25, 33));

        imgPasteleria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        imgPasteleria.setForeground(new java.awt.Color(255, 255, 255));

        titleReserve.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        titleReserve.setForeground(new java.awt.Color(255, 255, 255));
        titleReserve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleReserve.setText("RESERVAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgPasteleria, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
            .addComponent(titleReserve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(imgPasteleria, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(titleReserve)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgPasteleria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titleReserve;
    // End of variables declaration//GEN-END:variables
}
