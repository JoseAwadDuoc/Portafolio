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

    public void GenerarReporteAvance(int idcontrato) {
        Conexion con = new Conexion();
        System.out.println("cero: " + con);
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObject("ReporteAvance.jasper");
            System.out.println("medio: " + reporte);
            Map parametro = new HashMap();
            System.out.println("parametro: " + parametro);

            parametro.put("idcontrato", idcontrato);
            System.out.println("parametro.put: " + parametro.toString());

            JasperPrint j = JasperFillManager.fillReport(reporte, parametro, con.conectar());
            System.out.println("uno: " + j.toString());
            JasperViewer jv = new JasperViewer(j, false);
            System.out.println("dos: " + jv);
            jv.setTitle("Reporte de Avance");
            jv.setVisible(true);
            System.out.println("tres: " + jv);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Mostrar el Reporte " + e);
        }

    }

}
