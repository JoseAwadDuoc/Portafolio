package view;

import Dao.AseguradoraDAO;
import Dao.SeguroDAO;
import Dao.TipoSeguroDAO;
import controller.SegurosController;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.KeyValue;
import model.Seguro;
import utils.GuiUtils;

/**
 *
 * @author cristianorellanafarias
 */
public class AgregarSegurosView extends javax.swing.JFrame {

    private SegurosController controller = new SegurosController();
    private SeguroDAO seguroDAO = new SeguroDAO();
    private AseguradoraDAO aseguradoraDAO = new AseguradoraDAO();
    private TipoSeguroDAO tipoSeguroDAO = new TipoSeguroDAO();

    /**
     * Creates new form AgregarContratos
     */
    public AgregarSegurosView() {
        this.setUndecorated(true);
        this.setMinimumSize(new Dimension(480, 560));
        initComponents();
        setIconImage(GuiUtils.getImage("logo1.png"));
        this.cmbAseguradora.setModel(aseguradoraDAO.obtenerAseguradoras());
        this.cmbTipoSeguro.setModel(tipoSeguroDAO.obtenerTipoSeguros());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpanelRegistrarSeguro = new javax.swing.JPanel();
        lblTipoSeguro = new javax.swing.JLabel();
        cmbTipoSeguro = new javax.swing.JComboBox<>();
        lblAseguradora = new javax.swing.JLabel();
        cmbAseguradora = new javax.swing.JComboBox<>();
        lblFechaIni = new javax.swing.JLabel();
        dateChooserFechaEvento = new com.toedter.calendar.JDateChooser();
        lblPrecioSeguro = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtPrecioSeguro = new javax.swing.JTextField();
        lblFechaIni1 = new javax.swing.JLabel();
        dateChooserFechaFin = new com.toedter.calendar.JDateChooser();
        btnLimpiarApoderado = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        lblMinimizar = new javax.swing.JLabel();
        lblLogoMenu = new javax.swing.JLabel();
        BtnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("On Tour");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelRegistrarSeguro.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRegistrarSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(12, 161, 215), 5, true), "Registrar Seguro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jpanelRegistrarSeguro.setLayout(null);

        lblTipoSeguro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTipoSeguro.setText("Tipo de seguro:");
        jpanelRegistrarSeguro.add(lblTipoSeguro);
        lblTipoSeguro.setBounds(50, 110, 140, 20);

        cmbTipoSeguro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbTipoSeguro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpanelRegistrarSeguro.add(cmbTipoSeguro);
        cmbTipoSeguro.setBounds(160, 100, 200, 40);

        lblAseguradora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAseguradora.setText("Aseguradora:");
        jpanelRegistrarSeguro.add(lblAseguradora);
        lblAseguradora.setBounds(60, 50, 94, 20);

        cmbAseguradora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbAseguradora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpanelRegistrarSeguro.add(cmbAseguradora);
        cmbAseguradora.setBounds(160, 40, 200, 40);

        lblFechaIni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFechaIni.setText("Fecha Inicio : ");
        jpanelRegistrarSeguro.add(lblFechaIni);
        lblFechaIni.setBounds(70, 210, 95, 20);

        dateChooserFechaEvento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jpanelRegistrarSeguro.add(dateChooserFechaEvento);
        dateChooserFechaEvento.setBounds(170, 200, 200, 30);

        lblPrecioSeguro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrecioSeguro.setText("Precio:");
        jpanelRegistrarSeguro.add(lblPrecioSeguro);
        lblPrecioSeguro.setBounds(110, 160, 47, 20);

