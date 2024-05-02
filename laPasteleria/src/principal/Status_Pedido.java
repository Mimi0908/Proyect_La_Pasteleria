/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal;
import java.awt.Toolkit;
import javax.swing.*;
import utils.*;

public class Status_Pedido extends javax.swing.JFrame {
    BaseDatos bd= new BaseDatos();
    int pedido;
    public Status_Pedido(int idPedido) {
        pedido=idPedido;
        initComponents();
        initAlternComponents();
    }

    public void initAlternComponents(){
        setTitle("Estado Pedido");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono.png")));
        ponerDatos();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        etqOrden = new javax.swing.JLabel();
        etqNombre = new javax.swing.JLabel();
        etqFechaEntrega = new javax.swing.JLabel();
        etqEstadoPedido = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();
        btnMaking = new javax.swing.JButton();
        imgPasteleria = new javax.swing.JLabel();
        textOrder = new javax.swing.JLabel();
        textName = new javax.swing.JLabel();
        textDate = new javax.swing.JLabel();
        textStatusOrder = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(179, 25, 33));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ESTADO DEL PEDIDO");

        etqOrden.setBackground(new java.awt.Color(255, 255, 255));
        etqOrden.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        etqOrden.setForeground(new java.awt.Color(255, 255, 255));
        etqOrden.setText("ORDEN:");

        etqNombre.setBackground(new java.awt.Color(255, 255, 255));
        etqNombre.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        etqNombre.setForeground(new java.awt.Color(255, 255, 255));
        etqNombre.setText("NOMBRE:");

        etqFechaEntrega.setBackground(new java.awt.Color(255, 255, 255));
        etqFechaEntrega.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        etqFechaEntrega.setForeground(new java.awt.Color(255, 255, 255));
        etqFechaEntrega.setText("FECHA DE ENTREGA:");

        etqEstadoPedido.setBackground(new java.awt.Color(255, 255, 255));
        etqEstadoPedido.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        etqEstadoPedido.setForeground(new java.awt.Color(255, 255, 255));
        etqEstadoPedido.setText("ESTADO DEL PEDIDO:");

        btnStart.setBackground(new java.awt.Color(179, 25, 33));
        btnStart.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        btnStart.setForeground(new java.awt.Color(255, 255, 255));
        btnStart.setText("SIN EMPEZAR");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnFinish.setBackground(new java.awt.Color(179, 25, 33));
        btnFinish.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        btnFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnFinish.setText("TERMINADO");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        btnMaking.setBackground(new java.awt.Color(179, 25, 33));
        btnMaking.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        btnMaking.setForeground(new java.awt.Color(255, 255, 255));
        btnMaking.setText("HACIENDO");
        btnMaking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakingActionPerformed(evt);
            }
        });

        imgPasteleria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPasteleria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logotipo_pequeño.png"))); // NOI18N

        textOrder.setBackground(new java.awt.Color(255, 255, 255));
        textOrder.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        textOrder.setForeground(new java.awt.Color(255, 255, 255));
        textOrder.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textOrder.setText("---------------------------");
        textOrder.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        textOrder.setAutoscrolls(true);
        textOrder.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        textOrder.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

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
            .addComponent(imgPasteleria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnMaking)
                .addGap(18, 18, 18)
                .addComponent(btnFinish)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(etqOrden)
                                    .addGap(145, 145, 145))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(etqEstadoPedido)
                                    .addGap(18, 18, 18)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etqFechaEntrega)
                                    .addComponent(etqNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textStatusOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textName))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(imgPasteleria, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etqOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textOrder))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNombre)
                    .addComponent(textName))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqFechaEntrega)
                    .addComponent(textDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqEstadoPedido)
                    .addComponent(textStatusOrder))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart)
                    .addComponent(btnMaking)
                    .addComponent(btnFinish)
                    .addComponent(btnVolver))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnMakingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakingActionPerformed
        bd.editarEstadoEncargo(pedido, "Haciendo");
        ponerDatos();
    }//GEN-LAST:event_btnMakingActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        bd.editarEstadoEncargo(pedido, "Terminado");
        ponerDatos();
    }//GEN-LAST:event_btnFinishActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        bd.editarEstadoEncargo(pedido, "En espera");
        ponerDatos();
    }//GEN-LAST:event_btnStartActionPerformed
    
    private void ponerDatos(){
        Encargo datos = bd.buscarDatosEncargo(pedido);
        textOrder.setText("<html>" + datos.getAnexos() + "</html>");
        textOrder.setVerticalAlignment(SwingConstants.TOP); 
        textOrder.setHorizontalAlignment(SwingConstants.LEFT); 
        textOrder.setSize(textOrder.getPreferredSize()); 
        
        textName.setText(datos.getNombre());
        textDate.setText(datos.getFechaEntrega());
        textStatusOrder.setText(datos.getEstado());
    }
    
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnMaking;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel etqEstadoPedido;
    private javax.swing.JLabel etqFechaEntrega;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqOrden;
    private javax.swing.JLabel imgPasteleria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel textDate;
    private javax.swing.JLabel textName;
    private javax.swing.JLabel textOrder;
    private javax.swing.JLabel textStatusOrder;
    // End of variables declaration//GEN-END:variables
}
