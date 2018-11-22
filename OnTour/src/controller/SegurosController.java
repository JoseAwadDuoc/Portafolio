/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.SeguroDAO;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import model.Seguro;

/**
 *
 * @author jose_
 */
public class SegurosController {

    private SeguroDAO seguroDAO = new SeguroDAO();

    public boolean agregarSeguro(Seguro seguro) throws Exception {
        if (seguro == null) {
            throw new Exception("Seguro no puede ser null");
        }
        boolean creado = this.seguroDAO.agregarSeguro(seguro);
        System.out.println("creado " + creado);
        return creado;
    }
    
    public DefaultTableModel consultarSeguros() {

        DefaultTableModel modelotabla = new DefaultTableModel();
        Map<String, List> map = this.seguroDAO.obtenerSeguros();
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
    
        public boolean eliminarSeguro(int id){
        try {
            this.seguroDAO.eliminarSeguro(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
    }
}
