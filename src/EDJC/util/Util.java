/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC.util;

/**
 *
 * @author Jay C Espinoza
 */
public class Util {
    private Util(){}
    
    /**
     * Metodo escrito por Edgardo para transformar una cadena de caracteres
     * a formato Titulo por ejemplo: "alGo" se convierte en "Algo".
     * @param cad La String a transformar.
     * @return Una String con la transformacion.
     */
    public static String toTitleCase(String cad){
        if(cad != null && cad.length()>0){
            cad=cad.replace(cad.substring(0, 1),cad.substring(0,1).toUpperCase());
            return cad;
        }
        throw new NullPointerException();
    }
}
