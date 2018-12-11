/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author jose_
 */
public class Deposito {

    private int montoDeposito;
    private int rutApoderado;
    private int rutAlumno;
    private Date fechaDeposito;
    private int estado;

    public Deposito() {
    }

    public Deposito(int montoDeposito, int rutApoderado, int rutAlumno, Date fechaDeposito, int estado) {
        this.montoDeposito = montoDeposito;
        this.rutApoderado = rutApoderado;
        this.rutAlumno = rutAlumno;
        this.fechaDeposito = fechaDeposito;
        this.estado = estado;
    }

    public int getMontoDeposito() {
        return montoDeposito;
    }

    public void setMontoDeposito(int montoDeposito) {
        this.montoDeposito = montoDeposito;
    }

    public int getRutApoderado() {
        return rutApoderado;
    }

    public void setRutApoderado(int rutApoderado) {
        this.rutApoderado = rutApoderado;
    }

    public int getRutAlumno() {
        return rutAlumno;
    }

    public void setRutAlumno(int rutAlumno) {
        this.rutAlumno = rutAlumno;
    }

    public Date getFechaDeposito() {
        return fechaDeposito;
    }

    public void setFechaDeposito(Date fechaDeposito) {
        this.fechaDeposito = fechaDeposito;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Deposito{" + "montoDeposito=" + montoDeposito + ", rutApoderado=" + rutApoderado + ", rutAlumno=" + rutAlumno + ", fechaDeposito=" + fechaDeposito + ", estado=" + estado + '}';
    }

}
