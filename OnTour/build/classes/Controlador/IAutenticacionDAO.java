
package Controlador;

import Modelo.RepresentanteAgencia;
import Vista.Autenticacion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class IAutenticacionDAO {
    
    Autenticacion Autenticacion = new Autenticacion();
    public static RepresentanteAgencia RP = new RepresentanteAgencia();

     public boolean validarUsuario(int rut, String contraseña){
        Connection con = null;
        
        Modelo.RepresentanteAgencia repreA = new RepresentanteAgencia();
        
        try {            
            con = Conexion.conectar();
            Statement st = con.createStatement();
            String sql="SELECT RUT_REPRESENTANTE,PASS_REPRESENTANTE,NOMBRES FROM REPRESENTANTE_AGENCIA "
                    + "WHERE RUT_REPRESENTANTE = '"+rut+"' AND "
                    + "PASS_REPRESENTANTE = '"+contraseña+"'";
            
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){                                
                System.out.println("Usuario Validado");                
                RP.setNombre(rs.getString(3));
                return true;                
            }     
        } catch (Exception e) {
            System.out.println("Error SQL, no se pudo validar usuario");    
        }      
        return false;
    }   

public static List<RepresentanteAgencia> listarRepresentantes() throws SQLException{
        List<RepresentanteAgencia> listRepr = null;
        Connection con = null;       
        
        try {
            
            con = Conexion.conectar();
            Statement st=con.createStatement();
            String sql="SELECT * FROM REPRESENTANTE_AGENCIA";
            
            ResultSet rs = st.executeQuery(sql);
            listRepr=new ArrayList();
            while(rs.next()){
                RepresentanteAgencia rpa = new RepresentanteAgencia();
                rpa.setRut(rs.getInt(1));
                rpa.setIdcomuna(rs.getInt(2));
                rpa.setIdcargo(rs.getInt(3));
                rpa.setNombre(rs.getString(4));;
                rpa.setaPaterno(rs.getString(5));
                rpa.setaMaterno(rs.getString(6));
                rpa.setFechaNacimiento(rs.getString(7));
                rpa.setDireccion(rs.getString(8));
                rpa.setTelefono(rs.getInt(9));
                rpa.setContraseña(rs.getString(10));
                listRepr.add(rpa);     
            }               
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        return listRepr;
    }
    
    public static Object[] objetoRepresentanteAgencia(RepresentanteAgencia representante){
 
                Object[] obj = new Object[10];
           try {               
                obj[0]=representante.getRut();
                obj[1]=representante.getIdcomuna();
                obj[2]=representante.getIdcargo();
                obj[3]=representante.getNombre();
                obj[4]=representante.getaPaterno();
                obj[5]=representante.getaMaterno();
                obj[6]=representante.getFechaNacimiento();
                obj[7]=representante.getDireccion();
                obj[8]=representante.getTelefono();
                obj[9]=representante.getContraseña();
           }catch(Exception e){
               
           }
                return obj;
    }
        
}
