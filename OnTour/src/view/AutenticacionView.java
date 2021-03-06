package view;

import Dao.Conexion;
import controller.AutenticacionController;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;
import org.apache.commons.io.IOUtils;
import utils.GuiUtils;

/**
 *
 * @author jose_
 */
public class AutenticacionView extends javax.swing.JFrame {

    private AutenticacionController controller = new AutenticacionController();

    private Timer tiempo;
    int cont;
    Conexion con = new Conexion();

    public void activar() {
        tiempo.start();
    }

    public final static int TWO_SECOND = 10;

    /**
     * Creates new form Autenticacion
     */
    public AutenticacionView() {
        this.setMinimumSize(new Dimension(490, 590));
        this.setUndecorated(true);
        initComponents();
        setIconImage(GuiUtils.getImage("logo1.png"));
        this.pbBarra.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnCerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        TxtRut = new javax.swing.JTextField();
        TxtPass = new javax.swing.JPasswordField();
        BtnAutenticacion = new javax.swing.JButton();
        pbBarra = new javax.swing.JProgressBar();
        lblRut = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LblIconUserKey = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        LblIconUser1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblMinimizar = new javax.swing.JLabel();
        lblLogoMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("On Tour");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Exit.png"))); // NOI18N
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 30, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtRut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TxtRut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TxtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRutActionPerformed(evt);
            }
        });
        jPanel1.add(TxtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 280, 30));

        TxtPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TxtPass.setBorder(null);
        jPanel1.add(TxtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 280, 30));

        BtnAutenticacion.setBackground(new java.awt.Color(255, 255, 255));
        BtnAutenticacion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnAutenticacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LoginUser.png"))); // NOI18N
        BtnAutenticacion.setText("INGRESAR");
        BtnAutenticacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAutenticacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BtnAutenticacionMouseMoved(evt);
            }
        });
        BtnAutenticacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnAutenticacionMouseExited(evt);
            }
        });
        BtnAutenticacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAutenticacionActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAutenticacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 330, 60));
        jPanel1.add(pbBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 330, 20));

        lblRut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRut.setText("RUT: ");
        jPanel1.add(lblRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 50, -1));

        lblPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPass.setText("Contraseña: ");
        jPanel1.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 130, -1));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo1.png"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 180, 160));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 330, 10));

        LblIconUserKey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/KeyLogin.png"))); // NOI18N
        jPanel1.add(LblIconUserKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 50, 40));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 330, 10));

        LblIconUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/UserLogin.png"))); // NOI18N
        jPanel1.add(LblIconUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 40, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 490, 540));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Minimizar.png"))); // NOI18N
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });
        jPanel3.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, 30));

        lblLogoMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLogoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        lblLogoMenu.setText("On Tour");
        jPanel3.add(lblLogoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    class TimerListener implements ActionListener {

        public void actionPerformed(ActionEvent ae) {
            cont++;
            pbBarra.setValue(cont);

            if (cont == 101) {
                tiempo.stop();
                String rutag = TxtRut.getText();
                int cargoag1 = controller.obtenerPerfil(rutag);

                if (cargoag1 == 2) {
                    MenuDuenoView menuDueno = new MenuDuenoView();
                    menuDueno.setLocationRelativeTo(null);
                    setVisible(false);
                    menuDueno.setVisible(true);
                } else {
                    MenuPrincipalView menuprincipal = new MenuPrincipalView();
                    menuprincipal.setLocationRelativeTo(null);
                    setVisible(false);
                    menuprincipal.setVisible(true);
                }
            }
        }
    }

    private void BtnAutenticacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAutenticacionActionPerformed
        // TODO add your handling code here:

        try {
            int rutt = Integer.parseInt(TxtRut.getText());
            String pass = new String(TxtPass.getPassword());
            if (controller.validarUsuario(rutt, pass)) {
                this.pbBarra.setVisible(true);
                cont = -1;
                pbBarra.setValue(0);
                pbBarra.setStringPainted(true);
                tiempo = new Timer(TWO_SECOND, new TimerListener());
                activar();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectas");
                TxtRut.setText("");
                TxtPass.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectas");
        }
    }//GEN-LAST:event_BtnAutenticacionActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        // TODO add your handling code here:
        int input = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas salir de la aplicación?");
        if (input == 0) {
            System.exit(0);
//            this.dispose();
        }
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void TxtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRutActionPerformed

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        // TODO add your handling code here:
        this.setState(MenuPrincipalView.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void BtnAutenticacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAutenticacionMouseMoved
        // TODO add your handling code here:
        BtnAutenticacion.setBackground((new java.awt.Color(231, 165, 165)));
    }//GEN-LAST:event_BtnAutenticacionMouseMoved

    private void BtnAutenticacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAutenticacionMouseExited
        // TODO add your handling code here:
        BtnAutenticacion.setBackground((new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_BtnAutenticacionMouseExited

    public void limpiarInfo() {
        TxtRut.setText(null);
        TxtPass.setText(null);
    }

    public static class CustomeBorder extends AbstractBorder {

        public void paintBorder(Component c, Graphics g, int x, int y,
                int width, int height) {
            super.paintBorder(c, g, x, y, width, height);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setPaint(Color.BLACK);
            Shape shape = new RoundRectangle2D.Float(0, 0, c.getWidth() - 1, c.getHeight() - 1, 9, 9);
            g2d.draw(shape);
        }
    }

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
            java.util.logging.Logger.getLogger(AutenticacionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutenticacionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutenticacionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutenticacionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutenticacionView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAutenticacion;
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JLabel LblIconUser1;
    private javax.swing.JLabel LblIconUserKey;
    private javax.swing.JLabel Logo;
    private javax.swing.JPasswordField TxtPass;
    private javax.swing.JTextField TxtRut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblLogoMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblRut;
    private javax.swing.JProgressBar pbBarra;
    // End of variables declaration//GEN-END:variables
}
