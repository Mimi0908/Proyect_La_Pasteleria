package principal;

import java.awt.Image;
import java.util.Calendar;
import java.awt.Toolkit;
import utils.*;
import javax.swing.ImageIcon;


public class PanelCrearReservas extends javax.swing.JPanel {


    

    public PanelCrearReservas() {
      
        usuario=usu;
        initComponents();

        initAlternComponents();

    }
    
    public void initAlternComponents() {
        

        

        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logotipo3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        etqNombre = new javax.swing.JLabel();
        cajaCliente = new javax.swing.JTextField();
        etqFechaR = new javax.swing.JLabel();
        etqHora = new javax.swing.JLabel();
        cajaHora = new javax.swing.JTextField();
        etqMesa = new javax.swing.JLabel();
        cajaMesa = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        etqNotas = new javax.swing.JLabel();
        cajaAnexos1 = new javax.swing.JTextField();
        etqDocumento = new javax.swing.JLabel();
        cajaDocumento = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        etqApellidos = new javax.swing.JLabel();
        cajaApellido = new javax.swing.JTextField();
        cajaTelefono = new javax.swing.JTextField();
        etqCorreo = new javax.swing.JLabel();
        cajaCorreo = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jPanel1.setBackground(new java.awt.Color(179, 25, 33));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        logotipo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logotipo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logotipo_pequeño.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear Reserva");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        etqNombre.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        etqNombre.setForeground(new java.awt.Color(255, 255, 255));
        etqNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etqNombre.setText("Nombre: ");

        etqFechaR.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        etqFechaR.setForeground(new java.awt.Color(255, 255, 255));
        etqFechaR.setText("Fecha R.");

        etqHora.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        etqHora.setForeground(new java.awt.Color(255, 255, 255));
        etqHora.setText("Hora: ");


        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Mesa:");


        btnCrear.setBackground(new java.awt.Color(179, 25, 33));
        btnCrear.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });


        cajaNotas.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        cajaNotas.setForeground(new java.awt.Color(255, 255, 255));
        cajaNotas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cajaNotas.setText("Nota: ");


        etqDocumento.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        etqDocumento.setForeground(new java.awt.Color(255, 255, 255));
        etqDocumento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etqDocumento.setText("Documento:");

        etqTelefono.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        etqTelefono.setForeground(new java.awt.Color(255, 255, 255));
        etqTelefono.setText("Tel:");


        jLabel9.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Apellido:");


        etqCorreo.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        etqCorreo.setForeground(new java.awt.Color(255, 255, 255));
        etqCorreo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etqCorreo.setText("Email:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addComponent(logotipo3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)

                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(473, 473, 473)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cajaHora)
                                .addComponent(cajaTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cajaAnexos1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addComponent(jLabel6)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cajaDocumento)
                                .addComponent(cajaMesa)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cajaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()


                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cajaNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 196, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))

        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()

                .addComponent(logotipo3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(cajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cajaDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cajaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaNotas)
                            .addComponent(cajaAnexos1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cajaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCrear)
                        .addGap(43, 43, 43))))

        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        /*// Crear Reserva 
        String cliente = cajaCliente.getText();
        String documento = cajaDocumento.getText();
        String fecha = ""; //buscar codigo de la fecha
        String mesa = cajaMesa.getText();
        String Correo = cajaCorreo.getText();
        String apellido = cajaApellido.getText();
        String telefono = cajaTelefono.getText();
        String hora = cajaHora.getText();
        String nota = cajaAnexos1.getText();*/
        
    }//GEN-LAST:event_btnCrearActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JTextField cajaAnexos1;
    private javax.swing.JTextField cajaApellido;
    private javax.swing.JTextField cajaCliente;
    private javax.swing.JTextField cajaCorreo;
    private javax.swing.JTextField cajaDocumento;
    private javax.swing.JTextField cajaHora;
    private javax.swing.JTextField cajaMesa;
    private javax.swing.JTextField cajaTelefono;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqCorreo;
    private javax.swing.JLabel etqDocumento;
    private javax.swing.JLabel etqFechaR;
    private javax.swing.JLabel etqHora;
    private javax.swing.JLabel etqMesa;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqNotas;
    private javax.swing.JLabel etqTelefono;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logotipo3;
    // End of variables declaration//GEN-END:variables

         
    

    
