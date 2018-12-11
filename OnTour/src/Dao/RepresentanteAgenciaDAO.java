/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.KeyValue;

/**
 *
 * @author jose_
 */
public class RepresentanteAgenciaDAO extends DbUtilidades {
    
    
    public static List<model.RepresentanteAgencia> listarRepresentantes() throws SQLException {
        List<model.RepresentanteAgencia> listRepr = null;
        Connection con = null;

        try {

            con = Conexion.conectar();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM REPRESENTANTE_AGENCIA";

            ResultSet rs = st.executeQuery(sql);
            listRepr = new ArrayList();
            while (rs.next()) {
                model.RepresentanteAgencia rpa = new model.RepresentanteAgencia();
                rpa.setRut(rs.getInt(1));
                rpa.setIdcomuna(rs.getInt(2));
                rpa.setIdcargo(rs.getInt(3));
                rpa.setNombre(rs.getString(4));;
                rpa.setaPaterno(rs.getString(5));
                rpa.setaMaterno(rs.getString(6));
                rpa.setFechaNacimiento(rs.getString(7));
                rpa.setDireccion(rs.getString(8));
                rpa.setTelefono(rs.getInt(9));
                rpa.setContraseña(rs.getString(10));
                listRepr.add(rpa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listRepr;
    }

    public static Object[] objetoRepresentanteAgencia(model.RepresentanteAgencia representante) {

        Object[] obj = new Object[10];
        try {
            obj[0] = representante.getRut();
            obj[1] = representante.getIdcomuna();
            obj[2] = representante.getIdcargo();
            obj[3] = representante.getNombre();
            obj[4] = representante.getaPaterno();
            obj[5] = representante.getaMaterno();
            obj[6] = representante.getFechaNacimiento();
            obj[7] = representante.getDireccion();
            obj[8] = representante.getTelefono();
            obj[9] = representante.getContraseña();
        } catch (Exception e) {

        }
        return obj;
    }

    


    public DefaultComboBoxModel obtenerRepresentantes() {
        DefaultComboBoxModel lst = new DefaultComboBoxModel();
        lst.addElement(new KeyValue(-1, "Seleccione Representante"));
        ResultSet rs = this.consulta("Select CONCAT(NOMBRES,CONCAT(' ',APATERNO)) as nombre_agente, rut_representante from REPRESENTANTE_AGENCIA");
        try {
            while (rs.next()) {
                int id = rs.getInt("rut_representante");
                String text = rs.getString("nombre_agente");
                lst.addElement(new KeyValue(id, text));
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lst;

    }

}
