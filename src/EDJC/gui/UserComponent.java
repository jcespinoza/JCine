/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC.gui;

import EDJC.seguridad.Usuario;
import javax.swing.JLayeredPane;

/**
 *
 * @author Jay C Espinoza
 */
class UserComponent extends JLayeredPane{
    private String nom;
    private String username;
    private String pictPath;
    
    public UserComponent(Usuario u){
        nom = u.getNombreCompleto();
        username = u.getUsername();
        pictPath = u.getFotoPath();
        fillComponents();
    }

    private void fillComponents() {
        
    }
}
