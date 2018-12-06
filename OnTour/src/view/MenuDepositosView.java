/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DepositosController;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jose_
 */
public class MenuDepositosView extends javax.swing.JFrame {
    private DepositosController controller = new DepositosController();

    /**
     * Creates new form MenuDepositosView
     */
    public MenuDepositosView() {
        this.setMinimumSize(new Dimension(680,400));
        this.setUndecorated(true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBarraCerrarMinimizar = new javax.swing.JPanel();
        lblLogoMenu = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        BtnCerrar = new javax.swing.JButton();
        jPanelMenuDeposito = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDepositos = new javax.swing.JTable();
        btnConsultarDepositos = new javax.swing.JButton();
        btnValidarDeposito = new javax.swing.JButton();
        BtnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanelBarraCerrarMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBarraCerrarMinimizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelBarraCerrarMinimizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogoMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLogoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        lblLogoMenu.setText("On Tour");
        jPanelBarraCerrarMinimizar.add(lblLogoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        lblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Minimizar.png"))); // NOI18N
        lblMinimizar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseMoved(evt);
            }
        });
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseExited(evt);
            }
        });
        jPanelBarraCerrarMinimizar.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, 30));

        BtnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        BtnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Exit.png"))); // NOI18N
        BtnCerrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BtnCerrarMouseMoved(evt);
            }
        });
        BtnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnCerrarMouseExited(evt);
            }
        });
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });
        jPanelBarraCerrarMinimizar.add(BtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 30, 30));

        getContentPane().add(jPanelBarraCerrarMinimizar);
        jPanelBarraCerrarMinimizar.setBounds(0, 0, 680, 50);

        jPanelMenuDeposito.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMenuDeposito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelMenuDeposito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDepositos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableDepositos);

        jPanelMenuDeposito.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 610, 160));

        btnConsultarDepositos.setText("Consultar");
        btnConsultarDepositos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarDepositosActionPerformed(evt);
            }
        });
        jPanelMenuDeposito.add(btnConsultarDepositos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 60));

        btnValidarDeposito.setText("Validar");
        btnValidarDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarDepositoActionPerformed(evt);
            }
        });
        jPanelMenuDeposito.add(btnValidarDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 150, 60));

        BtnVolver.setBackground(new java.awt.Color(255, 255, 255));
        BtnVolver.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnVolver.setForeground(new java.awt.Color(12, 161, 215));
        BtnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Return1.png"))); // NOI18N
        BtnVolver.setText("Volver");
        BtnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnVolver.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnVolver.setIconTextGap(-10);
        BtnVolver.setMargin(new java.awt.Insets(2, 0, 2, 14));
        BtnVolver.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BtnVolverMouseMoved(evt);
            }
        });
        BtnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnVolverMouseExited(evt);
            }
        });
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });
        jPanelMenuDeposito.add(BtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 140, 60));

        getContentPane().add(jPanelMenuDeposito);
        jPanelMenuDeposito.setBounds(0, 50, 680, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarDepositosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarDepositosActionPerformed
        // TODO add your handling code here:
        this.tableDepositos.setVisible(true);
        DefaultTableModel modelotabla = this.controller.consultarDepositos();
        this.tableDepositos.setModel(modelotabla);
    }//GEN-LAST:event_btnConsultarDepositosActionPerformed

    private void btnValidarDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarDepositoActionPerformed
        // TODO add your handling code here:
        int seleccionado= this.tableDepositos.getSelectedRow();
        if (seleccionado > -1) {

            int confirm = JOptionPane.showConfirmDialog(null, "¿Está Seguro del depósito a validar?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirm == JOptionPane.YES_OPTION) {

                Object valor = ((DefaultTableModel) this.tableDepositos.getModel()).getValueAt(seleccionado, 0);
                int idDeposito = Integer.parseInt(valor.toString());

                boolean eliminado = this.controller.actualizarDeposito(idDeposito);
                if(eliminado){
                    ((DefaultTableModel) this.tableDepositos.getModel()).removeRow(seleccionado);
                    JOptionPane.showMessageDialog(this, "Depósito Actualizado");
                }

            } else {
                System.out.println("Cancelación de eliminado");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione un Depósito");
        }
    }//GEN-LAST:event_btnValidarDepositoActionPerformed

    private void BtnVolverMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVolverMouseMoved
        // TODO add your handling code here:
        BtnVolver.setBackground((new java.awt.Color(231, 165, 165)));
    }//GEN-LAST:event_BtnVolverMouseMoved

    private void BtnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVolverMouseExited
        // TODO add your handling code here:
        BtnVolver.setBackground((new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_BtnVolverMouseExited

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MenuPrincipalView MenuPrin = new MenuPrincipalView();
        MenuPrin.setLocationRelativeTo(null);
        MenuPrin.setVisible(true);
    }//GEN-LAST:event_BtnVolverActionPerformed

    private void lblMinimizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseMoved

        lblMinimizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(231, 165, 165)));
    }//GEN-LAST:event_lblMinimizarMouseMoved

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        // TODO add your handling code here:
        this.setState(MenuPrincipalView.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseExited

        lblMinimizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lblMinimizarMouseExited

    private void BtnCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarMouseMoved
        // TODO add your handling code here:
        BtnCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(231, 165, 165)));
    }//GEN-LAST:event_BtnCerrarMouseMoved

    private void BtnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarMouseExited
        // TODO add your handling code here:
        BtnCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_BtnCerrarMouseExited

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        // TODO add your handling code here:
        int input = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas salir de la aplicación?");
        if (input == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_BtnCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuDepositosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDepositosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDepositosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDepositosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDepositosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JButton btnConsultarDepositos;
    private javax.swing.JButton btnValidarDeposito;
    private javax.swing.JPanel jPanelBarraCerrarMinimizar;
    private javax.swing.JPanel jPanelMenuDeposito;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogoMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JTable tableDepositos;
    // End of variables declaration//GEN-END:variables
}