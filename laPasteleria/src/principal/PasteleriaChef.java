/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;


/**
 *
 * @author Asus
 */
public class PasteleriaChef extends javax.swing.JFrame {

    /**
     * Creates new form PasteleriaChef
     */
    public PasteleriaChef() {
        initComponents();
        initAlternComponents();
    }

     public void initAlternComponents() {
        setTitle("MENU");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo-principal.png"));
        icono= icono.getScaledInstance(557, 289, Image.SCALE_SMOOTH);
        logotipo.setIcon(new ImageIcon(icono));
        
        Image icono2 = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono.png"));
        icono2= icono2.getScaledInstance(162, 180, Image.SCALE_SMOOTH);
        cajaIcono.setIcon(new ImageIcon(icono2));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        btnReservas = new javax.swing.JButton();
        btnEncargos = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        cajaIcono = new javax.swing.JLabel();
        pantallaInicial = new javax.swing.JPanel();
        logotipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setBackground(new java.awt.Color(214, 25, 33));
        menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        btnReservas.setBackground(new java.awt.Color(214, 25, 33));
        btnReservas.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btnReservas.setForeground(new java.awt.Color(255, 255, 255));
        btnReservas.setText("Reservas");
        btnReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservasActionPerformed(evt);
            }
        });

        btnEncargos.setBackground(new java.awt.Color(214, 25, 33));
        btnEncargos.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btnEncargos.setForeground(new java.awt.Color(255, 255, 255));
        btnEncargos.setText("Encargos");
        btnEncargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncargosActionPerformed(evt);
            }
        });

        btnSalida.setBackground(new java.awt.Color(214, 25, 33));
        btnSalida.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btnSalida.setForeground(new java.awt.Color(255, 255, 255));
        btnSalida.setText("Salir");
        btnSalida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });

        cajaIcono.setToolTipText("");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cajaIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEncargos, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(cajaIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnReservas)
                .addGap(18, 18, 18)
                .addComponent(btnEncargos)
                .addGap(18, 18, 18)
                .addComponent(btnSalida)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pantallaInicial.setBackground(new java.awt.Color(179, 25, 33));
        pantallaInicial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        logotipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pantallaInicialLayout = new javax.swing.GroupLayout(pantallaInicial);
        pantallaInicial.setLayout(pantallaInicialLayout);
        pantallaInicialLayout.setHorizontalGroup(
            pantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logotipo, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );
        pantallaInicialLayout.setVerticalGroup(
            pantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaInicialLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(logotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pantallaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pantallaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        //crear instancia de la base de datos
        
        pantallaInicial.removeAll();
        // creara una instancia del nuevo contenedor
        TablaReservas nuevo= new TablaReservas();
        // ajustar el tamaño del nuevo contenedor
        nuevo.setSize(pantallaInicial.getSize());
        nuevo.setPreferredSize(pantallaInicial.getPreferredSize());
        // agregar el nuevo contenedor dentro del contenedor principal
        pantallaInicial.add(nuevo);
        // renderizar revalidaded o repade
        revalidate();
        repaint();
    }//GEN-LAST:event_btnReservasActionPerformed

    private void btnEncargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncargosActionPerformed
         pantallaInicial.removeAll();
         
        //Envio el contenedor debido a que Tablapedidos y view Pedidos es un JPanel
        TablaPedidos nuevo= new TablaPedidos();
        // ajustar el tamaño del nuevo contenedor
        nuevo.setSize(pantallaInicial.getSize());
        nuevo.setPreferredSize(pantallaInicial.getPreferredSize());
        // agregar el nuevo contenedor dentro del contenedor principal
        pantallaInicial.add(nuevo);
        // renderizar revalidaded o repade
        revalidate();
        repaint();
    }//GEN-LAST:event_btnEncargosActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        Login ventana= new Login();
        dispose();
    }//GEN-LAST:event_btnSalidaActionPerformed

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
            java.util.logging.Logger.getLogger(PasteleriaChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasteleriaChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasteleriaChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasteleriaChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasteleriaChef().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEncargos;
    private javax.swing.JButton btnReservas;
    private javax.swing.JButton btnSalida;
    private javax.swing.JLabel cajaIcono;
    private javax.swing.JLabel logotipo;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel pantallaInicial;
    // End of variables declaration//GEN-END:variables
}
