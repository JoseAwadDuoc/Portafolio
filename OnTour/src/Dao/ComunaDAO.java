/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author jose_
 */
public class ComunaDAO extends DbUtilidades {

    public DefaultComboBoxModel obtenerComuna(String comuna) {
        DefaultComboBoxModel listaComuna = new DefaultComboBoxModel();
        listaComuna.addElement("Seleccione Comuna ");
        ResultSet rs = this.consulta("SELECT * FROM COMUNA co join CIUDAD cu on(co.IDCIUDAD=cu.IDCIUDAD)" 
                + "WHERE cu.NOMBRE_CIUDAD = '" + comuna + "'");

        try {
            while (rs.next()) {
                listaComuna.addElement(rs.getString("NOMBRE_COMUNA"));

            }
            rs.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listaComuna;

    }
    
        public String obtenerIdComuna(String nombreComuna) {

        ResultSet rs = this.consulta("Select * from COMUNA where NOMBRE_COMUNA = '" + nombreComuna + "'");
        String idcomuna = new String();
        try {
            while (rs.next()) {
                idcomuna = rs.getString("IDCOMUNA");

            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return idcomuna;
    }

}
