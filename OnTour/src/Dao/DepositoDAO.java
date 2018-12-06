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
public class DepositoDAO extends DbUtilidades {

    public String ActualizarDeposito(int id) {
        ResultSet rs = this.consulta("CALL sp_deposito_enable(" + id + ")");
        String deposito = new String();
        try {
            while (rs.next()) {

                confirmarCambio();

                System.out.println("Depósito validado Correctamente");
            }
            rs.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }
        return deposito;
    }

    public Map<String, List> obtenerDepositos() {
        Map<String, List> map = null;
        try {

            Statement st = Conexion.conectar().createStatement();
            String sql = "Select * From deposito where estado = 0";

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
            System.out.println("No se ha encontrado ningún depósito para validar.");
        }
        return map;
    }
}
