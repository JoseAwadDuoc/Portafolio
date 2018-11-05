package Dao;

import model.Apoderado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jose_
 */
public class ApoderadoDAO {

    public static Apoderado apo = new Apoderado();

    public static List<Apoderado> listarApoderado() throws SQLException {
        List<Apoderado> listApoderado = null;
        Connection con = null;

        try {

            con = Conexion.conectar();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM APODERADO";

            ResultSet rs = st.executeQuery(sql);
            listApoderado = new ArrayList();
            while (rs.next()) {
                Apoderado apo = new Apoderado();
                apo.setRut(rs.getInt(1));
                apo.setContrasena(rs.getString(2));
                apo.setIdComuna(rs.getInt(3));
                apo.setNombres(rs.getString(4));;
                apo.setaPaterno(rs.getString(5));
                apo.setaMaterno(rs.getString(6));
                apo.setFechaNacimiento(rs.getString(7));
                apo.setTelefono(rs.getInt(8));
                apo.setPerfil(rs.getString(9));
                apo.setDireccion(rs.getString(10));

                listApoderado.add(apo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listApoderado;
    }

    public static Object[] objetoApoderado(Apoderado apoderado) {

        Object[] obj = new Object[10];
        try {
            obj[0] = apoderado.getRut();
            obj[1] = apoderado.getContrasena();
            obj[2] = apoderado.getIdComuna();
            obj[3] = apoderado.getNombres();
            obj[4] = apoderado.getaPaterno();
            obj[5] = apoderado.getaMaterno();
            obj[6] = apoderado.getFechaNacimiento();
            obj[7] = apoderado.getTelefono();
            obj[8] = apoderado.isPerfil();
            obj[9] = apoderado.getDireccion();
        } catch (Exception e) {

        }
        return obj;
    }

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

}
