
package Vista;

import Controlador.Conexion;
import Controlador.IAutenticacionDAO;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author jose_
 */
public class Autenticacion extends javax.swing.JFrame {
    private Timer tiempo;
    int cont;
    Conexion con = new Conexion();
    public void activar(){tiempo.start();};
    public final static int TWO_SECOND=10;
    /**
     * Creates new form Autenticacion
     */
    public Autenticacion() {
        this.setMinimumSize(new Dimension(400, 500)); 
        initComponents();
        Conexion con = new Conexion();
        con.conectar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRut = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        TxtRut = new javax.swing.JTextField();
        BtnAutenticacion = new javax.swing.JButton();
        TxtPass = new javax.swing.JPasswordField();
        lblUser = new javax.swing.JLabel();
        pbBarra = new javax.swing.JProgressBar();
        LblFondoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblRut.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lblRut.setForeground(new java.awt.Color(255, 255, 255));
        lblRut.setText("RUT: ");
        getContentPane().add(lblRut);
        lblRut.setBounds(40, 320, 31, 14);

        lblPass.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lblPass.setForeground(new java.awt.Color(255, 255, 255));
        lblPass.setText("Contraseña: ");
        getContentPane().add(lblPass);
        lblPass.setBounds(40, 360, 63, 14);
        getContentPane().add(TxtRut);
        TxtRut.setBounds(120, 310, 174, 22);

        BtnAutenticacion.setText("INGRESAR");
        BtnAutenticacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAutenticacionActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAutenticacion);
        BtnAutenticacion.setBounds(120, 380, 174, 25);
        getContentPane().add(TxtPass);
        TxtPass.setBounds(120, 350, 174, 22);

        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        getContentPane().add(lblUser);
        lblUser.setBounds(90, 40, 260, 260);
        getContentPane().add(pbBarra);
        pbBarra.setBounds(120, 410, 170, 14);

        LblFondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(LblFondoLogin);
        LblFondoLogin.setBounds(0, 0, 640, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    class TimerListener implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            cont++;
            pbBarra.setValue(cont);
            
            if(cont==101){
                tiempo.stop(); 
                IAutenticacionDAO IDAO= new IAutenticacionDAO();
                String rutag= TxtRut.getText();
                int cargoag1=IDAO.obtener_perfil(rutag);
                
             if (cargoag1==2) {                
                MenuDueno menuDueno = new MenuDueno();
                menuDueno.setLocationRelativeTo(null);
                setVisible(false);
                menuDueno.setVisible(true);
            }else{    
                MenuPrincipal menuprincipal = new MenuPrincipal();
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
        String pass= new String (TxtPass.getPassword());
        
        try {
            IAutenticacionDAO aut = new IAutenticacionDAO();                        
            if(aut.validarUsuario(rutt, pass)){
                cont=-1;
                pbBarra.setValue(0);
                pbBarra.setStringPainted(true);
                tiempo=new Timer(TWO_SECOND,new TimerListener());
                activar();
                
            }else{
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectas");
                TxtRut.setText("");
                TxtPass.setText("");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectas");
        }
        
    }//GEN-LAST:event_BtnAutenticacionActionPerformed
   
    public void limpiarInfo(){
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
            java.util.logging.Logger.getLogger(Autenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Autenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Autenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Autenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Autenticacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAutenticacion;
    private javax.swing.JLabel LblFondoLogin;
    private javax.swing.JPasswordField TxtPass;
    private javax.swing.JTextField TxtRut;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel lblUser;
    private javax.swing.JProgressBar pbBarra;
    // End of variables declaration//GEN-END:variables
}
