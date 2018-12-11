/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import model.Ciudad;
import model.KeyValue;

/**
 *
 * @author jose_
 */
public class CiudadDAO extends DbUtilidades {

    public DefaultComboBoxModel obtenerCiudades() {
        DefaultComboBoxModel listaCiudad = new DefaultComboBoxModel();
        listaCiudad.addElement(new KeyValue(-1, "Seleccione Ciudad"));
        ResultSet rs = this.consulta("SELECT * FROM CIUDAD ORDER BY NOMBRE_CIUDAD ASC");
        try {
            while (rs.next()) {
                int id = rs.getInt("IDCIUDAD");
                String text = rs.getString("NOMBRE_CIUDAD");
                listaCiudad.addElement(new KeyValue(id, text));
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listaCiudad;
    }
    
    public Ciudad obtenerCiudadPorId(int idCiudad) {
        ResultSet rs = this.consulta("Select * from CIUDAD where IDCIUDAD = " +  idCiudad);
        Ciudad ciudad = null;
        try {
            while (rs.next()) {
                ciudad = new Ciudad();
                ciudad.setId(rs.getInt("IDCIUDAD"));
                ciudad.setNombre(rs.getString("NOMBRE_CIUDAD"));
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ciudad;
    }
}
