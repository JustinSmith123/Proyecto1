/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import src.proyecto01.Empleado;

/**
 *
 * @author Enzo Morales
 */
public class VentanaSesion extends javax.swing.JFrame {
    private String usuarioIngresado = "";
    private String contrasennaIngresada = "";
    /**
     * Creates new form VentanaSesion
     */
    public VentanaSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelInstrucciones = new javax.swing.JLabel();
        jLabelFondoInstrucciones = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelContrasenna = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonIniciarSesion = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jPasswordFieldContrasenna = new javax.swing.JPasswordField();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(153, 153, 153));
        jLabelTitulo.setText("Iniciar sesión");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabelInstrucciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelInstrucciones.setForeground(new java.awt.Color(204, 204, 204));
        jLabelInstrucciones.setText("Para poder utilizar el sistema, por favor inicie sesión antes.");
        getContentPane().add(jLabelInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabelFondoInstrucciones.setBackground(new java.awt.Color(51, 51, 51));
        jLabelFondoInstrucciones.setOpaque(true);
        getContentPane().add(jLabelFondoInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 20, 380, 70));

        jLabelNombre.setBackground(new java.awt.Color(51, 51, 51));
        jLabelNombre.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(153, 153, 153));
        jLabelNombre.setText("         Nombre de usuario:");
        jLabelNombre.setOpaque(true);
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 120, 210, 30));

        jLabelContrasenna.setBackground(new java.awt.Color(51, 51, 51));
        jLabelContrasenna.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelContrasenna.setForeground(new java.awt.Color(153, 153, 153));
        jLabelContrasenna.setText("                     Contraseña:");
        jLabelContrasenna.setOpaque(true);
        getContentPane().add(jLabelContrasenna, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 180, 210, 30));

        jTextFieldNombre.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 160, 30));

        jButtonIniciarSesion.setBackground(new java.awt.Color(51, 51, 51));
        jButtonIniciarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonIniciarSesion.setForeground(new java.awt.Color(204, 204, 204));
        jButtonIniciarSesion.setText("Iniciar sesión");
        jButtonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        jButtonSalir.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(51, 51, 51));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jPasswordFieldContrasenna.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordFieldContrasenna.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordFieldContrasenna.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jPasswordFieldContrasenna, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 160, 30));

        jLabelFondo.setBackground(new java.awt.Color(0, 173, 181));
        jLabelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabelFondo.setOpaque(true);
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionActionPerformed
        usuarioIngresado = jTextFieldNombre.getText();
        contrasennaIngresada = jPasswordFieldContrasenna.getText();
        boolean ingreso = false; 
        if (usuarioIngresado.length() != 0 && contrasennaIngresada.length() != 0) {
            Empleado empleadoTemporal = new Empleado();
            ArrayList<Empleado> listaEmpleados = empleadoTemporal.getListaEmpleados();
            for(int cont = 0; cont<listaEmpleados.size(); cont++){
                if (usuarioIngresado.equals(listaEmpleados.get(cont).getNombreUsuario()) && contrasennaIngresada.equals(listaEmpleados.get(cont).getContrasenna())) {
                    VentanaMenuPrincipal siguienteVentana = new VentanaMenuPrincipal();
                    siguienteVentana.setVisible(true);
                    dispose();
                    ingreso = true;
                }
            }
            if (!ingreso) {
                JOptionPane.showMessageDialog(null, "El usuario y la contraseña no coinciden con alguna cuenta registrada.", "Error: Credenciales incorrectas", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor asegúrese de llenar todos los campos de texto.", "Error: Campo vacío", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonIniciarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelContrasenna;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelFondoInstrucciones;
    private javax.swing.JLabel jLabelInstrucciones;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPasswordField jPasswordFieldContrasenna;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
