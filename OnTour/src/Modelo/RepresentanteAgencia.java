package Modelo;

public class RepresentanteAgencia {
    private int rut;
    private int idcomuna;
    private int idcargo;
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String fechaNacimiento;
    private String direccion;
    private int telefono;
    private String contraseña;

    public RepresentanteAgencia() {
    }

    public RepresentanteAgencia(int rut, int idcomuna, int idcargo, String nombre, String aPaterno, String aMaterno, String fechaNacimiento, String direccion, int telefono, String contraseña) {
        this.rut = rut;
        this.idcomuna = idcomuna;
        this.idcargo = idcargo;
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.contraseña = contraseña;
    }

  
    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

        public int getIdcomuna() {
        return idcomuna;
    }

    public void setIdcomuna(int idcomuna) {
        this.idcomuna = idcomuna;
    }

    public int getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(int idcargo) {
        this.idcargo = idcargo;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    @Override
    public String toString() {
        return "RepresentanteAgencia{" + "rut="+ rut+", idComuna=" + idcomuna + ", idCargo=" + idcargo + ", nombre=" + nombre + ", aPaterno=" + aPaterno + ", aMaterno=" + aMaterno + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion + ", telefono=" + telefono + ", contrase\u00f1a=" + contraseña +'}';
    }


    
    
}
