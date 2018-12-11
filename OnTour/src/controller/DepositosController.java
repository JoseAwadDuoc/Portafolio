/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.ApoderadoDAO;
import Dao.DepositoDAO;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import model.Apoderado;
import model.Deposito;
import utils.CorreoUtils;

/**
 *
 * @author jose_
 */
public class DepositosController {

    private DepositoDAO depositoDAO = new DepositoDAO();
    private ApoderadoDAO apoderadoDAO = new ApoderadoDAO();

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

    public boolean actualizarDeposito(int idDeposito) {
        try {
            boolean actualizado = this.depositoDAO.actualizarDeposito(idDeposito);
            System.out.println("actualizado "+actualizado);
            if(actualizado){
                Deposito deposito = this.depositoDAO.obtenerDepositoPorId(idDeposito);
                Apoderado apoderado = this.apoderadoDAO.buscarApoderadoPorRut(deposito.getRutApoderado());
                CorreoUtils.enviarCorreoValidarDepositoApoderado(apoderado,deposito);
            }
            return actualizado;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
//    
//    boolean creado = this.apoderadoDAO.agregarApoderado(apoderado);
//        System.out.println("creado "+creado);
//        if(creado){
//            CorreoUtils.enviarCorreoValidarDepositoApoderado(apoderado);
//        }
//    
}
