package app;
import view.AutenticacionView;
import java.sql.SQLException;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        AutenticacionView login = new AutenticacionView();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        
    }
    
    
   
}
