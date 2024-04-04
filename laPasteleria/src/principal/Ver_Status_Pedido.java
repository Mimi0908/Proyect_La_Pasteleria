
package principal;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Ver_Status_Pedido extends javax.swing.JPanel {

  
    public Ver_Status_Pedido() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();
        btnMaking = new javax.swing.JButton();
        imgPasteleria = new javax.swing.JLabel();
        textOrder = new javax.swing.JLabel();
        textName = new javax.swing.JLabel();
        textDate = new javax.swing.JLabel();
        textStatusOrder = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(179, 25, 33));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ESTADO DEL PEDIDO");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ORDEN:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FECHA DE ENTREGA:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ESTADO DEL PEDIDO:");

        btnStart.setBackground(new java.awt.Color(179, 25, 33));
        btnStart.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        btnStart.setForeground(new java.awt.Color(255, 255, 255));
        btnStart.setText("SIN EMPEZAR");

        btnFinish.setBackground(new java.awt.Color(179, 25, 33));
        btnFinish.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        btnFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnFinish.setText("TERMINADO");

        btnMaking.setBackground(new java.awt.Color(179, 25, 33));
        btnMaking.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        btnMaking.setForeground(new java.awt.Color(255, 255, 255));
        btnMaking.setText("HACIENDO");

        imgPasteleria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        textOrder.setBackground(new java.awt.Color(255, 255, 255));
        textOrder.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        textOrder.setForeground(new java.awt.Color(255, 255, 255));
        textOrder.setText("---------------------------");

        textName.setBackground(new java.awt.Color(255, 255, 255));
        textName.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        textName.setForeground(new java.awt.Color(255, 255, 255));
        textName.setText("---------------------------");

        textDate.setBackground(new java.awt.Color(255, 255, 255));
        textDate.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        textDate.setForeground(new java.awt.Color(255, 255, 255));
        textDate.setText("---------------------------");

        textStatusOrder.setBackground(new java.awt.Color(255, 255, 255));
        textStatusOrder.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        textStatusOrder.setForeground(new java.awt.Color(255, 255, 255));
        textStatusOrder.setText("---------------------------");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgPasteleria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textName)
                    .addComponent(textOrder)
                    .addComponent(textDate)
                    .addComponent(textStatusOrder))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnStart)
                        .addGap(18, 18, 18)
                        .addComponent(btnMaking)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinish)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(imgPasteleria, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textName)
                        .addGap(18, 18, 18)
                        .addComponent(textDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textStatusOrder)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart)
                    .addComponent(btnMaking)
                    .addComponent(btnFinish))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnMaking;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel imgPasteleria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel textDate;
    private javax.swing.JLabel textName;
    private javax.swing.JLabel textOrder;
    private javax.swing.JLabel textStatusOrder;
    // End of variables declaration//GEN-END:variables
}
