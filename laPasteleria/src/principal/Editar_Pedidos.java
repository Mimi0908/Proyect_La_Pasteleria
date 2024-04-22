
package principal;

import java.awt.Image;
import java.util.Calendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import utils.*;

public class Editar_Pedidos extends javax.swing.JPanel {
    Usuarios usuario;
    BaseDatos bd= new BaseDatos();
    public Editar_Pedidos(Usuarios usu) {
        usuario=usu;
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

        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        campoPin = new javax.swing.JTextField();
        etqNombre = new javax.swing.JLabel();
        etqFechaPedido = new javax.swing.JLabel();
        etqDescripcion = new javax.swing.JLabel();
        campoDescripcion = new javax.swing.JTextField();
        etqFechaEntrega = new javax.swing.JLabel();
        etqNota = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        textFechaP = new com.toedter.calendar.JDateChooser();
        imgPasteleria = new javax.swing.JLabel();
        textNombre = new javax.swing.JLabel();
        textFechaPedido = new javax.swing.JLabel();
        textEstado = new javax.swing.JLabel();

        setBackground(new java.awt.Color(179, 25, 33));
        setForeground(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INGRESE PIN DE PEDIDO:");

        etqNombre.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        etqNombre.setForeground(new java.awt.Color(255, 255, 255));
        etqNombre.setText("NOMBRE:");

        etqFechaPedido.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        etqFechaPedido.setForeground(new java.awt.Color(255, 255, 255));
        etqFechaPedido.setText("FECHA DE PEDIDO:");

        etqDescripcion.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        etqDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        etqDescripcion.setText("DESCRIPCION:");

        etqFechaEntrega.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        etqFechaEntrega.setForeground(new java.awt.Color(255, 255, 255));
        etqFechaEntrega.setText("FECHA DE ENTREGA:");

        etqNota.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        etqNota.setForeground(new java.awt.Color(255, 255, 255));
        etqNota.setText("ESTADO:");

        btnBuscar.setBackground(new java.awt.Color(179, 25, 33));
        btnBuscar.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(179, 25, 33));
        btnCancelar.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(179, 25, 33));
        btnGuardar.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");

        imgPasteleria.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        imgPasteleria.setForeground(new java.awt.Color(255, 255, 255));

        textNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textNombre.setForeground(new java.awt.Color(255, 255, 255));
        textNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textNombre.setText("---------------------");
        textNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        textFechaPedido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textFechaPedido.setForeground(new java.awt.Color(255, 255, 255));
        textFechaPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textFechaPedido.setText("---------------------");
        textFechaPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        textEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textEstado.setForeground(new java.awt.Color(255, 255, 255));
        textEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textEstado.setText("---------------------");
        textEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(imgPasteleria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoPin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etqDescripcion)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etqFechaEntrega)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFechaP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(etqFechaPedido)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFechaPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoDescripcion)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etqNombre)
                                .addGap(92, 92, 92)
                                .addComponent(textNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etqNota)
                                .addGap(98, 98, 98)
                                .addComponent(textEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(99, 99, 99))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imgPasteleria, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnBuscar))
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNombre)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqFechaPedido)
                    .addComponent(textFechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(etqDescripcion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(etqFechaEntrega)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFechaP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqNota))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addGap(0, 46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
     private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int pin_encargo = Integer.parseInt(campoPin.getText());
        String diaI = Integer.toString(textFechaP.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mesI = Integer.toString(textFechaP.getCalendar().get(Calendar.MONTH) + 1);
        String yearI = Integer.toString(textFechaP.getCalendar().get(Calendar.YEAR));
        String fechaI = (yearI + "-" + mesI+ "-" + diaI);
        String nota = campoDescripcion.getText();

        //Editamos en la base de datos
        BaseDatos guardar = new BaseDatos();
        guardar.editarDatosEncargo(pin_encargo,fechaI,nota);

        //una vez agregado, hacemos limpieza
        textNombre.setText("");
        /*fecha.setText("");*/
        textFechaPedido.setText("");
        campoDescripcion.setText("");
        textEstado.setText("");
        
    }                                          
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int pin_reserva = Integer.parseInt(campoPin.getText());
        BaseDatos buscar = new BaseDatos(); 
        //NECESITO EL CODIGO DEL JCALENDER
        Encargo datos= buscar.buscarDatosEncargo(pin_reserva);
        textNombre.setText(datos.getNombre());
        textFechaPedido.setText(datos.getFechaEntrega());
        campoDescripcion.setText(datos.getAnexos());
        textEstado.setText(datos.getEstado());
        /*fecha.setText("");*/
        campoPin.setText("");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        textNombre.setText("");
        /*fecha.setText("");*/
        textFechaPedido.setText("");
        campoDescripcion.setText("");
        textEstado.setText("");
         campoPin.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField campoDescripcion;
    private javax.swing.JTextField campoPin;
    private javax.swing.JLabel etqDescripcion;
    private javax.swing.JLabel etqFechaEntrega;
    private javax.swing.JLabel etqFechaPedido;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqNota;
    private javax.swing.JLabel imgPasteleria;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel textEstado;
    private com.toedter.calendar.JDateChooser textFechaP;
    private javax.swing.JLabel textFechaPedido;
    private javax.swing.JLabel textNombre;
    // End of variables declaration//GEN-END:variables
}
