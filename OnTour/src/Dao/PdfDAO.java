package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

public class PdfDAO extends DbUtilidades {

    public DefaultComboBoxModel obtenerContrato() {
        DefaultComboBoxModel listapaquete = new DefaultComboBoxModel();
        listapaquete.addElement("Seleccione Contrato");
        ResultSet rs = this.consulta("Select IDCONTRATO from contrato ORDER BY IDCONTRATO ASC");

        try {
            while (rs.next()) {
                listapaquete.addElement(rs.getInt("IDCONTRATO"));

            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return listapaquete;
    }

    public void agregarPdf(String nombrearchivo, String rutapdf, int idcontrato) {
        Conexion conec = new Conexion();
        String sql = "INSERT INTO ARCHIVO (NOMBREARCHIVO,RUTAARCHIVO,IDCONTRATO) VALUES(?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = conec.conectar().prepareStatement(sql);

            ps.setString(1, nombrearchivo);
            ps.setString(2, rutapdf);
            ps.setInt(3, idcontrato);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.conectar().close();
            } catch (Exception ex) {
            }
        }
    }

    public String obtenerRutaPdf(int idarchivo) {

        ResultSet rs = this.consulta("Select * from ARCHIVO where idarchivo = '" + idarchivo + "'");
        String ruta = new String();
        try {
            while (rs.next()) {
                ruta = rs.getString("RUTAARCHIVO");
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ruta;
    }


    /*Metodo Modificar*/
 /*  public void Modificar_PdfVO(PdfVO vo) {
        Conexion conec = new Conexion();
        String sql = "UPDATE pdf SET nombrepdf = ?, archivopdf = ? WHERE codigopdf = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.conectar().prepareStatement(sql);
            ps.setString(1, vo.getNombrepdf());
            ps.setString(2, vo.getRutapdf());
            ps.setInt(3, vo.getCodigopdf());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    public void Modificar_PdfVO2(PdfVO vo) {
        Conectar conec = new Conectar();
        String sql = "UPDATE pdf SET nombrepdf = ? WHERE codigopdf = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getNombrepdf());
            ps.setInt(2, vo.getCodigopdf());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }
     */
    public void eliminarArchivoPdf(int id) {
        this.actualizar("DELETE FROM ARCHIVO WHERE IDARCHIVO=" + id);
    }

    public int obtenerIdContrato(int idcontrato) {

        ResultSet rs = this.consulta("Select idcontrato from Contrato where idcontrato = " + idcontrato);
        int idcontrato1 = 0;
        try {
            while (rs.next()) {
                idcontrato1 = rs.getInt("idcontrato");
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return idcontrato1;
    }

    public boolean existeArchivoPorIdContrato(int idContrato) {
        ResultSet rs = this.consulta("Select idcontrato from archivo where idcontrato = " + idContrato);
        int idcontrato1 = 0;
        try {
            while (rs.next()) {
                idcontrato1 = rs.getInt("idcontrato");
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return idcontrato1 != 0;
    }

}
