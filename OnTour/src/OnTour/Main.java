package OnTour;
import Vista.Autenticacion;
import java.sql.SQLException;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Autenticacion login = new Autenticacion();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        
    }
    
    
   
}
