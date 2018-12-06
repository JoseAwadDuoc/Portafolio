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
import model.Seguro;

/**
 *
 * @author jose_
 */
public class SeguroDAO extends DbUtilidades {

    public boolean agregarSeguro(Seguro seguro) {

        int idTipoSeguro = seguro.getIdTipoSeguro();
        int idAseguradora = seguro.getIdAseguradora();
        int precio = seguro.getPrecio();
        String fechaIni = seguro.getFechaIni();
        String fechaFin = seguro.getFechFin();

        return this.actualizar("INSERT INTO SEGURO (IDTIPO_SEGURO,IDASEGURADORA,CANT_PERSONAS,FECHA_INI,FECHA_TER) "
                + "VALUES "
                + "( " + idTipoSeguro
                + "," + idAseguradora
                + "," + precio
                + ",TO_DATE('" + fechaIni + "','DD-MM-YYYY')"
                + ",TO_DATE('" + fechaFin + "','DD-MM-YYYY'))");
    }

    public DefaultComboBoxModel obtenerSeguro() {
        DefaultComboBoxModel listamodelo = new DefaultComboBoxModel();
        listamodelo.addElement("Seleccione Seguro");
        ResultSet rs = this.consulta("select ts.descripcion from seguro s join tipo_seguro ts on(s.idtipo_seguro=ts.idtipo_seguro)");

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

    public String obtenerIdSeguro(String nombreseguro) {

        ResultSet rs = this.consulta("Select * from seguro s join tipo_seguro ts on(s.idtipo_seguro=ts.idtipo_seguro) where DESCRIPCION ='" + nombreseguro + "'");
        String idseguro = new String();
        try {
            while (rs.next()) {
                idseguro = rs.getString("idseguro");
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return idseguro;
    }

    public int obtenerMontoSeguro(String descripcion) {
        ResultSet rs = this.consulta("select s.cant_personas from seguro s join tipo_seguro ts on(s.idtipo_seguro=ts.idtipo_seguro) where ts.descripcion like '" + descripcion + "'");
        int monto = 0;
        try {
            while (rs.next()) {
                monto = rs.getInt("CANT_PERSONAS");
                break;
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return monto;
    }

    public Map<String, List> obtenerSeguros() {
        Map<String, List> map = null;
        try {

            Statement st = Conexion.conectar().createStatement();
            String sql = "SELECT se.IDSEGURO ID,ts.DESCRIPCION Seguro, se.cant_personas Precio,se.fecha_ini Fecha_Inicio,se.fecha_ter Fecha_Termino FROM SEGURO se JOIN TIPO_SEGURO ts on (se.IDTIPO_SEGURO=ts.IDTIPO_SEGURO)";
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

    public String eliminarSeguro(int id) {
        ResultSet rs = this.consulta("DELETE seguro where idseguro =" + id);
        String seguro = new String();
        try {
            while (rs.next()) {

                confirmarCambio();

                System.out.println("Seguro Eliminado Correctamente");
            }
            rs.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }
        return seguro;
    }

}
