/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.ApoderadoDAO;
import Dao.ColegioDAO;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import model.Colegio;

/**
 *
 * @author jose_
 */
public class ColegioController {
        private ColegioDAO colegioDAO = new ColegioDAO();
    
    
    public DefaultTableModel consultarColegios() {

        DefaultTableModel modelotabla = new DefaultTableModel();
        
        Map<String, List> map = this.colegioDAO.obtenerColegios();
        if (map != null) {

            List columnLabels = map.get("columnLabels");
            List columnValues = map.get("columnValues");

            for (Object label : columnLabels) {
                modelotabla.addColumn(label);
            }

            for (int x = 0; x < columnValues.size(); x++) {
                Object[] fila = (Object[]) columnValues.get(x);
                modelotabla.addRow(fila);
            }
        }

        return modelotabla;
    }
    
    public Colegio buscarColegiosPorId(int idColegio) throws Exception{
        if (idColegio <= 0) {
            throw new Exception("ID invalido");
        }
        return this.colegioDAO.buscarColegioPorId(idColegio);
    }
    
    public boolean eliminarColegio(int id){
        try {
            this.colegioDAO.eliminarColegio(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
    }
    
}
