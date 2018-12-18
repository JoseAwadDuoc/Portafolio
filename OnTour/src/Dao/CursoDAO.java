/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import model.Colegio;
import model.Curso;

/**
 *
 * @author jose_
 */
public class CursoDAO extends DbUtilidades{
    
    
    public boolean agregarCurso(Curso cursos) {
        int idColegio = cursos.getIdColegio();
        String nombre = cursos.getNombre();
        int rutApoderado = cursos.getRutEncargado();
       return this.actualizar("INSERT INTO CURSO ( IDCOLEGIO, DESCRIPCION, RUT_ENCARGADO)"
                + "VALUES ( " + idColegio + ",'" + nombre.trim().toUpperCase() + "'," + rutApoderado+")");
    }
}
