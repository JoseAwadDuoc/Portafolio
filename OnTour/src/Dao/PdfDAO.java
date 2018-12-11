package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;

public class PdfDAO extends DbUtilidades {
    
    public Map<String, List> obtenerArchivosContratos() {
        Map<String, List> map = null;
        try {

            Statement st = Conexion.conectar().createStatement();
            String sql = "Select idarchivo id,nombrearchivo Nombre,rutaarchivo Ruta,idcontrato \"ID Contrato\" From ARCHIVO ORDER BY IDARCHIVO ASC";

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

    public void agregarPdf(String nombrearchivo, String rutapdf, int idcontrato) {
        Conexion conec = new Conexion();
        String sql = "INSERT INTO ARCHIVO (NOMBREARCHIVO,RUTAARCHIVO,IDCONTRATO) VALUES(?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = conec.conectar().prepareStatement(sql);

            ps.setString(1, nombrearchivo);
            ps.setString(2, rutapdf);
            ps.setInt(3, idcontrato);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.conectar().close();
            } catch (Exception ex) {
            }
        }
    }

    public String obtenerRutaPdf(int idarchivo) {

        ResultSet rs = this.consulta("Select * from ARCHIVO where idarchivo = '" + idarchivo + "'");
        String ruta = new String();
        try {
            while (rs.next()) {
                ruta = rs.getString("RUTAARCHIVO");
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ruta;
    }

    public void eliminarArchivoPdf(int id) {
        this.actualizar("DELETE FROM ARCHIVO WHERE IDARCHIVO=" + id);
    }

    public boolean existeArchivoPorIdContrato(int idContrato) {
        ResultSet rs = this.consulta("Select idcontrato from archivo where idcontrato = " + idContrato);
        int idcontrato1 = 0;
        try {
            while (rs.next()) {
                idcontrato1 = rs.getInt("idcontrato");
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return idcontrato1 != 0;
    }

}
