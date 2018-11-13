package Dao;

/**
 *
 * @author jose_
 */
public class ColegioDAO extends DbUtilidades {

    public boolean agregarColegio(int idComuna, String nombre, String direccion, int telefono) {
       return this.actualizar("INSERT INTO COLEGIO ( IDCOMUNA, NOMBRE_COLEGIO, DIRECCION, TELEFONO)"
                + "VALUES ( " + idComuna + ",'" + nombre + "', '" + direccion + " ', " + telefono + ")");
    }

}
