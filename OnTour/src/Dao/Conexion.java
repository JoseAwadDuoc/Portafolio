
package Dao;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Conexion {
    
//    public static final String BD_NAME = "USUARIO2";

    public static Connection conectar(){
        Connection con;
        
        String pass="PORTAFOLIO";
        String user="PORTAFOLIO";
        String bd="jdbc:oracle:thin:@172.16.55.176:1521:XE";
        //String bd = "jdbc:oracle:thin:@dbontour.intercity.net:1521:XE";
        
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
