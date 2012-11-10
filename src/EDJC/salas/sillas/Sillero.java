/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC.salas.sillas;

import EDJC.salas.Tablero;
import java.awt.Container;

/**
 *
 * @author Jay C Espinoza
 */
public class Sillero extends Container{
    protected SillaI sillas[][];
    protected int filas;
    protected int columnas;

    public int getFilas() {
        return this.filas;
    }
    
    SillaI[][] getSillas(){
        return sillas;
    }
    
    public int getColumnas(){
        return this.columnas;
    }
}