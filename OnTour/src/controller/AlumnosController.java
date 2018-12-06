/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.AlumnoDAO;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import model.Alumno;

/**
 *
 * @author corellana
 */
public class AlumnosController {
    
    private AlumnoDAO alumnoDAO = new AlumnoDAO();
    
    public DefaultTableModel consultaralumnos_todos() {

        DefaultTableModel modelotabla = new DefaultTableModel();
        Map<String, List> map = this.alumnoDAO.obtenerAlumnos();
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
   
    public DefaultTableModel consultaralumnos_curso(int idcurso) throws Exception {

         if (idcurso <= 0) {
            throw new Exception("Curso invalido");
        }
        
        DefaultTableModel modelotabla = new DefaultTableModel();
        Map<String, List> map = this.alumnoDAO.obtenerAlumnosxCurso(idcurso);
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
    
    
    
  
    
    public boolean actualizarAlumno(Alumno alumno) throws Exception{
        if (alumno == null) {
            throw new Exception("Alumno no puede ser null");
        }
        if (!alumno.getFechaNacimiento().contains("-")) {
            throw new Exception("Formato de fecha de nacimiento invalida");
        }
        return this.alumnoDAO.actualizarAlumno(alumno);
    }
    
    public boolean agregarAlumno(Alumno alumno) throws Exception{
        if (alumno == null) {
            throw new Exception("Apoderado no puede ser null");
        }
        if (!alumno.getFechaNacimiento().contains("/")) {
            throw new Exception("Formato de fecha de nacimiento invalida");
        }
        boolean creado = this.alumnoDAO.actualizarAlumno(alumno);
        System.out.println("creado "+creado);
        
        return creado;
    }
    
}
