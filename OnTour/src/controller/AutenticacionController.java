/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.AutenticacionDAO;

/**
 *
 * @author jose_
 */
public class AutenticacionController {
    
    private AutenticacionDAO autenticacionDAO = new AutenticacionDAO();
    
    public boolean validarUsuario(int rut, String contraseña) {
        return this.autenticacionDAO.validarUsuario(rut, contraseña);
    }
    
    public int obtenerPerfil(String rutagente) {
        return this.autenticacionDAO.obtenerPerfil(rutagente);
    }
}
