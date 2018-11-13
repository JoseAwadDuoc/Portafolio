package view;

import Dao.Conexion;
import controller.AutenticacionController;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

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
        this.setMinimumSize(new Dimension(420, 560));
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo1.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        TxtRut = new javax.swing.JTextField();
        TxtPass = new javax.swing.JPasswordField();
        BtnAutenticacion = new javax.swing.JButton();
        pbBarra = new javax.swing.JProgressBar();
        lblRut = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("On Tour");
        getContentPane().setLayout(null);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo1.png"))); // NOI18N
        getContentPane().add(Logo);
        Logo.setBounds(120, -10, 180, 160);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Login Administrador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel1.setLayout(null);

        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Login.png"))); // NOI18N
        jPanel1.add(lblUser);
        lblUser.setBounds(160, 20, 130, 140);
        jPanel1.add(TxtRut);
        TxtRut.setBounds(130, 160, 190, 30);
        jPanel1.add(TxtPass);
        TxtPass.setBounds(130, 200, 190, 30);

        BtnAutenticacion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnAutenticacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LoginUser.png"))); // NOI18N
        BtnAutenticacion.setText("INGRESAR");
        BtnAutenticacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAutenticacionActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAutenticacion);
        BtnAutenticacion.setBounds(130, 240, 190, 50);
        jPanel1.add(pbBarra);
        pbBarra.setBounds(130, 300, 190, 20);

        lblRut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRut.setText("RUT: ");
        jPanel1.add(lblRut);
        lblRut.setBounds(80, 170, 50, 22);

        lblPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPass.setText("Contraseña: ");
        jPanel1.add(lblPass);
        lblPass.setBounds(10, 200, 130, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 150, 370, 340);

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
        int rutt = Integer.parseInt(TxtRut.getText());
        String pass = new String(TxtPass.getPassword());

        try {
            if (controller.validarUsuario(rutt, pass)) {
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

    public void limpiarInfo() {
        TxtRut.setText(null);
        TxtPass.setText(null);
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
    private javax.swing.JLabel Logo;
    private javax.swing.JPasswordField TxtPass;
    private javax.swing.JTextField TxtRut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel lblUser;
    private javax.swing.JProgressBar pbBarra;
    // End of variables declaration//GEN-END:variables
}
