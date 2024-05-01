package principal;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;
import utils.BaseDatos;
import utils.ButtonRenderer;


public class TablaReservas extends javax.swing.JPanel {
    //btn global para evitar que todos los botones tengan el mismo evento
    JButton btn = new JButton();
    //instancia de la tabla
    private DefaultTableModel modelo;  
    //instancia Datos
    private BaseDatos database = new BaseDatos();
    
    
    public TablaReservas() {
        initComponents();
        initAlternComponents();
    }
    public void initAlternComponents() {
        
        initColumnBotons();
        
        
        btn.setBackground(Color.RED);
        Toolkit toolkit = btn.getToolkit();
        Image icono_editar = toolkit.createImage(ClassLoader.getSystemResource("imagenes/icono.png"));
        icono_editar = icono_editar.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        btn.setIcon(new ImageIcon(icono_editar));
        
        //extraer la tabla
        modelo = (DefaultTableModel) jTable1.getModel();
        
           
        
        //imprimir la info que hay en la base de datos
        database.imprimirDatosReservasChef(modelo, btn);
    }
    
    public void initColumnBotons(){
        // Agregar boton y renderizarlo
        jTable1.getColumnModel().getColumn(10).setCellEditor(new utils.ButtonEditor(new JCheckBox()));
        jTable1.getColumnModel().getColumn(10).setCellRenderer(new ButtonRenderer());
        
        //modificar tamaño de la celda "estado"
        jTable1.setRowHeight(30);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(220);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(160);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(160);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(160);
        jTable1.getColumnModel().getColumn(8).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(9).setPreferredWidth(250);
        jTable1.getColumnModel().getColumn(10).setPreferredWidth(170);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(179, 25, 33));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logotipo_pequeño.png"))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PIN", "NOMBRE", "FECHA", "ZONA", "HORA", "ANEXOS", "PRECIO", "ABONO", "PENDIENTE", "ENCARGADO", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
