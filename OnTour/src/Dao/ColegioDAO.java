
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jose_
 */
public class ColegioDAO {
    private DbUtilidades dbutils;
    
        public ResultSet consulta(String sql) {
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

        public String agregarColegio(int idComuna,String nombre,String direccion,int telefono) {
        ResultSet rs = this.consulta(" INSERT INTO USUARIO2.COLEGIO ( IDCOMUNA, NOMBRE_COLEGIO, DIRECCION, TELEFONO)"
                + "VALUES ( " + idComuna + ",'" +nombre + "', '" + direccion+" ', " + telefono + ")");
        String colegio = new String();
        try {
            while (rs.next()) {
                DbUtilidades db = new DbUtilidades();

                db.confirmarCambio();

                System.out.println("colegio Ingresado Correctamente");
            }
            rs.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }
        return colegio;
    }
    
}
