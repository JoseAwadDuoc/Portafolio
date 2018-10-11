
package Controlador;

import Modelo.RepresentanteAgencia;
import Vista.Autenticacion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import oracle.sql.DATE;

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
    
    public ResultSet consulta(String sql){
        Connection con = null;
        ResultSet rs = null;
    
  try {
            con = Conexion.conectar();
            PreparedStatement stm= con.prepareStatement(sql);
            rs = stm.executeQuery();
  }catch(SQLException e){	

    System.out.println("Error Consulta :"+ e.getMessage());
}
  
return rs;
}
 
    
  public DefaultComboBoxModel obtener_Paquete(){
        DefaultComboBoxModel listapaquete = new DefaultComboBoxModel();
        listapaquete.addElement("Seleccione Paquete Turistico");
        ResultSet rs = this.consulta("Select * from paquete ORDER BY descripcion ASC");
        
       
        try{
            while (rs.next()){
            listapaquete.addElement(rs.getString("DESCRIPCION"));
            
                    }rs.close();
                
        }catch (SQLException e){
            
            System.out.println(e.getMessage());
        
        }

  return listapaquete;

}
  
  
   public DefaultComboBoxModel obtener_Colegio(){
        DefaultComboBoxModel listapaquete = new DefaultComboBoxModel();
        listapaquete.addElement("Seleccione Colegio Asociado");
        ResultSet rs = this.consulta("Select * from COLEGIO ORDER BY NOMBRE_COLEGIO ASC");
          
        try{
            while (rs.next()){
            listapaquete.addElement(rs.getString("NOMBRE_COLEGIO"));
            
                    }rs.close();
                
        }catch (SQLException e){
            
            System.out.println(e.getMessage());
        
        }

  return listapaquete;

}
   
     public DefaultComboBoxModel obtener_Curso(String curso){
        DefaultComboBoxModel listapaquete = new DefaultComboBoxModel();
        listapaquete.addElement("Seleccione Curso Asociado");
        ResultSet rs = this.consulta("Select * from CURSO cu join colegio co on(cu.idcolegio=co.idcolegio)" +
"WHERE co.nombre_colegio = '"+curso+"'");
          
        try{
            while (rs.next()){
            listapaquete.addElement(rs.getString("DESCRIPCION"));
            
                    }rs.close();
                
        }catch (SQLException e){
            
            System.out.println(e.getMessage());
        
        }

  return listapaquete;

}
      
    
    public String obtener_montopaquete(String descripcion){
        
      ResultSet rs = this.consulta("Select * from paquete where DESCRIPCION = '"+descripcion+"'");
          String monto=new String();
        try{
            while (rs.next()){
             monto=rs.getString("PRECIO");
            
                    }rs.close();
                
        }catch (SQLException e){
            
            System.out.println(e.getMessage());
        
        }

  return monto;    
    }
    
    public String obtener_idpaquete(String nombrepaquete){
        
      ResultSet rs = this.consulta("Select * from paquete where DESCRIPCION = '"+nombrepaquete+"'");
          String idpaquete=new String();
        try{
            while (rs.next()){
             idpaquete=rs.getString("IDPAQUETE");
            
                    }rs.close();
                
        }catch (SQLException e){
            
            System.out.println(e.getMessage());
        
        }

  return idpaquete;    
    }
    
    public String obtener_idcurso(String nombrecurso){
        
      ResultSet rs = this.consulta("Select * from CURSO where DESCRIPCION = '"+nombrecurso+"'");
          String idcurso=new String();
        try{
            while (rs.next()){
             idcurso=rs.getString("IDCURSO");
            
                    }rs.close();
                
        }catch (SQLException e){
            
            System.out.println(e.getMessage());
        
        }

  return idcurso;    
    }
    
  
    
    public String agregar_contrato(int idpaquete,int rut,int idcurso,String fecha_inicio,int monto_venta,String fecha_evento)
    {
    ResultSet rs = this.consulta("INSERT INTO USUARIO2.CONTRATO (IDCONTRATO, IDPAQUETE, RUT_REPRES, IDCURSO, FECHA_CONTRATO, MONTO_META, FECHA_EVENTO) VALUES (idContrato.nextval,"+idpaquete+", "+rut+","+idcurso +", TO_DATE('"+fecha_inicio+"', 'DD-MM-YYYY'),"+monto_venta+", TO_DATE('"+fecha_evento+"', 'DD-MM-YYYY'))");
          String contrato=new String();
        try{
            while (rs.next()){
                
                confirmarcambio();
                
                System.out.println("Contrato Ingresado Correctamente");
                    }rs.close();
                
        }catch (SQLException e){
            
            System.out.println(e.getMessage());
        
        }
    return contrato;
    }
    
    public String eliminar_contrato(int idpaquete)
    {
    ResultSet rs = this.consulta("DELETE FROM contrato where idcontrato ="+idpaquete+"");
          String contrato=new String();
        try{
            while (rs.next()){
                
                confirmarcambio();
                
                System.out.println("Contrato Eliminado Correctamente");
                    }rs.close();
                
        }catch (SQLException e){
            
            System.out.println(e.getMessage());
        
        }
    return contrato;
    }
    
    
    public void confirmarcambio(){
    ResultSet rs= this.consulta("COMMIT");
            
    
        try {
            rs.next();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            
   }
  
    
    
     public DefaultComboBoxModel obtener_Representantes(){
        DefaultComboBoxModel listamodelo = new DefaultComboBoxModel();
        listamodelo.addElement("Seleccione Agente");
        ResultSet rs = this.consulta("Select CONCAT(NOMBRES,CONCAT(' ',APATERNO)) as nombre_agente from REPRESENTANTE_AGENCIA");
        
       
        try{
            while (rs.next()){
            listamodelo.addElement(rs.getString("nombre_agente"));
            
                    }rs.close();
                
        }catch (SQLException e){
            
            System.out.println(e.getMessage());
        
        }

  return listamodelo;

}
    
    
    
    public String obtener_rutRepresentante(String nombreagente){
        
      ResultSet rs = this.consulta("Select CONCAT(NOMBRES,CONCAT(' ',APATERNO)) as nombre_agente,rut_representante from REPRESENTANTE_AGENCIA where CONCAT(NOMBRES,CONCAT(' ',APATERNO)) = '"+nombreagente+"'");
          String rutagente=new String();
        try{
            while (rs.next()){
             rutagente=rs.getString("rut_representante");
            
                    }rs.close();
                
        }catch (SQLException e){
            
            System.out.println(e.getMessage());
        
        }

  return rutagente;    
    }
    
        public int obtener_perfil(String rutagente){
        
      ResultSet rs = this.consulta("select * from representante_agencia where rut_representante = '"+rutagente+"'");
      
      //select * from representante_agencia where IDCARGO = ;
           Integer idcargo =0;
        try{
            while (rs.next()){
             idcargo=rs.getInt("IDCARGO");
            
                    }rs.close();
                
        }catch (SQLException e){
            
            System.out.println(e.getMessage());
        
        }

  return idcargo;    
    }
        
        
         public DefaultComboBoxModel obtener_Ciudad(){
        DefaultComboBoxModel listaCiudad = new DefaultComboBoxModel();
        listaCiudad.addElement("Seleccione Ciudad");
        ResultSet rs = this.consulta("SELECT * FROM CIUDAD ORDER BY NOMBRE_CIUDAD ASC");
        
       
        try{
            while (rs.next()){
            listaCiudad.addElement(rs.getString("NOMBRE_CIUDAD"));
            
                    }rs.close();
                
        }catch (SQLException e){
            
            System.out.println(e.getMessage());
        
        }

  return listaCiudad;

}
    
    
    public DefaultComboBoxModel obtener_comuna(String comuna){
        DefaultComboBoxModel listapaquete = new DefaultComboBoxModel();
        listapaquete.addElement("Seleccione Comuna ");
        ResultSet rs = this.consulta("SELECT * FROM COMUNA co join CIUDAD cu on(co.IDCIUDAD=cu.IDCIUDAD)" + "WHERE co.NOMBRE_COMUNA = '"+comuna+"'");
          
        try{
            while (rs.next()){
            listapaquete.addElement(rs.getString("IDCOMUNA"));
            
                    }rs.close();
                
        }catch (SQLException e){
            
            System.out.println(e.getMessage());
        
        }

  return listapaquete;

}

//    public String obtener_idcomuna(String nombrecomuna){
//        
//      ResultSet rs = this.consulta("SELECT * FROM COMUNA where NOMBRE_COMUNA = '"+nombrecomuna+"'");
//          String idcomuna=new String();
//        try{
//            while (rs.next()){
//             idcomuna=rs.getString("NOMBRE_COMUNA");
//            
//                    }rs.close();
//                
//        }catch (SQLException e){
//            
//            System.out.println(e.getMessage());
//        
//        }
//
//  return idcomuna;    
//    }
    
}
   

