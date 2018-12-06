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
        this.setMinimumSize(new Dimension(500, 620));
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo1.png")).getImage());
        this.comboAseguradora.setModel(aseguradoraDAO.obtenerAseguradoras());
        this.comboTipoSeguro.setModel(tipoSeguroDAO.obtenerTipoSeguros());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelRegistrarSeguro = new javax.swing.JPanel();
        lblTipoSeguro = new javax.swing.JLabel();
        comboTipoSeguro = new javax.swing.JComboBox<>();
        lblAseguradora = new javax.swing.JLabel();
        comboAseguradora = new javax.swing.JComboBox<>();
        lblFechaIni = new javax.swing.JLabel();
        dateChooserFechaEvento = new com.toedter.calendar.JDateChooser();
        lblPrecioSeguro = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        BtnBorrarcampos = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        txtPrecioSeguro = new javax.swing.JTextField();
        lblFechaIni1 = new javax.swing.JLabel();
        dateChooserFechaFin = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("On Tour");
        getContentPane().setLayout(null);

        jpanelRegistrarSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Registrar Seguro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jpanelRegistrarSeguro.setLayout(null);

        lblTipoSeguro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTipoSeguro.setText("Tipo de seguro:");
        jpanelRegistrarSeguro.add(lblTipoSeguro);
        lblTipoSeguro.setBounds(20, 110, 140, 20);

        comboTipoSeguro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpanelRegistrarSeguro.add(comboTipoSeguro);
        comboTipoSeguro.setBounds(150, 100, 200, 40);

        lblAseguradora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAseguradora.setText("Aseguradora:");
        jpanelRegistrarSeguro.add(lblAseguradora);
        lblAseguradora.setBounds(30, 50, 94, 20);

        comboAseguradora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpanelRegistrarSeguro.add(comboAseguradora);
        comboAseguradora.setBounds(150, 40, 200, 40);

        lblFechaIni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFechaIni.setText("Fecha Inicio : ");
        jpanelRegistrarSeguro.add(lblFechaIni);
        lblFechaIni.setBounds(40, 210, 95, 20);
        jpanelRegistrarSeguro.add(dateChooserFechaEvento);
        dateChooserFechaEvento.setBounds(150, 200, 200, 30);

        lblPrecioSeguro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrecioSeguro.setText("Precio:");
        jpanelRegistrarSeguro.add(lblPrecioSeguro);
        lblPrecioSeguro.setBounds(80, 160, 47, 20);

        lblMonto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jpanelRegistrarSeguro.add(lblMonto);
        lblMonto.setBounds(180, 280, 190, 30);

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar.png"))); // NOI18N
        btnAgregar.setText("Guardar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jpanelRegistrarSeguro.add(btnAgregar);
        btnAgregar.setBounds(120, 300, 260, 50);

        BtnBorrarcampos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnBorrarcampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Limpiar.png"))); // NOI18N
        BtnBorrarcampos.setText("Limpiar");
        BtnBorrarcampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarcamposActionPerformed(evt);
            }
        });
        jpanelRegistrarSeguro.add(BtnBorrarcampos);
        BtnBorrarcampos.setBounds(120, 380, 120, 40);

        BtnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Return.png"))); // NOI18N
        BtnCancelar.setText("Volver");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        jpanelRegistrarSeguro.add(BtnCancelar);
        BtnCancelar.setBounds(250, 380, 130, 40);
        jpanelRegistrarSeguro.add(txtPrecioSeguro);
        txtPrecioSeguro.setBounds(150, 150, 200, 30);

        lblFechaIni1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFechaIni1.setText("Fecha Fin : ");
        jpanelRegistrarSeguro.add(lblFechaIni1);
        lblFechaIni1.setBounds(60, 260, 77, 20);
        jpanelRegistrarSeguro.add(dateChooserFechaFin);
        dateChooserFechaFin.setBounds(150, 250, 200, 30);

        getContentPane().add(jpanelRegistrarSeguro);
        jpanelRegistrarSeguro.setBounds(20, 50, 440, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBorrarcamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarcamposActionPerformed
//        ComboPaquete.setSelectedIndex(0);
        comboAseguradora.setSelectedIndex(0);
        comboTipoSeguro.setSelectedIndex(0);
//        ComboCurso.setSelectedIndex(0);
        dateChooserFechaEvento.setDate(null);
        lblPrecioSeguro.setText(" ");

// TODO add your handling code here:
    }//GEN-LAST:event_BtnBorrarcamposActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        try {

            String cmbseg = String.valueOf(comboAseguradora.getSelectedItem());
            String cmbseg1 = aseguradoraDAO.obtenerIdAseguradora(cmbseg);
            int idaseguradora = Integer.parseInt(cmbseg1);
            System.out.println("id aseguradora : " + idaseguradora);

            String cmbseg2 = String.valueOf(comboTipoSeguro.getSelectedItem());
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
            }else{
                JOptionPane.showMessageDialog(this, "El seguro no se pudo registrar", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

// TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MenuSegurosView menuSeguro = new MenuSegurosView();
        menuSeguro.setLocationRelativeTo(null);
        menuSeguro.setVisible(true);
    }//GEN-LAST:event_BtnCancelarActionPerformed

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
    private javax.swing.JButton BtnBorrarcampos;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> comboAseguradora;
    private javax.swing.JComboBox<String> comboTipoSeguro;
    private com.toedter.calendar.JDateChooser dateChooserFechaEvento;
    private com.toedter.calendar.JDateChooser dateChooserFechaFin;
    private javax.swing.JPanel jpanelRegistrarSeguro;
    private javax.swing.JLabel lblAseguradora;
    private javax.swing.JLabel lblFechaIni;
    private javax.swing.JLabel lblFechaIni1;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblPrecioSeguro;
    private javax.swing.JLabel lblTipoSeguro;
    private javax.swing.JTextField txtPrecioSeguro;
    // End of variables declaration//GEN-END:variables
}
