/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Image;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import model.KeyValue;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author jose_
 */
public class GuiUtils {
    
    
    public static DefaultComboBoxModel createModelFromList(List list) {
        
        DefaultComboBoxModel model = new DefaultComboBoxModel();
     
        for(Object s : list) {
            model.addElement(s);
        }
        return model;
    }
    
    public static Image getImage(String name) {
        ImageIcon img = getImageIcon(name);
        return img != null ? img.getImage() : null;
    }
    
    public static ImageIcon getImageIcon(String name) {
        ImageIcon img = null;
        try {
            GuiUtils gu = new GuiUtils();
            img = new ImageIcon(IOUtils.toByteArray(gu.getClass().getResourceAsStream("/imagenes/" + name)));
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return img;
    }
}
