
package Ventanas;

import Ventanas.*;

public class Principal extends javax.swing.JDialog {
    public Principal(java.awt.Frame parent, boolean modal, String name) {
        super(parent, modal);
        initComponents();
        volver.setVisible(false);
        visa.setVisible(false);
        master.setVisible(false);
        paypal.setVisible(false);
        confirmar.setVisible(false);
        saldo.setVisible(false);
        texto.setVisible(false);
        String username = name;
        user.setText(username);
   } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        panel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        penca = new javax.swing.JToggleButton();
        apuesta = new javax.swing.JToggleButton();
        usuario = new javax.swing.JToggleButton();
        label_penca = new javax.swing.JLabel();
        label_apuesta = new javax.swing.JLabel();
        label_usuario = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        paypal = new javax.swing.JLabel();
        master = new javax.swing.JLabel();
        visa = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();
        saldo = new javax.swing.JTextField();
        confirmar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        Bienvenido = new javax.swing.JMenu();
        user = new javax.swing.JMenu();
        quit = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(320, 480));
        setResizable(false);

        panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panel.png"))); // NOI18N

        jPanel1.setPreferredSize(new java.awt.Dimension(320, 239));

        penca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pencas.png"))); // NOI18N
        penca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        penca.setMaximumSize(new java.awt.Dimension(36, 49));
        penca.setMinimumSize(new java.awt.Dimension(36, 49));
        penca.setPreferredSize(new java.awt.Dimension(36, 49));
        penca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencaActionPerformed(evt);
            }
        });

        apuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/apuestas.png"))); // NOI18N
        apuesta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        apuesta.setMaximumSize(new java.awt.Dimension(36, 49));
        apuesta.setMinimumSize(new java.awt.Dimension(36, 49));
        apuesta.setPreferredSize(new java.awt.Dimension(36, 49));
        apuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apuestaActionPerformed(evt);
            }
        });

        usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        usuario.setMaximumSize(new java.awt.Dimension(36, 49));
        usuario.setMinimumSize(new java.awt.Dimension(36, 49));
        usuario.setPreferredSize(new java.awt.Dimension(36, 49));
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        label_penca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_penca.setText("Pencas");

        label_apuesta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_apuesta.setText("Apuestas");

        label_usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_usuario.setText("Usuario");

        volver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        paypal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pay.png"))); // NOI18N

        master.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/visa.png"))); // NOI18N

        visa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/master.png"))); // NOI18N

        texto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        texto.setText("Ingresar Saldo en Monedero u$s");

        confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/money.png"))); // NOI18N
        confirmar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(volver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(penca, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_penca, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(apuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_apuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(texto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(visa, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(master, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(paypal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(46, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(volver)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(label_usuario))
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(label_apuesta)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(penca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(label_penca)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(texto)
                    .addGap(23, 23, 23)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(paypal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(master, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(visa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(38, 38, 38)))
        );

        penca.getAccessibleContext().setAccessibleParent(this);
        apuesta.getAccessibleContext().setAccessibleParent(this);
        usuario.getAccessibleContext().setAccessibleParent(this);
        label_penca.getAccessibleContext().setAccessibleParent(this);
        label_apuesta.getAccessibleContext().setAccessibleParent(this);
        label_usuario.getAccessibleContext().setAccessibleParent(this);

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenu2.setText("                         ");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("                         ");
        jMenuBar1.add(jMenu3);

        Bienvenido.setText("Bienvenido:");
        Bienvenido.setEnabled(false);
        Bienvenido.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Bienvenido.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jMenuBar1.add(Bienvenido);

        user.setForeground(new java.awt.Color(0, 0, 204));
        user.setText("Nombre");
        user.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        quit.setText("Salir");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });
        user.add(quit);

        jMenuBar1.add(user);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        // TODO add your handling code here:
        Main m = new Main();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_quitActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
        usuario.setVisible(false);
        label_usuario.setVisible(false);
        apuesta.setVisible(false);
        label_apuesta.setVisible(false);
        penca.setVisible(false);
        label_penca.setVisible(false);
        volver.setVisible(true);
        visa.setVisible(true);
        master.setVisible(true);
        paypal.setVisible(true);
        confirmar.setVisible(true);
        saldo.setVisible(true);
        texto.setVisible(true);
    }//GEN-LAST:event_usuarioActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        usuario.setVisible(true);
        label_usuario.setVisible(true);
        apuesta.setVisible(true);
        label_apuesta.setVisible(true);
        penca.setVisible(true);
        label_penca.setVisible(true);
        volver.setVisible(false);
        visa.setVisible(false);
        master.setVisible(false);
        paypal.setVisible(false);
        confirmar.setVisible(false);
        saldo.setVisible(false);
        panel.setVisible(true);
        texto.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed

    private void apuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apuestaActionPerformed
        // TODO add your handling code here:
        usuario.setVisible(false);
        label_usuario.setVisible(false);
        apuesta.setVisible(false);
        label_apuesta.setVisible(false);
        penca.setVisible(false);
        label_penca.setVisible(false);
        volver.setVisible(true);
        panel.setVisible(false);
       /* label_apostar.setVisible(true);
        APartidos.setVisible(true);
        a   _partidos.setVisible(true);
        ResExacto.setVisible(true);
        label_resultado.setVisible(true);
        ACampeon.setVisible(true);
        a_campeon.setVisible(true);
        AGoleador.setVisible(true);
        a_goleador.setVisible(true);
        linea.setVisible(true);
        cambia.setVisible(false);
        lista_partidos.setVisible(false);
        competicion.setVisible(false);
        fecha.setVisible(false);
        local.setVisible(false);
        visitante.setVisible(false);
        vs.setVisible(false);
                */
    }//GEN-LAST:event_apuestaActionPerformed

    private void pencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencaActionPerformed
        // TODO add your handling code here:
        usuario.setVisible(false);
        label_usuario.setVisible(false);
        apuesta.setVisible(false);
        label_apuesta.setVisible(false);
        penca.setVisible(false);
        label_penca.setVisible(false);
        volver.setVisible(true);
    }//GEN-LAST:event_pencaActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Bienvenido;
    private javax.swing.JToggleButton apuesta;
    private javax.swing.JButton confirmar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JLabel label_apuesta;
    private javax.swing.JLabel label_penca;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JLabel master;
    private javax.swing.JLabel panel;
    private javax.swing.JLabel paypal;
    private javax.swing.JToggleButton penca;
    private javax.swing.JMenuItem quit;
    private javax.swing.JTextField saldo;
    private javax.swing.JLabel texto;
    private javax.swing.JMenu user;
    private javax.swing.JToggleButton usuario;
    private javax.swing.JLabel visa;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
