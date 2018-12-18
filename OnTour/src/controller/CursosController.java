/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.CursoDAO;
import Dao.TipoSeguroDAO;
import model.Curso;

/**
 *
 * @author jose_
 */
public class CursosController {
    
    private CursoDAO cursoDAO = new CursoDAO();

    public boolean agregarCurso(Curso curso) throws Exception {
        if (curso == null) {
            throw new Exception("Curso no puede ser null");
        }
        boolean creado = this.cursoDAO.agregarCurso(curso);
        System.out.println("creado " + creado);
        return creado;
    }
    
}
