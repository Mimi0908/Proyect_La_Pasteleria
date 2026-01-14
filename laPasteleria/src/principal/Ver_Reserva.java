
package principal;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import java.sql.ResultSet;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.BaseDatos;
import utils.ButtonRenderer;

public class Ver_Reserva extends javax.swing.JPanel {
    //modificaciones que hare: eliminare el parametro para crear directamente la instancia de "BaseDatos"
    private BaseDatos database = new BaseDatos();
    private DefaultTableModel modelo;
  
    public Ver_Reserva() {
        //parametro = BaseDatos database
        initComponents();
        initAlternComponents();
        init_Components_mods();
        
        /* en caso de error, eliminare los comentarios
         this.database = database;*/
        cargarDatosReservas();
    }
    
    public void init_Components_mods() {    
        modelo = (DefaultTableModel) tablaReserva.getModel();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReserva = new javax.swing.JTable();
        logo = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(179, 25, 33));

        tablaReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PIN", "Nombre Usuario", "Fecha ", "Zona ", "Hora ", "Descripcion", "Precio", "Abono", "Saldo Pendiente", "Encargado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaReserva);

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logotipo_pequeño.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void cargarDatosReservas() {
        database.imprimirDatosReservas(modelo);
    }

    public void initAlternComponents() {
  
        
         modelo = (DefaultTableModel) tablaReserva.getModel();
            
        tablaReserva.setRowHeight(40);   
        tablaReserva.getColumnModel().getColumn(0).setPreferredWidth(120);
        tablaReserva.getColumnModel().getColumn(1).setPreferredWidth(230);
        tablaReserva.getColumnModel().getColumn(2).setPreferredWidth(230);
        tablaReserva.getColumnModel().getColumn(3).setPreferredWidth(200);
        tablaReserva.getColumnModel().getColumn(4).setPreferredWidth(230);
        tablaReserva.getColumnModel().getColumn(5).setPreferredWidth(260);
        tablaReserva.getColumnModel().getColumn(6).setPreferredWidth(160);
        tablaReserva.getColumnModel().getColumn(7).setPreferredWidth(160);
        tablaReserva.getColumnModel().getColumn(8).setPreferredWidth(230);
        tablaReserva.getColumnModel().getColumn(9).setPreferredWidth(240);
 
           

    }
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JTable tablaReserva;
    // End of variables declaration//GEN-END:variables
}
