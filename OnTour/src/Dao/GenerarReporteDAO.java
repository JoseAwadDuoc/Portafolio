/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
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

    public void generarReporteAvance(int idcontrato) {
        Conexion con = new Conexion();
        System.out.println("cero: " + con);
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObject(getClass().getResourceAsStream("/Reporte/ReporteAvance.jasper"));
            //JasperReport reporte= (JasperReport) JRLoader.loadObject("src/Reporte/ReporteAvance.jasper");
            System.out.println("reporte: " + reporte);
            Map parametro = new HashMap();
            parametro.put("idcontrato", idcontrato);
            System.out.println("parametro: " + parametro);
            JasperPrint j = JasperFillManager.fillReport(reporte, parametro, con.conectar());
            System.out.println("uno: " + j.toString());
            JasperViewer jv = new JasperViewer(j, false);
            System.out.println("dos: " + jv);
            jv.setTitle("Reporte de Avance");
            jv.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al Mostrar el Reporte " + e);
        }
    }

    public static void main(String[] args) throws Exception {
        //Compila el ReporteAvance.jrxml en un ReporteAvance.jasper
        JasperCompileManager.compileReportToFile(
                "src/Reporte/ReporteAvance.jrxml",
                "src/Reporte/ReporteAvance.jasper");

    }
}
