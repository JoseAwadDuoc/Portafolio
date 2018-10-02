/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.IAutenticacionDAO;
import Modelo.RepresentanteAgencia;
import javax.swing.JOptionPane;

/**
 *
 * @author jose_
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        RepresentanteAgencia rp = new RepresentanteAgencia();
        LblMensajeBienvenido1.setText(IAutenticacionDAO.RP.getNombre());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnSeguros = new javax.swing.JButton();
        BtnContratos = new javax.swing.JButton();
        BtnEstadoDeCuenta = new javax.swing.JButton();
        LblMensajeBienvenido = new javax.swing.JLabel();
        LblMensajeBienvenido1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MnListarRepresentates = new javax.swing.JMenuItem();
        MnCerrarSesion = new javax.swing.JMenuItem();
        MnSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnSeguros.setText("Gestionar Seguros");

        BtnContratos.setText("Administrar Contratos");
        BtnContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnContratosActionPerformed(evt);
            }
        });

        BtnEstadoDeCuenta.setText("Consulta Estado de Cuenta");

        LblMensajeBienvenido.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LblMensajeBienvenido.setText("HOLA!!");

        LblMensajeBienvenido1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LblMensajeBienvenido1.setText("----");

        jMenu1.setText("Opciones");

        MnListarRepresentates.setText("Listar Representantes");
        MnListarRepresentates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnListarRepresentatesActionPerformed(evt);
            }
        });
        jMenu1.add(MnListarRepresentates);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(BtnSeguros)
                        .addGap(27, 27, 27)
                        .addComponent(BtnContratos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(BtnEstadoDeCuenta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(LblMensajeBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblMensajeBienvenido1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblMensajeBienvenido)
                    .addComponent(LblMensajeBienvenido1))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSeguros)
                    .addComponent(BtnContratos))
                .addGap(18, 18, 18)
                .addComponent(BtnEstadoDeCuenta)
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnListarRepresentatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnListarRepresentatesActionPerformed
        // TODO add your handling code here:
        ListarRepresentantes listRepre = new ListarRepresentantes();
        this.setVisible(false);
        listRepre.setLocationRelativeTo(null);
        listRepre.setVisible(true);
    }//GEN-LAST:event_MnListarRepresentatesActionPerformed

    private void MnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnCerrarSesionActionPerformed
        // TODO add your handling code here:
        int input = JOptionPane.showConfirmDialog(null,"¿Seguro deseas Cerrar Sesion?");
        if(input==0){
            JOptionPane.showMessageDialog(this, "Sesión Cerrada con éxito");
            this.setVisible(false);
            Autenticacion Autenti = new Autenticacion();
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

    private void BtnContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContratosActionPerformed
        // TODO add your handling code here:
        ConsultaContratos ConsultContr = new ConsultaContratos();
        this.setVisible(false);
        ConsultContr.setLocationRelativeTo(null);
        ConsultContr.setVisible(true);
    }//GEN-LAST:event_BtnContratosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnContratos;
    private javax.swing.JButton BtnEstadoDeCuenta;
    private javax.swing.JButton BtnSeguros;
    private javax.swing.JLabel LblMensajeBienvenido;
    private javax.swing.JLabel LblMensajeBienvenido1;
    private javax.swing.JMenuItem MnCerrarSesion;
    private javax.swing.JMenuItem MnListarRepresentates;
    private javax.swing.JMenuItem MnSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
