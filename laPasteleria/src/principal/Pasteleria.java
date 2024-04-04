
package principal;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;


public class Pasteleria extends javax.swing.JFrame {

    public Pasteleria() {
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
        btnFacturas = new javax.swing.JButton();
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

        btnEncargos.setBackground(new java.awt.Color(214, 25, 33));
        btnEncargos.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btnEncargos.setForeground(new java.awt.Color(255, 255, 255));
        btnEncargos.setText("Encargos");

        btnFacturas.setBackground(new java.awt.Color(214, 25, 33));
        btnFacturas.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btnFacturas.setForeground(new java.awt.Color(255, 255, 255));
        btnFacturas.setText("Facturas");

        btnSalida.setBackground(new java.awt.Color(214, 25, 33));
        btnSalida.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btnSalida.setForeground(new java.awt.Color(255, 255, 255));
        btnSalida.setText("Salir");
        btnSalida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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
                    .addComponent(btnFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEncargos, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(cajaIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReservas)
                .addGap(18, 18, 18)
                .addComponent(btnEncargos)
                .addGap(18, 18, 18)
                .addComponent(btnFacturas)
                .addGap(18, 18, 18)
                .addComponent(btnSalida)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pantallaInicial.setBackground(new java.awt.Color(179, 25, 33));
        pantallaInicial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout pantallaInicialLayout = new javax.swing.GroupLayout(pantallaInicial);
        pantallaInicial.setLayout(pantallaInicialLayout);
        pantallaInicialLayout.setHorizontalGroup(
            pantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logotipo, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addGap(14, 14, 14))
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
            .addComponent(pantallaInicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pasteleria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEncargos;
    private javax.swing.JButton btnFacturas;
    private javax.swing.JButton btnReservas;
    private javax.swing.JButton btnSalida;
    private javax.swing.JLabel cajaIcono;
    private javax.swing.JLabel logotipo;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel pantallaInicial;
    // End of variables declaration//GEN-END:variables
}
