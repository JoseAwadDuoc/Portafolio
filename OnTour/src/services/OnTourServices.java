package services;

import Dao.ApoderadoDAO;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;
import model.Apoderado;

@WebService
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT)
public class OnTourServices {

    private ApoderadoDAO apoderadoDAO = new ApoderadoDAO();

  /**
   * 
   * @param rut rut apoderado
   * @return retorna un apoderado por rut
   */
    
    @WebMethod
    public Apoderado buscarApoderadoPorRut(int rut) { 
        return this.apoderadoDAO.buscarApoderadoPorRut(rut);
    }

    /**
     * Metodo main para ejecutar el servicio web SOAP
     * @param args metodo para iniciar web services
     */
    public static void main(String[] args) {
        //wsimport -keep -verbose http://localhost:8081/ontourservices?wsdl
        String url = "http://localhost:8081/ontourservices";
        Endpoint.publish(url, new OnTourServices());
        System.out.println("Servicio iniciado en: " + url + "?wsdl");
    }
}
