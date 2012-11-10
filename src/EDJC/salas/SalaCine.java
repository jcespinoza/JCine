/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC.salas;

import EDJC.peliculas.Pelicula;
import java.util.ArrayList;

/**
 *
 * @author Jay C Espinoza
 */
public abstract class SalaCine {
    protected SalaLayout layout;
    protected Tablero sillas;
    protected ArrayList<Pelicula> peliculas;
    protected double precioTicket;
    
    public abstract void agregarPelicula(Pelicula peli);
    
    public Tablero getSillero(){
        return sillas;
    }
    
    public double getPrecioTicket(){
        return this.precioTicket;
    }

    public void setPrecioTicket(double precio){
        this.precioTicket = precio;
    }
}