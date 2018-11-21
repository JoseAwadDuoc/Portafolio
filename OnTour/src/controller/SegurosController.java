/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.SeguroDAO;
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
}
