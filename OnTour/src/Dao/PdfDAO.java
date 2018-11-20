package Dao;

import Dao.Conexion;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class PdfDAO extends DbUtilidades {

    

    public DefaultComboBoxModel obtenerContrato() {
        DefaultComboBoxModel listapaquete = new DefaultComboBoxModel();
        listapaquete.addElement("Seleccione Contrato");
        ResultSet rs = this.consulta("Select * from contrato ORDER BY IDCONTRATO ASC");

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

    /*Metodo agregar*/
    public void Agregar_PdfVO(String nombrearchivo,String rutapdf,int idcontrato) {
        Conexion conec = new Conexion();
        String sql = "INSERT INTO ARCHIVO (NOMBREARCHIVO,RUTAARCHIVO,IDCONTRATO) VALUES(?,?,?)";
        PreparedStatement ps = null;
        try {
            ps= conec.conectar().prepareStatement(sql);
            
            ps.setString(1,nombrearchivo);
            ps.setString(2,rutapdf);
            ps.setInt(3,idcontrato);
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
    
    public String obtenerrutapdf(int idarchivo) {

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



    /*Metodo agregar*/
  /* public void Agregar_PdfVO(PdfVO vo) {
        Conectar conec = new Conectar();
        String sql = "INSERT INTO ARCHIVO (NOMBREARCHIVO,RUTAARCHIVO,IDCONTRATO) VALUES(?,?,?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getNombrepdf());
            ps.setString(2, vo.getRutapdf());
            ps.setInt(3, vo.getIdcontrato());
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
    }*/


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
    

    /*Metodo Eliminar*/
/*    public void Eliminar_PdfVO(PdfVO vo) {
        Conectar conec = new Conectar();
        String sql = "DELETE FROM pdf WHERE codigopdf = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodigopdf());
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
    
    public String eliminararchivopdf(int id) {
        ResultSet rs = this.consulta("DELETE FROM ARCHIVO WHERE IDARCHIVO="+ id);
        String contrato = new String();
        try {
            while (rs.next()) {

                confirmarCambio();

                System.out.println("Archivo Eliminado Correctamente");
            }
            rs.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }
        return contrato;
    }
//Modificar
    //Permite mostrar PDF contenido en la base de datos
   /* public void ejecutar_archivoPDF(int id) {

        Conectar cn = new Conectar();
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;

        try {
            ps = cn.getConnection().prepareStatement("SELECT rutapdf FROM archivopdfpdf WHERE idcontrato= ?;");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                String ruta= rs.getString("rutapdf");
                //Agregar Ruta directorio
            }
            InputStream bos = new ByteArrayInputStream(b);

            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);

            OutputStream out = new FileOutputStream("new.pdf");
            out.write(datosPDF);

            //abrir archivo
            out.close();
            bos.close();
            ps.close();
            rs.close();
            cn.desconectar();

        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("Error al abrir archivo PDF " + ex.getMessage());
        }
    }*/
    
    
    public int obtenerIdContrato(int idcontrato) {

        ResultSet rs = this.consulta("Select * from Contrato where idcontrato = '" + idcontrato + "'");
        int idcontrato1=0;
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

}
