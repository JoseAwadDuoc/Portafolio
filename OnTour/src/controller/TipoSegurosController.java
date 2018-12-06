/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.TipoSeguroDAO;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import model.TipoSeguro;

/**
 *
 * @author jose_
 */
public class TipoSegurosController {

    private TipoSeguroDAO tipoSeguroDAO = new TipoSeguroDAO();

    public boolean agregarTipoSeguro(TipoSeguro tipoSeguro) throws Exception {
        if (tipoSeguro == null) {
            throw new Exception("Tipo Seguro no puede ser null");
        }
        boolean creado = this.tipoSeguroDAO.agregarSeguro(tipoSeguro);
        System.out.println("creado " + creado);
        return creado;
    }

    public DefaultTableModel consultarTipoSeguros() {

        DefaultTableModel modelotabla = new DefaultTableModel();
        Map<String, List> map = this.tipoSeguroDAO.obtenerTipoSegurosMap();
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

}