        lblMonto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jpanelRegistrarSeguro.add(lblMonto);
        lblMonto.setBounds(180, 280, 190, 30);

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar.png"))); // NOI18N
        btnAgregar.setText("Guardar");
        btnAgregar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAgregarMouseMoved(evt);
            }
        });
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jpanelRegistrarSeguro.add(btnAgregar);
        btnAgregar.setBounds(50, 300, 320, 50);

        txtPrecioSeguro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPrecioSeguro.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPrecioSeguro.setBorder(null);
        txtPrecioSeguro.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioSeguro.setFocusCycleRoot(true);
        jpanelRegistrarSeguro.add(txtPrecioSeguro);
        txtPrecioSeguro.setBounds(160, 160, 200, 20);

        lblFechaIni1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFechaIni1.setText("Fecha Fin : ");
        jpanelRegistrarSeguro.add(lblFechaIni1);
        lblFechaIni1.setBounds(90, 260, 77, 20);

        dateChooserFechaFin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jpanelRegistrarSeguro.add(dateChooserFechaFin);
        dateChooserFechaFin.setBounds(170, 250, 200, 30);

        btnLimpiarApoderado.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarApoderado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLimpiarApoderado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Limpiar.png"))); // NOI18N
        btnLimpiarApoderado.setText("Limpiar");
        btnLimpiarApoderado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLimpiarApoderado.setIconTextGap(-1);
        btnLimpiarApoderado.setMargin(new java.awt.Insets(2, 4, 2, 14));
        btnLimpiarApoderado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnLimpiarApoderadoMouseMoved(evt);
            }
        });
        btnLimpiarApoderado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarApoderadoMouseExited(evt);
            }
        });
        btnLimpiarApoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarApoderadoActionPerformed(evt);
            }
        });
        jpanelRegistrarSeguro.add(btnLimpiarApoderado);
        btnLimpiarApoderado.setBounds(50, 360, 150, 60);

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
        jpanelRegistrarSeguro.add(btnVolver);
        btnVolver.setBounds(230, 360, 140, 60);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jpanelRegistrarSeguro.add(jSeparator1);
        jSeparator1.setBounds(110, 180, 250, 10);

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jpanelRegistrarSeguro.add(jSeparator9);
        jSeparator9.setBounds(210, 360, 10, 60);

        jPanel1.add(jpanelRegistrarSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 440, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 480, 510));

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
        jPanel3.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, 30));

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
        jPanel3.add(BtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 30, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        try {

            String cmbseg = String.valueOf(cmbAseguradora.getSelectedItem());
            String cmbseg1 = aseguradoraDAO.obtenerIdAseguradora(cmbseg);
            int idaseguradora = Integer.parseInt(cmbseg1);
            System.out.println("id aseguradora : " + idaseguradora);

            String cmbseg2 = String.valueOf(cmbTipoSeguro.getSelectedItem());
            String cmbseg3 = tipoSeguroDAO.obtenerIdTipoSeguro(cmbseg2);
            int idseguro = Integer.parseInt(cmbseg3);
            System.out.println("id seguro : " + idseguro);

            int precio = Integer.parseInt(txtPrecioSeguro.getText());
            System.out.println("Precio: " + precio);

            String fecha_ini = formato.format(dateChooserFechaEvento.getDate());
            System.out.println("Fecha Inicio : " + fecha_ini);

            String fecha_fin = formato.format(dateChooserFechaFin.getDate());
            System.out.println("Fecha Fin : " + fecha_fin);

            Seguro seguro = new Seguro();
            seguro.setIdTipoSeguro(idseguro);
            seguro.setIdAseguradora(idaseguradora);
            seguro.setPrecio(precio);
            seguro.setFechaIni(fecha_ini);
            seguro.setFechFin(fecha_fin);

            boolean agregado = controller.agregarSeguro(seguro);
            if (agregado) {
                JOptionPane.showMessageDialog(this, "Seguro registrado");
            } else {
                JOptionPane.showMessageDialog(this, "El seguro no se pudo registrar", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

// TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

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

    private void btnLimpiarApoderadoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarApoderadoMouseMoved
        // TODO add your handling code here:
        btnLimpiarApoderado.setBackground((new java.awt.Color(231, 165, 165)));
    }//GEN-LAST:event_btnLimpiarApoderadoMouseMoved

    private void btnLimpiarApoderadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarApoderadoMouseExited
        // TODO add your handling code here:
        btnLimpiarApoderado.setBackground((new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_btnLimpiarApoderadoMouseExited

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
        MenuSegurosView menuSeguro = new MenuSegurosView();
        menuSeguro.setLocationRelativeTo(null);
        menuSeguro.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnLimpiarApoderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarApoderadoActionPerformed
        // TODO add your handling code here:
        cmbAseguradora.setSelectedIndex(0);
        cmbTipoSeguro.setSelectedIndex(0);
        txtPrecioSeguro.setText(" ");
        dateChooserFechaEvento.setDate(null);
        dateChooserFechaFin.setDate(null);

    }//GEN-LAST:event_btnLimpiarApoderadoActionPerformed

    private void btnAgregarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseMoved
        // TODO add your handling code here:
        btnAgregar.setBackground((new java.awt.Color(231, 165, 165)));
    }//GEN-LAST:event_btnAgregarMouseMoved

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        // TODO add your handling code here:
        btnAgregar.setBackground((new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_btnAgregarMouseExited

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
            java.util.logging.Logger.getLogger(AgregarSegurosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarSegurosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarSegurosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarSegurosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarSegurosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiarApoderado;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbAseguradora;
    private javax.swing.JComboBox<String> cmbTipoSeguro;
    private com.toedter.calendar.JDateChooser dateChooserFechaEvento;
    private com.toedter.calendar.JDateChooser dateChooserFechaFin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel jpanelRegistrarSeguro;
    private javax.swing.JLabel lblAseguradora;
    private javax.swing.JLabel lblFechaIni;
    private javax.swing.JLabel lblFechaIni1;
    private javax.swing.JLabel lblLogoMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblPrecioSeguro;
    private javax.swing.JLabel lblTipoSeguro;
    private javax.swing.JTextField txtPrecioSeguro;
    // End of variables declaration//GEN-END:variables
}
