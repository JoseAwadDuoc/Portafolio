/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jose_
 */
public class Curso {
    
    private int idColegio;
    private String nombre;
    private int rutEncargado;

    public Curso() {
    }

    public int getIdColegio() {
        return idColegio;
    }

    public void setIdColegio(int idColegio) {
        this.idColegio = idColegio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRutEncargado() {
        return rutEncargado;
    }

    public void setRutEncargado(int rutEncargado) {
        this.rutEncargado = rutEncargado;
    }

    @Override
    public String toString() {
        return "Curso{" + "idColegio=" + idColegio + ", nombre=" + nombre + ", rutEncargado=" + rutEncargado + '}';
    }

   
    
    
}
