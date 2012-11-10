/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC.salas.sillas;

import EDJC.util.Util;

/**
 *
 * @author Jay C Espinoza
 */
public enum SeatState {
    RESERVADO, SELECCIONADO, DISPONIBLE;
    
    @Override
    public String toString(){
        return Util.toTitleCase(super.toString());
    }
}
