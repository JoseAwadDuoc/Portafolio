/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Dao.ApoderadoDAO;
import Dao.AutenticacionDAO;
import Dao.CiudadDAO;
import Dao.ComunaDAO;
import java.awt.event.ItemEvent;

/**
 *
 * @author jose_
 */
public class AgregarApoderadosView extends javax.swing.JFrame {

    private AutenticacionDAO autenticacionDAO = new AutenticacionDAO();
    private ApoderadoDAO apoderadoDAO = new ApoderadoDAO();
    private CiudadDAO ciudadDAO = new CiudadDAO();
    private ComunaDAO comunaDAO = new ComunaDAO();

    /**
     * Creates new form AgregarApoderados
     */
    public AgregarApoderadosView() {
        initComponents();
        this.CmbxCiudad.setModel(ciudadDAO.obtenerCiudad());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        LblRutApoderado = new javax.swing.JLabel();
        TxtRutApoderado = new javax.swing.JTextField();
        LblNombreApoderado = new javax.swing.JLabel();
        TxtNombreApoderado = new javax.swing.JTextField();
        LblAPaterno = new javax.swing.JLabel();
        TxtAPaternoApoderado = new javax.swing.JTextField();
        LblAMaterno = new javax.swing.JLabel();
        TxtAMaternoApoderado = new javax.swing.JTextField();
        LblFNacimiento = new javax.swing.JLabel();
        TxtFNacimiento = new javax.swing.JTextField();
        LblTelefono = new javax.swing.JLabel();
        TxtTelefonoApoderado = new javax.swing.JTextField();
        LblCiudad = new javax.swing.JLabel();
        CmbxCiudad = new javax.swing.JComboBox<>();
        LblComunaApoderado = new javax.swing.JLabel();
        CmbxComuna = new javax.swing.JComboBox<>();
        LblDireccion = new javax.swing.JLabel();
        TxtDireccionApoderado = new javax.swing.JTextField();
        LblPassApoderado = new javax.swing.JLabel();
        TxtPassApoderado = new javax.swing.JPasswordField();
        LblCorreoApoderado = new javax.swing.JLabel();
        TxtCorreoApoderado = new javax.swing.JTextField();
        LblPerfilApoderado = new javax.swing.JLabel();
        RbtPerfilSi = new javax.swing.JRadioButton();
        RbtPerfilNo = new javax.swing.JRadioButton();
        BtnResgistrar = new javax.swing.JButton();
        BtnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LblRutApoderado.setText("RUT:");

        LblNombreApoderado.setText("Nombre: ");

        LblAPaterno.setText("Apellido Paterno:");

        TxtAPaternoApoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAPaternoApoderadoActionPerformed(evt);
            }
        });

        LblAMaterno.setText("Apellido Materno:");

        LblFNacimiento.setText("Fecha Nacimiento:");

        LblTelefono.setText("Teléfono: ");

        LblCiudad.setText("Ciudad:");

        CmbxCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Ciudad" }));
        CmbxCiudad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbxCiudadItemStateChanged(evt);
            }
        });

        LblComunaApoderado.setText("Comuna: ");

        CmbxComuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Comuna" }));
        CmbxComuna.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbxComunaItemStateChanged(evt);
            }
        });

        LblDireccion.setText("Dirección: ");

        LblPassApoderado.setText("Contraseña:");

        LblCorreoApoderado.setText("Correo Electronico:");

        LblPerfilApoderado.setText("Encargado:");

        buttonGroup1.add(RbtPerfilSi);
        RbtPerfilSi.setText("Sí");

        buttonGroup1.add(RbtPerfilNo);
        RbtPerfilNo.setSelected(true);
        RbtPerfilNo.setText("No");

        BtnResgistrar.setText("Registrar");
        BtnResgistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResgistrarActionPerformed(evt);
            }
        });

        BtnVolver.setText("Volver");
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(LblRutApoderado)
                        .addGap(11, 11, 11)
                        .addComponent(TxtRutApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(LblNombreApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(TxtNombreApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblAPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(TxtAPaternoApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(TxtAMaternoApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LblAMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblFNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(TxtFNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(TxtTelefonoApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(CmbxCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LblCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(LblComunaApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CmbxComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblDireccion)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(TxtDireccionApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(LblPassApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(TxtPassApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblCorreoApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtCorreoApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(LblPerfilApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(RbtPerfilSi)
                        .addGap(11, 11, 11)
                        .addComponent(RbtPerfilNo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(BtnResgistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblRutApoderado)
                            .addComponent(TxtRutApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblNombreApoderado)
                            .addComponent(TxtNombreApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblAPaterno)
                            .addComponent(TxtAPaternoApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtAMaternoApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblAMaterno))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblFNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtFNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblTelefono)
                            .addComponent(TxtTelefonoApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CmbxCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblCiudad))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblComunaApoderado)
                            .addComponent(CmbxComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblDireccion)
                            .addComponent(TxtDireccionApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblPassApoderado)
                            .addComponent(TxtPassApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(TxtCorreoApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblCorreoApoderado)))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(LblPerfilApoderado))
                            .addComponent(RbtPerfilSi)
                            .addComponent(RbtPerfilNo))
                        .addGap(14, 14, 14)
                        .addComponent(BtnResgistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnVolver)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtAPaternoApoderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAPaternoApoderadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAPaternoApoderadoActionPerformed

    private void CmbxCiudadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbxCiudadItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String comuna;
            comuna = String.valueOf(CmbxCiudad.getSelectedItem());
            this.CmbxComuna.setModel(comunaDAO.obtenerComuna(comuna));
        }

    }//GEN-LAST:event_CmbxCiudadItemStateChanged

    private void CmbxComunaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbxComunaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbxComunaItemStateChanged

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MenuApoderadoView MenuPrin = new MenuApoderadoView();
        MenuPrin.setLocationRelativeTo(null);
        MenuPrin.setVisible(true);
    }//GEN-LAST:event_BtnVolverActionPerformed

    private void BtnResgistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResgistrarActionPerformed
        // TODO add your handling code here:
        try {
            
            int rutApod = Integer.parseInt(TxtRutApoderado.getText());
            System.out.println("asas: " +rutApod);
            
            String nombre = TxtNombreApoderado.getText();
            String ap= TxtAPaternoApoderado.getText();
            String am=TxtAMaternoApoderado.getText();
            String fechaNac = TxtFNacimiento.getText();
            int tel= Integer.parseInt(TxtTelefonoApoderado.getText());
            
            String comboCom = String.valueOf(CmbxComuna.getSelectedItem());
            String comboCom1 = comunaDAO.obtenerIdComuna(comboCom);
            int idcomuna = Integer.parseInt(comboCom1);
            
            String direccion= TxtDireccionApoderado.getText();
            String contrasena = String.valueOf(TxtPassApoderado.getPassword());
            String correo = TxtCorreoApoderado.getText();
            
            String perfil= new String();
            
            if(RbtPerfilSi.isSelected()){
            
                perfil="SI";
                
            }else{
            perfil="NO";
            }
            

            // direccion, contraseña, correo , perfil
            
            apoderadoDAO.agregarApoderado(rutApod, nombre,ap,am, fechaNac, tel, idcomuna, direccion, contrasena, correo,perfil);
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BtnResgistrarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarApoderadosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarApoderadosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarApoderadosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarApoderadosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarApoderadosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnResgistrar;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JComboBox<String> CmbxCiudad;
    private javax.swing.JComboBox<String> CmbxComuna;
    private javax.swing.JLabel LblAMaterno;
    private javax.swing.JLabel LblAPaterno;
    private javax.swing.JLabel LblCiudad;
    private javax.swing.JLabel LblComunaApoderado;
    private javax.swing.JLabel LblCorreoApoderado;
    private javax.swing.JLabel LblDireccion;
    private javax.swing.JLabel LblFNacimiento;
    private javax.swing.JLabel LblNombreApoderado;
    private javax.swing.JLabel LblPassApoderado;
    private javax.swing.JLabel LblPerfilApoderado;
    private javax.swing.JLabel LblRutApoderado;
    private javax.swing.JLabel LblTelefono;
    private javax.swing.JRadioButton RbtPerfilNo;
    private javax.swing.JRadioButton RbtPerfilSi;
    private javax.swing.JTextField TxtAMaternoApoderado;
    private javax.swing.JTextField TxtAPaternoApoderado;
    private javax.swing.JTextField TxtCorreoApoderado;
    private javax.swing.JTextField TxtDireccionApoderado;
    private javax.swing.JTextField TxtFNacimiento;
    private javax.swing.JTextField TxtNombreApoderado;
    private javax.swing.JPasswordField TxtPassApoderado;
    private javax.swing.JTextField TxtRutApoderado;
    private javax.swing.JTextField TxtTelefonoApoderado;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}