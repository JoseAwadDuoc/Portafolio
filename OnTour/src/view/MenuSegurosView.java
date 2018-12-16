/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Dao.AseguradoraDAO;
import Dao.AutenticacionDAO;
import Dao.CiudadDAO;
import Dao.ColegioDAO;
import Dao.ComunaDAO;
import Dao.SeguroDAO;
import Dao.TipoSeguroDAO;
import controller.SegurosController;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.GuiUtils;

/**
 *
 * @author jose_
 */
public class MenuSegurosView extends javax.swing.JFrame {

    private SegurosController controller = new SegurosController();
    private SeguroDAO seguroDAO = new SeguroDAO();
    private AseguradoraDAO aseguradoraDAO = new AseguradoraDAO();
    private TipoSeguroDAO tipoSeguroDAO = new TipoSeguroDAO();

    DefaultTableModel modelo;

    private AutenticacionDAO autenticacionDAO = new AutenticacionDAO();
    private ColegioDAO colegioDAO = new ColegioDAO();
    private CiudadDAO ciudadDAO = new CiudadDAO();
    private ComunaDAO comunaDAO = new ComunaDAO();

    /**
     * Creates new form MenuColegioView
     */
    public MenuSegurosView() {
        this.setUndecorated(true);
        this.setMinimumSize(new Dimension(790, 500));
        initComponents();
        setIconImage(GuiUtils.getImage("logo1.png"));
        this.btnModificarSeguros.setVisible(false);
        this.jPanelListarSeguros.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblMinimizar = new javax.swing.JLabel();
        lblLogoMenu = new javax.swing.JLabel();
        BtnCerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnListarColegio = new javax.swing.JPanel();
        BtnAgregarSeguro = new javax.swing.JButton();
        btnConsultarSeguros = new javax.swing.JButton();
        btnModificarSeguros = new javax.swing.JButton();
        jPanelListarSeguros = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSeguro = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jPanel3.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, 30));

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
        jPanel3.add(BtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 30, 30));

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 790, 50);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo1.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 177, 159));

        btnListarColegio.setBackground(new java.awt.Color(255, 255, 255));
        btnListarColegio.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(12, 161, 215), 5, true), "Admistrador de Seguros", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        BtnAgregarSeguro.setBackground(new java.awt.Color(255, 255, 255));
        BtnAgregarSeguro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnAgregarSeguro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AddColegio2.png"))); // NOI18N
        BtnAgregarSeguro.setText("Agregar");
        BtnAgregarSeguro.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BtnAgregarSeguroMouseMoved(evt);
            }
        });
        BtnAgregarSeguro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnAgregarSeguroMouseExited(evt);
            }
        });
        BtnAgregarSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarSeguroActionPerformed(evt);
            }
        });

        btnConsultarSeguros.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultarSeguros.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnConsultarSeguros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Listar.png"))); // NOI18N
        btnConsultarSeguros.setText("Consultar");
        btnConsultarSeguros.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnConsultarSegurosMouseMoved(evt);
            }
        });
        btnConsultarSeguros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarSegurosMouseExited(evt);
            }
        });
        btnConsultarSeguros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarSegurosActionPerformed(evt);
            }
        });

        btnModificarSeguros.setBackground(new java.awt.Color(255, 255, 255));
        btnModificarSeguros.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnModificarSeguros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Delete.png"))); // NOI18N
        btnModificarSeguros.setText("Eliminar");
        btnModificarSeguros.setEnabled(false);
        btnModificarSeguros.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnModificarSegurosMouseMoved(evt);
            }
        });
        btnModificarSeguros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarSegurosMouseExited(evt);
            }
        });
        btnModificarSeguros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarSegurosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnListarColegioLayout = new javax.swing.GroupLayout(btnListarColegio);
        btnListarColegio.setLayout(btnListarColegioLayout);
        btnListarColegioLayout.setHorizontalGroup(
            btnListarColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnListarColegioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnAgregarSeguro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultarSeguros)
                .addGap(18, 18, 18)
                .addComponent(btnModificarSeguros)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        btnListarColegioLayout.setVerticalGroup(
            btnListarColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnListarColegioLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(btnListarColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModificarSeguros, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarSeguros, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAgregarSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(btnListarColegio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jPanelListarSeguros.setBackground(new java.awt.Color(255, 255, 255));
        jPanelListarSeguros.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(12, 161, 215), 5, true), "Listar Seguros", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanelListarSeguros.setLayout(null);

        jTableSeguro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableSeguro);

        jPanelListarSeguros.add(jScrollPane1);
        jScrollPane1.setBounds(20, 30, 560, 130);

        jPanel1.add(jPanelListarSeguros, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 595, 170));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(12, 161, 215));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Return1.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVolver.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVolver.setIconTextGap(-10);
        btnVolver.setMargin(new java.awt.Insets(2, 0, 2, 14));
        btnVolver.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnVolverMouseMoved(evt);
            }
        });
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
        });
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 140, 60));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 50, 790, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarSeguroActionPerformed
        AgregarSegurosView agregarSeguros = new AgregarSegurosView();
        this.setVisible(false);
        agregarSeguros.setLocationRelativeTo(null);
        agregarSeguros.setVisible(true);
    }//GEN-LAST:event_BtnAgregarSeguroActionPerformed

    private void btnConsultarSegurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarSegurosActionPerformed

        this.jPanelListarSeguros.setVisible(true);
        this.jScrollPane1.setVisible(true);
        DefaultTableModel modelotabla = this.controller.consultarSeguros();
        this.jTableSeguro.setModel(modelotabla);
        this.btnModificarSeguros.setVisible(true);
    }//GEN-LAST:event_btnConsultarSegurosActionPerformed

    private void btnModificarSegurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarSegurosActionPerformed
        // TODO add your handling code here:
        int seleccionado = this.jTableSeguro.getSelectedRow();
        if (seleccionado > -1) {

            int confirm = JOptionPane.showConfirmDialog(null, "¿Está Seguro del seguro a eliminar?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirm == JOptionPane.YES_OPTION) {

                Object valor = ((DefaultTableModel) this.jTableSeguro.getModel()).getValueAt(seleccionado, 0);
                int idSeguro = Integer.parseInt(valor.toString());

                boolean eliminado = this.controller.eliminarSeguro(idSeguro);
                if (eliminado) {
                    ((DefaultTableModel) this.jTableSeguro.getModel()).removeRow(seleccionado);
                    JOptionPane.showMessageDialog(this, "Seguro Eliminado");
                }

            } else {
                System.out.println("Cancelación de eliminado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un Colegio");
        }
    }//GEN-LAST:event_btnModificarSegurosActionPerformed

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

    private void btnVolverMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseMoved
        // TODO add your handling code here:
        btnVolver.setBackground((new java.awt.Color(231, 165, 165)));
    }//GEN-LAST:event_btnVolverMouseMoved

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        // TODO add your handling code here:
        btnVolver.setBackground((new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MenuPrincipalView MenuPrin = new MenuPrincipalView();
        MenuPrin.setLocationRelativeTo(null);
        MenuPrin.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void BtnAgregarSeguroMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarSeguroMouseMoved
        // TODO add your handling code here:
        BtnAgregarSeguro.setBackground((new java.awt.Color(231, 165, 165)));
    }//GEN-LAST:event_BtnAgregarSeguroMouseMoved

    private void btnConsultarSegurosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarSegurosMouseMoved
        // TODO add your handling code here:
        btnConsultarSeguros.setBackground((new java.awt.Color(231, 165, 165)));
    }//GEN-LAST:event_btnConsultarSegurosMouseMoved

    private void btnModificarSegurosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarSegurosMouseMoved
        // TODO add your handling code here:
        btnModificarSeguros.setBackground((new java.awt.Color(231, 165, 165)));
    }//GEN-LAST:event_btnModificarSegurosMouseMoved

    private void BtnAgregarSeguroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarSeguroMouseExited
        // TODO add your handling code here:
        BtnAgregarSeguro.setBackground((new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_BtnAgregarSeguroMouseExited

    private void btnConsultarSegurosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarSegurosMouseExited
        // TODO add your handling code here:
        btnConsultarSeguros.setBackground((new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_btnConsultarSegurosMouseExited

    private void btnModificarSegurosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarSegurosMouseExited
        // TODO add your handling code here:
        btnModificarSeguros.setBackground((new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_btnModificarSegurosMouseExited

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
            java.util.logging.Logger.getLogger(MenuSegurosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuSegurosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuSegurosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuSegurosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuSegurosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregarSeguro;
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton btnConsultarSeguros;
    private javax.swing.JPanel btnListarColegio;
    private javax.swing.JButton btnModificarSeguros;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelListarSeguros;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSeguro;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogoMenu;
    private javax.swing.JLabel lblMinimizar;
    // End of variables declaration//GEN-END:variables
}
