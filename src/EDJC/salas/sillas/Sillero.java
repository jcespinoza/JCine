/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC.salas.sillas;

import EDJC.salas.Tablero;
import java.awt.Container;
import java.util.ArrayList;

/**
 *
 * @author Jay C Espinoza
 */
public class Sillero extends Container implements Tablero{
    protected SillaI sillas[][];

    @Override
    public int getFilas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getColumnas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}