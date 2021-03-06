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
import javax.swing.JOptionPane;
import model.Apoderado;
import model.Ciudad;
import model.Comuna;
import model.KeyValue;
import utils.GuiUtils;

/**
 *
 * @author corellana
 */
public class ModificarApoderadoView extends javax.swing.JFrame {

    private ApoderadosController controller = new ApoderadosController();
    private CiudadDAO ciudadDAO = new CiudadDAO();
    private ComunaDAO comunaDAO = new ComunaDAO();
    private Apoderado ApoderadoActual = null;

    /**
     * Creates new form ModificarApoderadoView
     */
    /**
     *
     * @param rutApoderado rutApoderado
     */
    public ModificarApoderadoView(int rutApoderado) {
        this.setUndecorated(true);
        this.setMinimumSize(new Dimension(580, 831));
        initComponents();
        setIconImage(GuiUtils.getImage("logo1.png"));
        this.cmbCiudad.setModel(ciudadDAO.obtenerCiudades());
        if (rutApoderado > 0) {
            this.txtRut.setText(String.valueOf(rutApoderado));
            this.btnBuscarxRut.doClick();
        }
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
        jPanel3 = new javax.swing.JPanel();
        lblLogoMenu = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        BtnCerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnBuscarxRut = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtRut = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtAppPaterno = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtAppMaterno = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        txtFNacimiento = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        cmbCiudad = new javax.swing.JComboBox<>();
        cmbComuna = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        txtContrasena = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        txtCorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        rbtPerfilSi = new javax.swing.JRadioButton();
        rbtPerfilNo = new javax.swing.JRadioButton();
        btnmodificar = new javax.swing.JButton();
        lblmensaje = new javax.swing.JLabel();
        BtnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogoMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLogoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        lblLogoMenu.setText("On Tour");
        jPanel3.add(lblLogoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

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
        jPanel3.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, 30));

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
        jPanel3.add(BtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 30, 30));

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 580, 50);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(12, 161, 215), 5, true), "Modificar Apoderado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarxRut.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarxRut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBuscarxRut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ShearchApoderado.png"))); // NOI18N
        btnBuscarxRut.setText("Buscar");
        btnBuscarxRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarxRutActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarxRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 170, 60));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 300, 10));

        txtRut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtRut.setBorder(null);
        jPanel1.add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 160, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Rut Apoderado:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 120, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 110, 480, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 70, -1));

        txtNombreUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNombreUsuario.setBorder(null);
        jPanel1.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 228, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 270, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Apellido Paterno:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 130, -1));

        txtAppPaterno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAppPaterno.setBorder(null);
        jPanel1.add(txtAppPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 228, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 300, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Apellido Materno:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 130, -1));

        txtAppMaterno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAppMaterno.setBorder(null);
        jPanel1.add(txtAppMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 228, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 300, 10));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Fecha de Nacimiento:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 150, -1));

        txtFNacimiento.setEditable(false);
        txtFNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        txtFNacimiento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtFNacimiento.setBorder(null);
        jPanel1.add(txtFNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 228, 30));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 300, 10));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Telefono:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 70, 14));

        txtTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTelefono.setBorder(null);
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 228, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 300, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Ciudad:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 60, 20));

        cmbCiudad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Ciudad" }));
        cmbCiudad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCiudadItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 228, 30));

        cmbComuna.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbComuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Comuna" }));
        jPanel1.add(cmbComuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 228, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Comuna:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 70, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Dirección:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 70, -1));

        txtDireccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDireccion.setBorder(null);
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 228, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 300, 10));

        txtContrasena.setEditable(false);
        txtContrasena.setBackground(new java.awt.Color(255, 255, 255));
        txtContrasena.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtContrasena.setBorder(null);
        jPanel1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 228, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Contraseña:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 90, -1));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 300, 10));

        txtCorreo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCorreo.setBorder(null);
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 228, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Correo Electronico:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 140, -1));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 300, 10));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Encargado:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 90, -1));

        rbtPerfilSi.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtPerfilSi);
        rbtPerfilSi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtPerfilSi.setText("Si");
        jPanel1.add(rbtPerfilSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 50, -1));

        rbtPerfilNo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtPerfilNo);
        rbtPerfilNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtPerfilNo.setText("No");
        jPanel1.add(rbtPerfilNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 50, -1));

        btnmodificar.setBackground(new java.awt.Color(255, 255, 255));
        btnmodificar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnmodificar.setText("Modificar Apoderado");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 610, 290, 50));

        lblmensaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmensaje.setForeground(new java.awt.Color(255, 51, 0));
        jPanel1.add(lblmensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 340, 20));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 500, 690));

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
        jPanel2.add(BtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 710, 120, -1));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 50, 580, 780);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarxRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarxRutActionPerformed
        lblmensaje.setText("");
        try {
            //Obtener apoderado
            String rut = txtRut.getText();

            Apoderado apo = this.controller.buscarApoderadoPorRut(Integer.parseInt(rut));
            ApoderadoActual = this.controller.buscarApoderadoPorRut(Integer.parseInt(rut));
            txtNombreUsuario.setText(String.valueOf(apo.getNombres()));
            txtAppPaterno.setText(String.valueOf(apo.getaPaterno()));
            txtAppMaterno.setText(String.valueOf(apo.getaMaterno()));
            txtFNacimiento.setText(String.valueOf(apo.getFechaNacimiento()));
            txtTelefono.setText(String.valueOf(apo.getTelefono()));
            txtDireccion.setText(String.valueOf(apo.getDireccion()));
            txtCorreo.setText(String.valueOf(apo.getCorreo()));

            Comuna comuna = comunaDAO.obtenerComunaPorId(ApoderadoActual.getIdComuna());
            Ciudad ciudad = ciudadDAO.obtenerCiudadPorId(comuna.getIdCiudad());

            cmbCiudad.setSelectedItem(new KeyValue(ciudad.getId(), ciudad.getNombre()));
            this.cmbComuna.setModel(comunaDAO.obtenerComunas(ciudad.getNombre()));
            cmbComuna.setSelectedItem(new KeyValue(comuna.getId(), comuna.getNombre()));
//            int idComuna = apo.getIdComuna();
//            Comuna comuna = comunaDAO.obtenerComunaPorId(idComuna);
//            Ciudad ciudad = ciudadDAO.obtenerCiudadPorId(comuna.getIdCiudad());
//            cmbCiudad.setSelectedItem(ciudad.getNombre());
//            this.cmbComuna.setModel(comunaDAO.obtenerComunas(ciudad.getNombre()));
//            cmbComuna.setSelectedItem(new KeyValue(comuna.getId(), comuna.getNombre()));

            txtContrasena.setText(String.valueOf(apo.getContrasena()));
            rbtPerfilNo.setActionCommand("NO");

            if (apo.isEncargado()) {
                rbtPerfilSi.setSelected(true);
            } else {
                rbtPerfilNo.setSelected(true);
            }
        } catch (Exception e) {
            lblmensaje.setText("El Objeto de Busqueda, no existe.");
        }
    }//GEN-LAST:event_btnBuscarxRutActionPerformed

    private void cmbCiudadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCiudadItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String ciudad = String.valueOf(cmbCiudad.getSelectedItem());
            this.cmbComuna.setModel(comunaDAO.obtenerComunas(ciudad));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCiudadItemStateChanged

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        try {
            int rut = Integer.parseInt(txtRut.getText());
            String nombre = txtNombreUsuario.getText();
            String aPaterno = txtAppPaterno.getText();
            String aMaterno = txtAppMaterno.getText();

            if (txtTelefono.getText().length() != 9) {
                throw new Exception("Número de teléfono invalido");
            }

            int telefono = Integer.parseInt(txtTelefono.getText());
            String fnacimiento = txtFNacimiento.getText();

            KeyValue comuna = (KeyValue) cmbComuna.getSelectedItem();

            if ("Seleccione Comuna".equals(comuna.getText())) {
                throw new Exception("Seleccione Ciudad y Comuna");
            }

            int idcomuna = comuna.getId();

            String direccion = txtDireccion.getText();
            String contrasena = String.valueOf(txtContrasena.getPassword());
            String correo = txtCorreo.getText();

            boolean encargado = false;

            if (rbtPerfilSi.isSelected()) {
                encargado = true;
            }

            Apoderado apo = new Apoderado(rut, contrasena, idcomuna, nombre, aPaterno, aMaterno, fnacimiento, telefono, encargado, direccion, correo);
            System.out.println(apo);
            this.controller.actualizarApoderado(apo);
            lblmensaje.setText("Apoderado Modificado Correctamente.");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }


    }//GEN-LAST:event_btnmodificarActionPerformed

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
        MenuApoderadoView MenuApode = new MenuApoderadoView();
        MenuApode.setLocationRelativeTo(null);
        MenuApode.setVisible(true);
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
            java.util.logging.Logger.getLogger(ModificarApoderadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarApoderadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarApoderadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarApoderadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarApoderadoView(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JButton btnBuscarxRut;
    private javax.swing.JButton btnmodificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbCiudad;
    private javax.swing.JComboBox<String> cmbComuna;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
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
    private javax.swing.JLabel lblmensaje;
    private javax.swing.JRadioButton rbtPerfilNo;
    private javax.swing.JRadioButton rbtPerfilSi;
    private javax.swing.JTextField txtAppMaterno;
    private javax.swing.JTextField txtAppPaterno;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFNacimiento;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
