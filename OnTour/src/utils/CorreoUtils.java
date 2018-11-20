
package utils;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import model.Apoderado;

/**
 *
 * @author jose_
 */
public class CorreoUtils {
    
    private static void enviarCorreo(String subject, String from, String to, String text) {
        
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                        "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication("ontour.app1@gmail.com","Ahg6Ajn.#fg");
                        }
                });

        try {

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO,
                            InternetAddress.parse(to));
            message.setSubject(subject);
            message.setText(text, "utf-8", "html");

            Transport.send(message);

            System.out.println("Correo enviado a: "+to);

        } catch (MessagingException e) {
                throw new RuntimeException(e);
        }
    }
    
    public static void enviarCorreoRegistroApoderado(Apoderado apoderado) {
        
        String subject = "Datos de registro";
        String from = "registro@ontour.cl";
        String to = apoderado.getCorreo();
        String text = "<html><h2>Estimad@: "+apoderado.getNombres()+" "+apoderado.getaPaterno()+"<h2><br>"
                + "<h2>Su usuario ha sido creado</h2><br>"
                +"Para iniciar sesión debe ingresar con su rut y su nueva clave.<br>"
                +"Su clave de acceso es : <b>"+apoderado.getContrasena() + "</b><br>"
                +"Se recomienda cambiar su clave por una nueva.<br><br>"
                + "Atte,<br> <b>Agencia OnTour.<b>"+"</html>";
        
        enviarCorreo(subject, from, to, text);
    }
    
    public static void main(String[] args) {
        
        Apoderado ap = new Apoderado();
        ap.setCorreo("jose.awad.jofre@gmail.com");
        CorreoUtils.enviarCorreoRegistroApoderado(ap);
    }
}
