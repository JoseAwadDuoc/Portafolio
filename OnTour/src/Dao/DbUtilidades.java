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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author jose_
 */
public class DbUtilidades {

    protected ResultSet consulta(String sql) {
        System.out.println("consulta: " + sql);
        Connection con = null;
        ResultSet rs = null;
        try {
            con = Conexion.conectar();
            PreparedStatement stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error consulta :" + e.getMessage());
        }
        return rs;
    }
    
    protected boolean actualizar(String sql) {
        System.out.println("actualizar: " + sql);
        Connection con = null;
        try {
            con = Conexion.conectar();
            PreparedStatement stm = con.prepareStatement(sql);
            stm.execute();
            con.commit();
            return true;
        } catch (SQLException e) {
            System.out.println("Error actualizar :" + e.getMessage());
            return false;
        } finally {
            this.cerrarRecursos(con);
        }
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
