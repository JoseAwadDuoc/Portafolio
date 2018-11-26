/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import model.TipoSeguro;

/**
 *
 * @author jose_
 */
public class TipoSeguroDAO extends DbUtilidades {

    public boolean agregarSeguro(TipoSeguro tipoSeguros) {

        String tipoSeguro = tipoSeguros.getTipoSeguro();

        return this.actualizar("INSERT INTO TIPO_SEGURO (DESCRIPCION) "
                + "VALUES "
                + "('" + tipoSeguro + "')");
    }

    public DefaultComboBoxModel obtenerTipoSeguro() {
        DefaultComboBoxModel listamodelo = new DefaultComboBoxModel();
        listamodelo.addElement("Seleccione Seguro");
        ResultSet rs = this.consulta("SELECT descripcion FROM tipo_seguro where idtipo_seguro=idtipo_seguro");

        try {
            while (rs.next()) {
                listamodelo.addElement(rs.getString("descripcion"));
            }
            rs.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listamodelo;

    }

    public String obtenerIdTipoSeguro(String nombreseguro) {

        ResultSet rs = this.consulta("Select * from tipo_seguro where DESCRIPCION ='" + nombreseguro + "'");
        String idseguro = new String();
        try {
            while (rs.next()) {
                idseguro = rs.getString("idtipo_seguro");
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return idseguro;
    }

    public boolean existeTipoSeguroIdTipoSeguro(int idTipoSeguro) {
        ResultSet rs = this.consulta("Select idtipo_seguro from tipo_seguro where idtipo_seguro = " + idTipoSeguro);
        int idTipoSeguro1 = 0;
        try {
            while (rs.next()) {
                idTipoSeguro1 = rs.getInt("idtipo_seguro");
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return idTipoSeguro1 != 0;
    }

    public int obtenerIdTipoSeguro(int idTipoSeguro) {

        ResultSet rs = this.consulta("Select idtipo_seguro from tipo_seguro where idtipo_seguro = " + idTipoSeguro);
        int idTipoSeguro1 = 0;
        try {
            while (rs.next()) {
                idTipoSeguro1 = rs.getInt("idtipo_seguro");
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return idTipoSeguro1;
    }

    public Map<String, List> obtenerTipoSeguros() {
        Map<String, List> map = null;
        try {

            Statement st = Conexion.conectar().createStatement();
            String sql = "SELECT idtipo_seguro, descripcion FROM tipo_seguro";
            System.out.println("sql: " + sql);
            ResultSet rs = st.executeQuery(sql);
            System.out.println("rs: " + rs);

            ResultSetMetaData rsMD = rs.getMetaData();
            int numerocolumnas = rsMD.getColumnCount();
            System.out.println("rs1: " + rs);

            List<Object> columnLabels = new ArrayList<>();

            for (int x = 1; x <= numerocolumnas; x++) {
                columnLabels.add(rsMD.getColumnLabel(x));
            }

            List<Object> columnValues = new ArrayList<>();

            while (rs.next()) {
                Object[] fila = new Object[numerocolumnas];
                for (int i = 0; i < numerocolumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                columnValues.add(fila);
            }
            System.out.println("rs2: " + rs);
            rs.close();

            map = new HashMap<>();
            map.put("columnLabels", columnLabels);
            map.put("columnValues", columnValues);

        } catch (Exception e) {
            System.out.println("No se ha encontrado ningún seguro.");
        }
        return map;
    }

}
