package app;

import Dao.Conexion;
import java.sql.SQLException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.AutenticacionView;

public class Main {

    /**
     * @param args the command line arguments
     */
    /**
     * 
     * @param args main de ejecución de proyecto
     * @throws SQLException excepción
     * @throws ClassNotFoundException excepción
     * @throws InstantiationException excepción
     * @throws IllegalAccessException excepción
     * @throws UnsupportedLookAndFeelException excepción
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

        UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName());
        try {
            AutenticacionView login = new AutenticacionView();
            login.setLocationRelativeTo(null);
            login.setVisible(true);
            //services.OnTourServices.main(args);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al iniciar " + e);
            System.exit(-1);
        }
    }
}
