/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
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
                + ",TO_DATE('" + fechaIni + "','DD-MM-YYYY'),"
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
                idseguro = rs.getString("idtipo_seguro");
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return idseguro;
    }

}
