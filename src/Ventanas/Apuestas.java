
package Ventanas;


public class Apuestas extends javax.swing.JDialog {

    
    public Apuestas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        linea.setVisible(false);
        lista_partidos.setVisible(false);
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
        
    }

  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        Bienvenido = new javax.swing.JMenu();
        user = new javax.swing.JMenu();
        quit = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        Bienvenido1 = new javax.swing.JMenu();
        user1 = new javax.swing.JMenu();
        quit1 = new javax.swing.JMenuItem();
        imagen = new javax.swing.JPanel();
        linea = new javax.swing.JSeparator();
        ResExacto = new javax.swing.JButton();
        ACampeon = new javax.swing.JButton();
        label_apostar = new javax.swing.JLabel();
        a_partidos = new javax.swing.JLabel();
        a_campeon = new javax.swing.JLabel();
        a_goleador = new javax.swing.JLabel();
        AGoleador = new javax.swing.JButton();
        APartidos = new javax.swing.JButton();
        label_resultado = new javax.swing.JLabel();
        cambia = new javax.swing.JLabel();
        Monto = new javax.swing.JTextField();
        Confirmar = new javax.swing.JButton();
        lista_partidos = new javax.swing.JComboBox();
        lista_competicion = new javax.swing.JComboBox();
        competicion = new javax.swing.JLabel();
        res_local = new javax.swing.JTextField();
        res_visita = new javax.swing.JTextField();
        visitante = new javax.swing.JLabel();
        local = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        label_monto = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        Bienvenido2 = new javax.swing.JMenu();
        user2 = new javax.swing.JMenu();
        quit2 = new javax.swing.JMenuItem();

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

        jMenuBar2.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenu4.setText("                         ");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("                         ");
        jMenuBar2.add(jMenu5);

        Bienvenido1.setText("Bienvenido:");
        Bienvenido1.setEnabled(false);
        Bienvenido1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Bienvenido1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jMenuBar2.add(Bienvenido1);

        user1.setForeground(new java.awt.Color(0, 0, 204));
        user1.setText("Nombre");
        user1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        quit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        quit1.setText("Salir");
        quit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit1ActionPerformed(evt);
            }
        });
        user1.add(quit1);

        jMenuBar2.add(user1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ResExacto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ResExacto.setText("Ex!");
        ResExacto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ResExacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResExactoActionPerformed(evt);
            }
        });

        ACampeon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ACampeon.setText("C!");
        ACampeon.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ACampeon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACampeonActionPerformed(evt);
            }
        });

        label_apostar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_apostar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_apostar.setText("Apuestas Ibet");

        a_partidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        a_partidos.setText("Partidos");

        a_campeon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        a_campeon.setText("Campeon");

        a_goleador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        a_goleador.setText("Goleador");

        AGoleador.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AGoleador.setText("G!");
        AGoleador.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        APartidos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        APartidos.setText("P!");
        APartidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        APartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APartidosActionPerformed(evt);
            }
        });

        label_resultado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_resultado.setText("Res. Exacto");

        cambia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cambia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Monto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Monto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Monto.setText("0");

        Confirmar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Confirmar.setText("Ingresar");
        Confirmar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lista_partidos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lista_partidos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manya vs Hijos", "Real Madrid vs Barcelona", "Boca vs River", "Santos vs Sao Paulo" }));

        lista_competicion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lista_competicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UEFA", "Liga Inglesa", "Liga Italiana", "Copa del Mundo" }));

        competicion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        competicion.setText("Competicion");

        res_local.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        res_local.setText("0");
        res_local.setMinimumSize(new java.awt.Dimension(20, 20));
        res_local.setPreferredSize(new java.awt.Dimension(20, 20));

        res_visita.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        res_visita.setText("0");
        res_visita.setMinimumSize(new java.awt.Dimension(20, 20));
        res_visita.setPreferredSize(new java.awt.Dimension(20, 20));

        visitante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        visitante.setText("Visitante");

        local.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        local.setText("Local");

        fecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fecha.setText("Fecha");

        label_monto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_monto.setText("Monto $$$");

        javax.swing.GroupLayout imagenLayout = new javax.swing.GroupLayout(imagen);
        imagen.setLayout(imagenLayout);
        imagenLayout.setHorizontalGroup(
            imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagenLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(cambia, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_apostar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(imagenLayout.createSequentialGroup()
                        .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(a_partidos)
                                .addComponent(ACampeon, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(APartidos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(imagenLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(a_campeon)))
                        .addGap(43, 43, 43)
                        .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ResExacto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_resultado)
                            .addComponent(AGoleador, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_goleador))))
                .addGap(73, 73, 73))
            .addGroup(imagenLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(imagenLayout.createSequentialGroup()
                            .addComponent(label_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Monto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lista_partidos, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(competicion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(imagenLayout.createSequentialGroup()
                            .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(visitante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(local, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(res_local, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(res_visita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(lista_competicion, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(imagenLayout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(linea, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        imagenLayout.setVerticalGroup(
            imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_apostar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(APartidos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResExacto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a_partidos)
                    .addComponent(label_resultado))
                .addGap(18, 18, 18)
                .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ACampeon, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AGoleador, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a_campeon)
                    .addComponent(a_goleador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(linea, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cambia, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lista_competicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lista_partidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(competicion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(res_local, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(local, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(res_visita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(visitante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Monto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_monto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar3.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenu6.setText("                         ");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("                         ");
        jMenuBar3.add(jMenu7);

        Bienvenido2.setText("Bienvenido:");
        Bienvenido2.setEnabled(false);
        Bienvenido2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Bienvenido2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jMenuBar3.add(Bienvenido2);

        user2.setForeground(new java.awt.Color(0, 0, 204));
        user2.setText("Nombre");
        user2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        quit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        quit2.setText("Salir");
        quit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit2ActionPerformed(evt);
            }
        });
        user2.add(quit2);

        jMenuBar3.add(user2);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void APartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APartidosActionPerformed
        // TODO add your handling code here:
        label_apostar.setVisible(true);
        label_apostar.setText("Apostar a Partidos");
        cambia.setText("Partidos");
        linea.setVisible(true);
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
        
    }//GEN-LAST:event_APartidosActionPerformed

    private void ResExactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResExactoActionPerformed
        // TODO add your handling code here:
        label_apostar.setVisible(true);
        label_apostar.setText("Apostar a Resultado Exacto");
        linea.setVisible(true);
        cambia.setText("Resultados");
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

    private void quit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quit1ActionPerformed
        // TODO add your handling code here:
        Main m = new Main();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_quit1ActionPerformed

    private void quit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quit2ActionPerformed
        // TODO add your handling code here:
        Main m = new Main();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_quit2ActionPerformed

    private void ACampeonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACampeonActionPerformed
        // TODO add your handling code here:
        label_apostar.setVisible(true);
        label_apostar.setText("Apostar a Campeon");
        linea.setVisible(true);
        cambia.setText("Campeon");
        lista_partidos.setVisible(true);
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

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Apuestas dialog = new Apuestas(new javax.swing.JFrame(), true);
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
    private javax.swing.JMenu Bienvenido1;
    private javax.swing.JMenu Bienvenido2;
    private javax.swing.JButton Confirmar;
    private javax.swing.JTextField Monto;
    private javax.swing.JButton ResExacto;
    private javax.swing.JLabel a_campeon;
    private javax.swing.JLabel a_goleador;
    private javax.swing.JLabel a_partidos;
    private javax.swing.JLabel cambia;
    private javax.swing.JLabel competicion;
    private javax.swing.JLabel fecha;
    private javax.swing.JPanel imagen;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JLabel label_apostar;
    private javax.swing.JLabel label_monto;
    private javax.swing.JLabel label_resultado;
    private javax.swing.JSeparator linea;
    private javax.swing.JComboBox lista_competicion;
    private javax.swing.JComboBox lista_partidos;
    private javax.swing.JLabel local;
    private javax.swing.JMenuItem quit;
    private javax.swing.JMenuItem quit1;
    private javax.swing.JMenuItem quit2;
    private javax.swing.JTextField res_local;
    private javax.swing.JTextField res_visita;
    private javax.swing.JMenu user;
    private javax.swing.JMenu user1;
    private javax.swing.JMenu user2;
    private javax.swing.JLabel visitante;
    // End of variables declaration//GEN-END:variables
}
