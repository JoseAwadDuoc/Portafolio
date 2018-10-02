
package Controlador;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Conexion {

    public static Connection conectar;
    
    public static Connection conectar(){
        Connection con;
        
        String pass="USUARIO2";
        String user="USUARIO2";
        String bd = "jdbc:oracle:thin:@dbontour.intercity.net:1521:XE";
        
        try{
            con = DriverManager.getConnection(bd,user,pass);
            
        }catch(SQLException e){
            System.out.println("No se encuentra conectado a la Base de Datos");
            System.out.println(e);
            return con=null;
        }
        return con;
    }

}
