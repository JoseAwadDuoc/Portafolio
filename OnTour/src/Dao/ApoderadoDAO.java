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
    private DbUtilidades dbutils;

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
    
        public String agregarApoderado(int rut,String nombres, String aPaterno, String aMaterno,String fechaNacimiento,int telefono,int idComuna ,String direccion, String contrasena,String correo, String perfil) {
        ResultSet rs = this.consulta("INSERT INTO USUARIO2.APODERADO (Rut_Apoderado,Pass_Apoderado,idComuna,Nombres,Apaterno,Amaterno,Fnacimiento,Telefono,Perfil,Direccion,Correo) VALUES "
                + "( "+ rut + ",'" + contrasena + "'," + idComuna + ",'" +nombres +"','" + aPaterno+"','"+aMaterno+"',TO_DATE('"+ fechaNacimiento+"','DD-MM-YYYY')," + telefono+",'"+perfil+"','"+direccion+"','"+correo+"')");
        String apoderado = new String();
        try {
            while (rs.next()) {
                DbUtilidades db = new DbUtilidades();

                db.confirmarCambio();

                System.out.println("Apoderado Ingresado Correctamente");
            }
            rs.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }
        return apoderado;
    }

        

     public ArrayList ObtenerApoderado(String Rut) {

        ResultSet rs = this.consulta("Select * from Apoderado apo join COMUNA co on (apo.IDCOMUNA=co.IDCOMUNA) JOIN CIUDAD cu on(co.IDCIUDAD=cu.IDCIUDAD) where RUT_APODERADO = '" + Rut + "'");
        ArrayList apoderado= new ArrayList();
        try {
            while (rs.next()) {
                 apoderado.add(rs.getString("RUT_APODERADO"));
                 apoderado.add(rs.getString("NOMBRES"));
                 apoderado.add(rs.getString("APATERNO"));
                 apoderado.add(rs.getString("AMATERNO"));
                 apoderado.add(rs.getString("FNACIMIENTO"));
                 apoderado.add(rs.getString("TELEFONO"));
                 apoderado.add(rs.getString("PERFIL"));
                 apoderado.add(rs.getString("DIRECCION"));
                 apoderado.add(rs.getString("CORREO"));
                 apoderado.add(rs.getString("PASS_APODERADO"));
                 apoderado.add(rs.getString("NOMBRE_CIUDAD"));
                 apoderado.add(rs.getString("NOMBRE_COMUNA"));
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return apoderado;
    }
  
     
     public String ModificarApoderado(int rut,String nombre,String apaterno,String amaterno,String fnacimiento,int telefono,int idcomuna,String direccion, String password,String email, String perfil) {
        ResultSet rs =this.consulta("UPDATE APODERADO SET NOMBRES='"+nombre+"',APATERNO='"+apaterno+"',AMATERNO='"+amaterno+"',TO_DATE('"+ fnacimiento+"','DD-MM-YYYY')," +telefono+",PERFIL='"+perfil+"',IDCOMUNA="+idcomuna+",CORREO='"+email+"',PASS_APODERADO='"+password+"' WHERE RUT_APODERADO="+rut+"");
        String apoderado = new String();
        try {
            while (rs.next()) {

                dbutils.confirmarCambio();

                System.out.println("Apoderado Modificado Correctamente");
            }
            rs.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }
        
        
        
        return apoderado;
    }
    
}
