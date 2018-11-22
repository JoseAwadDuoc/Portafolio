/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.ApoderadoDAO;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import model.Apoderado;
import utils.CorreoUtils;

/**
 *
 * @author jose_
 */
public class ApoderadosController {

    private ApoderadoDAO apoderadoDAO = new ApoderadoDAO();
    
    public DefaultTableModel consultarApoderados() {

        DefaultTableModel modelotabla = new DefaultTableModel();
        Map<String, List> map = this.apoderadoDAO.obtenerApoderados();
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
    
    public Apoderado buscarApoderadoPorRut(int rut) throws Exception{
        if (rut <= 0) {
            throw new Exception("Rut invalido");
        }
        return this.apoderadoDAO.buscarApoderadoPorRut(rut);
    }
    
    public boolean actualizarApoderado(Apoderado apoderado) throws Exception{
        if (apoderado == null) {
            throw new Exception("Apoderado no puede ser null");
        }
        if (!apoderado.getFechaNacimiento().contains("-")) {
            throw new Exception("Formato de fecha de nacimiento invalida");
        }
        return this.apoderadoDAO.actualizarApoderado(apoderado);
    }
    
    public boolean agregarApoderado(Apoderado apoderado) throws Exception{
        if (apoderado == null) {
            throw new Exception("Apoderado no puede ser null");
        }
        if (!apoderado.getFechaNacimiento().contains("/")) {
            throw new Exception("Formato de fecha de nacimiento invalida");
        }
        boolean creado = this.apoderadoDAO.agregarApoderado(apoderado);
        System.out.println("creado "+creado);
        if(creado){
            CorreoUtils.enviarCorreoRegistroApoderado(apoderado);
        }
        return creado;
    }
}
