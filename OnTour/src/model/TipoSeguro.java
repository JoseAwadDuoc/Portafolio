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
public class TipoSeguro {
    
    private String tipoSeguro;

    public TipoSeguro() {
    }

    public TipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    @Override
    public String toString() {
        return "TipoSeguro{" + "tipoSeguro=" + tipoSeguro + '}';
    }
    
    
    
}
