
package principal;
import utils.*;
public class viewReservas extends javax.swing.JFrame {

    Usuarios usuario;
    public viewReservas(Usuarios usu) {
        usuario=usu;
        initComponents();
        initAlternComponent();
    }

    public void initAlternComponent() {
        setTitle("pasteles reservas");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        cajaIcono = new javax.swing.JLabel();
        pantallaInicial = new javax.swing.JPanel();
        logotipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        menu.setBackground(new java.awt.Color(214, 25, 33));
        menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));

        btnCrear.setBackground(new java.awt.Color(255, 246, 242));
        btnCrear.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(214, 25, 33));
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnVer.setBackground(new java.awt.Color(255, 246, 242));
        btnVer.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btnVer.setForeground(new java.awt.Color(214, 25, 33));
        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 246, 242));
        btnEditar.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(214, 25, 33));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalida.setBackground(new java.awt.Color(255, 246, 242));
        btnSalida.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btnSalida.setForeground(new java.awt.Color(214, 25, 33));
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
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(cajaIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCrear)
                .addGap(18, 18, 18)
                .addComponent(btnVer)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnSalida)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pantallaInicial.setBackground(new java.awt.Color(179, 25, 33));
        pantallaInicial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        logotipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo-principal_pequeño.png"))); // NOI18N

        javax.swing.GroupLayout pantallaInicialLayout = new javax.swing.GroupLayout(pantallaInicial);
        pantallaInicial.setLayout(pantallaInicialLayout);
        pantallaInicialLayout.setHorizontalGroup(
            pantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaInicialLayout.createSequentialGroup()
                .addComponent(logotipo, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                .addContainerGap())
        );
        pantallaInicialLayout.setVerticalGroup(
            pantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaInicialLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
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
            .addComponent(pantallaInicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        pantallaInicial.removeAll();
        // creara una instancia del nuevo contenedor
        PanelCrearReservas nuevo = new PanelCrearReservas();
        // ajustar el tamaño del nuevo contenedor
        nuevo.setSize(pantallaInicial.getSize());
        nuevo.setPreferredSize(pantallaInicial.getPreferredSize());
        // agregar el nuevo contenedor dentro del contenedor principal
        pantallaInicial.add(nuevo);
        // renderizar revalidaded o repade
        revalidate();
        repaint();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        pantallaInicial.removeAll();
        // creara una instancia del nuevo contenedor
        Ver_Reserva nuevo = new Ver_Reserva();
        // ajustar el tamaño del nuevo contenedor
        nuevo.setSize(pantallaInicial.getSize());
        nuevo.setPreferredSize(pantallaInicial.getPreferredSize());
        // agregar el nuevo contenedor dentro del contenedor principal
        pantallaInicial.add(nuevo);
        // renderizar revalidaded o repade
        revalidate();
        repaint();
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         pantallaInicial.removeAll();
     // creara una instancia del nuevo contenedor
        Editar_Reservas nuevo=new Editar_Reservas(usuario);
     // ajustar el tamaño del nuevo contenedor
        nuevo.setSize(pantallaInicial.getSize());
        nuevo.setPreferredSize(pantallaInicial.getPreferredSize());
     // agregar el nuevo contenedor dentro del contenedor principal
        pantallaInicial.add(nuevo);
     // renderizar revalidaded o repade
        revalidate();
        repaint();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        //Volver a la pantalla de Pasteleria y devolvemos el usuario
        Pasteleria volver = new Pasteleria(usuario);
        dispose();
    }//GEN-LAST:event_btnSalidaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnSalida;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel cajaIcono;
    private javax.swing.JLabel logotipo;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel pantallaInicial;
    // End of variables declaration//GEN-END:variables
}
