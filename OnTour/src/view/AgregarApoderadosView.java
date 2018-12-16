/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Dao.CiudadDAO;
import Dao.ComunaDAO;
import controller.ApoderadosController;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Apoderado;
import model.KeyValue;
import utils.GuiUtils;

/**
 *
 * @author jose_
 */
public class AgregarApoderadosView extends javax.swing.JFrame {

    private ApoderadosController controller = new ApoderadosController();
    private CiudadDAO ciudadDAO = new CiudadDAO();
    private ComunaDAO comunaDAO = new ComunaDAO();

    /**
     * Creates new form AgregarApoderados
     */
    public AgregarApoderadosView() {
        this.setUndecorated(true);
        this.setMinimumSize(new Dimension(520, 940));
        initComponents();
        setIconImage(GuiUtils.getImage("logo1.png"));
        this.cmbCiudad.setModel(ciudadDAO.obtenerCiudades());
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
        jPanel1 = new javax.swing.JPanel();
        btnResgistrarApoderado = new javax.swing.JButton();
        btnLimpiarApoderado = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        LblRutApoderado = new javax.swing.JLabel();
        txtRutApoderado = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        LblNombreApoderado = new javax.swing.JLabel();
        txtNombreApoderado = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtAPaternoApoderado = new javax.swing.JTextField();
        LblAPaterno = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txtAMaternoApoderado = new javax.swing.JTextField();
        LblAMaterno = new javax.swing.JLabel();
        jDateChooserFechaNac = new com.toedter.calendar.JDateChooser();
        LblFNacimiento = new javax.swing.JLabel();
        txtTelefonoApoderado = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        LblTelefono = new javax.swing.JLabel();
        cmbCiudad = new javax.swing.JComboBox<>();
        cmbComuna = new javax.swing.JComboBox<>();
        LblCiudad = new javax.swing.JLabel();
        LblComunaApoderado = new javax.swing.JLabel();
        txtDireccionApoderado = new javax.swing.JTextField();
        LblDireccion = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        txtPassApoderado = new javax.swing.JPasswordField();
        jSeparator8 = new javax.swing.JSeparator();
        LblPassApoderado = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtCorreoApoderado = new javax.swing.JTextField();
        LblCorreoApoderado = new javax.swing.JLabel();
        LblPerfilApoderado = new javax.swing.JLabel();
        RbtPerfilSi = new javax.swing.JRadioButton();
        RbtPerfilNo = new javax.swing.JRadioButton();
        BtnVolver = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        lblMinimizar = new javax.swing.JLabel();
        lblLogoMenu = new javax.swing.JLabel();
        BtnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("On Tour");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnResgistrarApoderado.setBackground(new java.awt.Color(255, 255, 255));
        btnResgistrarApoderado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnResgistrarApoderado.setForeground(new java.awt.Color(12, 161, 215));
        btnResgistrarApoderado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar.png"))); // NOI18N
        btnResgistrarApoderado.setText("Registrar");
        btnResgistrarApoderado.setBorder(null);
        btnResgistrarApoderado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnResgistrarApoderado.setMargin(new java.awt.Insets(2, 4, 2, 14));
        btnResgistrarApoderado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnResgistrarApoderadoMouseMoved(evt);
            }
        });
        btnResgistrarApoderado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnResgistrarApoderadoMouseExited(evt);
            }
        });
        btnResgistrarApoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResgistrarApoderadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnResgistrarApoderado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 720, 330, 60));

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
        jPanel1.add(btnLimpiarApoderado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 800, 150, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(12, 161, 215), 5, true), "Registrar Apoderado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.setLayout(null);

        LblRutApoderado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblRutApoderado.setText("RUT:");
        jPanel2.add(LblRutApoderado);
        LblRutApoderado.setBounds(110, 50, 100, 22);

        txtRutApoderado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtRutApoderado.setBorder(null);
        jPanel2.add(txtRutApoderado);
        txtRutApoderado.setBounds(160, 40, 240, 40);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(110, 80, 290, 20);

        LblNombreApoderado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblNombreApoderado.setText("Nombre: ");
        jPanel2.add(LblNombreApoderado);
        LblNombreApoderado.setBounds(110, 100, 90, 22);

        txtNombreApoderado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNombreApoderado.setBorder(null);
        jPanel2.add(txtNombreApoderado);
        txtNombreApoderado.setBounds(190, 90, 210, 40);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(110, 130, 290, 20);

        txtAPaternoApoderado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAPaternoApoderado.setBorder(null);
        txtAPaternoApoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAPaternoApoderadoActionPerformed(evt);
            }
        });
        jPanel2.add(txtAPaternoApoderado);
        txtAPaternoApoderado.setBounds(190, 140, 210, 40);

        LblAPaterno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblAPaterno.setText("Apellido Paterno:");
        jPanel2.add(LblAPaterno);
        LblAPaterno.setBounds(30, 160, 160, 22);

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4);
        jSeparator4.setBounds(110, 180, 290, 20);

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator5);
        jSeparator5.setBounds(110, 230, 290, 20);

        txtAMaternoApoderado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAMaternoApoderado.setBorder(null);
        jPanel2.add(txtAMaternoApoderado);
        txtAMaternoApoderado.setBounds(190, 190, 210, 40);

        LblAMaterno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblAMaterno.setText("Apellido Materno:");
        jPanel2.add(LblAMaterno);
        LblAMaterno.setBounds(30, 210, 160, 22);

        jDateChooserFechaNac.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserFechaNac.setForeground(new java.awt.Color(255, 255, 255));
        jDateChooserFechaNac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDateChooserFechaNac.setMaxSelectableDate(new java.util.Date(1544500861000L));
        jDateChooserFechaNac.setMinSelectableDate(new java.util.Date(-1577902573000L));
        jPanel2.add(jDateChooserFechaNac);
        jDateChooserFechaNac.setBounds(190, 250, 210, 40);

        LblFNacimiento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblFNacimiento.setText("Fecha Nacimiento:");
        jPanel2.add(LblFNacimiento);
        LblFNacimiento.setBounds(20, 260, 170, 20);

        txtTelefonoApoderado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTelefonoApoderado.setBorder(null);
        jPanel2.add(txtTelefonoApoderado);
        txtTelefonoApoderado.setBounds(190, 290, 210, 40);

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator6);
        jSeparator6.setBounds(110, 330, 290, 20);

        LblTelefono.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblTelefono.setText("Teléfono: ");
        jPanel2.add(LblTelefono);
        LblTelefono.setBounds(100, 310, 100, 22);

        cmbCiudad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Ciudad" }));
        cmbCiudad.setBorder(null);
        cmbCiudad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCiudadItemStateChanged(evt);
            }
        });
        jPanel2.add(cmbCiudad);
        cmbCiudad.setBounds(190, 340, 210, 50);

        cmbComuna.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbComuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Comuna" }));
        jPanel2.add(cmbComuna);
        cmbComuna.setBounds(190, 400, 210, 50);

        LblCiudad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblCiudad.setText("Ciudad:");
        jPanel2.add(LblCiudad);
        LblCiudad.setBounds(120, 350, 80, 22);

        LblComunaApoderado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblComunaApoderado.setText("Comuna: ");
        jPanel2.add(LblComunaApoderado);
        LblComunaApoderado.setBounds(100, 400, 90, 22);

        txtDireccionApoderado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDireccionApoderado.setBorder(null);
        jPanel2.add(txtDireccionApoderado);
        txtDireccionApoderado.setBounds(180, 460, 220, 40);

        LblDireccion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblDireccion.setText("Dirección: ");
        jPanel2.add(LblDireccion);
        LblDireccion.setBounds(90, 480, 110, 22);

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator7);
        jSeparator7.setBounds(110, 500, 290, 20);

        txtPassApoderado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassApoderado.setBorder(null);
        jPanel2.add(txtPassApoderado);
        txtPassApoderado.setBounds(190, 520, 210, 40);

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator8);
        jSeparator8.setBounds(110, 560, 290, 20);

        LblPassApoderado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblPassApoderado.setText("Contraseña:");
        jPanel2.add(LblPassApoderado);
        LblPassApoderado.setBounds(80, 540, 120, 22);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(110, 630, 290, 20);

        txtCorreoApoderado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCorreoApoderado.setBorder(null);
        jPanel2.add(txtCorreoApoderado);
        txtCorreoApoderado.setBounds(180, 590, 220, 40);

        LblCorreoApoderado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblCorreoApoderado.setText("Correo Electrónico:");
        jPanel2.add(LblCorreoApoderado);
        LblCorreoApoderado.setBounds(10, 610, 180, 22);

        LblPerfilApoderado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblPerfilApoderado.setText("Encargado:");
        jPanel2.add(LblPerfilApoderado);
        LblPerfilApoderado.setBounds(80, 670, 110, 22);

        RbtPerfilSi.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RbtPerfilSi);
        RbtPerfilSi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RbtPerfilSi.setText("Sí");
        jPanel2.add(RbtPerfilSi);
        RbtPerfilSi.setBounds(200, 650, 50, 50);

        RbtPerfilNo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RbtPerfilNo);
        RbtPerfilNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RbtPerfilNo.setSelected(true);
        RbtPerfilNo.setText("No");
        jPanel2.add(RbtPerfilNo);
        RbtPerfilNo.setBounds(280, 650, 50, 50);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 450, 710));

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
        jPanel1.add(BtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 800, 140, 60));

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 800, -1, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 520, 890));

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
        jPanel3.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, 30));

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
        jPanel3.add(BtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 30, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAPaternoApoderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAPaternoApoderadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAPaternoApoderadoActionPerformed

    private void cmbCiudadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCiudadItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String comuna = String.valueOf(cmbCiudad.getSelectedItem());
            this.cmbComuna.setModel(comunaDAO.obtenerComunas(comuna));
        }
    }//GEN-LAST:event_cmbCiudadItemStateChanged

    private void btnResgistrarApoderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResgistrarApoderadoActionPerformed

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        try {

            int rutApod = Integer.parseInt(txtRutApoderado.getText());

            String nombre = txtNombreApoderado.getText();
            String ap = txtAPaternoApoderado.getText();
            String am = txtAMaternoApoderado.getText();

            String fechaNac = formato.format(jDateChooserFechaNac.getDate());
            int tel = Integer.parseInt(txtTelefonoApoderado.getText());

            KeyValue comuna = (KeyValue) cmbComuna.getSelectedItem();
            int idcomuna = comuna.getId();

            String direccion = txtDireccionApoderado.getText();
            String contrasena = String.valueOf(txtPassApoderado.getPassword());
            String correo = txtCorreoApoderado.getText();

            boolean encargado = false;

            if (RbtPerfilSi.isSelected()) {
                encargado = true;
            }

            Apoderado apoderado = new Apoderado();
            apoderado.setRut(rutApod);
            apoderado.setNombres(nombre);
            apoderado.setContrasena(contrasena);
            apoderado.setaPaterno(ap);
            apoderado.setaMaterno(am);
            apoderado.setFechaNacimiento(fechaNac);
            apoderado.setTelefono(tel);
            apoderado.setContrasena(contrasena);
            apoderado.setCorreo(correo);
            apoderado.setDireccion(direccion);
            apoderado.setEncargado(encargado);
            apoderado.setIdComuna(idcomuna);

            controller.agregarApoderado(apoderado);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnResgistrarApoderadoActionPerformed

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

    private void BtnVolverMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVolverMouseMoved
        // TODO add your handling code here:
        BtnVolver.setBackground((new java.awt.Color(231, 165, 165)));
    }//GEN-LAST:event_BtnVolverMouseMoved

    private void BtnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVolverMouseExited
        // TODO add your handling code here:
        BtnVolver.setBackground((new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_BtnVolverMouseExited

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MenuApoderadoView MenuPrin = new MenuApoderadoView();
        MenuPrin.setLocationRelativeTo(null);
        MenuPrin.setVisible(true);
    }//GEN-LAST:event_BtnVolverActionPerformed

    private void btnResgistrarApoderadoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResgistrarApoderadoMouseMoved
        // TODO add your handling code here:
        btnResgistrarApoderado.setBackground((new java.awt.Color(231, 165, 165)));
    }//GEN-LAST:event_btnResgistrarApoderadoMouseMoved

    private void btnResgistrarApoderadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResgistrarApoderadoMouseExited
        // TODO add your handling code here:
        btnResgistrarApoderado.setBackground((new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_btnResgistrarApoderadoMouseExited

    private void btnLimpiarApoderadoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarApoderadoMouseMoved
        // TODO add your handling code here:
        btnLimpiarApoderado.setBackground((new java.awt.Color(231, 165, 165)));
    }//GEN-LAST:event_btnLimpiarApoderadoMouseMoved

    private void btnLimpiarApoderadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarApoderadoMouseExited
        // TODO add your handling code here:
        btnLimpiarApoderado.setBackground((new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_btnLimpiarApoderadoMouseExited

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
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnVolver;
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
    private javax.swing.JButton btnLimpiarApoderado;
    private javax.swing.JButton btnResgistrarApoderado;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbCiudad;
    private javax.swing.JComboBox<String> cmbComuna;
    private com.toedter.calendar.JDateChooser jDateChooserFechaNac;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblLogoMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JTextField txtAMaternoApoderado;
    private javax.swing.JTextField txtAPaternoApoderado;
    private javax.swing.JTextField txtCorreoApoderado;
    private javax.swing.JTextField txtDireccionApoderado;
    private javax.swing.JTextField txtNombreApoderado;
    private javax.swing.JPasswordField txtPassApoderado;
    private javax.swing.JTextField txtRutApoderado;
    private javax.swing.JTextField txtTelefonoApoderado;
    // End of variables declaration//GEN-END:variables
}
