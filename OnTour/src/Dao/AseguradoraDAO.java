/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import model.KeyValue;

/**
 *
 * @author jose_
 */
public class AseguradoraDAO extends DbUtilidades{
    
    public DefaultComboBoxModel obtenerAseguradoras() {
        DefaultComboBoxModel listamodelo = new DefaultComboBoxModel();
        listamodelo.addElement(new KeyValue(-1, "Seleccione Aseguradora"));
        ResultSet rs = this.consulta("SELECT * FROM ASEGURADORA ORDER BY NOMBRE_ASEGURADORA ASC");
        try {
            while (rs.next()) {
                int id = rs.getInt("idaseguradora");
                String text = rs.getString("nombre_aseguradora");
                listamodelo.addElement(new KeyValue(id, text));
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listamodelo;

    }
    
//    public String obtenerIdAseguradora(String nombreAseguradora) {
//
//        ResultSet rs = this.consulta("Select * from ASEGURADORA  where ASEGURADORA where NOMBRE_ASEGURADORA ='" + nombreAseguradora + "'");
//        String idseguro = new String();
//        try {
//            while (rs.next()) {
//                idseguro = rs.getString("IDASEGURADORA");
//            }
//            rs.close();
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//
//        return idseguro;
//    }
    
    public String obtenerIdAseguradora(String nombreAseguradora) {

        ResultSet rs = this.consulta("Select NOMBRE_ASEGURADORA, IDASEGURADORA from ASEGURADORA where NOMBRE_ASEGURADORA = '" + nombreAseguradora + "'");
        String idaseguradora = new String();
        System.out.println("1: "+idaseguradora);
        try {
            while (rs.next()) {
                idaseguradora = rs.getString("IDASEGURADORA");
                System.out.println("2: "+idaseguradora);

            }
            rs.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return idaseguradora;
    }

    
}
