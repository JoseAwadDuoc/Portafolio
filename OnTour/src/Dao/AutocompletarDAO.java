/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import com.mxrck.autocompleter.TextAutoCompleter;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;

/**
 *
 * @author cristianorellanafarias
 */
public class AutocompletarDAO extends DbUtilidades{
    
    private JTextField txtapoderado;
    private TextAutoCompleter ac;
    
    
    public JTextField obtenerapoderados(){
        TextAutoCompleter autoc = new TextAutoCompleter(txtapoderado);
    txtapoderado.setText("Ingrese Nombre Apoderado");
    ResultSet rs = this.consulta("SELECT CONCAT(nombres,CONCAT(' ',CONCAT(apaterno,CONCAT(' ',amaterno)))) as \"NOMBRE_APODERADO\" FROM APODERADO;");
    
    try {
            while (rs.next()) {
                autoc.addItem(rs.getString("NOMBRE_APODERADO"));

            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return txtapoderado;
    
    }
    
    
}
