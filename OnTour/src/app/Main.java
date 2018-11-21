package app;
import Dao.Conexion;
import Dao.GenerarReporteDAO;
import java.sql.SQLException;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
    /*    AutenticacionView login = new AutenticacionView();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
     
        services.OnTourServices.main(args);*/
    
        try {
            Conexion con = new Conexion();
            con.conectar();
            
            GenerarReporteDAO g = new GenerarReporteDAO();
            g.GenerarReporteAvance(1);
        
        } catch (Exception e) {
            System.out.println("Error al iniciar "+e);
        }
    }
}
