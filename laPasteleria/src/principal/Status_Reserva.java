/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal;

/**
 *
 * @author Usuario
 */
public class Status_Reserva extends javax.swing.JFrame {

    /**
     * Creates new form Status_Reserva
     */
    public Status_Reserva() {
        initComponents();
        initAlternComponents();
    }

    public void initAlternComponents(){
        setTitle("Estado Rserva");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEliminarReserva = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textStatusReserve = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textDate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textName = new javax.swing.JLabel();
        imgPasteleria = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textReserve = new javax.swing.JLabel();
        titleReserve = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnOnReserve1 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(179, 25, 33));

        btnEliminarReserva.setBackground(new java.awt.Color(179, 25, 33));
        btnEliminarReserva.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        btnEliminarReserva.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarReserva.setText("ELIMINAR RESERVA");
        btnEliminarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarReservaActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ESTADO DE LA RESERVA:");

        textStatusReserve.setBackground(new java.awt.Color(255, 255, 255));
        textStatusReserve.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        textStatusReserve.setForeground(new java.awt.Color(255, 255, 255));
        textStatusReserve.setText("---------------------------");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FECHA DE ENTREGA:");

        textDate.setBackground(new java.awt.Color(255, 255, 255));
        textDate.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        textDate.setForeground(new java.awt.Color(255, 255, 255));
        textDate.setText("---------------------------");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE:");

        textName.setBackground(new java.awt.Color(255, 255, 255));
        textName.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        textName.setForeground(new java.awt.Color(255, 255, 255));
        textName.setText("---------------------------");

        imgPasteleria.setBackground(new java.awt.Color(255, 255, 255));
        imgPasteleria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        imgPasteleria.setForeground(new java.awt.Color(255, 255, 255));
        imgPasteleria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPasteleria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logotipo_pequeño.png"))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("RESERVA:");

        textReserve.setBackground(new java.awt.Color(255, 255, 255));
        textReserve.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        textReserve.setForeground(new java.awt.Color(255, 255, 255));
        textReserve.setText("---------------------------");

        titleReserve.setBackground(new java.awt.Color(255, 255, 255));
        titleReserve.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        titleReserve.setForeground(new java.awt.Color(255, 255, 255));
        titleReserve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleReserve.setText("ESTADO DE LA RESERVA");

        btnOnReserve1.setBackground(new java.awt.Color(179, 25, 33));
        btnOnReserve1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        btnOnReserve1.setForeground(new java.awt.Color(255, 255, 255));
        btnOnReserve1.setText("EN RESERVA");
        btnOnReserve1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnReserve1ActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(179, 25, 33));
        btnVolver.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("<- Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgPasteleria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleReserve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 41, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVolver)
                                .addGap(50, 50, 50)
                                .addComponent(btnOnReserve1)
                                .addGap(36, 36, 36)
                                .addComponent(btnEliminarReserva)))
                        .addGap(39, 39, 39))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textReserve)
                    .addComponent(textName)
                    .addComponent(textDate)
                    .addComponent(textStatusReserve))
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgPasteleria, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titleReserve)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(textReserve))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textName)
                        .addGap(18, 18, 18)
                        .addComponent(textDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textStatusReserve)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarReserva)
                    .addComponent(btnOnReserve1)
                    .addComponent(btnVolver))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarReservaActionPerformed
        //SE NECESITA CAMBIAR EL JPANEL A JFRAME

    }//GEN-LAST:event_btnEliminarReservaActionPerformed

    private void btnOnReserve1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnReserve1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOnReserve1ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Status_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Status_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Status_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Status_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Status_Reserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarReserva;
    private javax.swing.JButton btnOnReserve1;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel imgPasteleria;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel textDate;
    private javax.swing.JLabel textName;
    private javax.swing.JLabel textReserve;
    private javax.swing.JLabel textStatusReserve;
    private javax.swing.JLabel titleReserve;
    // End of variables declaration//GEN-END:variables
}
