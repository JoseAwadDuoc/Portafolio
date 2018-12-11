/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import model.Comuna;
import model.KeyValue;

/**
 *
 * @author jose_
 */
public class ComunaDAO extends DbUtilidades {

    public DefaultComboBoxModel obtenerComunas(String ciudad) {
        DefaultComboBoxModel listaComuna = new DefaultComboBoxModel();
        listaComuna.addElement(new KeyValue(-1, "Seleccione Comuna"));
        ResultSet rs = this.consulta("SELECT * FROM COMUNA co join CIUDAD cu on(co.IDCIUDAD=cu.IDCIUDAD)" + "WHERE cu.NOMBRE_CIUDAD = '" + ciudad + "'");
        try {
            while (rs.next()) {
                int id = rs.getInt("IDCOMUNA");
                String text = rs.getString("NOMBRE_COMUNA");
                listaComuna.addElement(new KeyValue(id, text));
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listaComuna;
    }

    public Comuna obtenerComunaPorId(int idComuna) {
        ResultSet rs = this.consulta("Select * from COMUNA where IDCOMUNA = " +  idComuna);
        Comuna comuna = null;
        try {
            while (rs.next()) {
                comuna = new Comuna();
                comuna.setId(rs.getInt("IDCOMUNA"));
                comuna.setNombre(rs.getString("NOMBRE_COMUNA"));
                comuna.setIdCiudad(rs.getInt("IDCIUDAD"));
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return comuna;
    }
}
