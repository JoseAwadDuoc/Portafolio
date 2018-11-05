package Dao;

import model.RepresentanteAgencia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Ordenar código de manera MVC
public class AutenticacionDAO extends DbUtilidades {

    public static RepresentanteAgencia RP = new RepresentanteAgencia();

    public boolean validarUsuario(int rut, String contraseña) {
        Connection con = null;
        Statement st = null;
        
        model.RepresentanteAgencia repreA = new RepresentanteAgencia();

        try {
            con = Conexion.conectar();
            st = con.createStatement();
            String sql = "SELECT RUT_REPRESENTANTE,PASS_REPRESENTANTE,NOMBRES FROM REPRESENTANTE_AGENCIA "
                    + "WHERE RUT_REPRESENTANTE = '" + rut + "' AND "
                    + "PASS_REPRESENTANTE = '" + contraseña + "'";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                System.out.println("Usuario Validado");
                RP.setNombre(rs.getString(3));
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error SQL, no se pudo validar usuario!");
        } finally {
            cerrarRecursos(st, con);
        }
        return false;
    }

    public int obtenerPerfil(String rutagente) {

        ResultSet rs = this.consulta("select * from representante_agencia where rut_representante = '" + rutagente + "'");

        //select * from representante_agencia where IDCARGO = ;
        Integer idcargo = 0;
        try {
            while (rs.next()) {
                idcargo = rs.getInt("IDCARGO");
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return idcargo;
    }
}
