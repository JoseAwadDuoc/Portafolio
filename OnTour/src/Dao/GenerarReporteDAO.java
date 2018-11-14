/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;




/**
 *
 * @author corellana
 */
public class GenerarReporteDAO {
    
    public void GenerarReporteAvance(int idcontrato){
     Conexion con = new Conexion();
        try {
            JasperReport reporte= (JasperReport) JRLoader.loadObject("ReporteAvance.jasper");
            Map parametro= new HashMap();
            
            parametro.put("idcontrato",idcontrato);
                    
            JasperPrint j= JasperFillManager.fillReport(reporte,parametro,con.conectar());
            JasperViewer jv=new JasperViewer(j,false);
            jv.setTitle("Reporte de Avance");
            jv.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Mostrar el Reporte"+e);
        }
    
    
        
        
        
    }
    
}
