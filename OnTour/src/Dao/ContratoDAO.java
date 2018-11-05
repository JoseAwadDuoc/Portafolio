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

/**
 *
 * @author jose_
 */
public class ContratoDAO extends DbUtilidades {

    public DefaultComboBoxModel obtenerPaquete() {
        DefaultComboBoxModel listapaquete = new DefaultComboBoxModel();
        listapaquete.addElement("Seleccione Paquete Turistico");
        ResultSet rs = this.consulta("Select * from paquete ORDER BY descripcion ASC");

        try {
            while (rs.next()) {
                listapaquete.addElement(rs.getString("DESCRIPCION"));
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listapaquete;
    }

    public DefaultComboBoxModel obtenerColegio() {
        DefaultComboBoxModel listapaquete = new DefaultComboBoxModel();
        listapaquete.addElement("Seleccione Colegio Asociado");
        ResultSet rs = this.consulta("Select * from COLEGIO ORDER BY NOMBRE_COLEGIO ASC");

        try {
            while (rs.next()) {
                listapaquete.addElement(rs.getString("NOMBRE_COLEGIO"));

            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return listapaquete;
    }

    public DefaultComboBoxModel obtenerCurso(String curso) {
        DefaultComboBoxModel listapaquete = new DefaultComboBoxModel();
        listapaquete.addElement("Seleccione Curso Asociado");
        ResultSet rs = this.consulta("Select * from CURSO cu join colegio co on(cu.idcolegio=co.idcolegio)"
                + "WHERE co.nombre_colegio = '" + curso + "'");

        try {
            while (rs.next()) {
                listapaquete.addElement(rs.getString("DESCRIPCION"));
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return listapaquete;
    }

    public String obtenerMontoPaquete(String descripcion) {

        ResultSet rs = this.consulta("Select * from paquete where DESCRIPCION = '" + descripcion + "'");
        String monto = new String();
        try {
            while (rs.next()) {
                monto = rs.getString("PRECIO");
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

    public String agregarContrato(int idpaquete, int rut, int idcurso, String fecha_inicio, int monto_venta, String fecha_evento) {
        ResultSet rs = this.consulta("INSERT INTO USUARIO2.CONTRATO (IDPAQUETE, RUT_REPRES, IDCURSO, FECHA_CONTRATO, MONTO_META, FECHA_EVENTO) "
                + "VALUES (" + idpaquete + ", " + rut + "," + idcurso + ", TO_DATE('" + fecha_inicio + "', 'DD-MM-YYYY')," + monto_venta 
                + ", TO_DATE('" + fecha_evento + "', 'DD-MM-YYYY'))");
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
        ResultSet rs = this.consulta("UPDATE contrato SET estado = 0 where idcontrato =" + id);
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
}
