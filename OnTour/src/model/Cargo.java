
package model;

class Cargo {
    private int idCargo;
    private String descripcion;

    public Cargo() {
    }
    
    public Cargo(int idCargo, String descripcion) {
        this.idCargo = idCargo;
        this.descripcion = descripcion;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Cargo{" + "idCargo=" + idCargo + ", descripcion=" + descripcion + '}';
    }
    
    
}
