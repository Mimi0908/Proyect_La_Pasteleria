
package principal;

import com.toedter.calendar.JCalendar;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import utils.*;


public class Editar_Reservas extends javax.swing.JPanel {
    Usuarios usuario;
    BaseDatos bd= new BaseDatos();
  
    public Editar_Reservas(Usuarios usu) {
        usuario=usu;
        initComponents();
        init_Components_mods();
    }
    
    public void init_Components_mods() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        etqNombre = new javax.swing.JLabel();
        etqFechaReserva = new javax.swing.JLabel();
        etqHora = new javax.swing.JLabel();
        imgPasteleria = new javax.swing.JLabel();
        campoPin = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        etqNotas = new javax.swing.JLabel();
        etqZona = new javax.swing.JLabel();
        boxHora = new javax.swing.JTextField();
        boxNota = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        cajaFechaI = new com.toedter.calendar.JDateChooser();
        btnCancelar = new javax.swing.JButton();
        textZona = new javax.swing.JLabel();
        textNombre = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(179, 25, 33));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INGRESAR PIN DE RESERVA:");

        etqNombre.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        etqNombre.setForeground(new java.awt.Color(255, 255, 255));
        etqNombre.setText("NOMBRE:");

        etqFechaReserva.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        etqFechaReserva.setForeground(new java.awt.Color(255, 255, 255));
        etqFechaReserva.setText("FECHA DE RESERVA:");

        etqHora.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        etqHora.setForeground(new java.awt.Color(255, 255, 255));
        etqHora.setText("HORA:");

        imgPasteleria.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        imgPasteleria.setForeground(new java.awt.Color(255, 255, 255));
        imgPasteleria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPasteleria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logotipo_pequeño.png"))); // NOI18N

        campoPin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etqNotas.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        etqNotas.setForeground(new java.awt.Color(255, 255, 255));
        etqNotas.setText("NOTA* (opcional):");

        etqZona.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        etqZona.setForeground(new java.awt.Color(255, 255, 255));
        etqZona.setText("ZONA:");

        boxHora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        boxNota.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnBuscar.setBackground(new java.awt.Color(179, 25, 33));
        btnBuscar.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(179, 25, 33));
        btnGuardar.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(179, 25, 33));
        btnCancelar.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        textZona.setForeground(new java.awt.Color(255, 255, 255));
        textZona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textZona.setText("------------------------");
        textZona.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        textNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textNombre.setForeground(new java.awt.Color(255, 255, 255));
        textNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textNombre.setText("---------------------");
        textNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgPasteleria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoPin, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etqFechaReserva)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(etqZona)
                                        .addComponent(etqHora))
                                    .addComponent(etqNombre)
                                    .addComponent(etqNotas))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cajaFechaI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boxHora)
                                    .addComponent(boxNota, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textZona, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addGap(49, 49, 49)
                                .addComponent(btnGuardar)
                                .addGap(50, 50, 50)))
                        .addGap(69, 69, 69)))
                .addGap(115, 115, 115))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgPasteleria, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(campoPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNombre)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etqFechaReserva)
                    .addComponent(cajaFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqZona)
                    .addComponent(textZona, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqNotas))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int pin_reserva = Integer.parseInt(campoPin.getText());
        String diaI = Integer.toString(cajaFechaI.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mesI = Integer.toString(cajaFechaI.getCalendar().get(Calendar.MONTH) + 1);
        String yearI = Integer.toString(cajaFechaI.getCalendar().get(Calendar.YEAR));
        String fechaI = (yearI + "-" + mesI+ "-" + diaI);
        String hora = boxHora.getText();
        String notas = boxNota.getText();

        //Editamos en la base de datos
        BaseDatos guardar = new BaseDatos();
        guardar.editarDatosReserva(pin_reserva,fechaI,hora, notas);

        //una vez agregado, hacemos limpieza
        textNombre.setText("");
        campoPin.setText("");
        cajaFechaI.setDate(null);
        boxHora.setText("");
        textZona.setText("");
        boxNota.setText("");
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //Buscar
        int pin_reserva = Integer.parseInt(campoPin.getText());
        BaseDatos buscar = new BaseDatos(); 
        //NECESITO EL CODIGO DEL JCALENDER
        Reserva datos= buscar.buscarDatosReserva(pin_reserva);
        textNombre.setText(datos.getNombre());
        
        try{
            var fechatest = datos.getFecha();
            Date fecha = new SimpleDateFormat("yyyy-MM-dd").parse(fechatest);
            cajaFechaI.setDate(fecha);
        }catch(Exception e){
            System.out.print("error: " + e);
        }
        
        //cajaFechaI.setDate(datos.getFecha());
        boxHora.setText(datos.getHora());
        textZona.setText(datos.getNombreZona());
        boxNota.setText(datos.getDescripcion());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        campoPin.setText("");
        textNombre.setText("");
        cajaFechaI.setDate(null);
        boxHora.setText("");
        textZona.setText("");
        boxNota.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxHora;
    private javax.swing.JTextField boxNota;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private com.toedter.calendar.JDateChooser cajaFechaI;
    private javax.swing.JTextField campoPin;
    private javax.swing.JLabel etqFechaReserva;
    private javax.swing.JLabel etqHora;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqNotas;
    private javax.swing.JLabel etqZona;
    private javax.swing.JLabel imgPasteleria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel textNombre;
    private javax.swing.JLabel textZona;
    // End of variables declaration//GEN-END:variables
}
