
package principal;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;
import utils.BaseDatos;
import utils.ButtonRenderer;

 

public class TablaPedidos extends javax.swing.JPanel {
   
    //instancia de la tabla
    private DefaultTableModel modelo;  
    //instancia Datos
    private BaseDatos database = new BaseDatos();

    public TablaPedidos() {
        initComponents();
        initAlternComponents();
    }
    public void initAlternComponents() {
        //tomamos el contenedor del JFrame pasteleria chef, para organizarlo en el archivo BaseDatos
        
        initColumnBotons();
        JButton btn = new JButton();
        
        
        //extraer la tabla
        modelo = (DefaultTableModel) jTable1.getModel();
        
 
        //imprimir la info que hay en la base de datos
        database.imprimirDatosEncargoChef(modelo);
    }
    
    //función para hacer el código mas legible
    public void initColumnBotons(){
        // Agregar boton y renderizarlo
        jTable1.getColumnModel().getColumn(4).setCellEditor(new utils.ButtonEditor(new JCheckBox()));
        jTable1.getColumnModel().getColumn(4).setCellRenderer(new ButtonRenderer());
        
        //modificar tamaño de la celda "estado"
        jTable1.setRowHeight(30);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(1);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(1);
        
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(1);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(10);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(179, 25, 33));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logotipo_pequeño.png"))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PIN", "NOMBRE", "ORDEN", "FECHA ENTREGA", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
