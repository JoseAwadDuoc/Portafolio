package Dao;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jose_
 */
public class ContratoDAO extends DbUtilidades {

    public List<String> obtenerPaquete() {
        List<String> listapaquete = new ArrayList<>();
        listapaquete.add("Seleccione Paquete Turistico");
        ResultSet rs = this.consulta("Select * from paquete ORDER BY descripcion ASC");

        try {
            while (rs.next()) {
                listapaquete.add(rs.getString("DESCRIPCION"));
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listapaquete;
    }

    public List<String> obtenerColegio() {
        List<String> listapaquete = new ArrayList<>();
        listapaquete.add("Seleccione Colegio Asociado");
        ResultSet rs = this.consulta("Select * from COLEGIO ORDER BY NOMBRE_COLEGIO ASC");

        try {
            while (rs.next()) {
                listapaquete.add(rs.getString("NOMBRE_COLEGIO"));

            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return listapaquete;
    }

    public List<String> obtenerCurso(String colegio) {
        List<String> listapaquete = new ArrayList<>();
        listapaquete.add("Seleccione Curso Asociado");
        ResultSet rs = this.consulta("Select * from CURSO cu join colegio co on(cu.idcolegio=co.idcolegio)"
                + "WHERE co.nombre_colegio = '" + colegio + "'");

        try {
            while (rs.next()) {
                listapaquete.add(rs.getString("DESCRIPCION"));
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return listapaquete;
    }

    public int obtenerMontoPaquete(String descripcion) {

        ResultSet rs = this.consulta("Select * from paquete where DESCRIPCION = '" + descripcion + "'");
        int monto = 0;
        try {
            while (rs.next()) {
                monto = rs.getInt("PRECIO");
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return monto;
    }

    public String obtenerIdPaquete(String nombrepaquete) {

        ResultSet rs = this.consulta("Select * from paquete where DESCRIPCION = '" + nombrepaquete + "'");
        String idpaquete = new String();
        try {
            while (rs.next()) {
                idpaquete = rs.getString("IDPAQUETE");
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return idpaquete;
    }

    public String obtenerIdCurso(String nombrecurso) {

        ResultSet rs = this.consulta("Select * from CURSO where DESCRIPCION = '" + nombrecurso + "'");
        String idcurso = new String();
        try {
            while (rs.next()) {
                idcurso = rs.getString("IDCURSO");

            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return idcurso;
    }

    public int obtenerIdContrato(int idcurso) {

        ResultSet rs = this.consulta("Select * from Contrato where idcurso = '" + idcurso + "'");
        int idcontrato = 0;
        try {
            while (rs.next()) {
                idcontrato = rs.getInt("idcontrato");

            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return idcontrato;
    }

    public String agregarContrato(int idpaquete, int rut, int idcurso, int idseguro, String fecha_inicio, int monto_venta, String fecha_evento) {
        /* ResultSet rs = this.consulta("INSERT INTO CONTRATO (IDPAQUETE, RUT_REPRES, IDCURSO, IDSEGURO, FECHA_CONTRATO, MONTO_META, FECHA_EVENTO) "
                + "VALUES (" + idpaquete + 
                ", "+ rut + 
                "," + idcurso +
                "," + idseguro + 
                ", TO_DATE('" + fecha_inicio + "', 'DD-MM-YYYY')," 
                + monto_venta + 
                ", TO_DATE('" + fecha_evento + "', 'DD-MM-YYYY'))"); */

        ResultSet rs = this.consulta("call sp_contrato_insertar(" + idpaquete + "," + rut + "," + idcurso + "," + idseguro + ",'" + fecha_inicio + "'," + monto_venta + ",'" + fecha_evento + "',1)");
        //  call sp_contrato(1,222222221,2,2,'25/11/2018',15000000,'01/01/2030',1)
        String contrato = new String();
        try {
            while (rs.next()) {

                confirmarCambio();

                System.out.println("Contrato Ingresado Correctamente");
            }
            rs.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }
        return contrato;
    }

    public String eliminarContrato(int id) {
        // ResultSet rs = this.consulta("UPDATE contrato SET estado = 0 where idcontrato =" + id);
        ResultSet rs = this.consulta("CALL sp_contrato_disable(" + id + ")");
        String contrato = new String();
        try {
            while (rs.next()) {

                confirmarCambio();

                System.out.println("Contrato Eliminado Correctamente");
            }
            rs.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }
        return contrato;
    }

    public Map<String, List> obtenerContratos() {
        Map<String, List> map = null;
        try {

            Statement st = Conexion.conectar().createStatement();
            String sql = "Select * From Contrato where estado = 1";

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
                System.out.println(" q" + Arrays.asList(fila));
                columnValues.add(fila);
            }

            rs.close();

            map = new HashMap<>();
            map.put("columnLabels", columnLabels);
            map.put("columnValues", columnValues);

        } catch (Exception e) {
            System.out.println("No se ha encontrado ningún contrato activo.");
        }
        return map;
    }

    public int obtenerCatidadAlumnos(String descripcion) {
        ResultSet rs = this.consulta("SELECT count(c.idcurso) , c.descripcion FROM ALUMNO a JOIN CURSO c ON(a.idcurso=c.idcurso) WHERE c.descripcion= '" + descripcion + "' group by c.descripcion");
        int catidadAlumnos = 0;
        try {
            while (rs.next()) {
                catidadAlumnos = rs.getInt("count(c.idcurso)");
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return catidadAlumnos;
    }

//    
//    SELECT count(c.idcurso) , c.descripcion FROM ALUMNO a JOIN CURSO c ON(a.idcurso=c.idcurso) WHERE c.descripcion=c.descripcion group by c.descripcion;
}
