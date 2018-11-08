/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Dao.AutenticacionDAO;
import model.RepresentanteAgencia;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author jose_
 */
public class MenuDuenoView extends javax.swing.JFrame {

    /**
     * Creates new form MenuDueno
     */
    public MenuDuenoView() {
        this.setMinimumSize(new Dimension(450, 350));
        initComponents();
        LblMensajeBienvenido1.setText(AutenticacionDAO.RP.getNombre()); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnEstadoDeCuenta = new javax.swing.JButton();
        BtnGenerarReportes = new javax.swing.JButton();
        LblMensajeBienvenido = new javax.swing.JLabel();
        LblMensajeBienvenido1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MnCerrarSesion = new javax.swing.JMenuItem();
        MnSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        BtnEstadoDeCuenta.setText("Consulta Estado de Cuenta");
        getContentPane().add(BtnEstadoDeCuenta);
        BtnEstadoDeCuenta.setBounds(12, 75, 400, 62);

        BtnGenerarReportes.setText("Generar Reporte de Avance");
        getContentPane().add(BtnGenerarReportes);
        BtnGenerarReportes.setBounds(12, 144, 400, 62);

        LblMensajeBienvenido.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LblMensajeBienvenido.setText("HOLA!!");
        getContentPane().add(LblMensajeBienvenido);
        LblMensajeBienvenido.setBounds(12, 13, 139, 44);

        LblMensajeBienvenido1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LblMensajeBienvenido1.setText("--------------");
        getContentPane().add(LblMensajeBienvenido1);
        LblMensajeBienvenido1.setBounds(158, 13, 227, 44);

        jMenu1.setText("Opciones");

        MnCerrarSesion.setText("Cerrar Sesión");
        MnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnCerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(MnCerrarSesion);

        MnSalir.setText("Salir");
        MnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSalirActionPerformed(evt);
            }
        });
        jMenu1.add(MnSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnCerrarSesionActionPerformed
        // TODO add your handling code here:
        int input = JOptionPane.showConfirmDialog(null,"¿Seguro deseas Cerrar Sesion?");
        if(input==0){
            JOptionPane.showMessageDialog(this, "Sesión Cerrada con éxito");
            this.setVisible(false);
            AutenticacionView Autenti = new AutenticacionView();
            Autenti.setLocationRelativeTo(null);
            Autenti.setVisible(true);
        }else{

        }
    }//GEN-LAST:event_MnCerrarSesionActionPerformed

    private void MnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSalirActionPerformed
        // TODO add your handling code here:
        int input = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas salir de la aplicación?");
        if(input==0){
            this.dispose();
        }
    }//GEN-LAST:event_MnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuDuenoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDuenoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDuenoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDuenoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDuenoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEstadoDeCuenta;
    private javax.swing.JButton BtnGenerarReportes;
    private javax.swing.JLabel LblMensajeBienvenido;
    private javax.swing.JLabel LblMensajeBienvenido1;
    private javax.swing.JMenuItem MnCerrarSesion;
    private javax.swing.JMenuItem MnSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}