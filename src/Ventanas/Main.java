
package Ventanas;

import Clases.Actualizacion;
import javax.swing.ImageIcon;
import Ventanas.*;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    
 
    public Main() {
        initComponents();
        this.setLocationRelativeTo(this);
        //Actualizacion instancia = new Actualizacion();
       // instancia.actualizacion();
        
    }

    Main(Principal aThis, boolean b) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        Ibet = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        iniciar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        javaicon = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        error1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximumSize(new java.awt.Dimension(320, 480));
        setMinimumSize(new java.awt.Dimension(320, 480));
        setResizable(false);

        Ibet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N

        usuario.setToolTipText("Ingrese Usuario");
        usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, password, org.jdesktop.beansbinding.ObjectProperty.create(), usuario, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        iniciar.setText("Iniciar sesion");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        jLabel1.setText("Esta aplicacion fue desarrolla en Java SE");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javaicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Java.png"))); // NOI18N

        error1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        error1.setForeground(new java.awt.Color(255, 0, 51));
        error1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ibet, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(javaicon)))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(password)
                    .addComponent(usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(error1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(Ibet, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(javaicon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(error1)
                        .addGap(21, 21, 21)
                        .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        // TODO add your handling code here:
        if(Main.login(usuario.getText(), password.getText())!=true){
        error1.setText("El usuario o password es incorrecto");
        }
        else {Principal p = new Principal(this, true, usuario.getText());
            p.setLocationRelativeTo(null);
            this.dispose();
            p.setVisible(true);}
    }//GEN-LAST:event_iniciarActionPerformed
        
    public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ibet;
    private javax.swing.JLabel error1;
    private javax.swing.JToggleButton iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel javaicon;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField usuario;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private static boolean login(java.lang.String usuario, java.lang.String password) {
        WebService.Conexion_Service service = new WebService.Conexion_Service();
        WebService.Conexion port = service.getConexionPort();
        return port.login(usuario, password);
    }
}
