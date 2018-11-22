/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author jose_
 */
public class GuiUtils {
    
    
    public static DefaultComboBoxModel createModelFromList(List<String> list) {
        
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
     
        for(String s : list) {
            model.addElement(s);
        }
        return model;
    }
}
