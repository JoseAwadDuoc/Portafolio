/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Dao.AutenticacionDAO;
import java.awt.Color;
import model.RepresentanteAgencia;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import utils.GuiUtils;

/**
 *
 * @author jose_
 */
public class MenuPrincipalView extends javax.swing.JFrame {

    private boolean menuLeftShow = false;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipalView() {
        this.setUndecorated(true);
        this.setMinimumSize(new Dimension(860, 670));
        initComponents();
//        setExtendedState(MAXIMIZED_BOTH);
        UIManager.put("TextField.background", Color.WHITE);
        UIManager.put("TextField.border", BorderFactory.createCompoundBorder(
                new AutenticacionView.CustomeBorder(),
                new EmptyBorder(new Insets(4, 4, 4, 4))));
        this.getContentPane().setBackground(Color.white);
//        this.jMenuBar1.setBackground(new Color(12, 161, 215));
//        this.jPanel2.setBackground(new Color(12,161,215));
        jPanel1.setBackground(Color.white);

        jPanel5.setVisible(menuLeftShow);

        setIconImage(GuiUtils.getImage("logo1.png"));
        RepresentanteAgencia rp = new RepresentanteAgencia();
        LblMensajeBienvenido1.setText(AutenticacionDAO.RP.getNombre() + " " + AutenticacionDAO.RP.getaPaterno());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblLogoMenu = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        BtnCerrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMantenedorSeguros = new javax.swing.JLabel();
        lblTextGestionarSeguros = new javax.swing.JLabel();
        lblMantenedorContratos = new javax.swing.JLabel();
        lblTextMantenedorContratos = new javax.swing.JLabel();
        lblEstadoCuenta = new javax.swing.JLabel();
        lblDepositos = new javax.swing.JLabel();
        lblTextDepositos = new javax.swing.JLabel();
        lblTextEstadoCuenta = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblCerrarSesion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LblMensajeBienvenido1 = new javax.swing.JLabel();
        LblMensajeBienvenido = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblMenuApoderados = new javax.swing.JLabel();
        lblMenuAlumnos = new javax.swing.JLabel();
        lblMenuColegios = new javax.swing.JLabel();
        lblMenuTipoSeguros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("On Tour");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("AGA Arabesque", 1, 36)); // NOI18N
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
        jPanel3.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, -1, 30));

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
        jPanel3.add(BtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 30, 30));

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 860, 50);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(12, 161, 215));
        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Menus.png"))); // NOI18N
        lblMenu.setText("Menú");
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });
        jPanel4.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 130, 70));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(12, 161, 215)));
        jPanel1.setLayout(null);

        lblMantenedorSeguros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMantenedorSeguros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Safe1.png"))); // NOI18N
        lblMantenedorSeguros.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblMantenedorSegurosMouseMoved(evt);
            }
        });
        lblMantenedorSeguros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMantenedorSegurosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMantenedorSegurosMouseExited(evt);
            }
        });
        jPanel1.add(lblMantenedorSeguros);
        lblMantenedorSeguros.setBounds(40, 20, 170, 180);

        lblTextGestionarSeguros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTextGestionarSeguros.setForeground(new java.awt.Color(12, 161, 215));
        lblTextGestionarSeguros.setText("SEGUROS");
        jPanel1.add(lblTextGestionarSeguros);
        lblTextGestionarSeguros.setBounds(90, 180, 80, 17);

        lblMantenedorContratos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMantenedorContratos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ContractIcon.png"))); // NOI18N
        lblMantenedorContratos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblMantenedorContratosMouseMoved(evt);
            }
        });
        lblMantenedorContratos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMantenedorContratosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMantenedorContratosMouseExited(evt);
            }
        });
        jPanel1.add(lblMantenedorContratos);
        lblMantenedorContratos.setBounds(230, 20, 170, 180);

        lblTextMantenedorContratos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTextMantenedorContratos.setForeground(new java.awt.Color(12, 161, 215));
        lblTextMantenedorContratos.setText("CONTRATOS");
        jPanel1.add(lblTextMantenedorContratos);
        lblTextMantenedorContratos.setBounds(260, 170, 100, 20);

        lblEstadoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstadoCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/StatusMoney.png"))); // NOI18N
        lblEstadoCuenta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblEstadoCuentaMouseMoved(evt);
            }
        });
        lblEstadoCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEstadoCuentaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEstadoCuentaMouseExited(evt);
            }
        });
        jPanel1.add(lblEstadoCuenta);
        lblEstadoCuenta.setBounds(40, 210, 170, 180);

        lblDepositos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDepositos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Depositos.png"))); // NOI18N
        lblDepositos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblDepositosMouseMoved(evt);
            }
        });
        lblDepositos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDepositosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDepositosMouseExited(evt);
            }
        });
        jPanel1.add(lblDepositos);
        lblDepositos.setBounds(230, 210, 170, 180);

        lblTextDepositos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTextDepositos.setForeground(new java.awt.Color(12, 161, 215));
        lblTextDepositos.setText("DEPÓSITOS");
        jPanel1.add(lblTextDepositos);
        lblTextDepositos.setBounds(270, 350, 90, 40);

        lblTextEstadoCuenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTextEstadoCuenta.setForeground(new java.awt.Color(12, 161, 215));
        lblTextEstadoCuenta.setText("ESTADO DE CUENTAS");
        jPanel1.add(lblTextEstadoCuenta);
        lblTextEstadoCuenta.setBounds(50, 360, 160, 30);

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 440, 420));

        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logout1.png"))); // NOI18N
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });
        jPanel4.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 70, 80));

        lblCerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCerrarSesion.setText("Cerrar Sesión");
        jPanel4.add(lblCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 130, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        LblMensajeBienvenido1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LblMensajeBienvenido1.setText("--------------");
        jPanel2.add(LblMensajeBienvenido1);
        LblMensajeBienvenido1.setBounds(30, 70, 227, 44);

        LblMensajeBienvenido.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LblMensajeBienvenido.setText("BIENVENIDO!");
        jPanel2.add(LblMensajeBienvenido);
        LblMensajeBienvenido.setBounds(10, 20, 270, 44);

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 350, 120));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo1.png"))); // NOI18N
        jPanel4.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 200, 150));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenuApoderados.setBackground(new java.awt.Color(255, 255, 255));
        lblMenuApoderados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMenuApoderados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ApoderadosMenu.png"))); // NOI18N
        lblMenuApoderados.setText("Apoderados");
        lblMenuApoderados.setOpaque(true);
        lblMenuApoderados.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblMenuApoderadosMouseMoved(evt);
            }
        });
        lblMenuApoderados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuApoderadosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenuApoderadosMouseExited(evt);
            }
        });
        jPanel5.add(lblMenuApoderados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 60));

        lblMenuAlumnos.setBackground(new java.awt.Color(255, 255, 255));
        lblMenuAlumnos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMenuAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EstudiantesMenu.png"))); // NOI18N
        lblMenuAlumnos.setText("Alumnos");
        lblMenuAlumnos.setOpaque(true);
        lblMenuAlumnos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblMenuAlumnosMouseMoved(evt);
            }
        });
        lblMenuAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuAlumnosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenuAlumnosMouseExited(evt);
            }
        });
        jPanel5.add(lblMenuAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 170, 70));

        lblMenuColegios.setBackground(new java.awt.Color(255, 255, 255));
        lblMenuColegios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMenuColegios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ColegiosMenu.png"))); // NOI18N
        lblMenuColegios.setText("Colegios");
        lblMenuColegios.setOpaque(true);
        lblMenuColegios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblMenuColegiosMouseMoved(evt);
            }
        });
        lblMenuColegios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuColegiosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenuColegiosMouseExited(evt);
            }
        });
        jPanel5.add(lblMenuColegios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 170, 80));

        lblMenuTipoSeguros.setBackground(new java.awt.Color(255, 255, 255));
        lblMenuTipoSeguros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMenuTipoSeguros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TipoSeguro.png"))); // NOI18N
        lblMenuTipoSeguros.setText("Tipo Seguros");
        lblMenuTipoSeguros.setOpaque(true);
        lblMenuTipoSeguros.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblMenuTipoSegurosMouseMoved(evt);
            }
        });
        lblMenuTipoSeguros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuTipoSegurosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenuTipoSegurosMouseExited(evt);
            }
        });
        jPanel5.add(lblMenuTipoSeguros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 170, 70));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 180, 350));

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 50, 860, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        int input = JOptionPane.showConfirmDialog(null, "¿Seguro deseas Cerrar Sesion?");
        if (input == 0) {
            JOptionPane.showMessageDialog(this, "Sesión Cerrada con éxito");
            this.setVisible(false);
            AutenticacionView Autenti = new AutenticacionView();
            Autenti.setLocationRelativeTo(null);
            Autenti.setVisible(true);
        } else {

        }
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblMantenedorContratosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMantenedorContratosMouseExited
        // TODO add your handling code here:
        lblMantenedorContratos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lblMantenedorContratosMouseExited

    private void lblMantenedorContratosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMantenedorContratosMouseClicked
        // TODO add your handling code here:
        MenuContratosView ConsultContr = new MenuContratosView();
        this.setVisible(false);
        ConsultContr.setLocationRelativeTo(null);
        ConsultContr.setVisible(true);
    }//GEN-LAST:event_lblMantenedorContratosMouseClicked

    private void lblMantenedorContratosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMantenedorContratosMouseMoved
        // TODO add your handling code here:
        lblMantenedorContratos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 161, 215)));
    }//GEN-LAST:event_lblMantenedorContratosMouseMoved

    private void lblMantenedorSegurosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMantenedorSegurosMouseMoved
        // TODO add your handling code here:
        lblMantenedorSeguros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 161, 215)));
    }//GEN-LAST:event_lblMantenedorSegurosMouseMoved

    private void lblMantenedorSegurosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMantenedorSegurosMouseClicked
        // TODO add your handling code here:
        MenuSegurosView menuSeguros = new MenuSegurosView();
        this.setVisible(false);
        menuSeguros.setLocationRelativeTo(null);
        menuSeguros.setVisible(true);
    }//GEN-LAST:event_lblMantenedorSegurosMouseClicked

    private void lblMantenedorSegurosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMantenedorSegurosMouseExited
        // TODO add your handling code here:
        lblMantenedorSeguros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lblMantenedorSegurosMouseExited

    private void lblEstadoCuentaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEstadoCuentaMouseMoved
        // TODO add your handling code here:
        lblEstadoCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 161, 215)));
    }//GEN-LAST:event_lblEstadoCuentaMouseMoved

    private void lblEstadoCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEstadoCuentaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblEstadoCuentaMouseClicked

    private void lblEstadoCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEstadoCuentaMouseExited
        // TODO add your handling code here:
        lblEstadoCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lblEstadoCuentaMouseExited

    private void lblDepositosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDepositosMouseMoved
        // TODO add your handling code here:
        lblDepositos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 161, 215)));
    }//GEN-LAST:event_lblDepositosMouseMoved

    private void lblDepositosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDepositosMouseClicked
        // TODO add your handling code here:
        MenuDepositosView menuDepositos = new MenuDepositosView();
        this.setVisible(false);
        menuDepositos.setLocationRelativeTo(null);
        menuDepositos.setVisible(true);
    }//GEN-LAST:event_lblDepositosMouseClicked

    private void lblDepositosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDepositosMouseExited
        // TODO add your handling code here:
        lblDepositos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lblDepositosMouseExited


    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        // TODO add your handling code here:lblMenu
        menuLeftShow = !menuLeftShow;
        jPanel5.setVisible(menuLeftShow);
    }//GEN-LAST:event_lblMenuMouseClicked

    private void lblMenuApoderadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuApoderadosMouseClicked
        // TODO add your handling code here:
        MenuApoderadoView listApod = new MenuApoderadoView();
        this.setVisible(false);
        listApod.setLocationRelativeTo(null);
        listApod.setVisible(true);
    }//GEN-LAST:event_lblMenuApoderadosMouseClicked

    private void lblMenuApoderadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuApoderadosMouseExited
        // TODO add your handling code here:
        lblMenuApoderados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lblMenuApoderados.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_lblMenuApoderadosMouseExited

    private void lblMenuApoderadosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuApoderadosMouseMoved
        // TODO add your handling code here:
        lblMenuApoderados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 161, 215)));
        lblMenuApoderados.setBackground(new Color(100, 196, 230));
    }//GEN-LAST:event_lblMenuApoderadosMouseMoved

    private void lblMenuAlumnosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuAlumnosMouseMoved
        // TODO add your handling code here:
        lblMenuAlumnos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 161, 215)));
        lblMenuAlumnos.setBackground(new Color(100, 196, 230));
    }//GEN-LAST:event_lblMenuAlumnosMouseMoved

    private void lblMenuAlumnosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuAlumnosMouseExited
        // TODO add your handling code here:
        lblMenuAlumnos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lblMenuAlumnos.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_lblMenuAlumnosMouseExited

    private void lblMenuColegiosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuColegiosMouseExited
        // TODO add your handling code here:
        lblMenuColegios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lblMenuColegios.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_lblMenuColegiosMouseExited

    private void lblMenuColegiosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuColegiosMouseMoved
        // TODO add your handling code here:
        lblMenuColegios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 161, 215)));
        lblMenuColegios.setBackground(new Color(100, 196, 230));
    }//GEN-LAST:event_lblMenuColegiosMouseMoved

    private void lblMenuTipoSegurosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuTipoSegurosMouseExited
        // TODO add your handling code here:
        lblMenuTipoSeguros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lblMenuTipoSeguros.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_lblMenuTipoSegurosMouseExited

    private void lblMenuTipoSegurosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuTipoSegurosMouseMoved
        // TODO add your handling code here:
        lblMenuTipoSeguros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 161, 215)));
        lblMenuTipoSeguros.setBackground(new Color(100, 196, 230));
    }//GEN-LAST:event_lblMenuTipoSegurosMouseMoved

    private void lblMenuTipoSegurosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuTipoSegurosMouseClicked
        // TODO add your handling code here:
        AgregarTipoSegurosView tipoSeg = new AgregarTipoSegurosView();
        this.setVisible(false);
        tipoSeg.setLocationRelativeTo(null);
        tipoSeg.setVisible(true);
    }//GEN-LAST:event_lblMenuTipoSegurosMouseClicked

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

    private void lblMenuColegiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuColegiosMouseClicked
        // TODO add your handling code here:
        MenuColegioView menuColegio = new MenuColegioView();
        this.setVisible(false);
        menuColegio.setLocationRelativeTo(null);
        menuColegio.setVisible(true);
    }//GEN-LAST:event_lblMenuColegiosMouseClicked

    private void lblMenuAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuAlumnosMouseClicked
        // TODO add your handling code here:
        MenuAlumnosView menuAlumnos = new MenuAlumnosView();
        this.setVisible(false);
        menuAlumnos.setLocationRelativeTo(null);
        menuAlumnos.setVisible(true);
    }//GEN-LAST:event_lblMenuAlumnosMouseClicked

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
            java.util.logging.Logger.getLogger(MenuPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JLabel LblMensajeBienvenido;
    private javax.swing.JLabel LblMensajeBienvenido1;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblDepositos;
    private javax.swing.JLabel lblEstadoCuenta;
    private javax.swing.JLabel lblLogoMenu;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblMantenedorContratos;
    private javax.swing.JLabel lblMantenedorSeguros;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMenuAlumnos;
    private javax.swing.JLabel lblMenuApoderados;
    private javax.swing.JLabel lblMenuColegios;
    private javax.swing.JLabel lblMenuTipoSeguros;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblTextDepositos;
    private javax.swing.JLabel lblTextEstadoCuenta;
    private javax.swing.JLabel lblTextGestionarSeguros;
    private javax.swing.JLabel lblTextMantenedorContratos;
    // End of variables declaration//GEN-END:variables
}
