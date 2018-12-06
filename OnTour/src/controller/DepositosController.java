/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.DepositoDAO;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jose_
 */
public class DepositosController {

    private DepositoDAO depositoDAO = new DepositoDAO();

    public DefaultTableModel consultarDepositos() {

        DefaultTableModel modelotabla = new DefaultTableModel();
        Map<String, List> map = this.depositoDAO.obtenerDepositos();
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

    public boolean actualizarDeposito(int id) {
        try {
            this.depositoDAO.ActualizarDeposito(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
}
