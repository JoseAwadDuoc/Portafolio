package Dao;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Colegio;

/**
 *
 * @author jose_
 */
public class ColegioDAO extends DbUtilidades {

    public boolean agregarColegio(int idComuna, String nombre, String direccion, int telefono) {
       return this.actualizar("INSERT INTO COLEGIO ( IDCOMUNA, NOMBRE_COLEGIO, DIRECCION, TELEFONO)"
                + "VALUES ( " + idComuna + ",'" + nombre + "', '" + direccion + " ', " + telefono + ")");
    }

    public Map<String, List> obtenerColegios() {
        Map<String, List> map = null;
        try {

            Statement st = Conexion.conectar().createStatement();
            String sql = "Select co.idcolegio as ID ,co.nombre_colegio as Colegio, c.nombre_comuna as COMUNA ,co.direccion, co.telefono From colegio co join comuna c on (co.idcomuna=c.idcomuna)";

            ResultSet rs = st.executeQuery(sql);

            ResultSetMetaData rsMD = rs.getMetaData();
            int numerocolumnas = rsMD.getColumnCount();

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

            rs.close();

            map = new HashMap<>();
            map.put("columnLabels", columnLabels);
            map.put("columnValues", columnValues);

        } catch (Exception e) {
            System.out.println("No se ha encontrado ningún colegio.");
        }
        return map;
    }
    
    public Colegio buscarColegioPorId(int idColegio) {
        ResultSet rs = this.consulta("Select * from colegio where idcolegio = '" + idColegio + "'");
        Colegio colegio = new Colegio();
        try {
            while (rs.next()) {
                colegio.setNombreColegio(rs.getString("NOMBRE_COLEGIO"));
                colegio.setIdComuna(rs.getInt("idcomuna"));
                colegio.setDireccion(rs.getString("DIRECCION"));
                colegio.setTelefono(rs.getInt("TELEFONO"));
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return colegio;
    }


    public String eliminarColegio(int id) {
        ResultSet rs = this.consulta("DELETE colegio where idcolegio =" + id);
        String contrato = new String();
        try {
            while (rs.next()) {

                confirmarCambio();

                System.out.println("Colegio Eliminado Correctamente");
            }
            rs.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }
        return contrato;
    }

}
