/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Dao.AutenticacionDAO;
import Dao.CiudadDAO;
import Dao.ColegioDAO;
import Dao.ComunaDAO;
import java.awt.event.ItemEvent;

/**
 *
 * @author jose_
 */
public class AgregarColegioView extends javax.swing.JFrame {

    private AutenticacionDAO autenticacionDAO = new AutenticacionDAO();
    private ColegioDAO colegioDAO = new ColegioDAO();
    private CiudadDAO ciudadDAO = new CiudadDAO();
    private ComunaDAO comunaDAO = new ComunaDAO();

    /**
     * Creates new form MenuColegioView
     */
    public AgregarColegioView() {
        initComponents();
        this.CmbxCiudadColegio.setModel(ciudadDAO.obtenerCiudad());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblNombreColegio = new javax.swing.JLabel();
        TxtNombreColegio = new javax.swing.JTextField();
        LblDireccionColegio = new javax.swing.JLabel();
        TxtDireccionColegio = new javax.swing.JTextField();
        LblCiudadColegio = new javax.swing.JLabel();
        CmbxCiudadColegio = new javax.swing.JComboBox<>();
        LblComunaColegio = new javax.swing.JLabel();
        cmbxComunaColegio = new javax.swing.JComboBox<>();
        LblTelefonoColegio = new javax.swing.JLabel();
        TxtTelefonoColegio = new javax.swing.JTextField();
        BtnAgregarColegio = new javax.swing.JButton();
        BtnVolerColegio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LblNombreColegio.setText("Nombre: ");

        LblDireccionColegio.setText("Dirección: ");

        LblCiudadColegio.setText("Ciudad: ");

        CmbxCiudadColegio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CmbxCiudadColegio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbxCiudadColegioItemStateChanged(evt);
            }
        });

        LblComunaColegio.setText("Comuna: ");

        cmbxComunaColegio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LblTelefonoColegio.setText("Teléfono:");

        BtnAgregarColegio.setText("Agregar");
        BtnAgregarColegio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarColegioActionPerformed(evt);
            }
        });

        BtnVolerColegio.setText("Volver");
        BtnVolerColegio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolerColegioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblComunaColegio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbxComunaColegio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblCiudadColegio)
                        .addGap(18, 18, 18)
                        .addComponent(CmbxCiudadColegio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblNombreColegio)
                            .addComponent(LblDireccionColegio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtNombreColegio)
                            .addComponent(TxtDireccionColegio, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblTelefonoColegio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtTelefonoColegio)
                            .addComponent(BtnAgregarColegio, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))))
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnVolerColegio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtNombreColegio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNombreColegio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDireccionColegio)
                    .addComponent(TxtDireccionColegio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCiudadColegio)
                    .addComponent(CmbxCiudadColegio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblComunaColegio)
                    .addComponent(cmbxComunaColegio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTelefonoColegio)
                    .addComponent(TxtTelefonoColegio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAgregarColegio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnVolerColegio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CmbxCiudadColegioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbxCiudadColegioItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String comuna;
            comuna = String.valueOf(CmbxCiudadColegio.getSelectedItem());
            this.cmbxComunaColegio.setModel(comunaDAO.obtenerComuna(comuna));
        }
    }//GEN-LAST:event_CmbxCiudadColegioItemStateChanged

    private void BtnVolerColegioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolerColegioActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MenuColegioView MenuColegio = new MenuColegioView();
        MenuColegio.setLocationRelativeTo(null);
        MenuColegio.setVisible(true);
    }//GEN-LAST:event_BtnVolerColegioActionPerformed

    private void BtnAgregarColegioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarColegioActionPerformed
        // TODO add your handling code here:
        try {
            
            String cmbxComuna = String.valueOf(cmbxComunaColegio.getSelectedItem());
            String cmbxComuna1 = comunaDAO.obtenerIdComuna(cmbxComuna);
            int idcomuna = Integer.parseInt(cmbxComuna1);

            String nombre = TxtNombreColegio.getText();
            String direccion = TxtDireccionColegio.getText();
            int telefono = Integer.parseInt(TxtTelefonoColegio.getText());


            colegioDAO.agregarColegio(idcomuna, nombre, direccion, telefono);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_BtnAgregarColegioActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarColegioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarColegioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarColegioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarColegioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarColegioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregarColegio;
    private javax.swing.JButton BtnVolerColegio;
    private javax.swing.JComboBox<String> CmbxCiudadColegio;
    private javax.swing.JLabel LblCiudadColegio;
    private javax.swing.JLabel LblComunaColegio;
    private javax.swing.JLabel LblDireccionColegio;
    private javax.swing.JLabel LblNombreColegio;
    private javax.swing.JLabel LblTelefonoColegio;
    private javax.swing.JTextField TxtDireccionColegio;
    private javax.swing.JTextField TxtNombreColegio;
    private javax.swing.JTextField TxtTelefonoColegio;
    private javax.swing.JComboBox<String> cmbxComunaColegio;
    // End of variables declaration//GEN-END:variables
}