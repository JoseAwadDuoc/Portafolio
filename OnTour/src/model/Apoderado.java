
package model;

/**
 *
 * @author jose_
 */
public class Apoderado {
    
    private int rut;
    private String contrasena;
    private int idComuna;
    private String nombres;
    private String aPaterno;
    private String aMaterno;
    private String fechaNacimiento;
    private int telefono;
    private boolean encargado;
    private String direccion;
    private String correo;

    public Apoderado() {
    }

    public Apoderado(int rut, String contrasena, int idComuna, String nombres, String aPaterno, String aMaterno, String fechaNacimiento, int telefono, boolean encargado, String direccion, String correo) {
        this.rut = rut;
        this.contrasena = contrasena;
        this.idComuna = idComuna;
        this.nombres = nombres;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.encargado = encargado;
        this.direccion = direccion;
        this.correo = correo;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isEncargado() {
        return encargado;
    }

    public void setEncargado(boolean encargado) {
        this.encargado = encargado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Apoderado{" + "rut=" + rut + ", contrasena=" + contrasena + ", idComuna=" + idComuna + ", nombres=" + nombres + ", aPaterno=" + aPaterno + ", aMaterno=" + aMaterno + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", encargado=" + encargado + ", direccion=" + direccion + ", correo=" + correo + '}';
    }

    
    

    
}
