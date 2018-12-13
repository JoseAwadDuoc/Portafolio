/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ApoderadosController;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jose_
 */
public final class MenuApoderadoView extends javax.swing.JFrame {

    private ApoderadosController controller = new ApoderadosController();

    DefaultTableModel modelo;

    public MenuApoderadoView() {
        this.setUndecorated(true);
        this.setMinimumSize(new Dimension(720, 570));
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo1.png")).getImage());
        this.lblModificarApoderado.setVisible(false);
        this.tableApoderados.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGroupPerfil = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        lblMinimizar = new javax.swing.JLabel();
        lblLogoMenu = new javax.swing.JLabel();
        BtnCerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblRegistrarApoderado = new javax.swing.JLabel();
        lblModificarApoderado = new javax.swing.JLabel();
        lblListarApoderado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableApoderados = new javax.swing.JTable();
        BtnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel3.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, 30));

        lblLogoMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLogoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        lblLogoMenu.setText("On Tour");
        jPanel3.add(lblLogoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

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
        jPanel3.add(BtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 30, 30));

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 720, 50);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo1.png"))); // NOI18N
        jPanel2.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 170));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(12, 161, 215), 5, true), "Administrador Apoderados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(12, 161, 215))); // NOI18N
        jPanel1.setLayout(null);

        lblRegistrarApoderado.setBackground(new java.awt.Color(255, 255, 255));
        lblRegistrarApoderado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRegistrarApoderado.setForeground(new java.awt.Color(12, 161, 215));
        lblRegistrarApoderado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Add1.png"))); // NOI18N
        lblRegistrarApoderado.setText("Registrar");
        lblRegistrarApoderado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblRegistrarApoderadoMouseMoved(evt);
            }
        });
        lblRegistrarApoderado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarApoderadoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegistrarApoderadoMouseExited(evt);
            }
        });
        jPanel1.add(lblRegistrarApoderado);
        lblRegistrarApoderado.setBounds(20, 30, 230, 120);

        lblModificarApoderado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblModificarApoderado.setForeground(new java.awt.Color(12, 161, 215));
        lblModificarApoderado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Editar.png"))); // NOI18N
        lblModificarApoderado.setText("Modificar");
        lblModificarApoderado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblModificarApoderadoMouseMoved(evt);
            }
        });
        lblModificarApoderado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModificarApoderadoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblModificarApoderadoMouseExited(evt);
            }
        });
        jPanel1.add(lblModificarApoderado);
        lblModificarApoderado.setBounds(330, 100, 130, 70);

        lblListarApoderado.setBackground(new java.awt.Color(255, 255, 255));
        lblListarApoderado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblListarApoderado.setForeground(new java.awt.Color(12, 161, 215));
        lblListarApoderado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Listar.png"))); // NOI18N
        lblListarApoderado.setText("Listar");
        lblListarApoderado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblListarApoderadoMouseMoved(evt);
            }
        });
        lblListarApoderado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblListarApoderadoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblListarApoderadoMouseExited(evt);
            }
        });
        jPanel1.add(lblListarApoderado);
        lblListarApoderado.setBounds(340, 30, 110, 60);

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 510, 190));

        tableApoderados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableApoderados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableApoderados.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tableApoderados);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 680, 200));

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
        jPanel2.add(BtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 140, 60));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 50, 720, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MenuPrincipalView MenuPrin = new MenuPrincipalView();
        MenuPrin.setLocationRelativeTo(null);
        MenuPrin.setVisible(true);
    }//GEN-LAST:event_BtnVolverActionPerformed

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        // TODO add your handling code here:
        this.setState(MenuPrincipalView.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        // TODO add your handling code here:
        int input = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas salir de la aplicación?");
        if (input == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void lblRegistrarApoderadoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarApoderadoMouseMoved
        // TODO add your handling code here:
        lblRegistrarApoderado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 161, 215)));
    }//GEN-LAST:event_lblRegistrarApoderadoMouseMoved

    private void lblRegistrarApoderadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarApoderadoMouseClicked
        // TODO add your handling code here:
        AgregarApoderadosView AgregarApod = new AgregarApoderadosView();
        this.setVisible(false);
        AgregarApod.setLocationRelativeTo(null);
        AgregarApod.setVisible(true);
    }//GEN-LAST:event_lblRegistrarApoderadoMouseClicked

    private void lblRegistrarApoderadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarApoderadoMouseExited
        // TODO add your handling code here:
        lblRegistrarApoderado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lblRegistrarApoderadoMouseExited

    private void lblListarApoderadoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListarApoderadoMouseMoved
        // TODO add your handling code here:
        lblListarApoderado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 161, 215)));
    }//GEN-LAST:event_lblListarApoderadoMouseMoved

    private void lblListarApoderadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListarApoderadoMouseExited
        // TODO add your handling code here:
        lblListarApoderado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lblListarApoderadoMouseExited

    private void lblListarApoderadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListarApoderadoMouseClicked
        // TODO add your handling code here:
        this.tableApoderados.setVisible(true);
        this.jScrollPane1.setVisible(true);
        DefaultTableModel modelotabla = this.controller.consultarApoderados();
        this.tableApoderados.setModel(modelotabla);
        this.lblModificarApoderado.setVisible(true);
    }//GEN-LAST:event_lblListarApoderadoMouseClicked

    private void lblModificarApoderadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModificarApoderadoMouseClicked
        // TODO add your handling code here:
        int seleccionado = this.tableApoderados.getSelectedRow();
        if (seleccionado > -1) {

            Object valor = ((DefaultTableModel) this.tableApoderados.getModel()).getValueAt(seleccionado, 0);
            int rutApoderado = Integer.parseInt(valor.toString());

            ModificarApoderadoView ModificarApod = new ModificarApoderadoView(rutApoderado);
            this.setVisible(false);
            ModificarApod.setLocationRelativeTo(null);
            ModificarApod.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un apoderado a modificar");
        }

    }//GEN-LAST:event_lblModificarApoderadoMouseClicked

    private void lblModificarApoderadoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModificarApoderadoMouseMoved
        // TODO add your handling code here:
        lblModificarApoderado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 161, 215)));
    }//GEN-LAST:event_lblModificarApoderadoMouseMoved

    private void lblModificarApoderadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModificarApoderadoMouseExited
        // TODO add your handling code here:
        lblModificarApoderado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lblModificarApoderadoMouseExited

    private void BtnVolverMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVolverMouseMoved
        // TODO add your handling code here:
        BtnVolver.setBackground((new java.awt.Color(231, 165, 165)));
    }//GEN-LAST:event_BtnVolverMouseMoved

    private void BtnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVolverMouseExited
        // TODO add your handling code here:
        BtnVolver.setBackground((new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_BtnVolverMouseExited

    private void lblMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseExited

        lblMinimizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lblMinimizarMouseExited

    private void lblMinimizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseMoved

        lblMinimizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(231, 165, 165)));
    }//GEN-LAST:event_lblMinimizarMouseMoved

    private void BtnCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarMouseMoved
        // TODO add your handling code here:
        BtnCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(231, 165, 165)));
    }//GEN-LAST:event_BtnCerrarMouseMoved

    private void BtnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarMouseExited
        // TODO add your handling code here:
        BtnCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_BtnCerrarMouseExited

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
            java.util.logging.Logger.getLogger(MenuApoderadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuApoderadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuApoderadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuApoderadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuApoderadoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.ButtonGroup BtnGroupPerfil;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListarApoderado;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogoMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblModificarApoderado;
    private javax.swing.JLabel lblRegistrarApoderado;
    private javax.swing.JTable tableApoderados;
    // End of variables declaration//GEN-END:variables
}
