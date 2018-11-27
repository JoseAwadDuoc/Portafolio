package Dao;

import model.Apoderado;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import utils.Md5Utils;

/**
 *
 * @author jose_
 */
public class ApoderadoDAO extends DbUtilidades {

    public static Apoderado apo = new Apoderado();

    public Map<String, List> obtenerApoderados() {
        Map<String, List> map = null;
        try {

            Statement st = Conexion.conectar().createStatement();
            String sql = "Select * From apoderado where estado = 1";

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

    public boolean agregarApoderado(Apoderado apoderado){
        String perfil = apoderado.isEncargado() ? "SI" : "NO";
        int rut = apoderado.getRut();
        String nombres = apoderado.getNombres();
        String aPaterno = apoderado.getaPaterno();
        String aMaterno = apoderado.getaMaterno();
        String fechaNacimiento = apoderado.getFechaNacimiento();
        int telefono = apoderado.getTelefono();
        int idComuna = apoderado.getIdComuna();
        String direccion = apoderado.getDireccion();
        String contrasena = apoderado.getContrasena();
        String correo = apoderado.getCorreo();

      /*  return this.actualizar("INSERT INTO APODERADO (Rut_Apoderado,Pass_Apoderado,idComuna,Nombres,Apaterno,Amaterno,Fnacimiento,Telefono,Perfil,Direccion,Correo) "
                + "VALUES "
                + "( " + rut + 
                ",'" + contrasena + 
                "'," + idComuna + 
                ",'" + nombres + 
                "','" + aPaterno + 
                "','" + aMaterno + 
                "',TO_DATE('" + fechaNacimiento + "','DD-MM-YYYY')," + telefono + 
                ",'" + perfil + 
                "','" + direccion + 
                "','" + correo + "')");
        */
      
      contrasena = Md5Utils.md5(contrasena);
      
      return this.actualizar("call sp_apoderado_insertar("+rut+",'"+contrasena+"',"+idComuna+",'"+nombres+"','"+aPaterno+"','"+aMaterno+"','"+fechaNacimiento+"','"+telefono+"','"+perfil+"','"+direccion+"','"+correo+"',1)");
 
    }

    public Apoderado buscarApoderadoPorRut(int rut) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        ResultSet rs = this.consulta("Select * from Apoderado apo join COMUNA co on (apo.IDCOMUNA=co.IDCOMUNA) JOIN CIUDAD cu on(co.IDCIUDAD=cu.IDCIUDAD) where RUT_APODERADO = '" + rut + "'");
        Apoderado apoderado = new Apoderado();
        try {
            while (rs.next()) {
                apoderado.setRut(rs.getInt("RUT_APODERADO"));
                apoderado.setNombres(rs.getString("NOMBRES"));
                apoderado.setaPaterno(rs.getString("APATERNO"));
                apoderado.setaMaterno(rs.getString("AMATERNO"));
                apoderado.setFechaNacimiento(sdf.format(rs.getDate("FNACIMIENTO")));
                apoderado.setTelefono(rs.getInt("TELEFONO"));
                apoderado.setEncargado("SI".equalsIgnoreCase(rs.getString("PERFIL")));
                apoderado.setDireccion(rs.getString("DIRECCION"));
                apoderado.setCorreo(rs.getString("CORREO"));
                apoderado.setContrasena(rs.getString("PASS_APODERADO"));
                apoderado.setIdComuna(rs.getInt("IDCOMUNA"));
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return apoderado;
    }

    public boolean actualizarApoderado(Apoderado apoderado){
        
        String perfil = apoderado.isEncargado() ? "SI" : "NO";
        
      /*  String sql = "UPDATE APODERADO SET NOMBRES='" + apoderado.getNombres() + 
                 "',APATERNO='" + apoderado.getaPaterno() + 
                 "',AMATERNO='" + apoderado.getaMaterno() + 
                 "',FNACIMIENTO = TO_DATE('" + apoderado.getFechaNacimiento() + "','DD-MM-YYYY')" +
                 ",TELEFONO="+ apoderado.getTelefono() + 
                 ",PERFIL='" + perfil + 
                 "',IDCOMUNA=" + apoderado.getIdComuna() + 
                 ",CORREO='" + apoderado.getCorreo() + 
                 "',PASS_APODERADO='" + apoderado.getContrasena() + 
                 "' WHERE RUT_APODERADO=" + apoderado.getRut();

*/
      String sql="call sp_apoderado_modificar("+apoderado.getRut()+",'"+apoderado.getContrasena()+"',"+apoderado.getIdComuna()+",'"+apoderado.getNombres()+"','"+apoderado.getaPaterno()+"','"+apoderado.getaMaterno()+"','"+apoderado.getFechaNacimiento()+"','"+apoderado.getTelefono()+"','"+perfil+"','"+apoderado.getDireccion()+"','"+apoderado.getCorreo()+"')";
        
        
        return this.actualizar(sql);
    }

}
