/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package principal;

import java.sql.*;
import java.sql.ResultSet;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;
import utils.*;



public class Ver_Pedidos extends javax.swing.JPanel {
       private BaseDatos database = new BaseDatos();
    private DefaultTableModel modelo;
   
   
    public Ver_Pedidos() {
        initComponents();

        initAlternComponents();

        this.modelo = (DefaultTableModel) jTable1.getModel();
        
        cargarDatosEncargo();
    }
    
    public void initAlternComponents() {
  
        
         modelo = (DefaultTableModel) jTable1.getModel();
            

        jTable1.setRowHeight(40);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(230);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(230);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(230);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(260);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(160);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(160);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(260);
        jTable1.getColumnModel().getColumn(8).setPreferredWidth(210);
        jTable1.getColumnModel().getColumn(9).setPreferredWidth(240);

           

    }
    
   private void cargarDatosEncargo() {
        database.imprimirDatosEncargo(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        logotipo3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(179, 25, 33));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PIN", "Nombre Usuario", "Fecha Pedido", "Fecha Entrega", "Descripcion ", "Total", "Abono", "Saldo Pendiente", "Estado Pedido", "Encargado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        logotipo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logotipo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logotipo_pequeño.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(logotipo3, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()

                .addGap(23, 23, 23)
                .addComponent(logotipo3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logotipo3;
    // End of variables declaration//GEN-END:variables
}
