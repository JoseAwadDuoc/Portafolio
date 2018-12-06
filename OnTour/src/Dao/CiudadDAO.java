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
public class CiudadDAO extends DbUtilidades {

    public DefaultComboBoxModel obtenerCiudad() {
        DefaultComboBoxModel listaCiudad = new DefaultComboBoxModel();
        listaCiudad.addElement("Seleccione Ciudad");
        ResultSet rs = this.consulta("SELECT * FROM CIUDAD ORDER BY NOMBRE_CIUDAD ASC");

        try {
            while (rs.next()) {
                listaCiudad.addElement(rs.getString("NOMBRE_CIUDAD"));

            }
            rs.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listaCiudad;
    }
}
