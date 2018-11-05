/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jose_
 */
public class DbUtilidades {

    protected ResultSet consulta(String sql) {
        Connection con = null;
        ResultSet rs = null;
        try {
            con = Conexion.conectar();
            PreparedStatement stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error Consulta :" + e.getMessage());
        }
        return rs;
    }
    
    protected void cerrarRecursos(Statement st, Connection conn) {
        try {
            st.close();
        } catch(Exception e) {
        }
        try {
            conn.close();
        } catch(Exception e) {
        }
    }
    
    protected void cerrarRecursos(Connection conn) {
        try {
            conn.close();
        } catch(Exception e) {
        }
    }
    
    protected void cerrarRecursos(Statement st) {
        try {
            st.close();
        } catch(Exception e) {
        }
    }
    
    protected void confirmarCambio() {
        ResultSet rs = this.consulta("COMMIT");
        try {
            rs.next();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
