
package Ventanas;


public class Apuestas extends javax.swing.JDialog {

    
    public Apuestas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lista_competicion.setVisible(false);
        competicion.setVisible(false);
        fecha.setVisible(false);
        local.setVisible(false);
        visitante.setVisible(false);
        lista_competicion.setVisible(false);
        res_visita.setVisible(false);
        res_local.setVisible(false);
        Confirmar.setVisible(false);
        Monto.setVisible(false);
        label_monto.setVisible(false);
        lista_jugadores.setVisible(false);
        detalle_jugador.setVisible(false);
    }

  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_radio = new javax.swing.ButtonGroup();
        APartidos = new javax.swing.JButton();
        label_apostar = new javax.swing.JLabel();
        ResExacto = new javax.swing.JButton();
        ACampeon = new javax.swing.JButton();
        AGoleador = new javax.swing.JButton();
        lista_competicion = new javax.swing.JComboBox();
        lista_partidos = new javax.swing.JComboBox();
        lista_jugadores = new javax.swing.JComboBox();
        fecha = new javax.swing.JLabel();
        competicion = new javax.swing.JLabel();
        local = new javax.swing.JLabel();
        visitante = new javax.swing.JLabel();
        res_visita = new javax.swing.JTextField();
        res_local = new javax.swing.JTextField();
        op_1 = new javax.swing.JRadioButton();
        op_2 = new javax.swing.JRadioButton();
        Monto = new javax.swing.JTextField();
        label_monto = new javax.swing.JLabel();
        Confirmar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        detalle_jugador = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        Bienvenido = new javax.swing.JMenu();
        user = new javax.swing.JMenu();
        quit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        APartidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        APartidos.setText("Partidos");
        APartidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        APartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APartidosActionPerformed(evt);
            }
        });

        label_apostar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_apostar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_apostar.setText("Apuestas Ibet");

        ResExacto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ResExacto.setText("Res. Exacto");
        ResExacto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ResExacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResExactoActionPerformed(evt);
            }
        });

        ACampeon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ACampeon.setText("Campeon");
        ACampeon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ACampeon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACampeonActionPerformed(evt);
            }
        });

        AGoleador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AGoleador.setText("Goleador");
        AGoleador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AGoleador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGoleadorActionPerformed(evt);
            }
        });

        lista_competicion.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lista_competicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manya vs Hijos", "Uruguay vs Argentina", "Real Madrid vs Atletico Madrid", "Boca bs River" }));

        lista_partidos.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lista_partidos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manya vs Hijos", "Uruguay vs Argentina", "Real Madrid vs Atletico Madrid", "Boca bs River" }));

        lista_jugadores.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lista_jugadores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manya vs Hijos", "Uruguay vs Argentina", "Real Madrid vs Atletico Madrid", "Boca bs River" }));

        fecha.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fecha.setText("ej: 17 - 11 - 2012 14:06");
        fecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        competicion.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        competicion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        competicion.setText("Competicion");
        competicion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        local.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        local.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        local.setText("Equipo Local");
        local.setBorder(new javax.swing.border.MatteBorder(null));

        visitante.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        visitante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        visitante.setText("Equipo Visitante");
        visitante.setBorder(new javax.swing.border.MatteBorder(null));

        res_visita.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        res_visita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        res_visita.setText("0");
        res_visita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        res_local.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        res_local.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        res_local.setText("0");
        res_local.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        op_1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        op_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        op_2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        op_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Monto.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Monto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Monto.setText("0");
        Monto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label_monto.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        label_monto.setText("Monto u$s");
        label_monto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Confirmar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Confirmar.setText("Confirmar");

        detalle_jugador.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        detalle_jugador.setText("Detalles Jugador");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(APartidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ACampeon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AGoleador, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(ResExacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator1)
                    .addComponent(label_apostar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lista_competicion, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                            .addComponent(lista_partidos, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                            .addComponent(lista_jugadores, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                            .addComponent(local, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(res_local, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(op_1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 73, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(label_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(competicion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(visitante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(op_2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(res_visita, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Monto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(detalle_jugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(label_apostar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ResExacto, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(APartidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ACampeon, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AGoleador, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lista_competicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(competicion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lista_partidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lista_jugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detalle_jugador))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(local)
                    .addComponent(visitante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(res_visita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(res_local, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(op_1)
                    .addComponent(op_2))
                .addGap(18, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_monto))
                .addGap(18, 18, 18)
                .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void APartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APartidosActionPerformed
        // TODO add your handling code here:
        label_apostar.setVisible(true);
        label_apostar.setText("Apostar a Partidos");
        lista_competicion.setVisible(true);
        lista_jugadores.setVisible(false);
        lista_competicion.setVisible(true);
        competicion.setVisible(true);
        fecha.setVisible(true);
        local.setVisible(true);
        visitante.setVisible(true);
        lista_competicion.setVisible(false);
        res_visita.setVisible(false);
        res_local.setVisible(false);
        Confirmar.setVisible(true);
         Monto.setVisible(true);
        label_monto.setVisible(true);
        grupo_radio.add(op_1);
        grupo_radio.add(op_2);
        
    }//GEN-LAST:event_APartidosActionPerformed

    private void ResExactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResExactoActionPerformed
        // TODO add your handling code here:
        label_apostar.setVisible(true);
        label_apostar.setText("Apostar a Resultado Exacto");
        lista_competicion.setVisible(true);
        lista_jugadores.setVisible(false);
        lista_competicion.setVisible(true);
        competicion.setVisible(true);
        fecha.setVisible(true);
        local.setVisible(true);
        visitante.setVisible(true);
        lista_competicion.setVisible(false);
        res_visita.setVisible(true);
        res_local.setVisible(true);
        Confirmar.setVisible(true);
         Monto.setVisible(true);
        label_monto.setVisible(true);
    }//GEN-LAST:event_ResExactoActionPerformed

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        // TODO add your handling code here:
        Main m = new Main();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_quitActionPerformed


    private void ACampeonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACampeonActionPerformed
        // TODO add your handling code here:
        label_apostar.setVisible(true);
        label_apostar.setText("Apostar a Campeon");
        lista_jugadores.setVisible(false);
        lista_competicion.setVisible(true);
        competicion.setVisible(true);
        fecha.setVisible(true);
        local.setVisible(true);
        visitante.setVisible(true);
        lista_competicion.setVisible(true);
        res_visita.setVisible(false);
        res_local.setVisible(false);
        Confirmar.setVisible(true);
         Monto.setVisible(true);
        label_monto.setVisible(true);
    }//GEN-LAST:event_ACampeonActionPerformed

    private void AGoleadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGoleadorActionPerformed
        // TODO add your handling code here:
        label_apostar.setVisible(true);
        label_apostar.setText("Apostar a Goleador");
        lista_competicion.setVisible(true);
        lista_jugadores.setVisible(false);
        lista_competicion.setVisible(true);
        competicion.setVisible(true);
        fecha.setVisible(true);
        local.setVisible(true);
        visitante.setVisible(true);
        lista_competicion.setVisible(false);
        res_visita.setVisible(false);
        res_local.setVisible(false);
        Confirmar.setVisible(true);
         Monto.setVisible(true);
        label_monto.setVisible(true);
    }//GEN-LAST:event_AGoleadorActionPerformed

   
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Apuestas dialog = new Apuestas (new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACampeon;
    private javax.swing.JButton AGoleador;
    private javax.swing.JButton APartidos;
    private javax.swing.JMenu Bienvenido;
    private javax.swing.JButton Confirmar;
    private javax.swing.JTextField Monto;
    private javax.swing.JButton ResExacto;
    private javax.swing.JLabel competicion;
    private javax.swing.JButton detalle_jugador;
    private javax.swing.JLabel fecha;
    private javax.swing.ButtonGroup grupo_radio;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_apostar;
    private javax.swing.JLabel label_monto;
    private javax.swing.JComboBox lista_competicion;
    private javax.swing.JComboBox lista_jugadores;
    private javax.swing.JComboBox lista_partidos;
    private javax.swing.JLabel local;
    private javax.swing.JRadioButton op_1;
    private javax.swing.JRadioButton op_2;
    private javax.swing.JMenuItem quit;
    private javax.swing.JTextField res_local;
    private javax.swing.JTextField res_visita;
    private javax.swing.JMenu user;
    private javax.swing.JLabel visitante;
    // End of variables declaration//GEN-END:variables
}


