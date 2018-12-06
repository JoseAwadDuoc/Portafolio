/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author corellana
 */
public class Alumno {
    
    private int rut;
     private int idcurso;
     private int idcomuna;
     private int rut_apoderado;
     private String nombre;
     private String aPaterno;
     private String aMaterno;
     private String fechaNacimiento;
     private String direccion;
     private int telefono;
     private int monto;

    public Alumno() {
    }

    public Alumno(int rut, int idcurso, int idcomuna, int rut_apoderado, String nombre, String aPaterno, String aMaterno, String fechaNacimiento, String direccion, int telefono, int monto) {
        this.rut = rut;
        this.idcurso = idcurso;
        this.idcomuna = idcomuna;
        this.rut_apoderado = rut_apoderado;
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.monto = monto;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public int getIdcomuna() {
        return idcomuna;
    }

    public void setIdcomuna(int idcomuna) {
        this.idcomuna = idcomuna;
    }

    public int getRut_apoderado() {
        return rut_apoderado;
    }

    public void setRut_apoderado(int rut_apoderado) {
        this.rut_apoderado = rut_apoderado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Alumno{" + "rut=" + rut + ", idcurso=" + idcurso + ", idcomuna=" + idcomuna + ", rut_apoderado=" + rut_apoderado + ", nombre=" + nombre + ", aPaterno=" + aPaterno + ", aMaterno=" + aMaterno + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion + ", telefono=" + telefono + ", monto=" + monto + '}';
    }
    
    
     
     
}
