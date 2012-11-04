/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC.peliculas;

import EDJC.util.Util;

/**
 *
 * @author Jay C Espinoza
 */
public enum TipoPelicula {
    COMEDIA, DRAMA, ACCION, MUSICAL, DOCUMENTAL, ANIMADA;
    
    @Override
    public String toString(){
        return Util.toTitleCase(super.toString());
    }
}
