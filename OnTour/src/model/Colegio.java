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
public class Colegio {
    
    private int idComuna;
    private String nombreColegio;
    private String direccion;
    private int telefono;

    public Colegio() {
    }

    public Colegio(int idComuna, String nombreColegio, String direccion, int telefono) {
        this.idComuna = idComuna;
        this.nombreColegio = nombreColegio;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }

    public String getNombreColegio() {
        return nombreColegio;
    }

    public void setNombreColegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
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

    @Override
    public String toString() {
        return "Colegio{" + "idComuna=" + idComuna + ", nombreColegio=" + nombreColegio + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
    
}
