package EDJC;

import EDJC.salas.SalaLayout;
import EDJC.seguridad.IllegalPasswordLengthException;
import EDJC.seguridad.TipoUsuario;
import EDJC.seguridad.Usuario;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jay C Espinoza
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        /*
         * Testing SalaLayout
         */
        SalaLayout sl = new SalaLayout(4,5);
        sl.setTodasVisibles();
        sl.setSilla(2, 3, false);
        System.out.println(sl);
        
        /*
         * Testing usuario
         */
        Usuario us = new Usuario("Pascualito", "123456#".toCharArray(), TipoUsuario.ADMINISTRADOR);
        String pass = "nada";
        try {
            System.out.println("Trying to assign \"" + pass + "\" as the password for " + us.getUsername());
            us.setPassword(pass.toCharArray());
        } catch (IllegalPasswordLengthException ex) {
            System.out.println("ups! \"" + pass + "\" has " + (6 - pass.length()) + " less than the required six characters");
        }
    }
}