/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.IAutenticacionDAO;
import java.awt.Dimension;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author corellana
 */
public class Eliminarcontrato extends javax.swing.JFrame {
    
private IAutenticacionDAO IDAO= new IAutenticacionDAO();
    /**
     * Creates new form Eliminarcontrato
     */
    public Eliminarcontrato() {
        this.setMinimumSize(new Dimension(460, 250));
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

        jLabel1 = new javax.swing.JLabel();
        txtcontratodel = new javax.swing.JTextField();
        btneliminar = new javax.swing.JButton();
        lblmensajeeliminar = new javax.swing.JLabel();
        BtnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Ingrese el ID del contrato a eliminar:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 211, 16);
        getContentPane().add(txtcontratodel);
        txtcontratodel.setBounds(230, 20, 41, 22);

        btneliminar.setBackground(new java.awt.Color(255, 0, 0));
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar);
        btneliminar.setBounds(280, 20, 130, 50);
        getContentPane().add(lblmensajeeliminar);
        lblmensajeeliminar.setBounds(100, 70, 171, 30);

        BtnVolver.setText("Volver");
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVolver);
        BtnVolver.setBounds(340, 120, 69, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        
        int confirm=JOptionPane.showConfirmDialog(null, "¿Está Seguro del contrato a eliminar?","Confirmar Eliminación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
         if (confirm== JOptionPane.YES_OPTION){
             try {
          int eliminacontrato= Integer.parseInt(txtcontratodel.getText());
            
         IDAO.eliminar_contrato(eliminacontrato);
            
          lblmensajeeliminar.setText("Contrato Eliminado Correctamente");
            
        } catch (Exception e) {
            
          lblmensajeeliminar.setText(e.getMessage());
      }
            
            
         }else{
             System.out.println("Cancelación de eliminado");
         }
     

// TODO add your handling code here:
    }//GEN-LAST:event_btneliminarActionPerformed

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ConsultaContratos ConsulContr = new ConsultaContratos();
        ConsulContr.setLocationRelativeTo(null);
        ConsulContr.setVisible(true);
    }//GEN-LAST:event_BtnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(Eliminarcontrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminarcontrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminarcontrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminarcontrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminarcontrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVolver;
    private javax.swing.JButton btneliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblmensajeeliminar;
    private javax.swing.JTextField txtcontratodel;
    // End of variables declaration//GEN-END:variables
}
