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
public class Seguro {

    private int idTipoSeguro;
    private int idAseguradora;
    private int precio;
    private String fechaIni;
    private String fechFin;

    public Seguro() {
    }

    public Seguro(int idTipoSeguro, int idAseguradora, int precio, String fechaIni, String fechFin) {
        this.idTipoSeguro = idTipoSeguro;
        this.idAseguradora = idAseguradora;
        this.precio = precio;
        this.fechaIni = fechaIni;
        this.fechFin = fechFin;
    }

    public int getIdTipoSeguro() {
        return idTipoSeguro;
    }

    public void setIdTipoSeguro(int idTipoSeguro) {
        this.idTipoSeguro = idTipoSeguro;
    }

    public int getIdAseguradora() {
        return idAseguradora;
    }

    public void setIdAseguradora(int idAseguradora) {
        this.idAseguradora = idAseguradora;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public String getFechFin() {
        return fechFin;
    }

    public void setFechFin(String fechFin) {
        this.fechFin = fechFin;
    }

    @Override
    public String toString() {
        return "Seguro{" + "idTipoSeguro=" + idTipoSeguro + ", idAseguradora=" + idAseguradora + ", precio=" + precio + ", fechaIni=" + fechaIni + ", fechFin=" + fechFin + '}';
    }

}
