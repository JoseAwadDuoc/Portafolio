/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Alumno;

/**
 *
 * @author corellana
 */
public class AlumnoDAO extends DbUtilidades {

    public static Alumno alu = new Alumno();

    /**
     * retorna un listado de alumnos
     *
     * @return retorna listado de alumnos
     */
    public Map<String, List> obtenerAlumnos() {
        Map<String, List> map = null;
        try {

            Statement st = Conexion.conectar().createStatement();
            String sql = "Select * From ALUMNO";

            ResultSet rs = st.executeQuery(sql);

            ResultSetMetaData rsMD = rs.getMetaData();
            int numerocolumnas = rsMD.getColumnCount();

            List<Object> columnLabels = new ArrayList<>();

            for (int x = 1; x <= numerocolumnas; x++) {
                columnLabels.add(rsMD.getColumnLabel(x));
            }

            List<Object> columnValues = new ArrayList<>();

            while (rs.next()) {
                Object[] fila = new Object[numerocolumnas];
                for (int i = 0; i < numerocolumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                columnValues.add(fila);
            }

            rs.close();

            map = new HashMap<>();
            map.put("columnLabels", columnLabels);
            map.put("columnValues", columnValues);

        } catch (Exception e) {
            System.out.println("No se ha  ningún Alumno Registrado.");
        }
        return map;
    }

    /**
     * retorna un listado de alumnos por curso
     *
     * @param idcurso id del curso
     * @return retorna listado de alumnos por idCurso
     */
    public Map<String, List> obtenerAlumnosxCurso(int idcurso) {
        Map<String, List> map = null;
        try {

            Statement st = Conexion.conectar().createStatement();
            String sql = "Select * From ALUMNO where IDCURSO =" + idcurso + " ORDER BY APATERNO ASC";

            ResultSet rs = st.executeQuery(sql);

            ResultSetMetaData rsMD = rs.getMetaData();
            int numerocolumnas = rsMD.getColumnCount();

            List<Object> columnLabels = new ArrayList<>();

            for (int x = 1; x <= numerocolumnas; x++) {
                columnLabels.add(rsMD.getColumnLabel(x));
            }

            List<Object> columnValues = new ArrayList<>();

            while (rs.next()) {
                Object[] fila = new Object[numerocolumnas];
                for (int i = 0; i < numerocolumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                columnValues.add(fila);
            }

            rs.close();

            map = new HashMap<>();
            map.put("columnLabels", columnLabels);
            map.put("columnValues", columnValues);

        } catch (Exception e) {
            System.out.println("No se ha  ningún Alumno Registrado.");
        }
        return map;
    }

    /**
     * Crea un nuevo alumno
     *
     * @param alumno alumno
     * @return un alumno
     */
    public boolean agregarAlumno(Alumno alumno) {

        int rut = alumno.getRut();
        int idCurso = alumno.getIdcurso();
        int idComuna = alumno.getIdcomuna();
        int rut_apod = alumno.getRut_apoderado();
        String nombres = alumno.getNombre();
        String aPaterno = alumno.getaPaterno();
        String aMaterno = alumno.getaMaterno();
        String fechaNacimiento = alumno.getFechaNacimiento();
        String direccion = alumno.getDireccion();
        int telefono = alumno.getTelefono();

        return this.actualizar("call sp_alumno_insertar(" + rut + ","
                + idCurso + ","
                + idComuna + ","
                + rut_apod + ",'"
                + nombres + "','"
                + aPaterno + "','"
                + aMaterno + "','"
                + fechaNacimiento + "','"
                + direccion + "',"
                + telefono
                + ",0)");
    }

    /**
     * Metodo para actualizar alumnos
     *
     * @param alumno alumno
     * @return modifica datos de alumno
     */
    public boolean actualizarAlumno(Alumno alumno) {

        String sql = "call sp_alumno_modificar(" + alumno.getRut()
                + "," + alumno.getIdcurso() + ","
                + alumno.getIdcomuna() + ","
                + alumno.getRut_apoderado() + ",'"
                + alumno.getNombre() + "','"
                + alumno.getaPaterno() + "','"
                + alumno.getaMaterno() + "','"
                + alumno.getFechaNacimiento() + "','"
                + alumno.getDireccion() + "','"
                + alumno.getTelefono() + "','"
                + alumno.getMonto() + "')";

        return this.actualizar(sql);
    }
    
    public int obtenerRutApoderado(String apoderado) {

        ResultSet rs = this.consulta("SELECT rut_apoderado FROM APODERADO\n" +
"WHERE CONCAT(nombres,CONCAT(' ',CONCAT(apaterno,CONCAT(' ',amaterno))))='"+apoderado+"'");
        int rut = 0;
        try {
            while (rs.next()) {
                rut = rs.getInt("rut_apoderado");
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return rut;
    }

}
