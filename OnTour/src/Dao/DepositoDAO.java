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
import model.Deposito;

/**
 *
 * @author jose_
 */
public class DepositoDAO extends DbUtilidades {

    public boolean actualizarDeposito(int id) {
       return this.actualizar("CALL sp_deposito_enable(" + id + ")");

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
    
    public Deposito obtenerDepositoPorId(int idDeposito) {

        ResultSet rs = this.consulta("Select * from deposito where iddeposito = " + idDeposito );
        Deposito deposito = new Deposito();
        try {
            while (rs.next()) {
                deposito.setMontoDeposito(rs.getInt("montodeposito"));
                deposito.setRutApoderado(rs.getInt("rut_apoderado"));
                deposito.setRutAlumno(rs.getInt("rut_alumno"));
                deposito.setFechaDeposito(rs.getDate("fechadeposito"));
                deposito.setEstado(rs.getInt("estado"));
            
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return deposito;
    }
}
